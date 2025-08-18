package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class q3 implements ka5 {
    public final s3 a = new s3(null, 0);
    public final yaf b = new yaf(2786);
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
        int iM;
        yaf yafVar = new yaf(10);
        int i = 0;
        while (true) {
            ra4Var = (ra4) ma5Var;
            ra4Var.q(yafVar.a, 0, 10, false);
            yafVar.H(0);
            if (yafVar.x() != 4801587) {
                break;
            }
            yafVar.I(3);
            int iU = yafVar.u();
            i += iU + 10;
            ra4Var.b(iU, false);
        }
        ra4Var.Y = 0;
        ra4Var.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ra4Var.q(yafVar.a, 0, 6, false);
            yafVar.H(0);
            if (yafVar.A() != 2935) {
                ra4Var.Y = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                ra4Var.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = yafVar.a;
                if (bArr.length < 6) {
                    iM = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iM = kq0.m((b & 192) >> 6, b & 63);
                }
                if (iM == -1) {
                    return false;
                }
                ra4Var.b(iM - 6, false);
            }
        }
    }

    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws EOFException, InterruptedIOException {
        yaf yafVar = this.b;
        int i = ((ra4) ma5Var).read(yafVar.a, 0, 2786);
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
