package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nc9 extends j47 implements ScheduledFuture, bm7, Future {
    public final bm7 w0;
    public final ScheduledFuture x0;

    public nc9(k1 k1Var, ScheduledFuture scheduledFuture) {
        super(10);
        this.w0 = k1Var;
        this.x0 = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zU0 = u0(z);
        if (zU0) {
            this.x0.cancel(z);
        }
        return zU0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.x0.compareTo(delayed);
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        this.w0.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.w0.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.x0.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.w0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.w0.isDone();
    }

    public final boolean u0(boolean z) {
        return this.w0.cancel(z);
    }

    @Override // defpackage.j47
    public final Object z() {
        return this.w0;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.w0.get(j, timeUnit);
    }
}
