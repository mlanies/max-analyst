package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class zp9 extends xtc {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;

    public zp9(ThreadFactory threadFactory) {
        boolean z = guc.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(guc.a);
        this.a = scheduledThreadPoolExecutor;
    }

    @Override // defpackage.xtc
    public final zl4 b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? iz4.a : e(runnable, j, timeUnit, null);
    }

    public final dtc e(Runnable runnable, long j, TimeUnit timeUnit, am4 am4Var) {
        Objects.requireNonNull(runnable, "run is null");
        dtc dtcVar = new dtc(runnable, am4Var);
        if (am4Var != null && !am4Var.a(dtcVar)) {
            return dtcVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        try {
            dtcVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) dtcVar) : scheduledThreadPoolExecutor.schedule((Callable) dtcVar, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (am4Var != null) {
                am4Var.b(dtcVar);
            }
            j47.Z(e);
        }
        return dtcVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b;
    }
}
