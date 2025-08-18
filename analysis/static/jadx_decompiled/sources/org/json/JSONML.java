package org.json;

/* loaded from: classes2.dex */
public class JSONML {
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0167, code lost:
    
        throw r9.syntaxError("Reserved attribute.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0170, code lost:
    
        r7 = r9.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0176, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0178, code lost:
    
        r7 = (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x017a, code lost:
    
        if (r12 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x017d, code lost:
    
        r7 = org.json.XML.stringToValue(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018c, code lost:
    
        throw r9.syntaxError("Missing value");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object parse(org.json.XMLTokener r9, boolean r10, org.json.JSONArray r11, boolean r12) throws org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONML.parse(org.json.XMLTokener, boolean, org.json.JSONArray, boolean):java.lang.Object");
    }

    public static JSONArray toJSONArray(String str) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, null, false);
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, null, false);
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        int i;
        StringBuilder sb = new StringBuilder("<");
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String strEscape = XML.escape(string);
        sb.append(strEscape);
        Object objOpt = jSONArray.opt(1);
        if (objOpt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objOpt;
            for (String str : jSONObject.keySet()) {
                Object objOpt2 = jSONObject.opt(str);
                XML.noSpace(str);
                if (objOpt2 != null) {
                    sb.append(' ');
                    sb.append(XML.escape(str));
                    sb.append("=\"");
                    sb.append(XML.escape(objOpt2.toString()));
                    sb.append('\"');
                }
            }
            i = 2;
        } else {
            i = 1;
        }
        int length = jSONArray.length();
        if (i >= length) {
            sb.append("/>");
        } else {
            sb.append('>');
            do {
                Object obj = jSONArray.get(i);
                i++;
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                    } else {
                        sb.append(obj.toString());
                    }
                }
            } while (i < length);
            sb.append("</");
            sb.append(strEscape);
            sb.append('>');
        }
        return sb.toString();
    }

    public static JSONArray toJSONArray(String str, boolean z) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, null, z);
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, null, z);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, null, z);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, null, false);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, null, false);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, null, z);
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder();
        String strOptString = jSONObject.optString("tagName");
        if (strOptString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(strOptString);
        String strEscape = XML.escape(strOptString);
        sb.append('<');
        sb.append(strEscape);
        for (String str : jSONObject.keySet()) {
            if (!"tagName".equals(str) && !"childNodes".equals(str)) {
                XML.noSpace(str);
                Object objOpt = jSONObject.opt(str);
                if (objOpt != null) {
                    sb.append(' ');
                    sb.append(XML.escape(str));
                    sb.append("=\"");
                    sb.append(XML.escape(objOpt.toString()));
                    sb.append('\"');
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childNodes");
        if (jSONArrayOptJSONArray == null) {
            sb.append("/>");
        } else {
            sb.append('>');
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArrayOptJSONArray.get(i);
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                    } else {
                        sb.append(obj.toString());
                    }
                }
            }
            sb.append("</");
            sb.append(strEscape);
            sb.append('>');
        }
        return sb.toString();
    }
}
