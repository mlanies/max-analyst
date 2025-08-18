package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class rn8 {
    public final long a;
    public final long b;
    public final av0 c;
    public final kld d = lld.b(0, 0, 0, 7);
    public final ContextScope e;

    public rn8(long j, long j2, av0 av0Var, kke kkeVar) {
        this.a = j;
        this.b = j2;
        this.c = av0Var;
        this.e = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(vz2 vz2Var) {
        if (vz2Var.b.contains(Long.valueOf(this.b))) {
            j47.T(this.e, null, null, new pn8(this, null), 3);
        }
    }

    @uae
    public final void onEvent(l6f l6fVar) {
        if (l6fVar.b == this.b) {
            if (l6fVar.c == this.a || l6fVar.X) {
                j47.T(this.e, null, null, new qn8(this, null), 3);
            }
        }
    }
}
