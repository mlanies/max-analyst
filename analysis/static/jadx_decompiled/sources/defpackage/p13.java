package defpackage;

/* loaded from: classes.dex */
public final class p13 implements grc {
    public final /* synthetic */ t13 X;
    public final t13 a;
    public final erc b;
    public final int c;
    public boolean o;

    public p13(t13 t13Var, t13 t13Var2, erc ercVar, int i) {
        this.X = t13Var;
        this.a = t13Var2;
        this.b = ercVar;
        this.c = i;
    }

    public final void a() {
        if (this.o) {
            return;
        }
        t13 t13Var = this.X;
        jn jnVar = t13Var.Z;
        int[] iArr = t13Var.b;
        int i = this.c;
        jnVar.m(iArr[i], t13Var.c[i], 0, null, t13Var.E0);
        this.o = true;
    }

    public final void b() {
        t13 t13Var = this.X;
        boolean[] zArr = t13Var.o;
        int i = this.c;
        fm9.k(zArr[i]);
        t13Var.o[i] = false;
    }

    @Override // defpackage.grc
    public final void c() {
    }

    @Override // defpackage.grc
    public final boolean d() {
        t13 t13Var = this.X;
        return !t13Var.y() && this.b.s(t13Var.H0);
    }

    @Override // defpackage.grc
    public final int e(long j) {
        t13 t13Var = this.X;
        if (t13Var.y()) {
            return 0;
        }
        boolean z = t13Var.H0;
        erc ercVar = this.b;
        int iP = ercVar.p(j, z);
        zi0 zi0Var = t13Var.G0;
        if (zi0Var != null) {
            iP = Math.min(iP, zi0Var.d(this.c + 1) - ercVar.n());
        }
        ercVar.B(iP);
        if (iP > 0) {
            a();
        }
        return iP;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        t13 t13Var = this.X;
        if (t13Var.y()) {
            return -3;
        }
        zi0 zi0Var = t13Var.G0;
        erc ercVar = this.b;
        if (zi0Var != null && zi0Var.d(this.c + 1) <= ercVar.n()) {
            return -3;
        }
        a();
        return ercVar.x(y7gVar, p54Var, i, t13Var.H0);
    }
}
