package defpackage;

/* loaded from: classes.dex */
public abstract class b9g extends pc3 {
    public final ej0 k;

    public b9g(ej0 ej0Var) {
        this.k = ej0Var;
    }

    public abstract void A(mue mueVar);

    public void B() {
        y(null, this.k);
    }

    @Override // defpackage.ej0
    public final mue h() {
        return this.k.h();
    }

    @Override // defpackage.ej0
    public final tb8 i() {
        return this.k.i();
    }

    @Override // defpackage.ej0
    public final boolean j() {
        return this.k.j();
    }

    @Override // defpackage.ej0
    public final void m(z0f z0fVar) {
        this.j = z0fVar;
        this.i = oaf.o(null);
        B();
    }

    @Override // defpackage.ej0
    public void t(tb8 tb8Var) {
        this.k.t(tb8Var);
    }

    @Override // defpackage.pc3
    public final yj8 u(Object obj, yj8 yj8Var) {
        return z(yj8Var);
    }

    @Override // defpackage.pc3
    public final long v(long j, Object obj) {
        return j;
    }

    @Override // defpackage.pc3
    public final int w(int i, Object obj) {
        return i;
    }

    @Override // defpackage.pc3
    public final void x(Object obj, ej0 ej0Var, mue mueVar) {
        A(mueVar);
    }

    public yj8 z(yj8 yj8Var) {
        return yj8Var;
    }
}
