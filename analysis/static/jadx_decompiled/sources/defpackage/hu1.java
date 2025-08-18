package defpackage;

/* loaded from: classes.dex */
public final class hu1 extends bn8 {
    public xm7 m;
    public final Object n;

    public hu1(Object obj) {
        this.n = obj;
    }

    @Override // defpackage.xm7
    public final Object d() {
        xm7 xm7Var = this.m;
        return xm7Var == null ? this.n : xm7Var.d();
    }

    @Override // defpackage.bn8
    public final void l(xm7 xm7Var, g2a g2aVar) {
        throw null;
    }

    public final void m(xm7 xm7Var) {
        an8 an8Var;
        xm7 xm7Var2 = this.m;
        if (xm7Var2 != null && (an8Var = (an8) this.l.c(xm7Var2)) != null) {
            an8Var.a.j(an8Var);
        }
        this.m = xm7Var;
        super.l(xm7Var, new gu1(0, this));
    }
}
