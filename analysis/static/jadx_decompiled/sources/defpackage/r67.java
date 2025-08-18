package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r67 implements Runnable {
    public final ScheduledFuture X;
    public final ThreadFactory Y;
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final hc3 c;
    public final ScheduledExecutorService o;

    public r67(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new hc3();
        this.Y = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, u67.e);
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        this.o = scheduledExecutorServiceNewScheduledThreadPool;
        this.X = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            t67 t67Var = (t67) it.next();
            if (t67Var.c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(t67Var)) {
                this.c.b(t67Var);
            }
        }
    }
}
