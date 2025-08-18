package defpackage;

import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ld3 extends ztc {
    public static final jd3 d;
    public static final zpc e;
    public static final int f;
    public static final kd3 g;
    public final AtomicReference c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        kd3 kd3Var = new kd3(new zpc("RxComputationShutdown"));
        g = kd3Var;
        kd3Var.g();
        zpc zpcVar = new zpc("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = zpcVar;
        jd3 jd3Var = new jd3(0, zpcVar);
        d = jd3Var;
        for (kd3 kd3Var2 : jd3Var.b) {
            kd3Var2.g();
        }
    }

    public ld3() {
        AtomicReference atomicReference;
        jd3 jd3Var = d;
        this.c = new AtomicReference(jd3Var);
        jd3 jd3Var2 = new jd3(f, e);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(jd3Var, jd3Var2)) {
                return;
            }
        } while (atomicReference.get() == jd3Var);
        for (kd3 kd3Var : jd3Var2.b) {
            kd3Var.g();
        }
    }

    @Override // defpackage.ztc
    public final xtc a() {
        return new id3(((jd3) this.c.get()).a());
    }

    @Override // defpackage.ztc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        kd3 kd3VarA = ((jd3) this.c.get()).a();
        kd3VarA.getClass();
        Objects.requireNonNull(runnable, "run is null");
        zsc zscVar = new zsc(runnable, true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = kd3VarA.a;
        try {
            zscVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit(zscVar) : scheduledThreadPoolExecutor.schedule(zscVar, j, timeUnit));
            return zscVar;
        } catch (RejectedExecutionException e2) {
            j47.Z(e2);
            return iz4.a;
        }
    }

    @Override // defpackage.ztc
    public final zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        kd3 kd3VarA = ((jd3) this.c.get()).a();
        kd3VarA.getClass();
        Objects.requireNonNull(runnable, "run is null");
        iz4 iz4Var = iz4.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = kd3VarA.a;
        if (j2 <= 0) {
            d37 d37Var = new d37(runnable, scheduledThreadPoolExecutor);
            try {
                d37Var.a(j <= 0 ? scheduledThreadPoolExecutor.submit(d37Var) : scheduledThreadPoolExecutor.schedule(d37Var, j, timeUnit));
                return d37Var;
            } catch (RejectedExecutionException e2) {
                j47.Z(e2);
                return iz4Var;
            }
        }
        ysc yscVar = new ysc(runnable, true);
        try {
            yscVar.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(yscVar, j, j2, timeUnit));
            return yscVar;
        } catch (RejectedExecutionException e3) {
            j47.Z(e3);
            return iz4Var;
        }
    }
}
