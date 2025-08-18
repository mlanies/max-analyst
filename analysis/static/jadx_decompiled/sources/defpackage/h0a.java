package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h0a extends qy9 implements kde {
    public final Callable a;

    public h0a(l5 l5Var) {
        this.a = l5Var;
    }

    @Override // defpackage.kde
    public final Object get() throws Exception {
        Object objCall = this.a.call();
        if (objCall == null) {
            throw q45.b("The Callable returned a null value.");
        }
        p45 p45Var = q45.a;
        return objCall;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        cg4 cg4Var = new cg4(f2aVar);
        f2aVar.c(cg4Var);
        if (cg4Var.h()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            if (objCall == null) {
                throw q45.b("Callable returned a null value.");
            }
            p45 p45Var = q45.a;
            cg4Var.f(objCall);
        } catch (Throwable th) {
            c37.B(th);
            if (cg4Var.h()) {
                j47.Z(th);
            } else {
                f2aVar.onError(th);
            }
        }
    }
}
