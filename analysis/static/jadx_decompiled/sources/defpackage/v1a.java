package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v1a extends AtomicReference implements f2a, zl4, Runnable {
    public final qj3 X = null;
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;

    public v1a(y6d y6dVar, long j, TimeUnit timeUnit, xtc xtcVar) {
        this.a = y6dVar;
        this.b = j;
        this.c = timeUnit;
        this.o = xtcVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        this.a.b();
        this.o.g();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.Y, zl4Var)) {
            this.Y = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (!this.Z) {
            this.Z = true;
            this.a.e(obj);
            zl4 zl4Var = (zl4) get();
            if (zl4Var != null) {
                zl4Var.g();
            }
            dm4.c(this, this.o.c(this, this.b, this.c));
            return;
        }
        qj3 qj3Var = this.X;
        if (qj3Var != null) {
            try {
                qj3Var.accept(obj);
            } catch (Throwable th) {
                c37.B(th);
                this.Y.g();
                this.a.onError(th);
                this.o.g();
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.Y.g();
        this.o.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        this.a.onError(th);
        this.o.g();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z = false;
    }
}
