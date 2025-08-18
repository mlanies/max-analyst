package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class k12 extends b76 implements Runnable {
    public bm7 Y;
    public volatile bm7 Z;
    public wu c;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue(1);
    public final CountDownLatch X = new CountDownLatch(1);

    public k12(wu wuVar, bm7 bm7Var) {
        this.c = wuVar;
        bm7Var.getClass();
        this.Y = bm7Var;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.b76, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.o.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        bm7 bm7Var = this.Y;
        if (bm7Var != null) {
            bm7Var.cancel(z);
        }
        bm7 bm7Var2 = this.Z;
        if (bm7Var2 != null) {
            bm7Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.b76, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            bm7 bm7Var = this.Y;
            if (bm7Var != null) {
                bm7Var.get();
            }
            this.X.await();
            bm7 bm7Var2 = this.Z;
            if (bm7Var2 != null) {
                bm7Var2.get();
            }
        }
        return this.a.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        bm7 bm7VarApply;
        try {
            try {
                try {
                    try {
                        try {
                            bm7VarApply = this.c.apply(kq0.o(this.Y));
                            this.Z = bm7VarApply;
                        } catch (Exception e) {
                            lq1 lq1Var = this.b;
                            if (lq1Var != null) {
                                lq1Var.d(e);
                            }
                        }
                    } catch (Error e2) {
                        lq1 lq1Var2 = this.b;
                        if (lq1Var2 != null) {
                            lq1Var2.d(e2);
                        }
                    }
                } finally {
                    this.c = null;
                    this.Y = null;
                    this.X.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                lq1 lq1Var3 = this.b;
                if (lq1Var3 != null) {
                    lq1Var3.d(cause);
                }
            }
        } catch (UndeclaredThrowableException e4) {
            Throwable cause2 = e4.getCause();
            lq1 lq1Var4 = this.b;
            if (lq1Var4 != null) {
                lq1Var4.d(cause2);
            }
        }
        if (this.a.isCancelled()) {
            bm7VarApply.cancel(((Boolean) b(this.o)).booleanValue());
            this.Z = null;
        } else {
            bm7VarApply.d(new h76((Object) this, (Object) bm7VarApply, false, 3), ju0.k());
        }
    }

    @Override // defpackage.b76, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            bm7 bm7Var = this.Y;
            if (bm7Var != null) {
                long jNanoTime = System.nanoTime();
                bm7Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.X.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                bm7 bm7Var2 = this.Z;
                if (bm7Var2 != null) {
                    bm7Var2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
