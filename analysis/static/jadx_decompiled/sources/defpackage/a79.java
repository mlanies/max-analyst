package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class a79 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public a79(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(fn4 fn4Var) {
        j47.T(this.b, null, null, new z69(this, new w69(fn4Var.X, fn4Var.o), null), 3);
    }

    @uae
    public final void onEvent(hn4 hn4Var) {
        j47.T(this.b, null, null, new z69(this, new x69(hn4Var.o, hn4Var.c), null), 3);
    }
}
