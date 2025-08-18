package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vl9 {
    public final /* synthetic */ int a;
    public final int b;
    public boolean c;
    public boolean d;
    public byte[] e;
    public int f;

    public vl9(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = i;
                byte[] bArr = new byte[131];
                this.e = bArr;
                bArr[2] = 1;
                break;
            default:
                this.b = i;
                byte[] bArr2 = new byte[131];
                this.e = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public final void a(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i3 = i2 - i;
                    byte[] bArr2 = this.e;
                    int length = bArr2.length;
                    int i4 = this.f;
                    if (length < i4 + i3) {
                        this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.f, i3);
                    this.f += i3;
                    break;
                }
                break;
            default:
                if (this.c) {
                    int i5 = i2 - i;
                    byte[] bArr3 = this.e;
                    int length2 = bArr3.length;
                    int i6 = this.f;
                    if (length2 < i6 + i5) {
                        this.e = Arrays.copyOf(bArr3, (i6 + i5) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.f, i5);
                    this.f += i5;
                    break;
                }
                break;
        }
    }

    public final boolean b(int i) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    this.f -= i;
                    this.c = false;
                    this.d = true;
                    break;
                }
                break;
            default:
                if (this.c) {
                    this.f -= i;
                    this.c = false;
                    this.d = true;
                    break;
                }
                break;
        }
        return true;
    }

    public final void c() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.d = false;
                break;
            default:
                this.c = false;
                this.d = false;
                break;
        }
    }

    public final void d(int i) {
        switch (this.a) {
            case 0:
                np8.f(!this.c);
                boolean z = i == this.b;
                this.c = z;
                if (z) {
                    this.f = 3;
                    this.d = false;
                    break;
                }
                break;
            default:
                fm9.k(!this.c);
                boolean z2 = i == this.b;
                this.c = z2;
                if (z2) {
                    this.f = 3;
                    this.d = false;
                    break;
                }
                break;
        }
    }
}
