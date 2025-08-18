package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class u3 implements ka5 {
    public final s3 a = new s3(null, 1);
    public final yaf b = new yaf(16384);
    public boolean c;

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.a.j(oa5Var, new l3f(0, 1, 0, (byte) 0));
        oa5Var.w();
        oa5Var.M(new pm5(-9223372036854775807L));
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        ra4 ra4Var;
        int i;
        yaf yafVar = new yaf(10);
        int i2 = 0;
        while (true) {
            ra4Var = (ra4) ma5Var;
            ra4Var.q(yafVar.a, 0, 10, false);
            yafVar.H(0);
            if (yafVar.x() != 4801587) {
                break;
            }
            yafVar.I(3);
            int iU = yafVar.u();
            i2 += iU + 10;
            ra4Var.b(iU, false);
        }
        ra4Var.Y = 0;
        ra4Var.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ra4Var.q(yafVar.a, 0, 7, false);
            yafVar.H(0);
            int iA = yafVar.A();
            if (iA == 44096 || iA == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = yafVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iA == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                ra4Var.b(i - 7, false);
            } else {
                ra4Var.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                ra4Var.b(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws EOFException, InterruptedIOException {
        yaf yafVar = this.b;
        int i = ((ra4) ma5Var).read(yafVar.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        yafVar.H(0);
        yafVar.G(i);
        boolean z = this.c;
        s3 s3Var = this.a;
        if (!z) {
            s3Var.g(4, 0L);
            this.c = true;
        }
        s3Var.f(yafVar);
        return 0;
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
