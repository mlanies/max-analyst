package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c4g {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final yaf a = new yaf(3, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(yaf yafVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = yafVar.b;
        int i2 = yafVar.c;
        while (i < i2 && !z) {
            char c2 = (char) yafVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        yafVar.I(i - yafVar.b);
        return sb.toString();
    }

    public static String b(yaf yafVar, StringBuilder sb) {
        c(yafVar);
        if (yafVar.c() == 0) {
            return null;
        }
        String strA = a(yafVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        char cV = (char) yafVar.v();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cV);
        return sb2.toString();
    }

    public static void c(yaf yafVar) {
        while (true) {
            for (boolean z = true; yafVar.c() > 0 && z; z = false) {
                int i = yafVar.b;
                byte[] bArr = yafVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    yafVar.I(1);
                } else {
                    int i2 = yafVar.c;
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
                            yafVar.I(i2 - yafVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
