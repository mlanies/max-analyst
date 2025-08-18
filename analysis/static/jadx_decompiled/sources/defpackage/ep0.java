package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ep0 {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public ep0(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.c = j1e.a(((w9a) ((kke) je7Var2.getValue())).a());
        ((av0) je7Var.getValue()).d(this);
    }

    @uae
    public final void onEvent(ps3 ps3Var) {
        j47.T(this.c, null, null, new bp0(this, ps3Var, null), 3);
    }

    @uae
    public final void onEvent(kn3 kn3Var) {
        j47.T(this.c, null, null, new cp0(this, kn3Var, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.c, null, null, new dp0(this, oi0Var, null), 3);
    }
}
