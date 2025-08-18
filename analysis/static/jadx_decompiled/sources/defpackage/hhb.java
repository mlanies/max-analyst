package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class hhb {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public hhb(av0 av0Var, je7 je7Var) {
        this.b = j1e.a(((w9a) ((kke) je7Var.getValue())).c());
        av0Var.d(this);
    }

    public static final jqe a(hhb hhbVar, pke pkeVar) {
        hhbVar.getClass();
        String str = pkeVar.o;
        if (str != null && str.length() != 0) {
            return new iqe(str);
        }
        String str2 = pkeVar.b;
        return (f46.U(str2) && tpa.f(str2, "io.exception")) ? new eqe(jpc.G) : (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        j47.T(this.b, null, null, new fhb(this, oi0Var, null), 3);
    }

    @uae
    public final void onEvent(xgb xgbVar) {
        j47.T(this.b, null, null, new ghb(this, xgbVar, null), 3);
    }
}
