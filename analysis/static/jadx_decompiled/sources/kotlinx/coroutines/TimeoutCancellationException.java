package kotlinx.coroutines;

import defpackage.fx3;
import defpackage.x77;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lfx3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException implements fx3 {
    public final transient x77 a;

    public TimeoutCancellationException(String str, x77 x77Var) {
        super(str);
        this.a = x77Var;
    }

    @Override // defpackage.fx3
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
