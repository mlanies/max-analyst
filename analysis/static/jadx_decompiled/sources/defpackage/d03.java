package defpackage;

import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes.dex */
public final class d03 extends k87 {
    public final /* synthetic */ int b;
    public final sy1 c;

    public /* synthetic */ d03(sy1 sy1Var, int i) {
        this.b = i;
        this.c = sy1Var;
    }

    @Override // defpackage.k87
    public final boolean c() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                z87 z87Var = this.a;
                if (z87Var == null) {
                    z87Var = null;
                }
                sy1 sy1Var = this.c;
                Throwable thK = sy1Var.k(z87Var);
                if (!(!sy1Var.r() ? false : ((DispatchedContinuation) sy1Var.a).postponeCancellation$kotlinx_coroutines_core(thK))) {
                    sy1Var.cancel(thK);
                    if (!sy1Var.r()) {
                        sy1Var.h();
                        break;
                    }
                }
                break;
            default:
                z87 z87Var2 = this.a;
                if (z87Var2 == null) {
                    z87Var2 = null;
                }
                Object state$kotlinx_coroutines_core = z87Var2.getState$kotlinx_coroutines_core();
                boolean z = state$kotlinx_coroutines_core instanceof lb3;
                sy1 sy1Var2 = this.c;
                if (!z) {
                    sy1Var2.resumeWith(a97.a(state$kotlinx_coroutines_core));
                    break;
                } else {
                    sy1Var2.resumeWith(new njc(((lb3) state$kotlinx_coroutines_core).a));
                    break;
                }
        }
    }
}
