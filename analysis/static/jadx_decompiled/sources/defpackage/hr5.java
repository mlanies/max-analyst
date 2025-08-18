package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hr5 extends AtomicReference implements gs5, zl4 {
    public volatile boolean X;
    public volatile dqd Y;
    public long Z;
    public final long a;
    public final ir5 b;
    public final int c;
    public final int o;
    public int s0;

    public hr5(ir5 ir5Var, int i, long j) {
        this.a = j;
        this.b = ir5Var;
        this.o = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.s0 != 1) {
            long j2 = this.Z + j;
            if (j2 < this.c) {
                this.Z = j2;
            } else {
                this.Z = 0L;
                ((xae) get()).j(j2);
            }
        }
    }

    @Override // defpackage.vae
    public final void b() {
        this.X = true;
        this.b.c();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.s0 == 2) {
            this.b.c();
            return;
        }
        ir5 ir5Var = this.b;
        if (ir5Var.get() == 0 && ir5Var.compareAndSet(0, 1)) {
            long j = ir5Var.v0.get();
            dqd owdVar = this.Y;
            if (j == 0 || !(owdVar == null || owdVar.isEmpty())) {
                if (owdVar == null) {
                    owdVar = new owd(ir5Var.X);
                    this.Y = owdVar;
                }
                if (!owdVar.offer(obj)) {
                    ir5Var.onError(new QueueOverflowException());
                }
            } else {
                ir5Var.a.e(obj);
                if (j != Long.MAX_VALUE) {
                    ir5Var.v0.decrementAndGet();
                }
                a(1L);
            }
            if (ir5Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            dqd owdVar2 = this.Y;
            if (owdVar2 == null) {
                owdVar2 = new owd(ir5Var.X);
                this.Y = owdVar2;
            }
            if (!owdVar2.offer(obj)) {
                ir5Var.onError(new QueueOverflowException());
                return;
            } else if (ir5Var.getAndIncrement() != 0) {
                return;
            }
        }
        ir5Var.d();
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.c(this, xaeVar)) {
            if (xaeVar instanceof vqb) {
                vqb vqbVar = (vqb) xaeVar;
                int iN = vqbVar.n(7);
                if (iN == 1) {
                    this.s0 = iN;
                    this.Y = vqbVar;
                    this.X = true;
                    this.b.c();
                    return;
                }
                if (iN == 2) {
                    this.s0 = iN;
                    this.Y = vqbVar;
                }
            }
            xaeVar.j(this.o);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        zae.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == zae.a;
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        lazySet(zae.a);
        ir5 ir5Var = this.b;
        if (ir5Var.s0.a(th)) {
            this.X = true;
            if (!ir5Var.c) {
                ir5Var.w0.cancel();
                for (hr5 hr5Var : (hr5[]) ir5Var.u0.getAndSet(ir5.D0)) {
                    hr5Var.getClass();
                    zae.a(hr5Var);
                }
            }
            ir5Var.c();
        }
    }
}
