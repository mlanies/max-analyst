package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ki7 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public ki7(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(hi7 hi7Var) {
        j47.T(this.b, null, null, new ii7(this, hi7Var, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new ji7(this, oi0Var, null), 3);
    }
}
