package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h0 extends AtomicReference implements zl4 {
    public static final FutureTask X;
    public static final FutureTask o;
    public final Runnable a;
    public final boolean b;
    public Thread c;

    static {
        wdg wdgVar = ft.c;
        o = new FutureTask(wdgVar, null);
        X = new FutureTask(wdgVar, null);
    }

    public h0(Runnable runnable, boolean z) {
        this.a = runnable;
        this.b = z;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == o) {
                return;
            }
            if (future2 == X) {
                if (this.c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.zl4
    public final void g() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == o || future == (futureTask = X) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.b);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        Future future = (Future) get();
        return future == o || future == X;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == o) {
            str = "Finished";
        } else if (future == X) {
            str = "Disposed";
        } else if (this.c != null) {
            str = "Running on " + this.c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
