package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class my8 implements Callable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public my8(oy8 oy8Var, long j, long j2, String str) {
        this.X = oy8Var;
        this.c = j;
        this.o = j2;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                oy8 oy8Var = (oy8) this.X;
                th thVar = oy8Var.c;
                ilc ilcVar = oy8Var.a;
                q36 q36VarF = thVar.f();
                q36VarF.j(1, this.c);
                q36VarF.j(2, this.o);
                String str = this.b;
                if (str == null) {
                    q36VarF.W(3);
                } else {
                    q36VarF.f(3, str);
                }
                try {
                    ilcVar.c();
                    try {
                        q36VarF.n();
                        ilcVar.r();
                        thVar.t(q36VarF);
                        return null;
                    } finally {
                        ilcVar.l();
                    }
                } catch (Throwable th) {
                    thVar.t(q36VarF);
                    throw th;
                }
            default:
                mtf mtfVar = (mtf) this.X;
                zkc zkcVar = mtfVar.d;
                ilc ilcVar2 = mtfVar.a;
                q36 q36VarF2 = zkcVar.f();
                String str2 = this.b;
                if (str2 == null) {
                    q36VarF2.W(1);
                } else {
                    q36VarF2.f(1, str2);
                }
                q36VarF2.j(2, this.c);
                q36VarF2.j(3, this.o);
                try {
                    ilcVar2.c();
                    try {
                        Integer numValueOf = Integer.valueOf(q36VarF2.n());
                        ilcVar2.r();
                        return numValueOf;
                    } finally {
                        ilcVar2.l();
                    }
                } finally {
                    zkcVar.t(q36VarF2);
                }
        }
    }

    public my8(mtf mtfVar, String str, long j, long j2) {
        this.X = mtfVar;
        this.b = str;
        this.c = j;
        this.o = j2;
    }
}
