package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class r3 implements la5 {
    public final t3 a = new t3();
    public final wpa b = new wpa(2786);
    public boolean c;

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.a.i(pa5Var, new l3f(0, 1, 1, (byte) 0));
        pa5Var.w();
        pa5Var.J(new wd0(-9223372036854775807L));
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) throws EOFException, InterruptedIOException {
        wpa wpaVar = this.b;
        int i = ((sa4) na5Var).read(wpaVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        wpaVar.G(0);
        wpaVar.F(i);
        boolean z = this.c;
        t3 t3Var = this.a;
        if (!z) {
            t3Var.n = 0L;
            this.c = true;
        }
        t3Var.d(wpaVar);
        return 0;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        int iV;
        wpa wpaVar = new wpa(10);
        int i = 0;
        while (true) {
            ((sa4) na5Var).q(wpaVar.a, 0, 10, false);
            wpaVar.G(0);
            if (wpaVar.x() != 4801587) {
                break;
            }
            wpaVar.H(3);
            int iT = wpaVar.t();
            i += iT + 10;
            ((sa4) na5Var).b(iT, false);
        }
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.Y = 0;
        sa4Var.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            sa4Var.q(wpaVar.a, 0, 6, false);
            wpaVar.G(0);
            if (wpaVar.A() != 2935) {
                sa4Var.Y = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                sa4Var.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = wpaVar.a;
                if (bArr.length < 6) {
                    iV = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iV = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iV = mr0.v((b & 192) >> 6, b & 63);
                }
                if (iV == -1) {
                    return false;
                }
                sa4Var.b(iV - 6, false);
            }
        }
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
