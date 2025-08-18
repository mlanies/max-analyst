package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class ec implements la5 {
    public final s02 X;
    public pa5 Y;
    public long Z;
    public final int a;
    public final gc b;
    public final wpa c;
    public final wpa o;
    public long s0;
    public int t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public ec(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new gc(true, null, 0);
        this.c = new wpa(2048);
        this.t0 = -1;
        this.s0 = -1L;
        wpa wpaVar = new wpa(10);
        this.o = wpaVar;
        byte[] bArr = wpaVar.a;
        this.X = new s02(bArr, bArr.length, 2, (byte) 0);
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.Y = pa5Var;
        this.b.i(pa5Var, new l3f(0, 1, 1, (byte) 0));
        pa5Var.w();
    }

    public final int a(sa4 sa4Var) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            wpa wpaVar = this.o;
            sa4Var.q(wpaVar.a, 0, 10, false);
            wpaVar.G(0);
            if (wpaVar.x() != 4801587) {
                break;
            }
            wpaVar.H(3);
            int iT = wpaVar.t();
            i += iT + 10;
            sa4Var.b(iT, false);
        }
        sa4Var.Y = 0;
        sa4Var.b(i, false);
        if (this.s0 == -1) {
            this.s0 = i;
        }
        return i;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.v0 = false;
        this.b.a();
        this.Z = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r19, defpackage.lh4 r20) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        sa4 sa4Var = (sa4) na5Var;
        int iA = a(sa4Var);
        int i = iA;
        int i2 = 0;
        int i3 = 0;
        do {
            wpa wpaVar = this.o;
            sa4Var.q(wpaVar.a, 0, 2, false);
            wpaVar.G(0);
            if ((wpaVar.A() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                sa4 sa4Var2 = (sa4) na5Var;
                sa4Var2.q(wpaVar.a, 0, 4, false);
                s02 s02Var = this.X;
                s02Var.q(14);
                int i4 = s02Var.i(13);
                if (i4 <= 6) {
                    i++;
                    sa4Var2.Y = 0;
                    sa4Var2.b(i, false);
                } else {
                    sa4Var2.b(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                sa4 sa4Var3 = (sa4) na5Var;
                sa4Var3.Y = 0;
                sa4Var3.b(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iA < 8192);
        return false;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
