package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class n1a extends AtomicReference implements f2a, zl4, Runnable {
    public zl4 Z;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final ztc o;
    public final AtomicReference Y = new AtomicReference();
    public final qj3 X = null;

    public n1a(y6d y6dVar, long j, TimeUnit timeUnit, ztc ztcVar) {
        this.a = y6dVar;
        this.b = j;
        this.c = timeUnit;
        this.o = ztcVar;
    }

    public abstract void a();

    @Override // defpackage.f2a
    public final void b() {
        dm4.a(this.Y);
        a();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Z, zl4Var)) {
            this.Z = zl4Var;
            this.a.c(this);
            long j = this.b;
            dm4.c(this.Y, this.o.d(this, j, j, this.c));
        }
    }

    public final void d() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.a.e(andSet);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        qj3 qj3Var;
        Object andSet = getAndSet(obj);
        if (andSet == null || (qj3Var = this.X) == null) {
            return;
        }
        try {
            qj3Var.accept(andSet);
        } catch (Throwable th) {
            c37.B(th);
            dm4.a(this.Y);
            this.Z.g();
            this.a.onError(th);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this.Y);
        this.Z.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Z.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        dm4.a(this.Y);
        this.a.onError(th);
    }

    public void run() {
        d();
    }
}
