package defpackage;

/* loaded from: classes.dex */
public final class mte extends rg4 {
    public final eab c;
    public final int d;
    public final jic e;
    public final /* synthetic */ r9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mte(r9 r9Var, fi0 fi0Var, eab eabVar, int i) {
        super(fi0Var);
        this.f = r9Var;
        this.c = eabVar;
        this.d = i;
        this.e = ((oj0) eabVar).a.i;
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void f(Throwable th) {
        int i = this.d + 1;
        r9 r9Var = this.f;
        fi0 fi0Var = this.b;
        if (r9Var.c(i, fi0Var, this.c)) {
            return;
        }
        fi0Var.e(th);
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        g05 g05Var = (g05) obj;
        fi0 fi0Var = this.b;
        if (g05Var != null && (fi0.b(i) || tu0.q(g05Var, this.e))) {
            fi0Var.g(i, g05Var);
            return;
        }
        if (fi0.a(i)) {
            g05.d(g05Var);
            if (this.f.c(this.d + 1, fi0Var, this.c)) {
                return;
            }
            fi0Var.g(1, null);
        }
    }
}
