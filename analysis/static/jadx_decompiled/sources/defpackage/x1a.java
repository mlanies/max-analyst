package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x1a extends AtomicInteger implements f2a, zl4, Runnable {
    public final f2a a;
    public final TimeUnit c;
    public final xtc o;
    public zl4 s0;
    public volatile boolean t0;
    public Throwable u0;
    public volatile boolean v0;
    public volatile boolean w0;
    public boolean x0;
    public final long b = 3;
    public final boolean X = false;
    public final AtomicReference Y = new AtomicReference();
    public final qj3 Z = null;

    public x1a(f2a f2aVar, TimeUnit timeUnit, xtc xtcVar) {
        this.a = f2aVar;
        this.c = timeUnit;
        this.o = xtcVar;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.Y;
        f2a f2aVar = this.a;
        int iAddAndGet = 1;
        while (!this.v0) {
            boolean z = this.t0;
            Throwable compositeException = this.u0;
            if (z && compositeException != null) {
                if (this.Z != null) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (andSet != null) {
                        try {
                            this.Z.accept(andSet);
                        } catch (Throwable th) {
                            c37.B(th);
                            compositeException = new CompositeException(compositeException, th);
                        }
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                f2aVar.onError(compositeException);
                this.o.g();
                return;
            }
            boolean z2 = atomicReference.get() == null;
            if (z) {
                if (!z2) {
                    Object andSet2 = atomicReference.getAndSet(null);
                    if (this.X) {
                        f2aVar.e(andSet2);
                    } else {
                        qj3 qj3Var = this.Z;
                        if (qj3Var != null) {
                            try {
                                qj3Var.accept(andSet2);
                            } catch (Throwable th2) {
                                c37.B(th2);
                                f2aVar.onError(th2);
                                this.o.g();
                                return;
                            }
                        }
                    }
                }
                f2aVar.b();
                this.o.g();
                return;
            }
            if (z2) {
                if (this.w0) {
                    this.x0 = false;
                    this.w0 = false;
                }
            } else if (!this.x0 || this.w0) {
                f2aVar.e(atomicReference.getAndSet(null));
                this.w0 = false;
                this.x0 = true;
                this.o.c(this, this.b, this.c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        AtomicReference atomicReference2 = this.Y;
        qj3 qj3Var2 = this.Z;
        if (qj3Var2 == null) {
            atomicReference2.lazySet(null);
            return;
        }
        Object andSet3 = atomicReference2.getAndSet(null);
        if (andSet3 != null) {
            try {
                qj3Var2.accept(andSet3);
            } catch (Throwable th3) {
                c37.B(th3);
                j47.Z(th3);
            }
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        this.t0 = true;
        a();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.s0, zl4Var)) {
            this.s0 = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        Object andSet = this.Y.getAndSet(obj);
        qj3 qj3Var = this.Z;
        if (qj3Var != null && andSet != null) {
            try {
                qj3Var.accept(andSet);
            } catch (Throwable th) {
                c37.B(th);
                this.s0.g();
                this.u0 = th;
                this.t0 = true;
            }
        }
        a();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.v0 = true;
        this.s0.g();
        this.o.g();
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.Y;
            qj3 qj3Var = this.Z;
            if (qj3Var == null) {
                atomicReference.lazySet(null);
                return;
            }
            Object andSet = atomicReference.getAndSet(null);
            if (andSet != null) {
                try {
                    qj3Var.accept(andSet);
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.v0;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        this.u0 = th;
        this.t0 = true;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w0 = true;
        a();
    }
}
