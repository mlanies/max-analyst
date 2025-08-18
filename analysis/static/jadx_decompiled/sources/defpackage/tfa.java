package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class tfa implements ScheduledFuture {
    public volatile Object Y;
    public final Callable a;
    public final ExecutorService b;
    public ScheduledFuture s0;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final CountDownLatch X = new CountDownLatch(1);
    public final AtomicReference Z = new AtomicReference(null);

    public tfa(Callable callable, ExecutorService executorService) {
        this.a = callable;
        this.b = executorService;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.o;
        if (atomicBoolean.get()) {
            return false;
        }
        AtomicBoolean atomicBoolean2 = this.c;
        if (atomicBoolean2.get()) {
            return false;
        }
        atomicBoolean2.set(true);
        atomicBoolean.set(true);
        ScheduledFuture scheduledFuture = this.s0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        scheduledFuture.cancel(z);
        this.X.countDown();
        return true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        ScheduledFuture scheduledFuture = this.s0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.compareTo(delayed2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.o.get()) {
            this.X.await();
        }
        Exception exc = (Exception) this.Z.get();
        if (exc == null) {
            if (this.c.get()) {
                throw new CancellationException("Future is cancelled");
            }
            return this.Y;
        }
        ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
        if (executionException != null) {
            throw executionException;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        ScheduledFuture scheduledFuture = this.s0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.o.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (!this.o.get() && !this.X.await(j, timeUnit)) {
            throw new TimeoutException("No result for " + j + " " + timeUnit);
        }
        Exception exc = (Exception) this.Z.get();
        if (exc == null) {
            return this.Y;
        }
        ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
        if (executionException != null) {
            throw executionException;
        }
        throw new ExecutionException(exc);
    }
}
