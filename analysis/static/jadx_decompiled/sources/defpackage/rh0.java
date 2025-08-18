package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class rh0 {
    public final kld a;
    public final v7c b;
    public final ContextScope c;

    public rh0(av0 av0Var, kke kkeVar) {
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.a = kldVarB;
        this.b = new v7c(kldVarB);
        this.c = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onBaseError(oi0 oi0Var) {
        j47.T(this.c, null, null, new qh0(this, oi0Var, null), 3);
    }
}
