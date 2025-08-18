package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes.dex */
public final class nz9 implements f2a, zl4 {
    public final f6 X;
    public zl4 Y;
    public boolean Z;
    public final f2a a;
    public final qj3 b;
    public final qj3 c;
    public final f6 o;

    public nz9(f2a f2aVar, qj3 qj3Var, qj3 qj3Var2, f6 f6Var) {
        r66 r66Var = ft.d;
        this.a = f2aVar;
        this.b = qj3Var;
        this.c = qj3Var2;
        this.o = f6Var;
        this.X = r66Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.Z) {
            return;
        }
        try {
            this.o.run();
            this.Z = true;
            this.a.b();
            try {
                this.X.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
        } catch (Throwable th2) {
            c37.B(th2);
            onError(th2);
        }
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
        if (this.Z) {
            return;
        }
        try {
            this.b.accept(obj);
            this.a.e(obj);
        } catch (Throwable th) {
            c37.B(th);
            this.Y.g();
            onError(th);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.Y.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Y.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
            return;
        }
        this.Z = true;
        try {
            this.c.accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        this.a.onError(th);
        try {
            this.X.run();
        } catch (Throwable th3) {
            c37.B(th3);
            j47.Z(th3);
        }
    }
}
