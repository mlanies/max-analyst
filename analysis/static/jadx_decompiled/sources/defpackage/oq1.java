package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oq1 implements bm7 {
    public final WeakReference a;
    public final nq1 b = new nq1(this);

    public oq1(lq1 lq1Var) {
        this.a = new WeakReference(lq1Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        lq1 lq1Var = (lq1) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && lq1Var != null) {
            lq1Var.a = null;
            lq1Var.b = null;
            lq1Var.c.i(null);
        }
        return zCancel;
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof g3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
