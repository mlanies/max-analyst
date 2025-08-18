package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.HTTP;

/* loaded from: classes2.dex */
public abstract class bre {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final String[] j;
    public static final String[] k;
    public static final Pattern l;

    static {
        Pattern patternCompile = Pattern.compile("@([A-Za-z0-9_-]+)");
        a = patternCompile;
        Pattern.compile("@([A-Za-z0-9_-]+)\\s");
        b = Pattern.compile("@([A-Za-z0-9_-]+)\\s/");
        Pattern patternCompile2 = Pattern.compile("[\\p{Punct}\\p{L}\\p{N}\\p{Sm}]+");
        c = Pattern.compile("(" + patternCompile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+");
        d = Pattern.compile("(" + patternCompile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+\\s(" + patternCompile2 + ")?");
        StringBuilder sb = new StringBuilder("(");
        sb.append(patternCompile);
        sb.append("\\s)(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+");
        e = Pattern.compile(sb.toString());
        f = Pattern.compile("(" + patternCompile + "\\s)(?<=\\s|\\p{Zs}|^)\\/[\ufeff]?[\\p{L}\\p{N}_]+\\s(" + patternCompile2 + ")?");
        g = Pattern.compile("[\n\r]");
        h = Pattern.compile("\\s{2,}");
        i = Pattern.compile("\\r|[\\r\\u2028\\u2029\\u0085]");
        j = new String[]{HTTP.CRLF, "\r", "\n", "\u2028", "\u2029", "\u0085"};
        k = new String[]{" ", "\\t", "\\n", "\\r", "\\t", " ", "\u2000", "\u2001", "\u2002", "\u2003", "\u2004", "\u2005", "\u2006", " ", "\u2008", "\u2009", "\u200a", "\u200b", "\u200c", "\u200d", " ", "\u205f", "\u3000"};
        l = Pattern.compile("[^\\p{L}\\p{Nd} ]+");
    }

    public static CharSequence a(CharSequence charSequence, ida idaVar) {
        if (oag.t(charSequence)) {
            return "";
        }
        if (idaVar.j.a(0, charSequence)) {
            List listC = idaVar.j.c(charSequence);
            if (!listC.isEmpty()) {
                CharSequence charSequence2 = (CharSequence) listC.get(0);
                return charSequence2 == null ? "" : charSequence2;
            }
        }
        String strReplaceAll = l.matcher(charSequence).replaceAll("");
        if (!oag.t(strReplaceAll)) {
            charSequence = strReplaceAll;
        }
        String[] strArrSplit = charSequence.toString().trim().split(" +");
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(strArrSplit.length, 2);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str = strArrSplit[i2];
            if (!oag.t(str)) {
                sb.append(Character.isHighSurrogate(str.charAt(0)) ? str.substring(0, Math.min(str.length(), 2)) : str.substring(0, 1));
            }
        }
        return sb.toString().toUpperCase();
    }

    public static String b(String str) {
        String rawPath = oag.t(str) ? null : URI.create(str).getRawPath();
        return rawPath == null ? "" : rawPath.length() < 2 ? str : rawPath.substring(1);
    }

    public static String c(String str) {
        if (oag.t(str)) {
            return "";
        }
        return "@" + b(str);
    }

    public static String[] d(String str, ida idaVar) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (length < str.length()) {
            if (!b0d.i(str.charAt(length))) {
                int i2 = length;
                while (i2 < str.length() && idaVar.j.a(i2, str)) {
                    i2++;
                }
                String strSubstring = i2 > length ? str.substring(length, i2) : null;
                if (oag.t(strSubstring)) {
                    int i3 = length;
                    while (i3 < str.length()) {
                        idaVar.getClass();
                        if (b0d.i(str.charAt(i3)) || idaVar.j.a(i3, str)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 > length) {
                        arrayList.add(str.substring(length, i3));
                    }
                    length = i3;
                } else {
                    arrayList.add(strSubstring);
                    length += strSubstring.length() - 1;
                }
            }
            length++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String e(String str) {
        if (oag.t(str)) {
            return str;
        }
        return h.matcher(g.matcher(str).replaceAll(" ")).replaceAll(" ");
    }
}
