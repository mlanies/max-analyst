package defpackage;

/* loaded from: classes.dex */
public final class pd8 implements y88, n3b {
    public final bj8 a;
    public final qh8 b;

    public pd8(bj8 bj8Var, qh8 qh8Var) {
        this.a = bj8Var;
        this.b = qh8Var;
    }

    @Override // defpackage.n3b
    public final void Y(q3b q3bVar, l3b l3bVar) {
        if (l3bVar.a.a(4, 5, 14, 0)) {
            this.a.g(this.b, false);
        }
    }

    @Override // defpackage.y88
    public final void e() {
        this.a.g(this.b, false);
    }

    @Override // defpackage.y88
    public final void g() {
        this.a.g(this.b, false);
    }

    @Override // defpackage.y88
    public final void onDisconnected() {
        bj8 bj8Var = this.a;
        qh8 qh8Var = this.b;
        if (bj8Var.d(qh8Var)) {
            bj8Var.h(qh8Var);
        }
        bj8Var.g(qh8Var, false);
    }

    public final void s(boolean z) {
        if (z) {
            this.a.g(this.b, false);
        }
    }
}
