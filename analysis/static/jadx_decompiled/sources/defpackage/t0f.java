package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t0f extends xtc {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean o;

    @Override // defpackage.xtc
    public final zl4 b(Runnable runnable) {
        return e(runnable, xtc.a(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + xtc.a(TimeUnit.MILLISECONDS);
        return e(new i0e(runnable, this, millis), millis);
    }

    public final zl4 e(Runnable runnable, long j) {
        boolean z = this.o;
        iz4 iz4Var = iz4.a;
        if (z) {
            return iz4Var;
        }
        s0f s0fVar = new s0f(runnable, Long.valueOf(j), this.c.incrementAndGet());
        this.a.add(s0fVar);
        if (this.b.getAndIncrement() != 0) {
            return new w6(1, new i76((Object) this, (Object) s0fVar, false, 25));
        }
        int iAddAndGet = 1;
        while (!this.o) {
            s0f s0fVar2 = (s0f) this.a.poll();
            if (s0fVar2 == null) {
                iAddAndGet = this.b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return iz4Var;
                }
            } else if (!s0fVar2.o) {
                s0fVar2.a.run();
            }
        }
        this.a.clear();
        return iz4Var;
    }

    @Override // defpackage.zl4
    public final void g() {
        this.o = true;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o;
    }
}
