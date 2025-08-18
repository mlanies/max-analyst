package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final /* synthetic */ class d76 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ d76(lq1 lq1Var, bm7 bm7Var, long j) {
        this.c = lq1Var;
        this.o = bm7Var;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        m20 m20Var;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((lq1) this.c).d(new TimeoutException("Future[" + ((bm7) this.o) + "] is not done within " + this.b + " ms.")));
            default:
                vlc vlcVar = (vlc) this.c;
                t19 t19VarD = vlcVar.d();
                long j = this.b;
                ru8 ru8VarC = t19VarD.c(j);
                int iM = 0;
                if (ru8VarC == null) {
                    return 0;
                }
                k8g k8gVar = ru8VarC.m;
                if (k8gVar != null) {
                    m20Var = k8gVar.C();
                } else {
                    m20Var = new m20();
                    m20Var.a = nz4.a;
                }
                int iB = m20Var.b() + (m20Var.b != null ? 1 : 0);
                ((qj3) this.o).accept(m20Var);
                int iB2 = m20Var.b() + (m20Var.b == null ? 0 : 1);
                if (iB > 0 || iB2 > 0) {
                    k8g k8gVarC = m20Var.c();
                    iM = vlcVar.d().m(new b6f(j, k8gVarC, iz7.c(k8gVarC)));
                }
                return Integer.valueOf(iM);
        }
    }

    public /* synthetic */ d76(vlc vlcVar, long j, qj3 qj3Var) {
        this.c = vlcVar;
        this.b = j;
        this.o = qj3Var;
    }
}
