package defpackage;

/* loaded from: classes.dex */
public final class f03 extends k87 implements e03 {
    public final h03 b;

    public f03(h03 h03Var) {
        this.b = h03Var;
    }

    @Override // defpackage.e03
    public final boolean a(Throwable th) {
        z87 z87Var = this.a;
        if (z87Var == null) {
            z87Var = null;
        }
        return z87Var.childCancelled(th);
    }

    @Override // defpackage.k87
    public final boolean c() {
        return true;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        z87 z87Var = this.a;
        if (z87Var == null) {
            z87Var = null;
        }
        this.b.parentCancelled(z87Var);
    }

    @Override // defpackage.e03
    public final x77 getParent() {
        z87 z87Var = this.a;
        if (z87Var != null) {
            return z87Var;
        }
        return null;
    }
}
