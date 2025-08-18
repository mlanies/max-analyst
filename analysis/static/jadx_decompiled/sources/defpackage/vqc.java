package defpackage;

import java.nio.ByteOrder;

/* loaded from: classes.dex */
public enum vqc {
    ;

    public static void a(int i, byte[] bArr) {
        if (i < 0 || i >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void b(int i, byte[] bArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
        if (i2 > 0) {
            a(i, bArr);
            a((i + i2) - 1, bArr);
        }
    }

    public static int c(int i, byte[] bArr) {
        if (paf.a != ByteOrder.BIG_ENDIAN) {
            return d(i, bArr);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static vqc valueOf(String str) {
        au1.r(Enum.valueOf(vqc.class, str));
        throw null;
    }
}
