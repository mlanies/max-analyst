package kotlinx.coroutines;

import defpackage.fx3;
import defpackage.tpa;
import defpackage.x77;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lfx3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class JobCancellationException extends CancellationException implements fx3 {
    public final transient x77 a;

    public JobCancellationException(String str, Throwable th, x77 x77Var) {
        super(str);
        this.a = x77Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.fx3
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!tpa.f(jobCancellationException.getMessage(), getMessage()) || !tpa.f(jobCancellationException.a, this.a) || !tpa.f(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
