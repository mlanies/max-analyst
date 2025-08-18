package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class dtc extends AtomicReferenceArray implements Runnable, Callable, zl4 {
    public final Runnable a;
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object o = new Object();
    public static final Object X = new Object();

    public dtc(Runnable runnable, am4 am4Var) {
        super(3);
        this.a = runnable;
        lazySet(0, am4Var);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == X) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == o) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.zl4
    public final void g() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = X;
            if (obj6 == obj || obj6 == (obj4 = c) || obj6 == (obj5 = o)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((am4) obj2).c(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        Object obj = get(0);
        return obj == b || obj == X;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = o;
        Object obj4 = c;
        Object obj5 = b;
        Object obj6 = X;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((am4) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                j47.Z(th);
                throw th;
            } catch (Throwable th2) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((am4) obj8).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String str;
        Object obj = get(1);
        if (obj == X) {
            str = "Finished";
        } else if (obj == c) {
            str = "Disposed(Sync)";
        } else if (obj == o) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return dtc.class.getSimpleName() + "[" + str + "]";
    }
}
