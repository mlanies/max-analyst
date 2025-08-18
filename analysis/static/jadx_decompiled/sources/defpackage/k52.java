package defpackage;

/* loaded from: classes2.dex */
public final class k52 extends pc4 {
    public final long d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final khe h;

    public k52(long j, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        super(je7Var3, je7Var4, je7Var5);
        this.d = j;
        this.e = je7Var;
        this.f = je7Var2;
        this.g = je7Var6;
        this.h = new khe(new md1(8, this));
    }

    @Override // defpackage.pc4
    public final jqe c(uj3 uj3Var) {
        String strD;
        e52 e52VarG = g();
        Long lD = e52VarG != null ? e52VarG.d(uj3Var.n()) : null;
        if (uj3Var.Y) {
            return new eqe(yea.p2);
        }
        long jT = ((hyc) b()).t();
        khe kheVar = this.h;
        if (lD != null && lD.longValue() == jT) {
            return new eqe(((Boolean) kheVar.getValue()).booleanValue() ? yea.S : yea.o2);
        }
        e52 e52VarG2 = g();
        if (e52VarG2 != null && e52VarG2.Y(uj3Var.n()) && ((Boolean) kheVar.getValue()).booleanValue()) {
            e52 e52VarG3 = g();
            return new eqe((e52VarG3 == null || !e52VarG3.I()) ? yea.s2 : yea.r2);
        }
        if (lD == null || !((Boolean) kheVar.getValue()).booleanValue()) {
            return super.c(uj3Var);
        }
        uj3 uj3Var2 = (uj3) ((ds3) this.f.getValue()).c(lD.longValue()).a.getValue();
        return (uj3Var2 == null || (strD = uj3Var2.d()) == null) ? super.c(uj3Var) : new gqe(yea.R, ys.m0(new Object[]{strD}));
    }

    @Override // defpackage.pc4
    public final boolean e(uj3 uj3Var) {
        e52 e52VarG;
        boolean z = uj3Var.n() != ((hyc) b()).t();
        e52 e52VarG2 = g();
        boolean z2 = (e52VarG2 == null || e52VarG2.Y(uj3Var.n())) ? false : true;
        e52 e52VarG3 = g();
        boolean z3 = e52VarG3 != null && oag.s(e52VarG3.e(((hyc) b()).t()), 4) && (e52VarG = g()) != null && e52VarG.E(uj3Var.n());
        e52 e52VarG4 = g();
        boolean z4 = !(e52VarG4 != null && e52VarG4.E(uj3Var.n()));
        if (z2 && z) {
            return z3 || z4;
        }
        return false;
    }

    @Override // defpackage.pc4
    public final kn8 f(uj3 uj3Var) {
        kn8 kn8VarF = super.f(uj3Var);
        e52 e52VarG = g();
        boolean z = false;
        if (e52VarG != null && e52VarG.Y(uj3Var.n())) {
            z = true;
        }
        return kn8.k(kn8VarF, z);
    }

    public final e52 g() {
        return (e52) ((jz2) ((iy2) this.e.getValue())).m(this.d).a.getValue();
    }
}
