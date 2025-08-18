package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fs5 extends AtomicReference implements gs5, xae, Runnable {
    public final boolean X;
    public ypb Y;
    public final vae a;
    public final xtc b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();

    public fs5(vae vaeVar, xtc xtcVar, ypb ypbVar, boolean z) {
        this.a = vaeVar;
        this.b = xtcVar;
        this.Y = ypbVar;
        this.X = !z;
    }

    public final void a(long j, xae xaeVar) {
        if (this.X || Thread.currentThread() == get()) {
            xaeVar.j(j);
        } else {
            this.b.b(new es5(j, xaeVar));
        }
    }

    @Override // defpackage.vae
    public final void b() {
        this.a.b();
        this.b.g();
    }

    @Override // defpackage.xae
    public final void cancel() {
        zae.a(this.c);
        this.b.g();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.c(this.c, xaeVar)) {
            long andSet = this.o.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, xaeVar);
            }
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            AtomicReference atomicReference = this.c;
            xae xaeVar = (xae) atomicReference.get();
            if (xaeVar != null) {
                a(j, xaeVar);
                return;
            }
            AtomicLong atomicLong = this.o;
            ngg.b(atomicLong, j);
            xae xaeVar2 = (xae) atomicReference.get();
            if (xaeVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, xaeVar2);
                }
            }
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.a.onError(th);
        this.b.g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        ypb ypbVar = this.Y;
        this.Y = null;
        ((wq5) ypbVar).d(this);
    }
}
