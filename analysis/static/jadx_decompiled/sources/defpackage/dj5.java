package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class dj5 {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public dj5(av0 av0Var, kke kkeVar) {
        this.a = av0Var;
        this.c = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(fk5 fk5Var) {
        if (nu0.t0.equals(fk5Var.c)) {
            j47.T(this.c, null, null, new bj5(this, null), 3);
        }
    }

    @uae
    public final void onEvent(n5d n5dVar) {
        if ("file.local.max.size.reached".equals(n5dVar.b)) {
            j47.T(this.c, null, null, new cj5(this, null), 3);
        }
    }
}
