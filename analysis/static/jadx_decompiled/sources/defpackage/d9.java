package defpackage;

/* loaded from: classes2.dex */
public final class d9 extends pc4 {
    public final /* synthetic */ int d;
    public final long e;
    public final je7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d9(long j, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, int i) {
        super(je7Var2, je7Var3, je7Var4);
        this.d = i;
        this.e = j;
        this.f = je7Var;
    }

    @Override // defpackage.pc4
    public jqe a(uj3 uj3Var) {
        switch (this.d) {
            case 1:
                e52 e52VarG = g();
                if (e52VarG == null) {
                    return null;
                }
                long jN = uj3Var.n();
                String str = (e52VarG.C() && e52VarG.E(jN)) ? ((t82) e52VarG.b.R.get(Long.valueOf(jN))).d : null;
                if (str != null && !w9e.C0(str)) {
                    return new iqe(str);
                }
                if (e52VarG.Y(uj3Var.n())) {
                    return new eqe(yea.q2);
                }
                if (e52VarG.E(uj3Var.n())) {
                    return new eqe(yea.c2);
                }
                return null;
            default:
                return super.a(uj3Var);
        }
    }

    @Override // defpackage.pc4
    public jqe c(uj3 uj3Var) {
        switch (this.d) {
            case 0:
                if (!uj3Var.Y) {
                    e52 e52Var = (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
                    if (e52Var != null && e52Var.E(uj3Var.n())) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.c(uj3Var);
    }

    @Override // defpackage.pc4
    public boolean d(uj3 uj3Var) {
        switch (this.d) {
            case 0:
                if (!uj3Var.Y) {
                    e52 e52Var = (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
                    if (e52Var == null || !e52Var.E(uj3Var.n())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.d(uj3Var);
        }
    }

    @Override // defpackage.pc4
    public boolean e(uj3 uj3Var) {
        e52 e52VarG;
        switch (this.d) {
            case 1:
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
            default:
                return super.e(uj3Var);
        }
    }

    @Override // defpackage.pc4
    public kn8 f(uj3 uj3Var) {
        switch (this.d) {
            case 1:
                kn8 kn8VarF = super.f(uj3Var);
                e52 e52VarG = g();
                boolean z = false;
                if (e52VarG != null && e52VarG.Y(uj3Var.n())) {
                    z = true;
                }
                return kn8.k(kn8VarF, z);
            default:
                return super.f(uj3Var);
        }
    }

    public e52 g() {
        return (e52) ((jz2) ((iy2) this.f.getValue())).m(this.e).a.getValue();
    }
}
