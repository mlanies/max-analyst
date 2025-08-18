package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c76 extends CountDownLatch implements b38, erd, ab3, Future, zl4 {
    public Object a;
    public Throwable b;
    public final AtomicReference c;

    public c76() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        AtomicReference atomicReference = this.c;
        zl4 zl4Var = (zl4) atomicReference.get();
        if (zl4Var == dm4.a) {
            return;
        }
        this.a = obj;
        while (!atomicReference.compareAndSet(zl4Var, this) && atomicReference.get() == zl4Var) {
        }
        countDown();
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        AtomicReference atomicReference = this.c;
        zl4 zl4Var = (zl4) atomicReference.get();
        if (zl4Var == dm4.a) {
            return;
        }
        while (!atomicReference.compareAndSet(zl4Var, this) && atomicReference.get() == zl4Var) {
        }
        countDown();
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        dm4.e(this.c, zl4Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dm4 dm4Var;
        while (true) {
            AtomicReference atomicReference = this.c;
            zl4 zl4Var = (zl4) atomicReference.get();
            if (zl4Var == this || zl4Var == (dm4Var = dm4.a)) {
                return false;
            }
            while (!atomicReference.compareAndSet(zl4Var, dm4Var)) {
                if (atomicReference.get() != zl4Var) {
                    break;
                }
            }
            if (zl4Var != null) {
                zl4Var.g();
            }
            countDown();
            return true;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw new ExecutionException(th);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return dm4.b((zl4) this.c.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        while (true) {
            AtomicReference atomicReference = this.c;
            zl4 zl4Var = (zl4) atomicReference.get();
            if (zl4Var == dm4.a) {
                j47.Z(th);
                return;
            }
            this.b = th;
            while (!atomicReference.compareAndSet(zl4Var, this)) {
                if (atomicReference.get() != zl4Var) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(q45.e(j, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.b;
            if (th == null) {
                return this.a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
