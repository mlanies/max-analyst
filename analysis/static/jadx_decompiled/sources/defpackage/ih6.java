package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ih6 {
    public static final byte[] f = {0, 0, 1};
    public static final byte[] g = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i3 = i2 - i;
                    byte[] bArr2 = this.e;
                    int length = bArr2.length;
                    int i4 = this.c;
                    if (length < i4 + i3) {
                        this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.c, i3);
                    this.c += i3;
                    break;
                }
                break;
            default:
                if (this.b) {
                    int i5 = i2 - i;
                    byte[] bArr3 = this.e;
                    int length2 = bArr3.length;
                    int i6 = this.c;
                    if (length2 < i6 + i5) {
                        this.e = Arrays.copyOf(bArr3, (i6 + i5) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.c, i5);
                    this.c += i5;
                    break;
                }
                break;
        }
    }
}
