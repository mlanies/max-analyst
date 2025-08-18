package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k9e extends AtomicInteger implements gs5, xae {
    public volatile boolean Y;
    public final vae a;
    public final az b = new az();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference o = new AtomicReference();
    public final AtomicBoolean X = new AtomicBoolean();

    public k9e(vae vaeVar) {
        this.a = vaeVar;
    }

    @Override // defpackage.vae
    public final void b() {
        this.Y = true;
        vae vaeVar = this.a;
        az azVar = this.b;
        if (getAndIncrement() == 0) {
            azVar.e(vaeVar);
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        if (this.Y) {
            return;
        }
        zae.a(this.o);
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            vae vaeVar = this.a;
            vaeVar.e(obj);
            if (decrementAndGet() == 0) {
                return;
            }
            this.b.e(vaeVar);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (!this.X.compareAndSet(false, true)) {
            xaeVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.a.f(this);
        AtomicReference atomicReference = this.o;
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
        if (j > 0) {
            zae.b(this.o, this.c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(ey8.h(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.Y = true;
        vae vaeVar = this.a;
        az azVar = this.b;
        if (azVar.a(th) && getAndIncrement() == 0) {
            azVar.e(vaeVar);
        }
    }
}
