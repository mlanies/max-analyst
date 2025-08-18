package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class ezc {
    public final kld a;
    public final ContextScope b;

    public ezc() {
        je7 je7Var = iyc.o;
        je7 je7Var2 = iyc.l;
        this.a = lld.b(0, 0, 0, 7);
        this.b = j1e.a(((w9a) ((kke) je7Var2.getValue())).c());
        ((av0) je7Var.getValue()).d(this);
    }

    @uae
    public final void onEvent(jl2 jl2Var) {
        j47.T(this.b, null, null, new czc(this, jl2Var, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new dzc(this, oi0Var, null), 3);
    }
}
