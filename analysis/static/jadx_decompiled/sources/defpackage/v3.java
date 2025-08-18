package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class v3 implements la5 {
    public final t3 a = new t3(null, 0, 1);
    public final wpa b = new wpa(16384);
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
        int i = ((sa4) na5Var).read(wpaVar.a, 0, 16384);
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
        int i;
        wpa wpaVar = new wpa(10);
        int i2 = 0;
        while (true) {
            ((sa4) na5Var).q(wpaVar.a, 0, 10, false);
            wpaVar.G(0);
            if (wpaVar.x() != 4801587) {
                break;
            }
            wpaVar.H(3);
            int iT = wpaVar.t();
            i2 += iT + 10;
            ((sa4) na5Var).b(iT, false);
        }
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.Y = 0;
        sa4Var.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            sa4Var.q(wpaVar.a, 0, 7, false);
            wpaVar.G(0);
            int iA = wpaVar.A();
            if (iA == 44096 || iA == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = wpaVar.a;
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
                sa4Var.b(i - 7, false);
            } else {
                sa4Var.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                sa4Var.b(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
