package org.json;

import defpackage.k7d;
import defpackage.zr6;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public class XML {
    public static final Character AMP = '&';
    public static final Character APOS = '\'';
    public static final Character BANG = '!';
    public static final Character EQ = '=';
    public static final Character GT = '>';
    public static final Character LT = '<';
    public static final Character QUEST = '?';
    public static final Character QUOT = '\"';
    public static final Character SLASH = '/';

    private static Iterable<Integer> codePointIterator(final String str) {
        return new Iterable<Integer>() { // from class: org.json.XML.1
            @Override // java.lang.Iterable
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() { // from class: org.json.XML.1.1
                    private int length;
                    private int nextIndex = 0;

                    {
                        this.length = str.length();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.nextIndex < this.length;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public Integer next() {
                        int iCodePointAt = str.codePointAt(this.nextIndex);
                        this.nextIndex = Character.charCount(iCodePointAt) + this.nextIndex;
                        return Integer.valueOf(iCodePointAt);
                    }
                };
            }
        };
    }

    public static String escape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Iterator<Integer> it = codePointIterator(str).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 34) {
                sb.append("&quot;");
            } else if (iIntValue == 60) {
                sb.append("&lt;");
            } else if (iIntValue == 62) {
                sb.append("&gt;");
            } else if (iIntValue == 38) {
                sb.append("&amp;");
            } else if (iIntValue == 39) {
                sb.append("&apos;");
            } else if (mustEscape(iIntValue)) {
                sb.append("&#x");
                sb.append(Integer.toHexString(iIntValue));
                sb.append(';');
            } else {
                sb.appendCodePoint(iIntValue);
            }
        }
        return sb.toString();
    }

    private static boolean mustEscape(int i) {
        return !(!Character.isISOControl(i) || i == 9 || i == 10 || i == 13) || ((i < 32 || i > 55295) && ((i < 57344 || i > 65533) && (i < 65536 || i > 1114111)));
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length == 0) {
            throw new JSONException("Empty string.");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                throw new JSONException(zr6.i("'", str, "' contains a space character."));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e9, code lost:
    
        r7 = r10.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        r7 = (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        r7 = stringToValue(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
    
        throw r10.syntaxError("Missing value");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean parse(org.json.XMLTokener r10, org.json.JSONObject r11, java.lang.String r12, boolean r13) throws org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XML.parse(org.json.XMLTokener, org.json.JSONObject, java.lang.String, boolean):boolean");
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
            return JSONObject.NULL;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
            try {
                if (str.indexOf(46) > -1 || str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) > -1 || str.indexOf(69) > -1 || "-0".equals(str)) {
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

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(str, false);
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, null);
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int length2 = 0;
        while (length2 < length) {
            char cCharAt = str.charAt(length2);
            if (cCharAt == '&') {
                int iIndexOf = str.indexOf(59, length2);
                if (iIndexOf > length2) {
                    String strSubstring = str.substring(length2 + 1, iIndexOf);
                    sb.append(XMLTokener.unescapeEntity(strSubstring));
                    length2 += strSubstring.length() + 1;
                } else {
                    sb.append(cCharAt);
                }
            } else {
                sb.append(cCharAt);
            }
            length2++;
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(Reader reader) throws JSONException {
        return toJSONObject(reader, false);
    }

    public static String toString(Object obj, String str) throws JSONException {
        StringBuilder sb = new StringBuilder();
        if (!(obj instanceof JSONObject)) {
            if (obj == null || !((obj instanceof JSONArray) || obj.getClass().isArray())) {
                String strEscape = obj == null ? "null" : escape(obj.toString());
                return str == null ? zr6.i("\"", strEscape, "\"") : strEscape.length() == 0 ? zr6.i("<", str, "/>") : zr6.l(k7d.k("<", str, ">", strEscape, "</"), str, ">");
            }
            JSONArray jSONArray = obj.getClass().isArray() ? new JSONArray(obj) : (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                sb.append(toString(jSONArray.opt(i), str == null ? "array" : str));
            }
            return sb.toString();
        }
        if (str != null) {
            sb.append('<');
            sb.append(str);
            sb.append('>');
        }
        JSONObject jSONObject = (JSONObject) obj;
        for (String str2 : jSONObject.keySet()) {
            Object objOpt = jSONObject.opt(str2);
            if (objOpt == null) {
                objOpt = "";
            } else if (objOpt.getClass().isArray()) {
                objOpt = new JSONArray(objOpt);
            }
            if ("content".equals(str2)) {
                if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) objOpt;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (i2 > 0) {
                            sb.append('\n');
                        }
                        sb.append(escape(jSONArray2.opt(i2).toString()));
                    }
                } else {
                    sb.append(escape(objOpt.toString()));
                }
            } else if (objOpt instanceof JSONArray) {
                JSONArray jSONArray3 = (JSONArray) objOpt;
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    Object objOpt2 = jSONArray3.opt(i3);
                    if (objOpt2 instanceof JSONArray) {
                        sb.append('<');
                        sb.append(str2);
                        sb.append('>');
                        sb.append(toString(objOpt2));
                        sb.append("</");
                        sb.append(str2);
                        sb.append('>');
                    } else {
                        sb.append(toString(objOpt2, str2));
                    }
                }
            } else if ("".equals(objOpt)) {
                sb.append('<');
                sb.append(str2);
                sb.append("/>");
            } else {
                sb.append(toString(objOpt, str2));
            }
        }
        if (str != null) {
            sb.append("</");
            sb.append(str);
            sb.append('>');
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(Reader reader, boolean z) throws JSONException, IOException, NumberFormatException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(reader);
        while (xMLTokener.more()) {
            xMLTokener.skipPast("<");
            if (xMLTokener.more()) {
                parse(xMLTokener, jSONObject, null, z);
            }
        }
        return jSONObject;
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return toJSONObject(new StringReader(str), z);
    }
}
