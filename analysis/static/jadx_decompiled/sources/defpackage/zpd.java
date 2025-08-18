package defpackage;

/* loaded from: classes.dex */
public final class zpd extends u2 {
    public final t75 c;
    public final ae3 o;

    public zpd(w65 w65Var) {
        super(2);
        ae3 ae3Var = new ae3(0, false);
        this.o = ae3Var;
        try {
            this.c = new t75(w65Var, this);
            ae3Var.g();
        } catch (Throwable th) {
            this.o.g();
            throw th;
        }
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int B() {
        Z1();
        return this.c.B();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int O() {
        Z1();
        return this.c.O();
    }

    @Override // defpackage.u2
    public final lue O1() {
        Z1();
        return this.c.O1();
    }

    @Override // defpackage.u2
    public final void Q1() {
        Z1();
        this.c.s2();
    }

    @Override // defpackage.q3b
    public final void Y(boolean z) {
        Z1();
        t75 t75Var = this.c;
        t75Var.s2();
        t75Var.s2();
        int iD = t75Var.I0.d(t75Var.k1.e, z);
        int i = 1;
        if (z && iD != 1) {
            i = 2;
        }
        t75Var.p2(iD, i, z);
    }

    public final void Z1() {
        this.o.b();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long b0() {
        Z1();
        return this.c.b0();
    }

    @Override // defpackage.q3b
    public final float e() {
        Z1();
        t75 t75Var = this.c;
        t75Var.s2();
        return t75Var.e1;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int getRepeatMode() {
        Z1();
        t75 t75Var = this.c;
        t75Var.s2();
        return t75Var.N0;
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long k() {
        Z1();
        return this.c.k();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final boolean n() {
        Z1();
        return this.c.n();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int o0() {
        Z1();
        return this.c.o0();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final int p0() {
        Z1();
        return this.c.p0();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final long q() {
        Z1();
        return this.c.q();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final void r(int i, long j) {
        Z1();
        this.c.r(i, j);
    }
}
