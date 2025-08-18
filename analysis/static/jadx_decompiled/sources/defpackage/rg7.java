package defpackage;

/* loaded from: classes.dex */
public final class rg7 extends pg7 implements ug7 {
    public final gh7 a;
    public final lx3 b;

    public rg7(gh7 gh7Var, lx3 lx3Var) {
        this.a = gh7Var;
        this.b = lx3Var;
        if (gh7Var.d == fg7.a) {
            pag.d(lx3Var);
        }
    }

    @Override // defpackage.sx3
    public final lx3 getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.ug7
    public final void m(eh7 eh7Var, eg7 eg7Var) {
        gh7 gh7Var = this.a;
        if (gh7Var.d.compareTo(fg7.a) <= 0) {
            gh7Var.f(this);
            pag.d(this.b);
        }
    }
}
