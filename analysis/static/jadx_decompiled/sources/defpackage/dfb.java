package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class dfb {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public dfb(av0 av0Var, je7 je7Var) {
        this.b = j1e.a(((w9a) ((kke) je7Var.getValue())).c());
        av0Var.d(this);
    }

    public static final jqe a(dfb dfbVar, pke pkeVar) {
        dfbVar.getClass();
        String str = pkeVar.o;
        if (str != null && str.length() != 0) {
            return new iqe(str);
        }
        String str2 = pkeVar.b;
        return (f46.U(str2) && tpa.f(str2, "io.exception")) ? new eqe(jpc.G) : (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J);
    }

    @uae
    public final void onEvent(bhb bhbVar) {
        j47.T(this.b, null, null, new yeb(this, bhbVar, null), 3);
    }

    @uae
    public final void onEvent(vab vabVar) {
        j47.T(this.b, null, null, new zeb(this, vabVar, null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new afb(this, oi0Var, null), 3);
    }

    @uae
    public final void onEvent(xgb xgbVar) {
        j47.T(this.b, null, null, new bfb(this, xgbVar, null), 3);
    }

    @uae
    public final void onEvent(ts2 ts2Var) {
        j47.T(this.b, null, null, new cfb(this, ts2Var, null), 3);
    }
}
