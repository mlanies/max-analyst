package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class itf implements Callable {
    public final /* synthetic */ mtf X;
    public final /* synthetic */ boolean a = true;
    public final /* synthetic */ boolean b = true;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public itf(mtf mtfVar, long j, long j2) {
        this.X = mtfVar;
        this.c = j;
        this.o = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        mtf mtfVar = this.X;
        zkc zkcVar = mtfVar.e;
        ilc ilcVar = mtfVar.a;
        q36 q36VarF = zkcVar.f();
        q36VarF.j(1, this.a ? 1L : 0L);
        q36VarF.j(2, this.b ? 1L : 0L);
        q36VarF.j(3, this.c);
        q36VarF.j(4, this.o);
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
            zkcVar.t(q36VarF);
        }
    }
}
