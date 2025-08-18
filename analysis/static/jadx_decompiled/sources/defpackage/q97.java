package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class q97 implements la5 {
    public int X;
    public vc9 Z;
    public pa5 b;
    public int c;
    public int o;
    public na5 s0;
    public g03 t0;
    public wd9 u0;
    public final wpa a = new wpa(6);
    public long Y = -1;

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.b = pa5Var;
    }

    public final void a() {
        pa5 pa5Var = this.b;
        pa5Var.getClass();
        pa5Var.w();
        this.b.J(new wd0(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.u0 = null;
        } else if (this.c == 5) {
            wd9 wd9Var = this.u0;
            wd9Var.getClass();
            wd9Var.d(j, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r26, defpackage.lh4 r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        sa4 sa4Var = (sa4) na5Var;
        wpa wpaVar = this.a;
        wpaVar.D(2);
        sa4Var.q(wpaVar.a, 0, 2, false);
        if (wpaVar.A() != 65496) {
            return false;
        }
        wpaVar.D(2);
        sa4Var.q(wpaVar.a, 0, 2, false);
        int iA = wpaVar.A();
        this.o = iA;
        if (iA == 65504) {
            wpaVar.D(2);
            sa4Var.q(wpaVar.a, 0, 2, false);
            sa4 sa4Var2 = (sa4) na5Var;
            sa4Var2.b(wpaVar.A() - 2, false);
            wpaVar.D(2);
            sa4Var2.q(wpaVar.a, 0, 2, false);
            this.o = wpaVar.A();
        }
        if (this.o != 65505) {
            return false;
        }
        sa4Var.b(2, false);
        wpaVar.D(6);
        ((sa4) na5Var).q(wpaVar.a, 0, 6, false);
        return wpaVar.w() == 1165519206 && wpaVar.A() == 0;
    }

    @Override // defpackage.la5
    public final void release() {
        wd9 wd9Var = this.u0;
        if (wd9Var != null) {
            wd9Var.getClass();
        }
    }
}
