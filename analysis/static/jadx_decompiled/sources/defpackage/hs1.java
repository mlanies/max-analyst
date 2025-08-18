package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class hs1 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public hs1(je7 je7Var, je7 je7Var2) {
        this.b = j1e.a(((w9a) ((kke) je7Var2.getValue())).c());
        ((av0) je7Var.getValue()).d(this);
    }

    @uae
    public final void onEvent(b41 b41Var) {
        j47.T(this.b, null, null, new fs1(this, b41Var, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new gs1(this, oi0Var, null), 3);
    }
}
