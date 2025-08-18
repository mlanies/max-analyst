package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c55 extends AtomicInteger implements Runnable, zl4 {
    public final Runnable a;
    public final am4 b;
    public volatile Thread c;

    public c55(Runnable runnable, am4 am4Var) {
        this.a = runnable;
        this.b = am4Var;
    }

    @Override // defpackage.zl4
    public final void g() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    am4 am4Var = this.b;
                    if (am4Var != null) {
                        am4Var.c(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.c;
                if (thread != null) {
                    thread.interrupt();
                    this.c = null;
                }
                set(4);
                am4 am4Var2 = this.b;
                if (am4Var2 != null) {
                    am4Var2.c(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.c = null;
                return;
            }
            try {
                this.a.run();
                this.c = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    am4 am4Var = this.b;
                    if (am4Var != null) {
                        am4Var.c(this);
                    }
                }
            } catch (Throwable th) {
                try {
                    j47.Z(th);
                    throw th;
                } catch (Throwable th2) {
                    this.c = null;
                    if (compareAndSet(1, 2)) {
                        am4 am4Var2 = this.b;
                        if (am4Var2 != null) {
                            am4Var2.c(this);
                        }
                    } else {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    }
                    throw th2;
                }
            }
        }
    }
}
