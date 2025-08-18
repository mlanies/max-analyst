package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ueg implements wsa {
    public final /* synthetic */ pag a;
    public final /* synthetic */ qne b;
    public final /* synthetic */ qx7 c;

    public ueg(BasePendingResult basePendingResult, qne qneVar, qx7 qx7Var) {
        this.a = basePendingResult;
        this.b = qneVar;
        this.c = qx7Var;
    }

    @Override // defpackage.wsa
    public final void a(Status status) {
        rjc rjcVar;
        if (status.a > 0) {
            this.b.a(i24.k(status));
            return;
        }
        pag pagVar = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) pagVar;
        fp3.p("Result has already been consumed.", !basePendingResult.k);
        try {
            if (!basePendingResult.f.await(0L, timeUnit)) {
                basePendingResult.Q(Status.s0);
            }
        } catch (InterruptedException unused) {
            basePendingResult.Q(Status.Y);
        }
        fp3.p("Result is not ready.", basePendingResult.R());
        synchronized (basePendingResult.e) {
            fp3.p("Result has already been consumed.", !basePendingResult.k);
            fp3.p("Result is not ready.", basePendingResult.R());
            rjcVar = basePendingResult.i;
            basePendingResult.i = null;
            basePendingResult.k = true;
        }
        au1.r(basePendingResult.h.getAndSet(null));
        fp3.n(rjcVar);
        this.b.b(this.c.c(rjcVar));
    }
}
