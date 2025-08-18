package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class bm4 implements cm4 {
    public final Future a;

    public bm4(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.cm4
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
