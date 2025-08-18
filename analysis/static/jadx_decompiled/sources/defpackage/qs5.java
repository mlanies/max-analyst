package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class qs5 implements la5 {
    public nlf A0;
    public final hwc X;
    public pa5 Y;
    public int Z;
    public final wpa a = new wpa(4);
    public final wpa b = new wpa(9);
    public final wpa c = new wpa(11);
    public final wpa o = new wpa();
    public boolean s0;
    public long t0;
    public int u0;
    public int v0;
    public int w0;
    public long x0;
    public boolean y0;
    public j70 z0;

    public qs5() {
        hwc hwcVar = new hwc(11, new sk4());
        hwcVar.c = -9223372036854775807L;
        hwcVar.o = new long[0];
        hwcVar.X = new long[0];
        this.X = hwcVar;
        this.Z = 1;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.Y = pa5Var;
    }

    public final wpa a(sa4 sa4Var) {
        int i = this.w0;
        wpa wpaVar = this.o;
        byte[] bArr = wpaVar.a;
        if (i > bArr.length) {
            wpaVar.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            wpaVar.G(0);
        }
        wpaVar.F(this.w0);
        sa4Var.h(wpaVar.a, 0, this.w0, false);
        return wpaVar;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.Z = 1;
            this.s0 = false;
        } else {
            this.Z = 3;
        }
        this.u0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0006 A[SYNTHETIC] */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r16, defpackage.lh4 r17) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs5.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        wpa wpaVar = this.a;
        ((sa4) na5Var).q(wpaVar.a, 0, 3, false);
        wpaVar.G(0);
        if (wpaVar.x() != 4607062) {
            return false;
        }
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.q(wpaVar.a, 0, 2, false);
        wpaVar.G(0);
        if ((wpaVar.A() & 250) != 0) {
            return false;
        }
        sa4Var.q(wpaVar.a, 0, 4, false);
        wpaVar.G(0);
        int iG = wpaVar.g();
        sa4Var.Y = 0;
        sa4Var.b(iG, false);
        sa4Var.q(wpaVar.a, 0, 4, false);
        wpaVar.G(0);
        return wpaVar.g() == 0;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
