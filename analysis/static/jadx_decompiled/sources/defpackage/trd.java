package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class trd extends ztc {
    public static final zpc d;
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        d = new zpc("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public trd() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z = guc.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(guc.a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // defpackage.ztc
    public final xtc a() {
        return new srd((ScheduledExecutorService) this.c.get());
    }

    @Override // defpackage.ztc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        zsc zscVar = new zsc(runnable, true);
        AtomicReference atomicReference = this.c;
        try {
            zscVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(zscVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(zscVar, j, timeUnit));
            return zscVar;
        } catch (RejectedExecutionException e2) {
            j47.Z(e2);
            return iz4.a;
        }
    }

    @Override // defpackage.ztc
    public final zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        iz4 iz4Var = iz4.a;
        AtomicReference atomicReference = this.c;
        if (j2 > 0) {
            ysc yscVar = new ysc(runnable, true);
            try {
                yscVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(yscVar, j, j2, timeUnit));
                return yscVar;
            } catch (RejectedExecutionException e2) {
                j47.Z(e2);
                return iz4Var;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        d37 d37Var = new d37(runnable, scheduledExecutorService);
        try {
            d37Var.a(j <= 0 ? scheduledExecutorService.submit(d37Var) : scheduledExecutorService.schedule(d37Var, j, timeUnit));
            return d37Var;
        } catch (RejectedExecutionException e3) {
            j47.Z(e3);
            return iz4Var;
        }
    }
}
