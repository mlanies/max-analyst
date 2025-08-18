package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpHost;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s5c {
    public static final oq9 a = new oq9(10);
    public static final lq9 b = new lq9();
    public static final /* synthetic */ int c = 0;

    public static l20 A(cu8 cu8Var, String str) {
        if (cu8Var == null || !cu8Var.n()) {
            return null;
        }
        int i = 0;
        while (true) {
            k8g k8gVar = cu8Var.z0;
            if (i >= k8gVar.i()) {
                return null;
            }
            l20 l20VarH = k8gVar.h(i);
            if (oag.d(l20VarH.r, str)) {
                return l20VarH;
            }
            i++;
        }
    }

    public static List B(cjg cjgVar) {
        String string = ((p7b) ((m7b) cjgVar.b)).a.g.getString("app.currentProxyList", null);
        if (M(string)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    eh3 eh3VarA = eh3.a((JSONObject) jSONArray.get(i));
                    if (eh3VarA != null) {
                        arrayList.add(eh3VarA);
                    }
                } catch (JSONException e) {
                    hm9.p("s5c", "parse proxy from string exception " + e.getMessage(), null);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            hm9.p("s5c", "parse from string exception " + e2.getMessage(), null);
            return Collections.emptyList();
        }
    }

    public static int C(l20 l20Var) {
        if (l20Var.f()) {
            return l20Var.b.o;
        }
        boolean zN = N(l20Var);
        s10 s10Var = l20Var.j;
        if (zN) {
            return s10Var.d.b.o;
        }
        if (l20Var.i()) {
            return l20Var.d.f;
        }
        if (P(l20Var)) {
            return s10Var.d.d.f;
        }
        if (l20Var.h()) {
            return l20Var.f.d;
        }
        return 0;
    }

    public static byte[] D(l20 l20Var) {
        x10 x10Var;
        if (l20Var.f()) {
            return l20Var.b.Y;
        }
        if (l20Var.i()) {
            return l20Var.d.j;
        }
        boolean zN = N(l20Var);
        s10 s10Var = l20Var.j;
        if (zN) {
            return s10Var.d.b.Y;
        }
        if (P(l20Var)) {
            return s10Var.d.d.j;
        }
        if (!l20Var.g() || (x10Var = l20Var.g.f) == null) {
            return null;
        }
        return x10Var.Y;
    }

    public static int E(l20 l20Var) {
        if (l20Var.f()) {
            return l20Var.b.c;
        }
        boolean zN = N(l20Var);
        s10 s10Var = l20Var.j;
        if (zN) {
            return s10Var.d.b.c;
        }
        if (l20Var.i()) {
            return l20Var.d.e;
        }
        if (P(l20Var)) {
            return s10Var.d.d.e;
        }
        if (l20Var.h()) {
            return l20Var.f.c;
        }
        return 0;
    }

    public static String F(s10 s10Var) {
        int iLastIndexOf;
        if (s10Var == null) {
            return null;
        }
        String str = s10Var.c;
        if (oag.t(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1 || iLastIndexOf >= str.length()) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static final Size G(Context context) {
        Size size = new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        return size.getHeight() > size.getWidth() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static int H(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void I(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            t(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            n(inputStream);
            m(fileOutputStream);
        }
    }

    public static String J(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }

    public static boolean K(l20 l20Var) {
        if (l20Var == null) {
            return false;
        }
        int iOrdinal = l20Var.a.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal == 9 && l20Var.j.a == 0 : l20Var.e.a == 0 : l20Var.d.a == 0 : l20Var.b.s0 == 0;
    }

    public static boolean L(cu8 cu8Var) {
        if (!cu8Var.n()) {
            return false;
        }
        k8g k8gVar = cu8Var.z0;
        return k8gVar.h(0).a() && oag.u(k8gVar.h(0).e.f);
    }

    public static boolean M(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean N(l20 l20Var) {
        s10 s10Var;
        l20 l20Var2;
        if (l20Var != null) {
            return (l20Var.a != g20.u0 || (s10Var = l20Var.j) == null || (l20Var2 = s10Var.d) == null || !l20Var2.f() || s10Var.d.b.X) ? false : true;
        }
        return false;
    }

    public static boolean O(j10 j10Var) {
        s10 s10VarB;
        l20 l20Var;
        return (j10Var == null || j10Var.a != g20.u0 || (s10VarB = j10Var.b()) == null || (l20Var = s10VarB.d) == null || !l20Var.i()) ? false : true;
    }

    public static boolean P(l20 l20Var) {
        s10 s10Var;
        l20 l20Var2;
        if (l20Var != null) {
            return l20Var.a == g20.u0 && (s10Var = l20Var.j) != null && (l20Var2 = s10Var.d) != null && l20Var2.i();
        }
        return false;
    }

    public static boolean Q(m7b m7bVar, k20 k20Var) {
        return k20Var != null && k20Var.g && ((p7b) m7bVar).a.n() < k20Var.k;
    }

    public static boolean R(l20 l20Var) {
        if (l20Var == null) {
            return false;
        }
        d20 d20Var = l20Var.o;
        if (!d20Var.d()) {
            return false;
        }
        if (P(l20Var)) {
            s10 s10Var = l20Var.j;
            return (s10Var == null || s10Var.a != 0 || d20Var.b()) ? false : true;
        }
        k20 k20Var = l20Var.d;
        return (k20Var == null || k20Var.a != 0 || d20Var.b()) ? false : true;
    }

    public static int S(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String T(Map map) {
        Object value;
        int i = 9;
        int i2 = 8;
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            value = entry.getValue();
            str.getClass();
            switch (str) {
                case "mt_instanceid":
                case "verifyCode":
                case "pushToken":
                case "text":
                case "token":
                case "configHash":
                case "password":
                    o84.Z.getClass();
                    value = "***";
                    break;
                case "messageIds":
                case "contactIds":
                case "chatIds":
                    if (!(value instanceof Iterable)) {
                        if (value instanceof long[]) {
                            long[] jArr = (long[]) value;
                            if (jArr != null && jArr.length != 0) {
                                value = ys.h0(jArr, ",", "[", "]", -1, "...", new g27(i));
                                break;
                            }
                        }
                    } else {
                        Iterable iterable = (Iterable) value;
                        if (iterable != null) {
                            g27 g27Var = new g27(i2);
                            StringBuilder sb2 = new StringBuilder();
                            x53.l0(iterable, sb2, ",", "[", "]", -1, "...", g27Var);
                            value = sb2.toString();
                            break;
                        }
                    }
                    break;
                case "events":
                    value = "[]";
                    break;
                case "phones":
                case "attachments":
                case "contacts":
                case "elements":
                    if (!(value instanceof Collection)) {
                        if (!(value instanceof Map)) {
                            if (value instanceof long[]) {
                                value = Integer.valueOf(((long[]) value).length);
                                break;
                            }
                        } else {
                            value = Integer.valueOf(((Map) value).size());
                            break;
                        }
                    } else {
                        value = Integer.valueOf(((Collection) value).size());
                        break;
                    }
                    break;
                case "draft":
                case "message":
                    if (value instanceof Map) {
                        value = T((Map) value);
                        break;
                    }
                    break;
            }
            sb.append(str);
            sb.append('=');
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static boolean U(l20 l20Var, es8 es8Var) {
        s10 s10Var;
        l20 l20Var2 = null;
        if (l20Var != null) {
            if (!l20Var.f()) {
                if (l20Var.a != g20.u0 || (s10Var = l20Var.j) == null || (l20Var = s10Var.d) == null || !l20Var.f()) {
                    l20Var = null;
                }
            }
            l20Var2 = l20Var;
        }
        return (l20Var2 == null || !l20Var2.f() || !l20Var2.z || l20Var2.y || es8Var.b.Y) ? false : true;
    }

    public static String V(String str, List list, d4c d4cVar, a4c a4cVar) {
        String[] strArrSplit = str.split(HTTP.CRLF);
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length) {
                i = -1;
                break;
            }
            if (strArrSplit[i].startsWith("m=audio")) {
                break;
            }
            i++;
        }
        if (i == -1) {
            c(d4cVar, a4cVar, "failed to find m=audio line in sdp");
            return str;
        }
        dcg dcgVarA = dcg.a(i, strArrSplit[i]);
        if (dcgVarA == null) {
            c(d4cVar, a4cVar, "failed to parse m=audio line");
            return str;
        }
        for (int i2 = i + 1; i2 < strArrSplit.length && !strArrSplit[i2].startsWith("m=audio"); i2++) {
            dcgVarA.e(i2, strArrSplit[i2]);
        }
        if (!dcgVarA.d(list)) {
            c(d4cVar, a4cVar, "failed to find any desired codecs");
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            int i4 = dcgVarA.c;
            if (i3 == i4) {
                dcgVarA.f(sb, list, false);
            } else if (i3 != i4 && !dcgVarA.a.contains(Integer.valueOf(i3))) {
                sb.append(strArrSplit[i3]);
                sb.append(HTTP.CRLF);
            } else if (!z) {
                dcgVarA.c(sb, list, false);
                z = true;
            }
        }
        return sb.toString();
    }

    public static void W(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (obj == null) {
            return;
        }
        int i = 0;
        if (obj instanceof qw8) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(u(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        W(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        W(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            W(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length3 = methods.length;
            while (i < length3) {
                String name2 = methods[i].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + strSubstring, null).invoke(obj, null)).booleanValue()) {
                            W(strSubstring, cls.getMethod("get" + strSubstring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i++;
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        if (obj instanceof Map) {
            String strU = u(str);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strU);
                stringBuffer2.append(" <\n");
                int length4 = stringBuffer.length();
                stringBuffer.append("  ");
                W("key", entry.getKey(), stringBuffer, stringBuffer2);
                W("value", entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length4);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        String strU2 = u(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(strU2);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && str2.length() > 200) {
                str2 = str2.substring(0, 200) + "[...]";
            }
            int length5 = str2.length();
            StringBuilder sb = new StringBuilder(length5);
            while (i < length5) {
                char cCharAt = str2.charAt(i);
                if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            String string = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(string);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer2.append('\"');
            while (i < bArr.length) {
                int i3 = bArr[i] & 255;
                if (i3 == 92 || i3 == 34) {
                    stringBuffer2.append('\\');
                    stringBuffer2.append((char) i3);
                } else if (i3 < 32 || i3 >= 127) {
                    stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                } else {
                    stringBuffer2.append((char) i3);
                }
                i++;
            }
            stringBuffer2.append('\"');
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    public static long X(yaf yafVar, int i, int i2) {
        yafVar.H(i);
        if (yafVar.c() < 5) {
            return -9223372036854775807L;
        }
        int iH = yafVar.h();
        if ((8388608 & iH) != 0 || ((2096896 & iH) >> 8) != i2 || (iH & 32) == 0 || yafVar.v() < 7 || yafVar.c() < 7 || (yafVar.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        yafVar.g(0, new byte[6], 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static int Y(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void Z(View view, eh7 eh7Var) {
        view.setTag(ayb.view_tree_lifecycle_owner, eh7Var);
    }

    public static final q46 a(Context context, k56 k56Var) {
        GestureDetector gestureDetector = new GestureDetector(context, new ua6(0, k56Var));
        gestureDetector.setIsLongpressEnabled(false);
        return new q46(gestureDetector, 2);
    }

    public static boolean a0(m7b m7bVar, k20 k20Var) {
        if (k20Var == null || !k20Var.g) {
            return false;
        }
        return Q(m7bVar, k20Var) || oag.t(k20Var.d);
    }

    public static dcg b(boolean z, String[] strArr, a4c a4cVar) {
        String str = z ? "m=audio " : "m=video ";
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (strArr[i].startsWith(str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            a4cVar.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        dcg dcgVarA = dcg.a(i, strArr[i]);
        if (dcgVarA == null) {
            a4cVar.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        while (true) {
            i++;
            if (i >= strArr.length || strArr[i].startsWith("m=")) {
                break;
            }
            dcgVarA.e(i, strArr[i]);
        }
        return dcgVarA;
    }

    public static boolean b0(p7b p7bVar, l20 l20Var) {
        if (l20Var == null) {
            return false;
        }
        return a0(p7bVar, P(l20Var) ? l20Var.j.d.d : l20Var.d);
    }

    public static void c(d4c d4cVar, a4c a4cVar, String str) {
        d4cVar.log(e0e.callPreferH264Sdp, "fail", (String) null);
        a4cVar.log("CodecPrefUtil", str);
    }

    public static int[] c0(Collection collection) {
        if (collection instanceof o47) {
            o47 o47Var = (o47) collection;
            return Arrays.copyOfRange(o47Var.a, o47Var.b, o47Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final StackTraceElement d(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final gx0 d0(vw0 vw0Var) {
        switch (vw0Var.ordinal()) {
            case 0:
                return gx0.b;
            case 1:
                return gx0.c;
            case 2:
                return gx0.o;
            case 3:
                return gx0.X;
            case 4:
                return gx0.Z;
            case 5:
                return gx0.s0;
            case 6:
                return gx0.t0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String e(String str, String str2, String str3, d4c d4cVar, a4c a4cVar) {
        String str4;
        String str5;
        int i;
        String string;
        String str6;
        b9b b9bVar;
        int iIndexOf;
        String str7;
        String strSubstring;
        String[] strArrSplit = str.split(HTTP.CRLF);
        int i2 = 0;
        while (true) {
            if (i2 >= strArrSplit.length) {
                i2 = -1;
                break;
            }
            if (strArrSplit[i2].startsWith("m=audio")) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            c(d4cVar, a4cVar, "failed to find m=audio line in sdp");
            return str;
        }
        dcg dcgVarA = dcg.a(i2, strArrSplit[i2]);
        if (dcgVarA == null) {
            c(d4cVar, a4cVar, "failed to parse m=audio line");
            return str;
        }
        for (int i3 = i2 + 1; i3 < strArrSplit.length && !strArrSplit[i3].startsWith("m=audio"); i3++) {
            dcgVarA.e(i3, strArrSplit[i3]);
        }
        if (!(!dcgVarA.b("opus").isEmpty())) {
            c(d4cVar, a4cVar, "failed to find desired codec");
            return str;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = dcgVarA.b("opus").iterator();
        String str8 = null;
        String str9 = null;
        while (it.hasNext()) {
            xbg xbgVar = (xbg) it.next();
            String str10 = xbgVar.a;
            Iterator it2 = xbgVar.c.iterator();
            while (it2.hasNext()) {
                String str11 = (String) it2.next();
                arrayList.add(str11);
                if (str11.startsWith("a=fmtp:")) {
                    str9 = str11;
                }
            }
            str8 = str10;
        }
        if (str8 == null) {
            c(d4cVar, a4cVar, "failed to find desired lines");
            return str;
        }
        if (str9 != null) {
            if (str9.startsWith("a=fmtp:") && (iIndexOf = str9.indexOf(32, 6)) >= 0) {
                String strSubstring2 = str9.substring(0, iIndexOf);
                String strSubstring3 = str9.substring(iIndexOf + 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] strArrSplit2 = strSubstring3.split(";");
                int length = strArrSplit2.length;
                str5 = str9;
                int i4 = 0;
                while (i4 < length) {
                    String[] strArr = strArrSplit2;
                    String strTrim = strArrSplit2[i4].trim();
                    int i5 = length;
                    int iIndexOf2 = strTrim.indexOf(61);
                    if (iIndexOf2 < 0) {
                        str7 = str8;
                        strSubstring = null;
                    } else {
                        str7 = str8;
                        String strSubstring4 = strTrim.substring(0, iIndexOf2);
                        strSubstring = strTrim.substring(iIndexOf2 + 1);
                        strTrim = strSubstring4;
                    }
                    linkedHashMap.put(strTrim, strSubstring);
                    i4++;
                    length = i5;
                    strArrSplit2 = strArr;
                    str8 = str7;
                }
                str4 = str8;
                i = 0;
                b9bVar = new b9b(strSubstring2, linkedHashMap);
            } else {
                str4 = str8;
                str5 = str9;
                b9bVar = null;
                i = 0;
            }
            if (b9bVar == null || !b9bVar.e(str2, str3, d4cVar, a4cVar)) {
                return str;
            }
            string = b9bVar.toString();
        } else {
            str4 = str8;
            str5 = str9;
            i = 0;
            string = null;
        }
        StringBuilder sb = new StringBuilder();
        if (string == null) {
            int i6 = i;
            while (i6 < strArrSplit.length) {
                String str12 = strArrSplit[i6];
                sb.append(str12);
                sb.append(HTTP.CRLF);
                i6++;
                int i7 = i6 < strArrSplit.length ? 1 : i;
                if (!arrayList.contains(str12) || (i7 != 0 && arrayList.contains(strArrSplit[i6]))) {
                    str6 = str4;
                } else {
                    str6 = str4;
                    b9b b9bVar2 = new b9b("a=fmtp:".concat(str6), (LinkedHashMap) null);
                    if (b9bVar2.e(str2, str3, d4cVar, a4cVar)) {
                        sb.append(b9bVar2);
                        sb.append(HTTP.CRLF);
                    }
                }
                str4 = str6;
            }
        } else {
            int length2 = strArrSplit.length;
            while (i < length2) {
                String str13 = strArrSplit[i];
                String str14 = str5;
                if (str13.equals(str14)) {
                    sb.append(string);
                } else {
                    sb.append(str13);
                }
                sb.append(HTTP.CRLF);
                i++;
                str5 = str14;
            }
        }
        return sb.toString();
    }

    public static final String e0(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer f0(java.lang.String r20) {
        /*
            r0 = r20
            r1 = 1
            r20.getClass()
            boolean r2 = r20.isEmpty()
            if (r2 == 0) goto Lf
        Lc:
            r0 = 0
            goto L7d
        Lf:
            r2 = 0
            char r4 = r0.charAt(r2)
            r5 = 45
            if (r4 != r5) goto L19
            r2 = r1
        L19:
            int r4 = r20.length()
            if (r2 != r4) goto L20
            goto Lc
        L20:
            int r4 = r2 + 1
            char r5 = r0.charAt(r2)
            r6 = -1
            r7 = 128(0x80, float:1.8E-43)
            if (r5 >= r7) goto L30
            byte[] r8 = defpackage.yv7.a
            r5 = r8[r5]
            goto L33
        L30:
            byte[] r5 = defpackage.yv7.a
            r5 = r6
        L33:
            if (r5 < 0) goto Lc
            r8 = 10
            if (r5 < r8) goto L3a
            goto Lc
        L3a:
            int r5 = -r5
            long r9 = (long) r5
            long r11 = (long) r8
            r13 = -9223372036854775808
            long r15 = r13 / r11
        L41:
            int r5 = r20.length()
            if (r4 >= r5) goto L6c
            int r5 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 >= r7) goto L54
            byte[] r17 = defpackage.yv7.a
            r4 = r17[r4]
            goto L57
        L54:
            byte[] r4 = defpackage.yv7.a
            r4 = r6
        L57:
            if (r4 < 0) goto Lc
            if (r4 >= r8) goto Lc
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 >= 0) goto L60
            goto Lc
        L60:
            long r9 = r9 * r11
            long r3 = (long) r4
            long r18 = r3 + r13
            int r18 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r18 >= 0) goto L69
            goto Lc
        L69:
            long r9 = r9 - r3
            r4 = r5
            goto L41
        L6c:
            if (r2 == 0) goto L73
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L7d
        L73:
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 != 0) goto L78
            goto Lc
        L78:
            long r0 = -r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7d:
            if (r0 == 0) goto L96
            long r1 = r0.longValue()
            int r3 = r0.intValue()
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L8d
            goto L96
        L8d:
            int r0 = r0.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L97
        L96:
            r3 = 0
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.f0(java.lang.String):java.lang.Integer");
    }

    public static void g(cjg cjgVar, Set set) {
        List<ly3> listEmptyList;
        List listAsList;
        List listEmptyList2;
        List list;
        Throwable th = null;
        String string = ((p7b) ((m7b) cjgVar.b)).a.g.getString("app.pushProxyList", null);
        if (M(string)) {
            hm9.n("s5c", "getProxiesFromPushString: empty string");
            listEmptyList = Collections.emptyList();
        } else {
            String[] strArrSplit = string.split("\\s*;\\s*");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String[] strArrSplit2 = strArrSplit[i2].split("\\s*>\\s*");
                if (strArrSplit2.length != 2) {
                    hm9.p("s5c", "getProxiesFromPushString: failed to parse, no country from proxies delimiter", th);
                } else {
                    String str = strArrSplit2[i];
                    if (M(str)) {
                        hm9.n("s5c", "getCountriesFromString: empty string");
                        listAsList = Collections.emptyList();
                    } else {
                        listAsList = Arrays.asList(str.split("\\s*,\\s*"));
                    }
                    String str2 = strArrSplit2[1];
                    if (M(str2)) {
                        hm9.k("s5c", "getProxiesFromString: empty string");
                        listEmptyList2 = Collections.emptyList();
                    } else {
                        String[] strArrSplit3 = str2.replace("\"", "").split("\\s*,\\s*");
                        if (strArrSplit3.length == 0) {
                            hm9.m0("s5c", "data field have no data", new Object[i]);
                            listEmptyList2 = Collections.emptyList();
                        } else {
                            ArrayList arrayList2 = new ArrayList(strArrSplit3.length);
                            int length2 = strArrSplit3.length;
                            int i3 = i;
                            while (i3 < length2) {
                                String[] strArrSplit4 = strArrSplit3[i3].split("\\s*:\\s*");
                                if (strArrSplit4.length >= 2) {
                                    String strTrim = strArrSplit4[i].trim();
                                    String strTrim2 = strArrSplit4[1].trim();
                                    if (!strTrim.isEmpty() && !strTrim2.isEmpty()) {
                                        arrayList2.add(new eh3(strTrim, strTrim2, true));
                                    }
                                }
                                i3++;
                                i = 0;
                            }
                            listEmptyList2 = arrayList2;
                        }
                    }
                    arrayList.add(new ly3(listAsList, listEmptyList2));
                }
                i2++;
                th = null;
                i = 0;
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList == null || listEmptyList.isEmpty()) {
            return;
        }
        String string2 = ((p7b) ((m7b) cjgVar.b)).a.g.getString("app.location.country.code", null);
        if (M(string2)) {
            return;
        }
        String strTrim3 = string2.toLowerCase().trim();
        for (ly3 ly3Var : listEmptyList) {
            Iterator it = ly3Var.a.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).toLowerCase().trim().equals(strTrim3) && (list = ly3Var.b) != null && !list.isEmpty()) {
                    set.addAll(list);
                }
            }
        }
    }

    public static boolean h(es8 es8Var, es8 es8Var2) {
        if (es8Var.a.n() != es8Var2.a.n()) {
            return true;
        }
        cu8 cu8Var = es8Var.a;
        boolean zN = cu8Var.n();
        cu8 cu8Var2 = es8Var2.a;
        if (!zN && !cu8Var2.n()) {
            return false;
        }
        List list = (List) cu8Var.z0.a;
        List list2 = (List) cu8Var2.z0.a;
        if (list.size() != list2.size()) {
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!oag.d(((l20) it.next()).r, ((l20) it2.next()).r)) {
                return true;
            }
        }
        return false;
    }

    public static List i(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new o47(0, iArr.length, iArr);
    }

    public static ArrayList j(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return r42.b[c2];
        }
        return (byte) 0;
    }

    public static int l(long j) {
        int i = (int) j;
        z04.j(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void n(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int p(zdc zdcVar, ga7 ga7Var, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || zdcVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(a.M(view) - a.M(view2)) + 1;
        }
        return Math.min(ga7Var.n(), ga7Var.c(view2) - ga7Var.f(view));
    }

    public static int q(zdc zdcVar, ga7 ga7Var, View view, View view2, a aVar, boolean z, boolean z2) {
        if (aVar.w() == 0 || zdcVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (zdcVar.b() - Math.max(a.M(view), a.M(view2))) - 1) : Math.max(0, Math.min(a.M(view), a.M(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(ga7Var.c(view2) - ga7Var.f(view)) / (Math.abs(a.M(view) - a.M(view2)) + 1))) + (ga7Var.m() - ga7Var.f(view)));
        }
        return iMax;
    }

    public static int r(zdc zdcVar, ga7 ga7Var, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || zdcVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zdcVar.b();
        }
        return (int) (((ga7Var.c(view2) - ga7Var.f(view)) / (Math.abs(a.M(view) - a.M(view2)) + 1)) * zdcVar.b());
    }

    public static void s(File file, File file2) throws Throwable {
        FileChannel fileChannel;
        FileChannel channel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel channel2 = null;
        try {
            channel = new FileInputStream(file).getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            channel2 = new FileOutputStream(file2).getChannel();
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel2 = channel2;
            channel2 = channel;
            fileChannel = fileChannel2;
            if (channel2 != null) {
                channel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static long t(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[20480];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    public static String u(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    public static eh3 v(cjg cjgVar) {
        String strD = ((p7b) ((m7b) cjgVar.b)).a.D();
        p7b p7bVar = (p7b) ((m7b) cjgVar.b);
        String strE = p7bVar.a.E();
        if (M(strD) || M(strE)) {
            return null;
        }
        return new eh3(strD, strE, p7bVar.a.d("server.useTls", true));
    }

    public static boolean w(l20 l20Var) {
        if (P(l20Var)) {
            l20Var = l20Var.j.d;
        }
        k20 k20Var = l20Var.d;
        return k20Var != null && !k20Var.g && k20Var.c > 0 && k20Var.k > 0;
    }

    public static void x(String str, a4c a4cVar) {
        String[] strArrSplit = str.split(HTTP.CRLF);
        dcg dcgVarB = b(true, strArrSplit, a4cVar);
        if (dcgVarB == null) {
            a4cVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            a4cVar.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            Iterator it = dcgVarB.d.entrySet().iterator();
            while (it.hasNext()) {
                a4cVar.log("CodecPrefUtil", "dumpCodecs: " + ((xbg) ((Map.Entry) it.next()).getValue()).b);
            }
        }
        dcg dcgVarB2 = b(false, strArrSplit, a4cVar);
        if (dcgVarB2 == null) {
            a4cVar.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        a4cVar.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        Iterator it2 = dcgVarB2.d.entrySet().iterator();
        while (it2.hasNext()) {
            a4cVar.log("CodecPrefUtil", "dumpCodecs: " + ((xbg) ((Map.Entry) it2.next()).getValue()).b);
        }
    }

    public static boolean y(String str, String str2) {
        return (oag.t(str) || oag.t(str2) || !oag.d(str, str2)) ? false : true;
    }

    public static int z(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (!z) {
            throw new IllegalArgumentException(i24.t("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }
}
