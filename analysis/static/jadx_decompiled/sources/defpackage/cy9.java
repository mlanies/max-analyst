package defpackage;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public abstract class cy9 {
    public static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String b = String.valueOf(Long.MAX_VALUE);

    public static BigDecimal a(char[] cArr, int i, int i2) {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw new NumberFormatException(zr6.i("Value \"", new String(cArr, i, i2), "\" can not be represented as BigDecimal"));
        }
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static long c(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (b(cArr, i, i3) * 1000000000) + b(cArr, i + i3, 9);
    }
}
