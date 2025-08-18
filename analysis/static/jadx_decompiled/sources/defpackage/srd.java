package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class srd extends xtc {
    public final ScheduledExecutorService a;
    public final hc3 b = new hc3();
    public volatile boolean c;

    public srd(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        boolean z = this.c;
        iz4 iz4Var = iz4.a;
        if (z) {
            return iz4Var;
        }
        Objects.requireNonNull(runnable, "run is null");
        dtc dtcVar = new dtc(runnable, this.b);
        this.b.a(dtcVar);
        try {
            dtcVar.a(j <= 0 ? this.a.submit((Callable) dtcVar) : this.a.schedule((Callable) dtcVar, j, timeUnit));
            return dtcVar;
        } catch (RejectedExecutionException e) {
            g();
            j47.Z(e);
            return iz4Var;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.c;
    }
}
