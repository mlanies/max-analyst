package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z1a extends AtomicLong implements f2a, zl4, a2a {
    public final uy1 X = new uy1(2);
    public final AtomicReference Y = new AtomicReference();
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;

    public z1a(f2a f2aVar, long j, TimeUnit timeUnit, xtc xtcVar) {
        this.a = f2aVar;
        this.b = j;
        this.c = timeUnit;
        this.o = xtcVar;
    }

    @Override // defpackage.a2a
    public final void a(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            dm4.a(this.Y);
            this.a.onError(new TimeoutException(q45.e(this.b, this.c)));
            this.o.g();
        }
    }

    @Override // defpackage.f2a
    public final void b() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            uy1 uy1Var = this.X;
            uy1Var.getClass();
            dm4.a(uy1Var);
            this.a.b();
            this.o.g();
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        dm4.e(this.Y, zl4Var);
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                uy1 uy1Var = this.X;
                ((zl4) uy1Var.get()).g();
                this.a.e(obj);
                zl4 zl4VarC = this.o.c(new es5(j2, this), this.b, this.c);
                uy1Var.getClass();
                dm4.c(uy1Var, zl4VarC);
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this.Y);
        this.o.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return dm4.b((zl4) this.Y.get());
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            j47.Z(th);
            return;
        }
        uy1 uy1Var = this.X;
        uy1Var.getClass();
        dm4.a(uy1Var);
        this.a.onError(th);
        this.o.g();
    }
}
