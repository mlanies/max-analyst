package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c5f extends vr5 {
    public volatile boolean X;
    public Throwable Y;
    public volatile boolean s0;
    public boolean w0;
    public final pwd b = new pwd(8);
    public final AtomicReference c = new AtomicReference(null);
    public final boolean o = true;
    public final AtomicReference Z = new AtomicReference();
    public final AtomicBoolean t0 = new AtomicBoolean();
    public final b5f u0 = new b5f(this);
    public final AtomicLong v0 = new AtomicLong();

    @Override // defpackage.vae
    public final void b() {
        if (this.X || this.s0) {
            return;
        }
        this.X = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        q45.c(obj, "onNext called with a null value.");
        if (this.X || this.s0) {
            return;
        }
        this.b.offer(obj);
        i();
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (this.X || this.s0) {
            xaeVar.cancel();
        } else {
            xaeVar.j(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        if (this.t0.get() || !this.t0.compareAndSet(false, true)) {
            b05.b(new IllegalStateException("This processor allows only a single Subscriber"), vaeVar);
            return;
        }
        vaeVar.f(this.u0);
        this.Z.set(vaeVar);
        if (this.s0) {
            this.Z.lazySet(null);
        } else {
            i();
        }
    }

    public final boolean h(boolean z, boolean z2, boolean z3, vae vaeVar, pwd pwdVar) {
        if (this.s0) {
            pwdVar.clear();
            this.Z.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.Y != null) {
            pwdVar.clear();
            this.Z.lazySet(null);
            vaeVar.onError(this.Y);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.Y;
        this.Z.lazySet(null);
        if (th != null) {
            vaeVar.onError(th);
        } else {
            vaeVar.b();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        long j;
        if (this.u0.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        vae vaeVar = (vae) this.Z.get();
        int iAddAndGet2 = 1;
        while (vaeVar == null) {
            iAddAndGet2 = this.u0.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
            vaeVar = (vae) this.Z.get();
            iAddAndGet = 1;
        }
        if (this.w0) {
            pwd pwdVar = this.b;
            int i = (this.o ? 1 : 0) ^ iAddAndGet;
            while (!this.s0) {
                boolean z = this.X;
                if (i != 0 && z && this.Y != null) {
                    pwdVar.clear();
                    this.Z.lazySet(null);
                    vaeVar.onError(this.Y);
                    return;
                }
                vaeVar.e(null);
                if (z) {
                    this.Z.lazySet(null);
                    Throwable th = this.Y;
                    if (th != null) {
                        vaeVar.onError(th);
                        return;
                    } else {
                        vaeVar.b();
                        return;
                    }
                }
                iAddAndGet = this.u0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.Z.lazySet(null);
            return;
        }
        pwd pwdVar2 = this.b;
        boolean z2 = !this.o;
        int iAddAndGet3 = iAddAndGet;
        boolean z3 = iAddAndGet;
        while (true) {
            long j2 = this.v0.get();
            long j3 = 0;
            boolean z4 = z3;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z5 = this.X;
                Object objPoll = pwdVar2.poll();
                boolean z6 = objPoll == null ? z4 : false;
                j = j3;
                if (h(z2, z5, z6, vaeVar, pwdVar2)) {
                    return;
                }
                if (z6) {
                    break;
                }
                vaeVar.e(objPoll);
                j3 = j + 1;
                z4 = true;
            }
            if (j2 == j3 && h(z2, this.X, pwdVar2.isEmpty(), vaeVar, pwdVar2)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.v0.addAndGet(-j);
            }
            iAddAndGet3 = this.u0.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z3 = true;
            }
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        q45.c(th, "onError called with a null Throwable.");
        if (this.X || this.s0) {
            j47.Z(th);
            return;
        }
        this.Y = th;
        this.X = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }
}
