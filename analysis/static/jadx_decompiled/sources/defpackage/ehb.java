package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ehb {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public ehb(av0 av0Var, kke kkeVar) {
        this.a = av0Var;
        this.c = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        jqe eqeVar;
        Long lValueOf = Long.valueOf(oi0Var.a);
        pke pkeVar = oi0Var.b;
        String str = pkeVar.o;
        if (str == null || str.length() == 0) {
            String str2 = pkeVar.b;
            eqeVar = (f46.U(str2) && tpa.f(str2, "io.exception")) ? new eqe(jpc.G) : (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J);
        } else {
            eqeVar = new iqe(str);
        }
        j47.T(this.c, null, null, new dhb(this, new zgb(lValueOf, eqeVar), null), 3);
    }

    @uae
    public final void onEvent(ts2 ts2Var) {
        j47.T(this.c, null, null, new dhb(this, new ahb(Long.valueOf(ts2Var.a)), null), 3);
    }
}
