package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ConcurrentKt;

/* loaded from: classes.dex */
public final class z45 extends y45 implements hg4 {
    public final Executor a;

    public z45(Executor executor) {
        this.a = executor;
        ConcurrentKt.removeFutureOnCancel(executor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.hg4
    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            x77 x77Var = (x77) lx3Var.get(c32.X);
            if (x77Var != null) {
                x77Var.cancel(cancellationException);
            }
            ql4.c.mo20dispatch(lx3Var, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z45) && ((z45) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.hg4
    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                x77 x77Var = (x77) lx3Var.get(c32.X);
                if (x77Var != null) {
                    x77Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new bm4(scheduledFutureSchedule) : pa4.s0.invokeOnTimeout(j, runnable, lx3Var);
    }

    @Override // defpackage.y45
    public final Executor n() {
        return this.a;
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo21scheduleResumeAfterDelay(long j, ry1 ry1Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            i76 i76Var = new i76(this, 17, ry1Var);
            lx3 context = ry1Var.getContext();
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(i76Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                x77 x77Var = (x77) context.get(c32.X);
                if (x77Var != null) {
                    x77Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            nu0.w(ry1Var, new hy1(0, scheduledFutureSchedule));
        } else {
            pa4.s0.mo21scheduleResumeAfterDelay(j, ry1Var);
        }
    }

    @Override // defpackage.nx3
    /* renamed from: toString */
    public final String getName() {
        return this.a.toString();
    }
}
