package org.json;

import defpackage.au1;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class JSONPointer {
    private static final String ENCODING = "utf-8";
    private final List<String> refTokens;

    public JSONPointer(String str) throws UnsupportedEncodingException {
        String strSubstring;
        if (str == null) {
            throw new NullPointerException("pointer cannot be null");
        }
        if (str.isEmpty() || str.equals("#")) {
            this.refTokens = Collections.emptyList();
            return;
        }
        if (str.startsWith("#/")) {
            try {
                strSubstring = URLDecoder.decode(str.substring(2), ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
            }
            strSubstring = str.substring(1);
        }
        this.refTokens = new ArrayList();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int iIndexOf = strSubstring.indexOf(47, i2);
            if (i2 == iIndexOf || i2 == strSubstring.length()) {
                this.refTokens.add("");
            } else if (iIndexOf >= 0) {
                this.refTokens.add(unescape(strSubstring.substring(i2, iIndexOf)));
            } else {
                this.refTokens.add(unescape(strSubstring.substring(i2)));
            }
            if (iIndexOf < 0) {
                return;
            } else {
                i = iIndexOf;
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private String escape(String str) {
        return str.replace("~", "~0").replace("/", "~1").replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private Object readByIndexToken(Object obj, String str) throws JSONPointerException, NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            JSONArray jSONArray = (JSONArray) obj;
            if (i >= jSONArray.length()) {
                throw new JSONPointerException(String.format("index %d is out of bounds - the array has %d elements", Integer.valueOf(i), Integer.valueOf(jSONArray.length())));
            }
            try {
                return jSONArray.get(i);
            } catch (JSONException e) {
                throw new JSONPointerException("Error reading value at index position " + i, e);
            }
        } catch (NumberFormatException e2) {
            throw new JSONPointerException(au1.g(str, " is not an array index"), e2);
        }
    }

    private String unescape(String str) {
        return str.replace("~1", "/").replace("~0", "~").replace("\\\"", "\"").replace("\\\\", "\\");
    }

    public Object queryFrom(Object obj) throws JSONPointerException, NumberFormatException {
        if (this.refTokens.isEmpty()) {
            return obj;
        }
        for (String str : this.refTokens) {
            if (obj instanceof JSONObject) {
                obj = ((JSONObject) obj).opt(unescape(str));
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new JSONPointerException(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", obj, str));
                }
                obj = readByIndexToken(obj, str);
            }
        }
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String str : this.refTokens) {
            sb.append('/');
            sb.append(escape(str));
        }
        return sb.toString();
    }

    public String toURIFragment() {
        try {
            StringBuilder sb = new StringBuilder("#");
            for (String str : this.refTokens) {
                sb.append('/');
                sb.append(URLEncoder.encode(str, ENCODING));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Builder {
        private final List<String> refTokens = new ArrayList();

        public Builder append(String str) {
            if (str == null) {
                throw new NullPointerException("token cannot be null");
            }
            this.refTokens.add(str);
            return this;
        }

        public JSONPointer build() {
            return new JSONPointer(this.refTokens);
        }

        public Builder append(int i) {
            this.refTokens.add(String.valueOf(i));
            return this;
        }
    }

    public JSONPointer(List<String> list) {
        this.refTokens = new ArrayList(list);
    }
}
