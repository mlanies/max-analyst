package defpackage;

import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public abstract class xj6 {
    public static final byte[] a = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            byte[] bArr3 = a;
            bArr2[i2] = bArr3[(b & 255) >>> 4];
            bArr2[i2 + 1] = bArr3[b & 15];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }
}
