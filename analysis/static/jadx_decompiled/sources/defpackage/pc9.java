package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class pc9 extends mc9 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public pc9(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        e3f e3fVar = new e3f(callable);
        return new nc9(e3fVar, this.b.schedule(e3fVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        oc9 oc9Var = new oc9(runnable);
        return new nc9(oc9Var, this.b.scheduleAtFixedRate(oc9Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        oc9 oc9Var = new oc9(runnable);
        return new nc9(oc9Var, this.b.scheduleWithFixedDelay(oc9Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        e3f e3fVar = new e3f(Executors.callable(runnable, null));
        return new nc9(e3fVar, this.b.schedule(e3fVar, j, timeUnit));
    }
}
