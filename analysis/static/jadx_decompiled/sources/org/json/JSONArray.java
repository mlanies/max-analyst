package org.json;

import defpackage.rh4;
import defpackage.wg0;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class JSONArray implements Iterable<Object> {
    private final ArrayList<Object> myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList<>();
    }

    public Object get(int i) throws JSONException {
        Object objOpt = opt(i);
        if (objOpt != null) {
            return objOpt;
        }
        throw new JSONException(wg0.g(i, "JSONArray[", "] not found."));
    }

    public BigDecimal getBigDecimal(int i) throws JSONException {
        try {
            return new BigDecimal(get(i).toString());
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] could not convert to BigDecimal."), e);
        }
    }

    public BigInteger getBigInteger(int i) throws JSONException {
        try {
            return new BigInteger(get(i).toString());
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] could not convert to BigInteger."), e);
        }
    }

    public boolean getBoolean(int i) throws JSONException {
        Object obj = get(i);
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
        throw new JSONException(wg0.g(i, "JSONArray[", "] is not a boolean."));
    }

    public double getDouble(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble((String) obj);
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] is not a number."), e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, int i) throws JSONException {
        E e = (E) optEnum(cls, i);
        if (e != null) {
            return e;
        }
        StringBuilder sbN = rh4.n(i, "JSONArray[", "] is not an enum of type ");
        sbN.append(JSONObject.quote(cls.getSimpleName()));
        sbN.append(".");
        throw new JSONException(sbN.toString());
    }

    public float getFloat(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] is not a number."), e);
        }
    }

    public int getInt(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt((String) obj);
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] is not a number."), e);
        }
    }

    public JSONArray getJSONArray(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException(wg0.g(i, "JSONArray[", "] is not a JSONArray."));
    }

    public JSONObject getJSONObject(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException(wg0.g(i, "JSONArray[", "] is not a JSONObject."));
    }

    public long getLong(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] is not a number."), e);
        }
    }

    public Number getNumber(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? (Number) obj : JSONObject.stringToNumber(obj.toString());
        } catch (Exception e) {
            throw new JSONException(wg0.g(i, "JSONArray[", "] is not a number."), e);
        }
    }

    public String getString(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new JSONException(wg0.g(i, "JSONArray[", "] not a string."));
    }

    public boolean isEmpty() {
        return this.myArrayList.isEmpty();
    }

    public boolean isNull(int i) {
        return JSONObject.NULL.equals(opt(i));
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.myArrayList.iterator();
    }

    public String join(String str) throws JSONException {
        int length = length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(JSONObject.valueToString(this.myArrayList.get(i)));
        }
        return sb.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int i) {
        if (i < 0 || i >= length()) {
            return null;
        }
        return this.myArrayList.get(i);
    }

    public BigDecimal optBigDecimal(int i, BigDecimal bigDecimal) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
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

    public BigInteger optBigInteger(int i, BigInteger bigInteger) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
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
            return JSONObject.isDecimalNotation(string) ? new BigDecimal(string).toBigInteger() : new BigInteger(string);
        } catch (Exception unused) {
            return bigInteger;
        }
    }

    public boolean optBoolean(int i) {
        return optBoolean(i, false);
    }

    public double optDouble(int i) {
        return optDouble(i, Double.NaN);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, int i) {
        return (E) optEnum(cls, i, null);
    }

    public float optFloat(int i) {
        return optFloat(i, Float.NaN);
    }

    public int optInt(int i) {
        return optInt(i, 0);
    }

    public JSONArray optJSONArray(int i) {
        Object objOpt = opt(i);
        if (objOpt instanceof JSONArray) {
            return (JSONArray) objOpt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i) {
        Object objOpt = opt(i);
        if (objOpt instanceof JSONObject) {
            return (JSONObject) objOpt;
        }
        return null;
    }

    public long optLong(int i) {
        return optLong(i, 0L);
    }

    public Number optNumber(int i) {
        return optNumber(i, null);
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public String optString(int i) {
        return optString(i, "");
    }

    public JSONArray put(boolean z) {
        return put(z ? Boolean.TRUE : Boolean.FALSE);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object remove(int i) {
        if (i < 0 || i >= length()) {
            return null;
        }
        return this.myArrayList.remove(i);
    }

    public boolean similar(Object obj) {
        if (!(obj instanceof JSONArray)) {
            return false;
        }
        int length = length();
        JSONArray jSONArray = (JSONArray) obj;
        if (length != jSONArray.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj2 = this.myArrayList.get(i);
            Object obj3 = jSONArray.myArrayList.get(i);
            if (obj2 != obj3) {
                if (obj2 == null) {
                    return false;
                }
                if (obj2 instanceof JSONObject) {
                    if (!((JSONObject) obj2).similar(obj3)) {
                        return false;
                    }
                } else if (obj2 instanceof JSONArray) {
                    if (!((JSONArray) obj2).similar(obj3)) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty() || isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONObject.put(jSONArray.getString(i), opt(i));
        }
        return jSONObject;
    }

    public List<Object> toList() {
        ArrayList arrayList = new ArrayList(this.myArrayList.size());
        Iterator<Object> it = this.myArrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null || JSONObject.NULL.equals(next)) {
                arrayList.add(null);
            } else if (next instanceof JSONArray) {
                arrayList.add(((JSONArray) next).toList());
            } else if (next instanceof JSONObject) {
                arrayList.add(((JSONObject) next).toMap());
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
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

    public boolean optBoolean(int i, boolean z) {
        try {
            return getBoolean(i);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(int i, double d) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
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

    public <E extends Enum<E>> E optEnum(Class<E> cls, int i, E e) {
        try {
            Object objOpt = opt(i);
            return JSONObject.NULL.equals(objOpt) ? e : cls.isAssignableFrom(objOpt.getClass()) ? (E) objOpt : (E) Enum.valueOf(cls, objOpt.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return e;
        }
    }

    public float optFloat(int i, float f) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
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

    public int optInt(int i, int i2) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
            return i2;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).intValue();
        }
        if (objOpt instanceof String) {
            try {
                return new BigDecimal(objOpt.toString()).intValue();
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    public long optLong(int i, long j) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
            return j;
        }
        if (objOpt instanceof Number) {
            return ((Number) objOpt).longValue();
        }
        if (objOpt instanceof String) {
            try {
                return new BigDecimal(objOpt.toString()).longValue();
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public Number optNumber(int i, Number number) {
        Object objOpt = opt(i);
        if (JSONObject.NULL.equals(objOpt)) {
            return number;
        }
        if (objOpt instanceof Number) {
            return (Number) objOpt;
        }
        if (objOpt instanceof String) {
            try {
                return JSONObject.stringToNumber((String) objOpt);
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

    public String optString(int i, String str) {
        Object objOpt = opt(i);
        return JSONObject.NULL.equals(objOpt) ? str : objOpt.toString();
    }

    public JSONArray put(Collection<?> collection) {
        return put(new JSONArray(collection));
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
            writer.write(91);
            int i3 = 0;
            if (length == 1) {
                try {
                    JSONObject.writeValue(writer, this.myArrayList.get(0), i, i2);
                } catch (Exception e) {
                    throw new JSONException("Unable to write JSONArray value at index: 0", e);
                }
            } else if (length != 0) {
                int i4 = i2 + i;
                boolean z = false;
                while (i3 < length) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    JSONObject.indent(writer, i4);
                    try {
                        JSONObject.writeValue(writer, this.myArrayList.get(i3), i, i4);
                        i3++;
                        z = true;
                    } catch (Exception e2) {
                        throw new JSONException("Unable to write JSONArray value at index: " + i3, e2);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                JSONObject.indent(writer, i2);
            }
            writer.write(93);
            return writer;
        } catch (IOException e3) {
            throw new JSONException(e3);
        }
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() == '[') {
            char cNextClean = jSONTokener.nextClean();
            if (cNextClean == 0) {
                throw jSONTokener.syntaxError("Expected a ',' or ']'");
            }
            if (cNextClean == ']') {
                return;
            }
            jSONTokener.back();
            while (true) {
                if (jSONTokener.nextClean() == ',') {
                    jSONTokener.back();
                    this.myArrayList.add(JSONObject.NULL);
                } else {
                    jSONTokener.back();
                    this.myArrayList.add(jSONTokener.nextValue());
                }
                char cNextClean2 = jSONTokener.nextClean();
                if (cNextClean2 == 0) {
                    throw jSONTokener.syntaxError("Expected a ',' or ']'");
                }
                if (cNextClean2 != ',') {
                    if (cNextClean2 != ']') {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    }
                    return;
                }
                char cNextClean3 = jSONTokener.nextClean();
                if (cNextClean3 == 0) {
                    throw jSONTokener.syntaxError("Expected a ',' or ']'");
                }
                if (cNextClean3 == ']') {
                    return;
                } else {
                    jSONTokener.back();
                }
            }
        } else {
            throw jSONTokener.syntaxError("A JSONArray text must start with '['");
        }
    }

    public JSONArray put(double d) throws JSONException {
        return put(Double.valueOf(d));
    }

    public JSONArray put(float f) throws JSONException {
        return put(Float.valueOf(f));
    }

    public JSONArray put(int i) {
        return put(Integer.valueOf(i));
    }

    public JSONArray put(long j) {
        return put(Long.valueOf(j));
    }

    public JSONArray put(Map<?, ?> map) {
        return put(new JSONObject(map));
    }

    public JSONArray put(Object obj) {
        JSONObject.testValidity(obj);
        this.myArrayList.add(obj);
        return this;
    }

    public JSONArray put(int i, boolean z) throws JSONException {
        return put(i, z ? Boolean.TRUE : Boolean.FALSE);
    }

    public JSONArray put(int i, Collection<?> collection) throws JSONException {
        return put(i, new JSONArray(collection));
    }

    public JSONArray put(int i, double d) throws JSONException {
        return put(i, Double.valueOf(d));
    }

    public JSONArray put(int i, float f) throws JSONException {
        return put(i, Float.valueOf(f));
    }

    public JSONArray put(int i, int i2) throws JSONException {
        return put(i, Integer.valueOf(i2));
    }

    public JSONArray put(int i, long j) throws JSONException {
        return put(i, Long.valueOf(j));
    }

    public JSONArray put(int i, Map<?, ?> map) throws JSONException {
        put(i, new JSONObject(map));
        return this;
    }

    public JSONArray put(int i, Object obj) throws JSONException {
        if (i >= 0) {
            if (i < length()) {
                JSONObject.testValidity(obj);
                this.myArrayList.set(i, obj);
                return this;
            }
            if (i == length()) {
                return put(obj);
            }
            this.myArrayList.ensureCapacity(i + 1);
            while (i != length()) {
                this.myArrayList.add(JSONObject.NULL);
            }
            return put(obj);
        }
        throw new JSONException(wg0.g(i, "JSONArray[", "] not found."));
    }

    public JSONArray(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONArray(Collection<?> collection) {
        if (collection == null) {
            this.myArrayList = new ArrayList<>();
            return;
        }
        this.myArrayList = new ArrayList<>(collection.size());
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            this.myArrayList.add(JSONObject.wrap(it.next()));
        }
    }

    public JSONArray(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            this.myArrayList.ensureCapacity(length);
            for (int i = 0; i < length; i++) {
                put(JSONObject.wrap(Array.get(obj, i)));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }
}
