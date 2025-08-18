package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class rdd {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public rdd(je7 je7Var, kke kkeVar) {
        this.a = je7Var;
        this.c = j1e.a(((w9a) kkeVar).a());
        ((av0) je7Var.getValue()).d(this);
    }

    @uae
    public final void onEvent(hh3 hh3Var) {
        throw null;
    }

    @uae
    public final void onEvent(vbd vbdVar) {
        j47.T(this.c, null, null, new odd(this, vbdVar, null), 3);
    }

    @uae
    public final void onEvent(tbd tbdVar) {
        j47.T(this.c, null, null, new pdd(this, tbdVar, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.c, null, null, new qdd(this, oi0Var, null), 3);
    }
}
