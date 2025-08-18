package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class su1 {
    public static final long j;
    public static final long k;
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final st1 d;
    public final oq0 e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final qu1 i = new qu1(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1L);
        k = timeUnit.toNanos(5L);
    }

    public su1(int i, Executor executor, ScheduledExecutorService scheduledExecutorService, st1 st1Var, boolean z, oq0 oq0Var) {
        this.a = i;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.d = st1Var;
        this.f = z;
        this.e = oq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bm7 a(int i) {
        dw6 dw6Var = dw6.c;
        if (this.h.isEmpty()) {
            return dw6Var;
        }
        dw6 dw6Var2 = dw6Var;
        if (this.i.b()) {
            uu1 uu1Var = new uu1(null);
            st1 st1Var = this.d;
            st1Var.p(uu1Var);
            wt1 wt1Var = new wt1(st1Var, 4, uu1Var);
            oq1 oq1Var = uu1Var.b;
            oq1Var.b.d(wt1Var, st1Var.c);
            dw6Var2 = oq1Var;
        }
        b76 b76VarA = b76.a(dw6Var2);
        hd0 hd0Var = new hd0(i, 2, this);
        b76VarA.getClass();
        Executor executor = this.b;
        return kq0.K(kq0.K(b76VarA, hd0Var, executor), new ync(26, this), executor);
    }
}
