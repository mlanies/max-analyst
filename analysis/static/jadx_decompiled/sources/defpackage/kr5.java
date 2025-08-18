package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kr5 extends AtomicInteger implements gs5, xae {
    public final vae a;
    public final boolean b;
    public final int c;
    public final b66 s0;
    public xae u0;
    public volatile boolean v0;
    public final AtomicLong o = new AtomicLong();
    public final hc3 X = new hc3();
    public final az Z = new az();
    public final AtomicInteger Y = new AtomicInteger(1);
    public final AtomicReference t0 = new AtomicReference();

    public kr5(vae vaeVar, b66 b66Var, boolean z, int i) {
        this.a = vaeVar;
        this.s0 = b66Var;
        this.b = z;
        this.c = i;
    }

    public final void a() {
        pwd pwdVar = (pwd) this.t0.get();
        if (pwdVar != null) {
            pwdVar.clear();
        }
    }

    @Override // defpackage.vae
    public final void b() {
        this.Y.decrementAndGet();
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.v0 = true;
        this.u0.cancel();
        this.X.g();
        this.Z.b();
    }

    public final void d() {
        vae vaeVar = this.a;
        AtomicInteger atomicInteger = this.Y;
        AtomicReference atomicReference = this.t0;
        int iAddAndGet = 1;
        do {
            long j = this.o.get();
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    break;
                }
                if (this.v0) {
                    a();
                    return;
                }
                if (!this.b && ((Throwable) this.Z.get()) != null) {
                    a();
                    this.Z.e(this.a);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                pwd pwdVar = (pwd) atomicReference.get();
                Object objPoll = pwdVar != null ? pwdVar.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2) {
                    this.Z.e(vaeVar);
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    vaeVar.e(objPoll);
                    j2++;
                }
            }
            if (j2 == j) {
                if (this.v0) {
                    a();
                    return;
                }
                if (!this.b && ((Throwable) this.Z.get()) != null) {
                    a();
                    this.Z.e(vaeVar);
                    return;
                }
                boolean z3 = atomicInteger.get() == 0;
                pwd pwdVar2 = (pwd) atomicReference.get();
                boolean z4 = pwdVar2 == null || pwdVar2.isEmpty();
                if (z3 && z4) {
                    this.Z.e(vaeVar);
                    return;
                }
            }
            if (j2 != 0) {
                ngg.D(this.o, j2);
                if (this.c != Integer.MAX_VALUE) {
                    this.u0.j(j2);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        try {
            Object objMo131apply = this.s0.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The mapper returned a null SingleSource");
            iqd iqdVar = (iqd) objMo131apply;
            this.Y.getAndIncrement();
            ez9 ez9Var = new ez9(this, 1);
            if (this.v0 || !this.X.a(ez9Var)) {
                return;
            }
            iqdVar.k(ez9Var);
        } catch (Throwable th) {
            c37.B(th);
            this.u0.cancel();
            onError(th);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.u0, xaeVar)) {
            this.u0 = xaeVar;
            this.a.f(this);
            int i = this.c;
            if (i == Integer.MAX_VALUE) {
                xaeVar.j(Long.MAX_VALUE);
            } else {
                xaeVar.j(i);
            }
        }
    }

    public final pwd g() {
        AtomicReference atomicReference = this.t0;
        pwd pwdVar = (pwd) atomicReference.get();
        if (pwdVar != null) {
            return pwdVar;
        }
        pwd pwdVar2 = new pwd(wq5.a);
        while (!atomicReference.compareAndSet(null, pwdVar2)) {
            if (atomicReference.get() != null) {
                return (pwd) atomicReference.get();
            }
        }
        return pwdVar2;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.o, j);
            c();
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        this.Y.decrementAndGet();
        if (this.Z.a(th)) {
            if (!this.b) {
                this.X.g();
            }
            c();
        }
    }
}
