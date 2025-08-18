package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class un9 implements dab {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public un9(dab dabVar, s2b s2bVar, Executor executor) {
        dabVar.getClass();
        this.b = dabVar;
        this.c = s2bVar;
        executor.getClass();
        this.d = executor;
    }

    public static void e(rq8 rq8Var, int i, fi0 fi0Var) throws Throwable {
        v84 v84VarO0 = o43.o0(rq8Var.n());
        g05 g05Var = null;
        try {
            g05 g05Var2 = new g05(v84VarO0);
            try {
                g05Var2.S();
                fi0Var.g(i, g05Var2);
                g05.d(g05Var2);
                o43.S(v84VarO0);
            } catch (Throwable th) {
                th = th;
                g05Var = g05Var2;
                g05.d(g05Var);
                o43.S(v84VarO0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        switch (this.a) {
            case 0:
                ((oj0) eabVar).c.j(eabVar, "NetworkFetchProducer");
                mr0 mr0Var = (mr0) this.d;
                hf5 hf5VarN = mr0Var.n(fi0Var, eabVar);
                mr0Var.t(hf5VarN, new h7b(this, 26, hf5VarN));
                break;
            default:
                hab habVar = ((oj0) eabVar).c;
                q6b q6bVar = ((oj0) eabVar).a.q;
                q6bVar.getClass();
                ((dab) this.b).a(new q9(new r6b(this, fi0Var, habVar, q6bVar, eabVar), 1), eabVar);
                break;
        }
    }

    public void c(rq8 rq8Var, hf5 hf5Var) throws Throwable {
        int i = rq8Var.c;
        hab habVarA = hf5Var.a();
        eab eabVar = hf5Var.b;
        HashMap mapD = !habVarA.i(eabVar, "NetworkFetchProducer") ? null : ((mr0) this.d).D(hf5Var, i);
        hab habVarA2 = hf5Var.a();
        habVarA2.a(eabVar, "NetworkFetchProducer", mapD);
        habVarA2.e(eabVar, "NetworkFetchProducer", true);
        ((oj0) eabVar).h("network", "default");
        e(rq8Var, 1, hf5Var.a);
    }

    public void d(rq8 rq8Var, hf5 hf5Var) throws Throwable {
        oj0 oj0Var = (oj0) hf5Var.b;
        if (oj0Var.w0.o == null || !oj0Var.f()) {
            return;
        }
        ((mr0) this.d).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - hf5Var.c >= 100) {
            hf5Var.c = jUptimeMillis;
            hf5Var.a().b(hf5Var.b);
            e(rq8Var, 0, hf5Var.a);
        }
    }

    public un9(y7g y7gVar, ja6 ja6Var, mr0 mr0Var) {
        this.b = y7gVar;
        this.c = ja6Var;
        this.d = mr0Var;
    }
}
