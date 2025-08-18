package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xr5 extends AtomicInteger implements gs5, xae {
    public volatile boolean Z;
    public xae a;
    public long b;
    public boolean s0;
    public final vae t0;
    public final vr5 u0;
    public final xae v0;
    public long w0;
    public final boolean Y = false;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();
    public final AtomicLong X = new AtomicLong();

    public xr5(c7d c7dVar, z6d z6dVar, wr5 wr5Var) {
        this.t0 = c7dVar;
        this.u0 = z6dVar;
        this.v0 = wr5Var;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    @Override // defpackage.vae
    public final void b() {
        this.v0.cancel();
        this.t0.b();
    }

    public final void c() {
        int iAddAndGet = 1;
        long jC = 0;
        xae xaeVar = null;
        do {
            xae xaeVar2 = (xae) this.c.get();
            if (xaeVar2 != null) {
                xaeVar2 = (xae) this.c.getAndSet(null);
            }
            long andSet = this.o.get();
            if (andSet != 0) {
                andSet = this.o.getAndSet(0L);
            }
            long andSet2 = this.X.get();
            if (andSet2 != 0) {
                andSet2 = this.X.getAndSet(0L);
            }
            xae xaeVar3 = this.a;
            if (this.Z) {
                if (xaeVar3 != null) {
                    xaeVar3.cancel();
                    this.a = null;
                }
                if (xaeVar2 != null) {
                    xaeVar2.cancel();
                }
            } else {
                long jC2 = this.b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = ngg.c(jC2, andSet);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet2;
                        if (jC2 < 0) {
                            j47.Z(new ProtocolViolationException(ey8.h(jC2, "More produced than requested: ")));
                            jC2 = 0;
                        }
                    }
                    this.b = jC2;
                }
                if (xaeVar2 != null) {
                    if (xaeVar3 != null && this.Y) {
                        xaeVar3.cancel();
                    }
                    this.a = xaeVar2;
                    if (jC2 != 0) {
                        jC = ngg.c(jC, jC2);
                        xaeVar = xaeVar2;
                    }
                } else if (xaeVar3 != null && andSet != 0) {
                    jC = ngg.c(jC, andSet);
                    xaeVar = xaeVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            xaeVar.j(jC);
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        if (!this.Z) {
            this.Z = true;
            a();
        }
        this.v0.cancel();
    }

    public final void d(xae xaeVar) {
        if (this.Z) {
            xaeVar.cancel();
            return;
        }
        Objects.requireNonNull(xaeVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            xae xaeVar2 = (xae) this.c.getAndSet(xaeVar);
            if (xaeVar2 != null && this.Y) {
                xaeVar2.cancel();
            }
            a();
            return;
        }
        xae xaeVar3 = this.a;
        if (xaeVar3 != null && this.Y) {
            xaeVar3.cancel();
        }
        this.a = xaeVar;
        long j = this.b;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j != 0) {
            xaeVar.j(j);
        }
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        this.w0++;
        this.t0.e(obj);
    }

    @Override // defpackage.vae
    public void f(xae xaeVar) {
        d(xaeVar);
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (!zae.d(j) || this.s0) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ngg.b(this.o, j);
            a();
            return;
        }
        long j2 = this.b;
        if (j2 != Long.MAX_VALUE) {
            long jC = ngg.c(j2, j);
            this.b = jC;
            if (jC == Long.MAX_VALUE) {
                this.s0 = true;
            }
        }
        xae xaeVar = this.a;
        if (decrementAndGet() != 0) {
            c();
        }
        if (xaeVar != null) {
            xaeVar.j(j);
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        d(b05.a);
        long j = this.w0;
        long j2 = 0;
        if (j != 0) {
            this.w0 = 0L;
            if (!this.s0) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j3 = this.b;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 - j;
                        if (j4 < 0) {
                            j47.Z(new ProtocolViolationException(ey8.h(j4, "More produced than requested: ")));
                        } else {
                            j2 = j4;
                        }
                        this.b = j2;
                    }
                    if (decrementAndGet() != 0) {
                        c();
                    }
                } else {
                    ngg.b(this.X, j);
                    a();
                }
            }
        }
        this.v0.j(1L);
        this.u0.e(th);
    }
}
