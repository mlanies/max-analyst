package defpackage;

import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class iba {
    public static final /* synthetic */ bc7[] p = {new hob(iba.class, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), z7b.g(nec.a, iba.class, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(iba.class, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(iba.class, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), new hob(iba.class, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0), new hob(iba.class, "singleTransmitExecutor", "getSingleTransmitExecutor()Ljava/util/concurrent/ExecutorService;", 0)};
    public final fh8 a;
    public volatile vse b;
    public final Thread.UncaughtExceptionHandler c;
    public final ConcurrentHashMap d;
    public final khe e;
    public final x45 f;
    public final x45 g;
    public final x45 h;
    public final x45 i;
    public final x45 j;
    public final x45 k;
    public final khe l;
    public final khe m;
    public final khe n;
    public final khe o;

    static {
        int i = 9;
        int i2 = ft4.o;
        kt4 kt4Var = kt4.SECONDS;
        new fh8(false, z7.R(Integer.MAX_VALUE, kt4Var), z7.R(Integer.MAX_VALUE, kt4Var), new ww9(i), new ww9(i));
    }

    public iba(fh8 fh8Var, rd3 rd3Var, final x45 x45Var, x45 x45Var2, final x45 x45Var3) {
        fe feVar = fe.a;
        final x45 x45Var4 = new x45("single", 1, 0L, false, true, 0, 72);
        x45 x45Var5 = new x45("single-low", 1, 0L, false, true, 1, 8);
        x45 x45Var6 = new x45("trnsmt", 1, 1, 0L, true, false, 10);
        this.a = fh8Var;
        this.b = feVar;
        this.c = rd3Var;
        this.d = new ConcurrentHashMap();
        this.e = new khe(new gba(this, 1));
        this.f = x45Var;
        this.g = x45Var3;
        this.h = x45Var4;
        this.i = x45Var5;
        this.j = x45Var2;
        this.k = x45Var6;
        final int i = 1;
        this.l = new khe(new k56(this) { // from class: fba
            public final /* synthetic */ iba b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        iba ibaVar = this.b;
                        eba ebaVarB = ibaVar.b();
                        ebaVarB.getClass();
                        x45 x45Var7 = x45Var;
                        return ibaVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sk5(x45Var7.b, ebaVarB.a.s("OneMeScheduler", Integer.valueOf(x45Var7.g)))), "OneMeScheduler");
                    case 1:
                        iba ibaVar2 = this.b;
                        return ibaVar2.h(ibaVar2.c(), x45Var.a);
                    case 2:
                        iba ibaVar3 = this.b;
                        return ibaVar3.h(ibaVar3.a(), x45Var.a);
                    default:
                        iba ibaVar4 = this.b;
                        return ibaVar4.h(ibaVar4.d(), x45Var.a);
                }
            }
        });
        final int i2 = 2;
        this.m = new khe(new k56(this) { // from class: fba
            public final /* synthetic */ iba b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        iba ibaVar = this.b;
                        eba ebaVarB = ibaVar.b();
                        ebaVarB.getClass();
                        x45 x45Var7 = x45Var3;
                        return ibaVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sk5(x45Var7.b, ebaVarB.a.s("OneMeScheduler", Integer.valueOf(x45Var7.g)))), "OneMeScheduler");
                    case 1:
                        iba ibaVar2 = this.b;
                        return ibaVar2.h(ibaVar2.c(), x45Var3.a);
                    case 2:
                        iba ibaVar3 = this.b;
                        return ibaVar3.h(ibaVar3.a(), x45Var3.a);
                    default:
                        iba ibaVar4 = this.b;
                        return ibaVar4.h(ibaVar4.d(), x45Var3.a);
                }
            }
        });
        final int i3 = 3;
        this.n = new khe(new k56(this) { // from class: fba
            public final /* synthetic */ iba b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        iba ibaVar = this.b;
                        eba ebaVarB = ibaVar.b();
                        ebaVarB.getClass();
                        x45 x45Var7 = x45Var4;
                        return ibaVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sk5(x45Var7.b, ebaVarB.a.s("OneMeScheduler", Integer.valueOf(x45Var7.g)))), "OneMeScheduler");
                    case 1:
                        iba ibaVar2 = this.b;
                        return ibaVar2.h(ibaVar2.c(), x45Var4.a);
                    case 2:
                        iba ibaVar3 = this.b;
                        return ibaVar3.h(ibaVar3.a(), x45Var4.a);
                    default:
                        iba ibaVar4 = this.b;
                        return ibaVar4.h(ibaVar4.d(), x45Var4.a);
                }
            }
        });
        final int i4 = 0;
        this.o = new khe(new k56(this) { // from class: fba
            public final /* synthetic */ iba b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        iba ibaVar = this.b;
                        eba ebaVarB = ibaVar.b();
                        ebaVarB.getClass();
                        x45 x45Var7 = x45Var4;
                        return ibaVar.j((ScheduledExecutorService) ScheduledExecutorService.class.cast(new sk5(x45Var7.b, ebaVarB.a.s("OneMeScheduler", Integer.valueOf(x45Var7.g)))), "OneMeScheduler");
                    case 1:
                        iba ibaVar2 = this.b;
                        return ibaVar2.h(ibaVar2.c(), x45Var4.a);
                    case 2:
                        iba ibaVar3 = this.b;
                        return ibaVar3.h(ibaVar3.a(), x45Var4.a);
                    default:
                        iba ibaVar4 = this.b;
                        return ibaVar4.h(ibaVar4.d(), x45Var4.a);
                }
            }
        });
    }

    public final ExecutorService a() {
        bc7 bc7Var = p[1];
        return e(this.g);
    }

    public final eba b() {
        return (eba) this.e.getValue();
    }

    public final ExecutorService c() {
        bc7 bc7Var = p[0];
        return e(this.f);
    }

    public final ExecutorService d() {
        bc7 bc7Var = p[2];
        return e(this.h);
    }

    public final ExecutorService e(x45 x45Var) {
        return (ExecutorService) this.d.computeIfAbsent(x45Var, new di(11, new ga(this, 23, x45Var)));
    }

    public final ExecutorService f(int i, String str, int i2, int i3) {
        eba ebaVarB = b();
        ebaVarB.getClass();
        dba dbaVar = new dba();
        tk5 tk5Var = new tk5(i, i2, 60000L, TimeUnit.MILLISECONDS, dbaVar, ebaVarB.a.s(str, Integer.valueOf(i3)));
        tk5Var.allowCoreThreadTimeOut(true);
        tk5Var.setRejectedExecutionHandler(new qw1(1));
        return i(tk5Var, str);
    }

    public final ExecutorService g() {
        eba ebaVarB = b();
        ebaVarB.getClass();
        tk5 tk5Var = new tk5(3, 3, 60000L, TimeUnit.MILLISECONDS, new dba(), ebaVarB.a.s("tam-srvc", 5));
        tk5Var.allowCoreThreadTimeOut(true);
        tk5Var.setRejectedExecutionHandler(new qw1(1));
        return i(tk5Var, "tam-srvc");
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof m55;
        khe kheVar = this.o;
        return z ? new zg4(executorService, kheVar) : j(new zg4(executorService, kheVar), str);
    }

    public final ExecutorService i(tk5 tk5Var, String str) {
        return this.a.b ? new m55(tk5Var, new hba(this, 0), new q12(str, 3)) : tk5Var;
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        return (!this.a.b || (scheduledExecutorService instanceof atc)) ? scheduledExecutorService : new atc(scheduledExecutorService, new hba(this, 1), new q12(str, 4));
    }
}
