package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class sa3 extends pa3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sa3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        switch (this.a) {
            case 0:
                ra3 ra3Var = new ra3(0, ab3Var);
                ab3Var.c(ra3Var);
                try {
                    ((bb3) this.b).b(ra3Var);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    if (ra3Var.a(th)) {
                        return;
                    }
                    j47.Z(th);
                    return;
                }
            case 1:
                zl4 w6Var = new w6(1, ft.c);
                ab3Var.c(w6Var);
                if (!w6Var.h()) {
                    try {
                        ((f6) this.b).run();
                        if (!w6Var.h()) {
                            ab3Var.b();
                            break;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        if (w6Var.h()) {
                            j47.Z(th2);
                            return;
                        } else {
                            ab3Var.onError(th2);
                            return;
                        }
                    }
                }
                break;
            case 2:
                zl4 w6Var2 = new w6(1, ft.c);
                ab3Var.c(w6Var2);
                try {
                    ((Callable) this.b).call();
                    if (!w6Var2.h()) {
                        ab3Var.b();
                        break;
                    }
                } catch (Throwable th3) {
                    c37.B(th3);
                    if (w6Var2.h()) {
                        j47.Z(th3);
                        return;
                    } else {
                        ab3Var.onError(th3);
                        return;
                    }
                }
                break;
            default:
                ((iqd) this.b).k(new gd1(4, ab3Var));
                break;
        }
    }
}
