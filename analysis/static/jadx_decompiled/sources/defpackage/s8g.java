package defpackage;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* loaded from: classes2.dex */
public final class s8g {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public s8g(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        this.g = je7Var7;
    }

    public final void a(d8d d8dVar) {
        ExecutorService executorServiceK;
        hm9.m("s8g", "execute task = %s", d8dVar);
        je7 je7Var = this.b;
        o45 o45Var = (o45) je7Var.getValue();
        je7 je7Var2 = this.a;
        je7 je7Var3 = this.f;
        r8g r8gVar = new r8g(d8dVar, je7Var2, o45Var, je7Var3);
        boolean z = d8dVar instanceof r9d;
        je7 je7Var4 = this.c;
        if (!z) {
            if (d8dVar.v() && (executorServiceK = d8dVar.k((iba) ((e8d) je7Var3.getValue()).D.getValue(), ((ri4) ((e8d) je7Var3.getValue()).d.getValue()).b())) != null) {
                executorServiceK.execute(r8gVar);
                return;
            }
            hm9.n("WorkerService", "normal executor will run " + d8dVar);
            ((iba) je7Var4.getValue()).c().execute(r8gVar);
            return;
        }
        hm9.n("s8g", "execute ServiceTaskTransmitTamTasks");
        iba ibaVar = (iba) je7Var4.getValue();
        ibaVar.getClass();
        bc7 bc7Var = iba.p[5];
        ExecutorService executorServiceE = ibaVar.e(ibaVar.k);
        if (executorServiceE.isShutdown() || executorServiceE.isTerminated()) {
            String str = "WARNING! SingleTransmitExecutor has broken state. isShutdown: " + executorServiceE.isShutdown() + ", isTerminated: " + executorServiceE.isTerminated();
            hm9.k0("s8g", null, str, Arrays.copyOf(new Object[0], 0));
            ((o45) je7Var.getValue()).a(new ExceptionHandler$HandledException(str, "ONEME-17687", null));
        }
        executorServiceE.execute(r8gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b(d8d d8dVar) {
        hua huaVar = (hua) d8dVar;
        ((eoe) this.a.getValue()).g(huaVar, 0L, 0);
        r9d.y(this);
        return huaVar.getId();
    }
}
