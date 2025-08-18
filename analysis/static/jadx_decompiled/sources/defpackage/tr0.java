package defpackage;

/* loaded from: classes.dex */
public final class tr0 extends rg4 {
    public final eab c;
    public final /* synthetic */ sse d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr0(sse sseVar, fi0 fi0Var, eab eabVar) {
        super(fi0Var);
        this.d = sseVar;
        this.c = eabVar;
    }

    @Override // defpackage.rg4, defpackage.fi0
    public final void f(Throwable th) {
        ((dab) this.d.c).a(this.b, this.c);
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) {
        g05 g05Var = (g05) obj;
        eab eabVar = this.c;
        wv6 wv6Var = ((oj0) eabVar).a;
        boolean zA = fi0.a(i);
        boolean zQ = tu0.q(g05Var, wv6Var.i);
        fi0 fi0Var = this.b;
        if (g05Var != null && (zQ || wv6Var.f)) {
            if (zA && zQ) {
                fi0Var.g(i, g05Var);
            } else {
                fi0Var.g(i & (-2), g05Var);
            }
        }
        if (!zA || zQ || wv6Var.g) {
            return;
        }
        g05.d(g05Var);
        ((dab) this.d.c).a(fi0Var, eabVar);
    }
}
