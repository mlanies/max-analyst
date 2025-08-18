package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d0a extends AtomicInteger implements f2a, zl4 {
    public final AtomicInteger X;
    public final az Y;
    public final b66 Z;
    public final /* synthetic */ int a;
    public final f2a b;
    public final boolean c;
    public final hc3 o;
    public final AtomicReference s0;
    public zl4 t0;
    public volatile boolean u0;

    public d0a(f2a f2aVar, b66 b66Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = f2aVar;
                this.Z = b66Var;
                this.c = false;
                this.o = new hc3();
                this.Y = new az();
                this.X = new AtomicInteger(1);
                this.s0 = new AtomicReference();
                break;
            default:
                this.b = f2aVar;
                this.Z = b66Var;
                this.c = false;
                this.o = new hc3();
                this.Y = new az();
                this.X = new AtomicInteger(1);
                this.s0 = new AtomicReference();
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                f2a f2aVar = this.b;
                AtomicInteger atomicInteger = this.X;
                AtomicReference atomicReference = this.s0;
                int iAddAndGet = 1;
                while (!this.u0) {
                    if (!this.c && ((Throwable) this.Y.get()) != null) {
                        pwd pwdVar = (pwd) this.s0.get();
                        if (pwdVar != null) {
                            pwdVar.clear();
                        }
                        this.Y.d(f2aVar);
                        break;
                    } else {
                        boolean z = atomicInteger.get() == 0;
                        pwd pwdVar2 = (pwd) atomicReference.get();
                        Object objPoll = pwdVar2 != null ? pwdVar2.poll() : null;
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.Y.d(f2aVar);
                            break;
                        } else if (z2) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            f2aVar.e(objPoll);
                        }
                    }
                }
                pwd pwdVar3 = (pwd) this.s0.get();
                if (pwdVar3 != null) {
                    pwdVar3.clear();
                    break;
                }
                break;
            default:
                f2a f2aVar2 = this.b;
                AtomicInteger atomicInteger2 = this.X;
                AtomicReference atomicReference2 = this.s0;
                int iAddAndGet2 = 1;
                while (!this.u0) {
                    if (!this.c && ((Throwable) this.Y.get()) != null) {
                        pwd pwdVar4 = (pwd) this.s0.get();
                        if (pwdVar4 != null) {
                            pwdVar4.clear();
                        }
                        this.Y.d(f2aVar2);
                        break;
                    } else {
                        boolean z3 = atomicInteger2.get() == 0;
                        pwd pwdVar5 = (pwd) atomicReference2.get();
                        Object objPoll2 = pwdVar5 != null ? pwdVar5.poll() : null;
                        boolean z4 = objPoll2 == null;
                        if (z3 && z4) {
                            this.Y.d(this.b);
                            break;
                        } else if (z4) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            f2aVar2.e(objPoll2);
                        }
                    }
                }
                pwd pwdVar6 = (pwd) this.s0.get();
                if (pwdVar6 != null) {
                    pwdVar6.clear();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    break;
                }
                break;
            default:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.t0, zl4Var)) {
                    this.t0 = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.t0, zl4Var)) {
                    this.t0 = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objMo131apply = this.Z.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null MaybeSource");
                    f38 f38Var = (f38) objMo131apply;
                    this.X.getAndIncrement();
                    j28 j28Var = new j28(this);
                    if (!this.u0 && this.o.a(j28Var)) {
                        f38Var.a(j28Var);
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    this.t0.g();
                    onError(th);
                }
                break;
            default:
                try {
                    Object objMo131apply2 = this.Z.mo131apply(obj);
                    Objects.requireNonNull(objMo131apply2, "The mapper returned a null SingleSource");
                    iqd iqdVar = (iqd) objMo131apply2;
                    this.X.getAndIncrement();
                    ez9 ez9Var = new ez9(this, 2);
                    if (!this.u0 && this.o.a(ez9Var)) {
                        iqdVar.k(ez9Var);
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    this.t0.g();
                    onError(th2);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.u0 = true;
                this.t0.g();
                this.o.g();
                this.Y.b();
                break;
            default:
                this.u0 = true;
                this.t0.g();
                this.o.g();
                this.Y.b();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.u0;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.g();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        break;
                    }
                }
                break;
            default:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.g();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        break;
                    }
                }
                break;
        }
    }
}
