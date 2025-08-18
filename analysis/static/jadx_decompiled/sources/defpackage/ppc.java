package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class ppc implements RunnableFuture {
    public Object X;
    public Thread Y;
    public boolean Z;
    public final ae3 a = new ae3(1, false);
    public final ae3 b = new ae3(1, false);
    public final Object c = new Object();
    public Exception o;

    public final void a() {
        this.b.b();
    }

    public void b() {
    }

    public abstract Object c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.c) {
            try {
                if (!this.Z && !this.b.e()) {
                    this.Z = true;
                    b();
                    Thread thread = this.Y;
                    if (thread == null) {
                        this.a.g();
                        this.b.g();
                    } else if (z) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.b.a();
        if (this.Z) {
            throw new CancellationException();
        }
        if (this.o == null) {
            return this.X;
        }
        throw new ExecutionException(this.o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.Z;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                if (this.Z) {
                    return;
                }
                this.Y = Thread.currentThread();
                this.a.g();
                try {
                    try {
                        this.X = c();
                        synchronized (this.c) {
                            this.b.g();
                            this.Y = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.b.g();
                            this.Y = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.o = e;
                    synchronized (this.c) {
                        this.b.g();
                        this.Y = null;
                        Thread.interrupted();
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ae3 ae3Var = this.b;
        synchronized (ae3Var) {
            if (jConvert <= 0) {
                z = ae3Var.b;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = jConvert + jElapsedRealtime;
                if (j2 < jElapsedRealtime) {
                    ae3Var.a();
                } else {
                    while (!ae3Var.b && jElapsedRealtime < j2) {
                        ae3Var.wait(j2 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = ae3Var.b;
            }
        }
        if (z) {
            if (!this.Z) {
                if (this.o == null) {
                    return this.X;
                }
                throw new ExecutionException(this.o);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
