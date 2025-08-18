package defpackage;

import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qm5 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Parcelable m;

    public qm5(byte[] bArr, int i, int i2) {
        byte b = 0;
        int i3 = 1;
        this.a = i2;
        switch (i2) {
            case 1:
                s02 s02Var = new s02(bArr, bArr.length, 2, b);
                s02Var.q(i * 8);
                this.b = s02Var.i(16);
                this.c = s02Var.i(16);
                this.d = s02Var.i(24);
                this.e = s02Var.i(24);
                int i4 = s02Var.i(20);
                this.f = i4;
                this.g = g(i4);
                this.h = s02Var.i(3) + 1;
                int i5 = s02Var.i(5) + 1;
                this.i = i5;
                this.j = b(i5);
                this.k = s02Var.k(36);
                this.l = null;
                this.m = null;
                break;
            default:
                s02 s02Var2 = new s02(bArr, bArr.length, i3, b);
                s02Var2.q(i * 8);
                this.b = s02Var2.i(16);
                this.c = s02Var2.i(16);
                this.d = s02Var2.i(24);
                this.e = s02Var2.i(24);
                int i6 = s02Var2.i(20);
                this.f = i6;
                this.g = f(i6);
                this.h = s02Var2.i(3) + 1;
                int i7 = s02Var2.i(5) + 1;
                this.i = i7;
                this.j = a(i7);
                int i8 = s02Var2.i(4);
                int i9 = s02Var2.i(32);
                int i10 = maf.a;
                this.k = ((i8 & 4294967295L) << 32) | (i9 & 4294967295L);
                this.l = null;
                this.m = null;
                break;
        }
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int f(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        switch (this.a) {
            case 0:
                long j = this.k;
                if (j == 0) {
                    return -9223372036854775807L;
                }
                return (j * 1000000) / this.f;
            default:
                long j2 = this.k;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / this.f;
        }
    }

    public oy5 d(byte[] bArr, e99 e99Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.e;
        if (i <= 0) {
            i = -1;
        }
        e99 e99Var2 = (e99) this.m;
        if (e99Var2 != null) {
            if (e99Var != null) {
                c99[] c99VarArr = e99Var.a;
                if (c99VarArr.length != 0) {
                    int i2 = maf.a;
                    c99[] c99VarArr2 = e99Var2.a;
                    Object[] objArrCopyOf = Arrays.copyOf(c99VarArr2, c99VarArr2.length + c99VarArr.length);
                    System.arraycopy(c99VarArr, 0, objArrCopyOf, c99VarArr2.length, c99VarArr.length);
                    e99Var2 = new e99((c99[]) objArrCopyOf);
                }
            }
            e99Var = e99Var2;
        }
        my5 my5Var = new my5();
        my5Var.k = "audio/flac";
        my5Var.l = i;
        my5Var.x = this.h;
        my5Var.y = this.f;
        my5Var.m = Collections.singletonList(bArr);
        my5Var.i = e99Var;
        return new oy5(my5Var);
    }

    public qy5 e(byte[] bArr, f99 f99Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.e;
        if (i <= 0) {
            i = -1;
        }
        f99 f99Var2 = (f99) this.m;
        if (f99Var2 != null) {
            f99Var = f99Var2.b(f99Var);
        }
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("audio/flac");
        ny5Var.n = i;
        ny5Var.A = this.h;
        ny5Var.B = this.f;
        ny5Var.C = oaf.C(this.i);
        ny5Var.p = Collections.singletonList(bArr);
        ny5Var.j = f99Var;
        return new qy5(ny5Var);
    }

    public qm5(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, va8 va8Var, e99 e99Var) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = f(i5);
        this.h = i6;
        this.i = i7;
        this.j = a(i7);
        this.k = j;
        this.l = va8Var;
        this.m = e99Var;
    }

    public qm5(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, h7b h7bVar, f99 f99Var) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = g(i5);
        this.h = i6;
        this.i = i7;
        this.j = b(i7);
        this.k = j;
        this.l = h7bVar;
        this.m = f99Var;
    }
}
