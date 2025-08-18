package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class dxa {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public dxa(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(tk2 tk2Var) {
        j47.T(this.b, null, null, new bxa(this, tk2Var, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new cxa(this, oi0Var, null), 3);
    }
}
