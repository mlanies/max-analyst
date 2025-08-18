package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q1a extends iqd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q1a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.iqd
    public final void l(erd erdVar) {
        switch (this.a) {
            case 0:
                ((r1a) this.b).a(new uy9(erdVar));
                break;
            case 1:
                nqd nqdVar = new nqd(erdVar);
                erdVar.c(nqdVar);
                try {
                    ((grd) this.b).j(nqdVar);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    nqdVar.onError(th);
                    return;
                }
            case 2:
                zl4 w6Var = new w6(1, ft.c);
                erdVar.c(w6Var);
                if (!w6Var.h()) {
                    try {
                        Object objCall = ((Callable) this.b).call();
                        Objects.requireNonNull(objCall, "The callable returned a null value");
                        if (!w6Var.h()) {
                            erdVar.a(objCall);
                            break;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        if (w6Var.h()) {
                            j47.Z(th2);
                            return;
                        } else {
                            erdVar.onError(th2);
                            return;
                        }
                    }
                }
                break;
            default:
                erdVar.c(iz4.a);
                erdVar.a(this.b);
                break;
        }
    }
}
