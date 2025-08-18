package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class td5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                ud5 ud5Var = (ud5) this.c;
                th thVar = ud5Var.X;
                ilc ilcVar = ud5Var.a;
                q36 q36VarF = thVar.f();
                q36VarF.j(1, this.b);
                try {
                    ilcVar.c();
                    try {
                        Integer numValueOf = Integer.valueOf(q36VarF.n());
                        ilcVar.r();
                        return numValueOf;
                    } finally {
                        ilcVar.l();
                    }
                } finally {
                    thVar.t(q36VarF);
                }
            case 1:
                ew9 ew9Var = (ew9) this.c;
                p19 p19Var = ew9Var.o;
                ilc ilcVar2 = ew9Var.a;
                q36 q36VarF2 = p19Var.f();
                q36VarF2.j(1, this.b);
                try {
                    ilcVar2.c();
                    try {
                        q36VarF2.n();
                        ilcVar2.r();
                        p19Var.t(q36VarF2);
                        return e5f.a;
                    } finally {
                        ilcVar2.l();
                    }
                } catch (Throwable th) {
                    p19Var.t(q36VarF2);
                    throw th;
                }
            case 2:
                yx9 yx9Var = (yx9) this.c;
                p19 p19Var2 = yx9Var.c;
                ilc ilcVar3 = yx9Var.a;
                q36 q36VarF3 = p19Var2.f();
                q36VarF3.j(1, this.b);
                try {
                    ilcVar3.c();
                    try {
                        Integer numValueOf2 = Integer.valueOf(q36VarF3.n());
                        ilcVar3.r();
                        return numValueOf2;
                    } finally {
                        ilcVar3.l();
                    }
                } finally {
                    p19Var2.t(q36VarF3);
                }
            case 3:
                alc alcVar = (alc) this.c;
                p19 p19Var3 = alcVar.j;
                ilc ilcVar4 = alcVar.a;
                q36 q36VarF4 = p19Var3.f();
                q36VarF4.j(1, this.b);
                try {
                    ilcVar4.c();
                    try {
                        q36VarF4.n();
                        ilcVar4.r();
                        p19Var3.t(q36VarF4);
                        return e5f.a;
                    } finally {
                        ilcVar4.l();
                    }
                } catch (Throwable th2) {
                    p19Var3.t(q36VarF4);
                    throw th2;
                }
            default:
                w8f w8fVar = (w8f) this.c;
                zkc zkcVar = w8fVar.d;
                ilc ilcVar5 = w8fVar.a;
                q36 q36VarF5 = zkcVar.f();
                q36VarF5.j(1, this.b);
                try {
                    ilcVar5.c();
                    try {
                        q36VarF5.n();
                        ilcVar5.r();
                        zkcVar.t(q36VarF5);
                        return null;
                    } finally {
                        ilcVar5.l();
                    }
                } catch (Throwable th3) {
                    zkcVar.t(q36VarF5);
                    throw th3;
                }
        }
    }
}
