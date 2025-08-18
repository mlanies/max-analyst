package defpackage;

/* loaded from: classes.dex */
public final class yb6 implements t0e {
    public final qne a;

    public yb6(qne qneVar) {
        this.a = qneVar;
    }

    @Override // defpackage.t0e
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.t0e
    public final boolean b(hb0 hb0Var) {
        int i = hb0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(hb0Var.a);
        return true;
    }
}
