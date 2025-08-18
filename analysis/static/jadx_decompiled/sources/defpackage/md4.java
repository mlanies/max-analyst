package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class md4 extends AbstractExecutorService implements v6d {
    public static final /* synthetic */ int s0 = 0;
    public final re X;
    public final AtomicInteger Y;
    public final AtomicInteger Z;
    public final String a;
    public final Executor b;
    public volatile int c;
    public final BlockingQueue o;

    public md4(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = "SerialExecutor";
        this.b = executor;
        this.c = 1;
        this.o = linkedBlockingQueue;
        this.X = new re(11, this);
        this.Y = new AtomicInteger(0);
        this.Z = new AtomicInteger(0);
    }

    public final void a(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        BlockingQueue blockingQueue = this.o;
        boolean zOffer = blockingQueue.offer(runnable);
        String str = this.a;
        if (!zOffer) {
            throw new RejectedExecutionException(str + " queue is full, size=" + blockingQueue.size());
        }
        int size = blockingQueue.size();
        AtomicInteger atomicInteger = this.Z;
        int i = atomicInteger.get();
        if (size > i && atomicInteger.compareAndSet(i, size)) {
            ta5.e(md4.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        b();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i = this.Y.get();
        while (i < this.c) {
            int i2 = i + 1;
            if (this.Y.compareAndSet(i, i2)) {
                ta5.f(md4.class, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.X);
                return;
            } else {
                ta5.d(md4.class, this.a, "%s: race in startWorkerIfNeeded; retrying");
                i = this.Y.get();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        a(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
