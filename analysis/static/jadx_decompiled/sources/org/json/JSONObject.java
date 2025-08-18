package org.json;

import defpackage.zr6;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public class JSONObject {
    public static final Object NULL = new Null();
    private final Map<String, Object> map;

    public static final class Null {
        private Null() {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "null";
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public static String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return "null";
        }
        String string = Double.toString(d);
        if (string.indexOf(46) <= 0 || string.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    private static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) {
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return (A) method.getAnnotation(cls);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    return (A) getAnnotation(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                return (A) getAnnotation(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    private static int getAnnotationDepth(Method method, Class<? extends Annotation> cls) {
        int annotationDepth;
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    annotationDepth = getAnnotationDepth(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
                if (annotationDepth > 0) {
                    return annotationDepth + 1;
                }
            }
            try {
                int annotationDepth2 = getAnnotationDepth(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (annotationDepth2 > 0) {
                    return annotationDepth2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    private String getKeyNameFromMethod(Method method) {
        String strSubstring;
        int annotationDepth;
        int annotationDepth2 = getAnnotationDepth(method, JSONPropertyIgnore.class);
        if (annotationDepth2 > 0 && ((annotationDepth = getAnnotationDepth(method, JSONPropertyName.class)) < 0 || annotationDepth2 <= annotationDepth)) {
            return null;
        }
        JSONPropertyName jSONPropertyName = (JSONPropertyName) getAnnotation(method, JSONPropertyName.class);
        if (jSONPropertyName != null && jSONPropertyName.value() != null && !jSONPropertyName.value().isEmpty()) {
            return jSONPropertyName.value();
        }
        String name = method.getName();
        if (name.startsWith("get") && name.length() > 3) {
            strSubstring = name.substring(3);
        } else {
            if (!name.startsWith("is") || name.length() <= 2) {
                return null;
            }
            strSubstring = name.substring(2);
        }
        if (Character.isLowerCase(strSubstring.charAt(0))) {
            return null;
        }
        if (strSubstring.length() == 1) {
            return strSubstring.toLowerCase(Locale.ROOT);
        }
        if (Character.isUpperCase(strSubstring.charAt(1))) {
            return strSubstring;
        }
        return strSubstring.substring(0, 1).toLowerCase(Locale.ROOT) + strSubstring.substring(1);
    }

    public static String[] getNames(JSONObject jSONObject) {
        if (jSONObject.isEmpty()) {
            return null;
        }
        return (String[]) jSONObject.keySet().toArray(new String[jSONObject.length()]);
    }

    public static final void indent(Writer writer, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    public static boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }

    private boolean isValidMethodName(String str) {
        return ("getClass".equals(str) || "getDeclaringClass".equals(str)) ? false : true;
    }

    public static String numberToString(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        testValidity(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    private void populateMap(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String keyNameFromMethod;
        Class<?> cls = obj.getClass();
        for (Method method : cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE && isValidMethodName(method.getName()) && (keyNameFromMethod = getKeyNameFromMethod(method)) != null && !keyNameFromMethod.isEmpty()) {
                try {
                    Object objInvoke = method.invoke(obj, null);
                    if (objInvoke != null) {
                        this.map.put(keyNameFromMethod, wrap(objInvoke));
                        if (objInvoke instanceof Closeable) {
                            ((Closeable) objInvoke).close();
                        }
                    }
                } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static String quote(String str) {
        String string;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    string = quote(str, stringWriter).toString();
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static Number stringToNumber(String str) throws NumberFormatException {
        char cCharAt = str.charAt(0);
        if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-') {
            throw new NumberFormatException(zr6.i("val [", str, "] is not a valid number."));
        }
        if (!isDecimalNotation(str)) {
            BigInteger bigInteger = new BigInteger(str);
            return bigInteger.bitLength() <= 31 ? Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
        }
        if (str.length() > 14) {
            return new BigDecimal(str);
        }
        Double dValueOf = Double.valueOf(str);
        return (dValueOf.isInfinite() || dValueOf.isNaN()) ? new BigDecimal(str) : dValueOf;
    }

    public static Object stringToValue(String str) throws NumberFormatException {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return NULL;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
            try {
                if (isDecimalNotation(str)) {
                    Double dValueOf = Double.valueOf(str);
                    if (!dValueOf.isInfinite() && !dValueOf.isNaN()) {
                        return dValueOf;
                    }
                } else {
                    Long lValueOf = Long.valueOf(str);
                    if (str.equals(lValueOf.toString())) {
                        return lValueOf.longValue() == ((long) lValueOf.intValue()) ? Integer.valueOf(lValueOf.intValue()) : lValueOf;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static void testValidity(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public static String valueToString(Object obj) throws JSONException {
        return JSONWriter.valueToString(obj);
    }

    public static Object wrap(Object obj) {
        try {
            if (obj == null) {
                return NULL;
            }
            if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && !NULL.equals(obj) && !(obj instanceof JSONString) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof BigInteger) && !(obj instanceof BigDecimal) && !(obj instanceof Enum)) {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection<?>) obj);
                }
                if (obj.getClass().isArray()) {
                    return new JSONArray(obj);
                }
                if (obj instanceof Map) {
                    return new JSONObject((Map<?, ?>) obj);
                }
                Package r0 = obj.getClass().getPackage();
                String name = r0 != null ? r0.getName() : "";
                if (!name.startsWith("java.") && !name.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                    return new JSONObject(obj);
                }
                return obj.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Writer writeValue(Writer writer, Object obj, int i, int i2) throws JSONException, IOException {
        if (obj == null || obj.equals(null)) {
            writer.write("null");
        } else if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                writer.write(jSONString != null ? jSONString.toString() : quote(obj.toString()));
            } catch (Exception e) {
                throw new JSONException(e);
            }
        } else if (obj instanceof Number) {
            String strNumberToString = numberToString((Number) obj);
            try {
                new BigDecimal(strNumberToString);
                writer.write(strNumberToString);
            } catch (NumberFormatException unused) {
                quote(strNumberToString, writer);
            }
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof Enum) {
            writer.write(quote(((Enum) obj).name()));
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).write(writer, i, i2);
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).write(writer, i, i2);
        } else if (obj instanceof Map) {
            new JSONObject((Map<?, ?>) obj).write(writer, i, i2);
        } else if (obj instanceof Collection) {
            new JSONArray((Collection<?>) obj).write(writer, i, i2);
        } else if (obj.getClass().isArray()) {
            new JSONArray(obj).write(writer, i, i2);
        } else {
            quote(obj.toString(), writer);
        }
        return writer;
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object objOpt = opt(str);
        if (objOpt == null) {
            if (obj instanceof JSONArray) {
                obj = new JSONArray().put(obj);
            }
            put(str, obj);
        } else if (objOpt instanceof JSONArray) {
            ((JSONArray) objOpt).put(obj);
        } else {
            put(str, new JSONArray().put(objOpt).put(obj));
        }
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object objOpt = opt(str);
        if (objOpt == null) {
            put(str, new JSONArray().put(obj));
        } else {
            if (!(objOpt instanceof JSONArray)) {
                throw new JSONException(zr6.i("JSONObject[", str, "] is not a JSONArray."));
            }
            put(str, ((JSONArray) objOpt).put(obj));
        }
        return this;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public Object get(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        Object objOpt = opt(str);
        if (objOpt != null) {
            return objOpt;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not found.");
    }

    public BigDecimal getBigDecimal(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        try {
            return new BigDecimal(obj.toString());
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] could not be converted to BigDecimal.", e);
        }
    }

    public BigInteger getBigInteger(String str) throws JSONException {
        try {
            return new BigInteger(get(str).toString());
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] could not be converted to BigInteger.", e);
        }
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z = obj instanceof String;
        if (z && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z && ((String) obj).equalsIgnoreCase("true")) {
            return true;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a Boolean.");
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) throws JSONException {
        E e = (E) optEnum(cls, str);
        if (e != null) {
            return e;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not an enum of type " + quote(cls.getSimpleName()) + ".");
    }

    public float getFloat(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not an int.", e);
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONObject.");
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a long.", e);
        }
    }

    public Number getNumber(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? (Number) obj : stringToNumber(obj.toString());
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] not a string.");
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public JSONObject increment(String str) throws JSONException {
        Object objOpt = opt(str);
        if (objOpt == null) {
            put(str, 1);
        } else if (objOpt instanceof BigInteger) {
            put(str, ((BigInteger) objOpt).add(BigInteger.ONE));
        } else if (objOpt instanceof BigDecimal) {
            put(str, ((BigDecimal) objOpt).add(BigDecimal.ONE));
        } else if (objOpt instanceof Integer) {
            put(str, ((Integer) objOpt).intValue() + 1);
        } else if (objOpt instanceof Long) {
            put(str, ((Long) objOpt).longValue() + 1);
        } else if (objOpt instanceof Double) {
            put(str, ((Double) objOpt).doubleValue() + 1.0d);
        } else {
            if (!(objOpt instanceof Float)) {
                throw new JSONException("Unable to increment [" + quote(str) + "].");
            }
            put(str, ((Float) objOpt).floatValue() + 1.0f);
        }
        return this;
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public Iterator<String> keys() {
        return keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        if (this.map.isEmpty()) {
            return null;
        }
        return new JSONArray((Collection<?>) this.map.keySet());
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public BigDecimal optBigDecimal(String str, BigDecimal bigDecimal) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return bigDecimal;
        }
        if (objOpt instanceof BigDecimal) {
            return (BigDecimal) objOpt;
        }
        if (objOpt instanceof BigInteger) {
            return new BigDecimal((BigInteger) objOpt);
        }
        if ((objOpt instanceof Double) || (objOpt instanceof Float)) {
            return new BigDecimal(((Number) objOpt).doubleValue());
        }
        if ((objOpt instanceof Long) || (objOpt instanceof Integer) || (objOpt instanceof Short) || (objOpt instanceof Byte)) {
            return new BigDecimal(((Number) objOpt).longValue());
        }
        try {
            return new BigDecimal(objOpt.toString());
        } catch (Exception unused) {
            return bigDecimal;
        }
    }

    public BigInteger optBigInteger(String str, BigInteger bigInteger) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return bigInteger;
        }
        if (objOpt instanceof BigInteger) {
            return (BigInteger) objOpt;
        }
        if (objOpt instanceof BigDecimal) {
            return ((BigDecimal) objOpt).toBigInteger();
        }
        if ((objOpt instanceof Double) || (objOpt instanceof Float)) {
            return new BigDecimal(((Number) objOpt).doubleValue()).toBigInteger();
        }
        if ((objOpt instanceof Long) || (objOpt instanceof Integer) || (objOpt instanceof Short) || (objOpt instanceof Byte)) {
            return BigInteger.valueOf(((Number) objOpt).longValue());
        }
        try {
            String string = objOpt.toString();
            return isDecimalNotation(string) ? new BigDecimal(string).toBigInteger() : new BigInteger(string);
        } catch (Exception unused) {
            return bigInteger;
        }
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str) {
        return (E) optEnum(cls, str, null);
    }

    public float optFloat(String str) {
        return optFloat(str, Float.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public JSONArray optJSONArray(String str) {
        Object objOpt = opt(str);
        if (objOpt instanceof JSONArray) {
            return (JSONArray) objOpt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        Object objOpt = opt(str);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public Number optNumber(String str) {
        return optNumber(str, null);
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        return put(str, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return this;
        }
        if (opt(str) == null) {
            return put(str, obj);
        }
        throw new JSONException(zr6.i("Duplicate key \"", str, "\""));
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        return (str == null || obj == null) ? this : put(str, obj);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public boolean similar(Object obj) {
        try {
            if (!(obj instanceof JSONObject) || !keySet().equals(((JSONObject) obj).keySet())) {
                return false;
            }
            for (Map.Entry<String, Object> entry : entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = ((JSONObject) obj).get(key);
                if (value != obj2) {
                    if (value == null) {
                        return false;
                    }
                    if (value instanceof JSONObject) {
                        if (!((JSONObject) value).similar(obj2)) {
                            return false;
                        }
                    } else if (value instanceof JSONArray) {
                        if (!((JSONArray) value).similar(obj2)) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(opt(jSONArray.getString(i)));
        }
        return jSONArray2;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            map.put(entry.getKey(), (entry.getValue() == null || NULL.equals(entry.getValue())) ? null : entry.getValue() instanceof JSONObject ? ((JSONObject) entry.getValue()).toMap() : entry.getValue() instanceof JSONArray ? ((JSONArray) entry.getValue()).toList() : entry.getValue());
        }
        return map;
    }

    public String toString() {
        try {
            return toString(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws JSONException {
        return write(writer, 0, 0);
    }

    public boolean optBoolean(String str, boolean z) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return z;
        }
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(String str, double d) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return d;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).doubleValue();
        }
        if (objOpt instanceof String) {
            try {
                return Double.parseDouble((String) objOpt);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str, E e) {
        try {
            Object objOpt = opt(str);
            return NULL.equals(objOpt) ? e : cls.isAssignableFrom(objOpt.getClass()) ? (E) objOpt : (E) Enum.valueOf(cls, objOpt.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return e;
        }
    }

    public float optFloat(String str, float f) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return f;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).floatValue();
        }
        if (objOpt instanceof String) {
            try {
                return Float.parseFloat((String) objOpt);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public int optInt(String str, int i) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return i;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).intValue();
        }
        if (objOpt instanceof String) {
            try {
                return new BigDecimal((String) objOpt).intValue();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public long optLong(String str, long j) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return j;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).longValue();
        }
        if (objOpt instanceof String) {
            try {
                return new BigDecimal((String) objOpt).longValue();
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public Number optNumber(String str, Number number) {
        Object objOpt = opt(str);
        if (NULL.equals(objOpt)) {
            return number;
        }
        if (objOpt instanceof Number) {
            return (Number) objOpt;
        }
        if (objOpt instanceof String) {
            try {
                return stringToNumber((String) objOpt);
            } catch (Exception unused) {
            }
        }
        return number;
    }

    public Object optQuery(JSONPointer jSONPointer) {
        try {
            return jSONPointer.queryFrom(this);
        } catch (JSONPointerException unused) {
            return null;
        }
    }

    public String optString(String str, String str2) {
        Object objOpt = opt(str);
        return NULL.equals(objOpt) ? str2 : objOpt.toString();
    }

    public JSONObject put(String str, Collection<?> collection) throws JSONException {
        return put(str, new JSONArray(collection));
    }

    public Object query(JSONPointer jSONPointer) {
        return jSONPointer.queryFrom(this);
    }

    public String toString(int i) throws JSONException {
        String string;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            string = write(stringWriter, i, 0).toString();
        }
        return string;
    }

    public Writer write(Writer writer, int i, int i2) throws JSONException, IOException {
        try {
            int length = length();
            writer.write(123);
            if (length == 1) {
                Map.Entry<String, Object> next = entrySet().iterator().next();
                String key = next.getKey();
                writer.write(quote(key));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                try {
                    writeValue(writer, next.getValue(), i, i2);
                } catch (Exception e) {
                    throw new JSONException("Unable to write JSONObject value for key: " + key, e);
                }
            } else if (length != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry<String, Object> entry : entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    indent(writer, i3);
                    String key2 = entry.getKey();
                    writer.write(quote(key2));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    try {
                        writeValue(writer, entry.getValue(), i, i3);
                        z = true;
                    } catch (Exception e2) {
                        throw new JSONException("Unable to write JSONObject value for key: " + key2, e2);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                indent(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (IOException e3) {
            throw new JSONException(e3);
        }
    }

    public JSONObject(JSONObject jSONObject, String[] strArr) {
        this(strArr.length);
        for (String str : strArr) {
            try {
                putOnce(str, jSONObject.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    public static String[] getNames(Object obj) {
        Field[] fields;
        int length;
        if (obj == null || (length = (fields = obj.getClass().getFields()).length) == 0) {
            return null;
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = fields[i].getName();
        }
        return strArr;
    }

    public JSONObject put(String str, double d) throws JSONException {
        return put(str, Double.valueOf(d));
    }

    public JSONObject put(String str, float f) throws JSONException {
        return put(str, Float.valueOf(f));
    }

    public JSONObject put(String str, int i) throws JSONException {
        return put(str, Integer.valueOf(i));
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() != '{') {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            char cNextClean = jSONTokener.nextClean();
            if (cNextClean == 0) {
                throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
            }
            if (cNextClean == '}') {
                return;
            }
            jSONTokener.back();
            String string = jSONTokener.nextValue().toString();
            if (jSONTokener.nextClean() == ':') {
                if (string != null) {
                    if (opt(string) == null) {
                        Object objNextValue = jSONTokener.nextValue();
                        if (objNextValue != null) {
                            put(string, objNextValue);
                        }
                    } else {
                        throw jSONTokener.syntaxError("Duplicate key \"" + string + "\"");
                    }
                }
                char cNextClean2 = jSONTokener.nextClean();
                if (cNextClean2 != ',' && cNextClean2 != ';') {
                    if (cNextClean2 != '}') {
                        throw jSONTokener.syntaxError("Expected a ',' or '}'");
                    }
                    return;
                } else if (jSONTokener.nextClean() == '}') {
                    return;
                } else {
                    jSONTokener.back();
                }
            } else {
                throw jSONTokener.syntaxError("Expected a ':' after a key");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Writer quote(java.lang.String r8, java.io.Writer r9) throws java.io.IOException {
        /*
            if (r8 == 0) goto L99
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto La
            goto L99
        La:
            int r0 = r8.length()
            r1 = 34
            r9.write(r1)
            r2 = 0
            r3 = r2
            r4 = r3
        L16:
            if (r3 >= r0) goto L95
            char r5 = r8.charAt(r3)
            r6 = 12
            if (r5 == r6) goto L8c
            r6 = 13
            if (r5 == r6) goto L86
            r6 = 92
            if (r5 == r1) goto L7f
            r7 = 47
            if (r5 == r7) goto L74
            if (r5 == r6) goto L7f
            switch(r5) {
                case 8: goto L6e;
                case 9: goto L68;
                case 10: goto L62;
                default: goto L31;
            }
        L31:
            r4 = 32
            if (r5 < r4) goto L4a
            r4 = 128(0x80, float:1.8E-43)
            if (r5 < r4) goto L3d
            r4 = 160(0xa0, float:2.24E-43)
            if (r5 < r4) goto L4a
        L3d:
            r4 = 8192(0x2000, float:1.148E-41)
            if (r5 < r4) goto L46
            r4 = 8448(0x2100, float:1.1838E-41)
            if (r5 >= r4) goto L46
            goto L4a
        L46:
            r9.write(r5)
            goto L91
        L4a:
            java.lang.String r4 = "\\u"
            r9.write(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r5)
            int r6 = r4.length()
            int r6 = 4 - r6
            java.lang.String r7 = "0000"
            r9.write(r7, r2, r6)
            r9.write(r4)
            goto L91
        L62:
            java.lang.String r4 = "\\n"
            r9.write(r4)
            goto L91
        L68:
            java.lang.String r4 = "\\t"
            r9.write(r4)
            goto L91
        L6e:
            java.lang.String r4 = "\\b"
            r9.write(r4)
            goto L91
        L74:
            r7 = 60
            if (r4 != r7) goto L7b
            r9.write(r6)
        L7b:
            r9.write(r5)
            goto L91
        L7f:
            r9.write(r6)
            r9.write(r5)
            goto L91
        L86:
            java.lang.String r4 = "\\r"
            r9.write(r4)
            goto L91
        L8c:
            java.lang.String r4 = "\\f"
            r9.write(r4)
        L91:
            int r3 = r3 + 1
            r4 = r5
            goto L16
        L95:
            r9.write(r1)
            return r9
        L99:
            java.lang.String r8 = "\"\""
            r9.write(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.quote(java.lang.String, java.io.Writer):java.io.Writer");
    }

    public JSONObject put(String str, long j) throws JSONException {
        return put(str, Long.valueOf(j));
    }

    public JSONObject put(String str, Map<?, ?> map) throws JSONException {
        return put(str, new JSONObject(map));
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new NullPointerException("Null key.");
        }
        if (obj != null) {
            testValidity(obj);
            this.map.put(str, obj);
        } else {
            remove(str);
        }
        return this;
    }

    public JSONObject(Map<?, ?> map) {
        if (map == null) {
            this.map = new HashMap();
            return;
        }
        this.map = new HashMap(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Object value = entry.getValue();
                if (value != null) {
                    this.map.put(String.valueOf(entry.getKey()), wrap(value));
                }
            } else {
                throw new NullPointerException("Null key.");
            }
        }
    }

    public JSONObject(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this();
        populateMap(obj);
    }

    public JSONObject(Object obj, String[] strArr) {
        this(strArr.length);
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String strNextElement = keys.nextElement();
            if (strNextElement != null) {
                String str2 = strNextElement;
                String[] strArrSplit = str2.split("\\.");
                int length = strArrSplit.length - 1;
                JSONObject jSONObject = this;
                for (int i = 0; i < length; i++) {
                    String str3 = strArrSplit[i];
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str3);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                        jSONObject.put(str3, jSONObjectOptJSONObject);
                    }
                    jSONObject = jSONObjectOptJSONObject;
                }
                jSONObject.put(strArrSplit[length], bundle.getString(str2));
            }
        }
    }

    public JSONObject(int i) {
        this.map = new HashMap(i);
    }
}
