package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u67 extends ztc {
    public static final zpc d;
    public static final zpc e;
    public static final t67 h;
    public static final boolean i;
    public static final r67 j;
    public final AtomicReference c;
    public static final TimeUnit g = TimeUnit.SECONDS;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        t67 t67Var = new t67(new zpc("RxCachedThreadSchedulerShutdown"));
        h = t67Var;
        t67Var.g();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        zpc zpcVar = new zpc("RxCachedThreadScheduler", iMax, false);
        d = zpcVar;
        e = new zpc("RxCachedWorkerPoolEvictor", iMax, false);
        i = Boolean.getBoolean("rx3.io-scheduled-release");
        r67 r67Var = new r67(0L, null, zpcVar);
        j = r67Var;
        r67Var.c.g();
        ScheduledFuture scheduledFuture = r67Var.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = r67Var.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public u67() {
        AtomicReference atomicReference;
        r67 r67Var = j;
        this.c = new AtomicReference(r67Var);
        r67 r67Var2 = new r67(f, g, d);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(r67Var, r67Var2)) {
                return;
            }
        } while (atomicReference.get() == r67Var);
        r67Var2.c.g();
        ScheduledFuture scheduledFuture = r67Var2.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = r67Var2.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // defpackage.ztc
    public final xtc a() {
        return new s67((r67) this.c.get());
    }
}
