package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t28 extends f28 implements kde {
    public final Callable a;

    public t28(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        w6 w6Var = new w6(1, ft.c);
        b38Var.c(w6Var);
        if (w6Var.h()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            if (w6Var.h()) {
                return;
            }
            if (objCall == null) {
                b38Var.b();
            } else {
                b38Var.a(objCall);
            }
        } catch (Throwable th) {
            c37.B(th);
            if (w6Var.h()) {
                j47.Z(th);
            } else {
                b38Var.onError(th);
            }
        }
    }

    @Override // defpackage.kde
    public final Object get() {
        return this.a.call();
    }
}
