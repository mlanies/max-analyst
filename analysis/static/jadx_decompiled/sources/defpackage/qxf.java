package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class qxf {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public qxf(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.c = j1e.a(((w9a) ((kke) je7Var2.getValue())).a());
        ((av0) je7Var.getValue()).d(this);
    }

    public final void a(oxf oxfVar) {
        j47.T(this.c, null, null, new pxf(this, oxfVar, null), 3);
    }

    @uae
    public final void onEvent(bh5 bh5Var) {
        throw null;
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        a(new nxf(oi0Var.a));
    }

    @uae
    public final void onEvent(zg5 zg5Var) {
        a(new nxf(zg5Var.b));
    }

    @uae
    public final void onEvent(xg5 xg5Var) {
        a(new lxf(xg5Var.b));
    }

    @uae
    public final void onEvent(ah5 ah5Var) {
        a(new mxf(ah5Var.a));
    }
}
