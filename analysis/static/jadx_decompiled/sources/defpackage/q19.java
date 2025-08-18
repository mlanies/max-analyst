package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q19 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ t19 o;

    public /* synthetic */ q19(t19 t19Var, long j, long j2, int i) {
        this.a = i;
        this.o = t19Var;
        this.b = j;
        this.c = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ilc ilcVar;
        switch (this.a) {
            case 0:
                t19 t19Var = this.o;
                p19 p19Var = t19Var.r;
                ilcVar = t19Var.a;
                q36 q36VarF = p19Var.f();
                q36VarF.j(1, this.b);
                q36VarF.j(2, this.c);
                try {
                    ilcVar.c();
                    try {
                        q36VarF.n();
                        ilcVar.r();
                        p19Var.t(q36VarF);
                        return e5f.a;
                    } finally {
                    }
                } catch (Throwable th) {
                    p19Var.t(q36VarF);
                    throw th;
                }
            default:
                t19 t19Var2 = this.o;
                p19 p19Var2 = t19Var2.s;
                ilcVar = t19Var2.a;
                q36 q36VarF2 = p19Var2.f();
                q36VarF2.j(1, this.b);
                q36VarF2.j(2, this.c);
                try {
                    ilcVar.c();
                    try {
                        q36VarF2.n();
                        ilcVar.r();
                        p19Var2.t(q36VarF2);
                        return e5f.a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    p19Var2.t(q36VarF2);
                    throw th2;
                }
        }
    }
}
