package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d4g {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final wpa a = new wpa();
    public final StringBuilder b = new StringBuilder();

    public static String a(wpa wpaVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = wpaVar.b;
        int i2 = wpaVar.c;
        while (i < i2 && !z) {
            char c2 = (char) wpaVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        wpaVar.H(i - wpaVar.b);
        return sb.toString();
    }

    public static String b(wpa wpaVar, StringBuilder sb) {
        c(wpaVar);
        if (wpaVar.a() == 0) {
            return null;
        }
        String strA = a(wpaVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) wpaVar.u());
    }

    public static void c(wpa wpaVar) {
        while (true) {
            for (boolean z = true; wpaVar.a() > 0 && z; z = false) {
                int i = wpaVar.b;
                byte[] bArr = wpaVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    wpaVar.H(1);
                } else {
                    int i2 = wpaVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            wpaVar.H(i2 - wpaVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
