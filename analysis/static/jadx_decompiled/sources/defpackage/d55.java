package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d55 extends xtc implements Runnable {
    public volatile boolean X;
    public final boolean a;
    public final boolean b;
    public final Executor c;
    public final AtomicInteger Y = new AtomicInteger();
    public final hc3 Z = new hc3();
    public final qz7 o = new qz7(27);

    public d55(Executor executor, boolean z, boolean z2) {
        this.c = executor;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.xtc
    public final zl4 b(Runnable runnable) {
        zl4 b55Var;
        boolean z = this.X;
        iz4 iz4Var = iz4.a;
        if (z) {
            return iz4Var;
        }
        Objects.requireNonNull(runnable, "run is null");
        if (this.a) {
            b55Var = new c55(runnable, this.Z);
            this.Z.a(b55Var);
        } else {
            b55Var = new b55(runnable);
        }
        qz7 qz7Var = this.o;
        qz7Var.getClass();
        le9 le9Var = new le9();
        le9Var.a = b55Var;
        ((le9) ((AtomicReference) qz7Var.b).getAndSet(le9Var)).lazySet(le9Var);
        if (this.Y.getAndIncrement() == 0) {
            try {
                this.c.execute(this);
            } catch (RejectedExecutionException e) {
                this.X = true;
                this.o.clear();
                j47.Z(e);
                return iz4Var;
            }
        }
        return b55Var;
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return b(runnable);
        }
        boolean z = this.X;
        iz4 iz4Var = iz4.a;
        if (z) {
            return iz4Var;
        }
        uy1 uy1Var = new uy1(2);
        uy1 uy1Var2 = new uy1(uy1Var);
        Objects.requireNonNull(runnable, "run is null");
        dtc dtcVar = new dtc(new wi3(1, this, uy1Var2, runnable, false), this.Z);
        this.Z.a(dtcVar);
        Executor executor = this.c;
        if (executor instanceof ScheduledExecutorService) {
            try {
                dtcVar.a(((ScheduledExecutorService) executor).schedule((Callable) dtcVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.X = true;
                j47.Z(e);
                return iz4Var;
            }
        } else {
            dtcVar.a(new fm4(e55.a.c(dtcVar, j, timeUnit)));
        }
        dm4.c(uy1Var, dtcVar);
        return uy1Var2;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.X) {
            return;
        }
        this.X = true;
        this.Z.g();
        if (this.Y.getAndIncrement() == 0) {
            this.o.clear();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.X;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            qz7 qz7Var = this.o;
            if (this.X) {
                qz7Var.clear();
                return;
            }
            ((Runnable) qz7Var.poll()).run();
            if (this.X) {
                qz7Var.clear();
                return;
            } else {
                if (this.Y.decrementAndGet() != 0) {
                    this.c.execute(this);
                    return;
                }
                return;
            }
        }
        qz7 qz7Var2 = this.o;
        int iAddAndGet = 1;
        while (!this.X) {
            do {
                Runnable runnable = (Runnable) qz7Var2.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.X) {
                    qz7Var2.clear();
                    return;
                } else {
                    iAddAndGet = this.Y.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            } while (!this.X);
            qz7Var2.clear();
            return;
        }
        qz7Var2.clear();
    }
}
