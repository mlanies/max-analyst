package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class as5 extends AtomicInteger implements gs5, xae {
    public final int X;
    public final int Y;
    public volatile boolean Z;
    public final vae a;
    public final pl0 b;
    public final owd c;
    public final AtomicLong o;
    public volatile boolean s0;
    public Throwable t0;
    public xae u0;
    public Object v0;
    public int w0;

    public as5(vae vaeVar, pl0 pl0Var, Object obj, int i) {
        this.a = vaeVar;
        this.b = pl0Var;
        this.v0 = obj;
        this.X = i;
        this.Y = i - (i >> 2);
        owd owdVar = new owd(i);
        this.c = owdVar;
        owdVar.offer(obj);
        this.o = new AtomicLong();
    }

    public final void a() {
        int i;
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        vae vaeVar = this.a;
        owd owdVar = this.c;
        int i2 = this.Y;
        int i3 = this.w0;
        int iAddAndGet = 1;
        do {
            long j = this.o.get();
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    i = iAddAndGet;
                    break;
                }
                if (this.Z) {
                    owdVar.clear();
                    return;
                }
                boolean z = this.s0;
                if (z && (th = this.t0) != null) {
                    owdVar.clear();
                    vaeVar.onError(th);
                    return;
                }
                AtomicLong atomicLong = owdVar.o;
                i = iAddAndGet;
                long j3 = atomicLong.get();
                int i4 = ((int) j3) & owdVar.a;
                Object obj = owdVar.get(i4);
                long j4 = j;
                if (obj == null) {
                    obj = null;
                } else {
                    atomicLong.lazySet(j3 + 1);
                    owdVar.lazySet(i4, null);
                }
                boolean z2 = obj == null;
                if (z && z2) {
                    vaeVar.b();
                    return;
                }
                if (z2) {
                    break;
                }
                vaeVar.e(obj);
                j2++;
                i3++;
                if (i3 == i2) {
                    this.u0.j(i2);
                    i3 = 0;
                }
                iAddAndGet = i;
                j = j4;
            }
            if (j2 == j && this.s0) {
                Throwable th2 = this.t0;
                if (th2 != null) {
                    owdVar.clear();
                    vaeVar.onError(th2);
                    return;
                } else if (owdVar.isEmpty()) {
                    vaeVar.b();
                    return;
                }
            }
            if (j2 != 0) {
                ngg.D(this.o, j2);
            }
            this.w0 = i3;
            iAddAndGet = addAndGet(-i);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        a();
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.Z = true;
        this.u0.cancel();
        if (getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.s0) {
            return;
        }
        try {
            Object objApply = this.b.apply(this.v0, obj);
            this.v0 = objApply;
            this.c.offer(objApply);
            a();
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
            xaeVar.j(this.X - 1);
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.o, j);
            a();
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        this.t0 = th;
        this.s0 = true;
        a();
    }
}
