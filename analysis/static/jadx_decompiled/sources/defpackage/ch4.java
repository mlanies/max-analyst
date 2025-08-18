package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ch4 extends m3 implements ScheduledFuture {
    public final ScheduledFuture s0;

    public ch4(bh4 bh4Var) {
        this.s0 = bh4Var.b(new bkg(12, this));
    }

    @Override // defpackage.m3
    public final void b() {
        ScheduledFuture scheduledFuture = this.s0;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof g3) && ((g3) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.s0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.s0.getDelay(timeUnit);
    }
}
