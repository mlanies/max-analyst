package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yh6 implements RunnableScheduledFuture {
    public final AtomicReference a = new AtomicReference(null);
    public final long b;
    public final Callable c;
    public final oq1 o;

    public yh6(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        this.o = f8.g(new vq7(7, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.o.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.o.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.o.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.o.b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        lq1 lq1Var = (lq1) this.a.getAndSet(null);
        if (lq1Var != null) {
            try {
                lq1Var.b(this.c.call());
            } catch (Exception e) {
                lq1Var.d(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.o.b.get(j, timeUnit);
    }
}
