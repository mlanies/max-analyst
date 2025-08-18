package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class atc extends m55 implements ScheduledExecutorService {
    public final ScheduledExecutorService w0;

    public atc(ScheduledExecutorService scheduledExecutorService, hba hbaVar, q12 q12Var) {
        super(scheduledExecutorService, hbaVar, q12Var);
        this.w0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.w0.schedule(i(runnable, b()), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.w0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.w0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.w0.schedule(h(callable, b()), j, timeUnit);
    }
}
