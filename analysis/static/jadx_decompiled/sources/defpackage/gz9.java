package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gz9 implements f2a, zl4 {
    public zl4 X;
    public fz9 Y;
    public volatile long Z;
    public final f2a a;
    public final long b = 1000;
    public final TimeUnit c;
    public final xtc o;
    public boolean s0;

    public gz9(y6d y6dVar, TimeUnit timeUnit, xtc xtcVar) {
        this.a = y6dVar;
        this.c = timeUnit;
        this.o = xtcVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        fz9 fz9Var = this.Y;
        if (fz9Var != null) {
            dm4.a(fz9Var);
        }
        if (fz9Var != null) {
            fz9Var.run();
        }
        this.a.b();
        this.o.g();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.X, zl4Var)) {
            this.X = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.s0) {
            return;
        }
        long j = this.Z + 1;
        this.Z = j;
        fz9 fz9Var = this.Y;
        if (fz9Var != null) {
            dm4.a(fz9Var);
        }
        fz9 fz9Var2 = new fz9(obj, j, this);
        this.Y = fz9Var2;
        dm4.c(fz9Var2, this.o.c(fz9Var2, this.b, this.c));
    }

    @Override // defpackage.zl4
    public final void g() {
        this.X.g();
        this.o.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        fz9 fz9Var = this.Y;
        if (fz9Var != null) {
            dm4.a(fz9Var);
        }
        this.s0 = true;
        this.a.onError(th);
        this.o.g();
    }
}
