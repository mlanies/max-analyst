package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f55 extends ztc {
    public final boolean c;
    public final boolean d = false;
    public final Executor e;

    public f55(Executor executor, boolean z) {
        this.e = executor;
        this.c = z;
    }

    @Override // defpackage.ztc
    public final xtc a() {
        return new d55(this.e, this.c, this.d);
    }

    @Override // defpackage.ztc
    public final zl4 b(Runnable runnable) {
        Executor executor = this.e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                zsc zscVar = new zsc(runnable, z2);
                zscVar.a(((ExecutorService) executor).submit(zscVar));
                return zscVar;
            }
            if (z2) {
                c55 c55Var = new c55(runnable, null);
                executor.execute(c55Var);
                return c55Var;
            }
            b55 b55Var = new b55(runnable);
            executor.execute(b55Var);
            return b55Var;
        } catch (RejectedExecutionException e) {
            j47.Z(e);
            return iz4.a;
        }
    }

    @Override // defpackage.ztc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.e;
        if (executor instanceof ScheduledExecutorService) {
            try {
                zsc zscVar = new zsc(runnable, this.c);
                zscVar.a(((ScheduledExecutorService) executor).schedule(zscVar, j, timeUnit));
                return zscVar;
            } catch (RejectedExecutionException e) {
                j47.Z(e);
                return iz4.a;
            }
        }
        a55 a55Var = new a55(runnable);
        zl4 zl4VarC = e55.a.c(new h76((Object) this, (Object) a55Var, false, 6), j, timeUnit);
        uy1 uy1Var = a55Var.a;
        uy1Var.getClass();
        dm4.c(uy1Var, zl4VarC);
        return a55Var;
    }

    @Override // defpackage.ztc
    public final zl4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.e;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        Objects.requireNonNull(runnable, "run is null");
        try {
            ysc yscVar = new ysc(runnable, this.c);
            yscVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(yscVar, j, j2, timeUnit));
            return yscVar;
        } catch (RejectedExecutionException e) {
            j47.Z(e);
            return iz4.a;
        }
    }
}
