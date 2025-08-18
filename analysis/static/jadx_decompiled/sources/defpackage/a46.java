package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a46 implements ExecutorService {
    public final ExecutorService a;
    public final je7 b = tu0.r(3, new fh5(11));

    public a46(ExecutorService executorService) {
        this.a = executorService;
    }

    public final boolean a() {
        return Thread.currentThread() == ((Thread) this.b.getValue());
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            this.a.execute(new i40(runnable, 1));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(e5f.a);
        }
        return this.a.submit(new i40(runnable, 3));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(obj);
        }
        return this.a.submit(new i40(runnable, 2), obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        if (a()) {
            return CompletableFuture.completedFuture(callable.call());
        }
        return this.a.submit(new l5(5, callable));
    }
}
