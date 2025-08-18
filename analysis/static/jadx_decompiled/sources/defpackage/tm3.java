package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class tm3 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public tm3(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    public final mn5 a() {
        return new v7c(this.a);
    }

    @uae
    public final void onEvent(ut7 ut7Var) {
        j47.T(this.b, null, null, new pm3(this, null), 3);
    }

    @uae
    public final void onEvent(sva svaVar) {
        j47.T(this.b, null, null, new qm3(this, null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3Var) {
        j47.T(this.b, null, null, new rm3(this, ps3Var, null), 3);
    }

    @uae
    public final void onEvent(c6f c6fVar) {
        j47.T(this.b, null, null, new sm3(this, null), 3);
    }
}
