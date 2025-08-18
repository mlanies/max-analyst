package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wr5 extends AtomicInteger implements gs5, xae {
    public final ypb a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public xr5 o;

    public wr5(ypb ypbVar) {
        this.a = ypbVar;
    }

    @Override // defpackage.vae
    public final void b() {
        this.o.cancel();
        this.o.t0.b();
    }

    @Override // defpackage.xae
    public final void cancel() {
        zae.a(this.b);
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != zae.a) {
                ((wq5) this.a).d(this.o);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        AtomicReference atomicReference = this.b;
        AtomicLong atomicLong = this.c;
        if (zae.c(atomicReference, xaeVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                xaeVar.j(andSet);
            }
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        zae.b(this.b, this.c, j);
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.o.cancel();
        this.o.t0.onError(th);
    }
}
