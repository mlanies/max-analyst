package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l1a extends n1a {
    public final AtomicInteger s0;

    public l1a(y6d y6dVar, long j, TimeUnit timeUnit, ztc ztcVar) {
        super(y6dVar, j, timeUnit, ztcVar);
        this.s0 = new AtomicInteger(1);
    }

    @Override // defpackage.n1a
    public final void a() {
        d();
        if (this.s0.decrementAndGet() == 0) {
            this.a.b();
        }
    }

    @Override // defpackage.n1a, java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.s0;
        if (atomicInteger.incrementAndGet() == 2) {
            d();
            if (atomicInteger.decrementAndGet() == 0) {
                this.a.b();
            }
        }
    }
}
