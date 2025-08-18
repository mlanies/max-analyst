package defpackage;

/* loaded from: classes.dex */
public final class em4 implements f2a, zl4 {
    public final f2a a;
    public final qj3 b;
    public final f6 c;
    public zl4 o;

    public em4(f2a f2aVar, qj3 qj3Var, f6 f6Var) {
        this.a = f2aVar;
        this.b = qj3Var;
        this.c = f6Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        zl4 zl4Var = this.o;
        dm4 dm4Var = dm4.a;
        if (zl4Var != dm4Var) {
            this.o = dm4Var;
            this.a.b();
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        f2a f2aVar = this.a;
        try {
            this.b.accept(zl4Var);
            if (dm4.f(this.o, zl4Var)) {
                this.o = zl4Var;
                f2aVar.c(this);
            }
        } catch (Throwable th) {
            c37.B(th);
            zl4Var.g();
            this.o = dm4.a;
            iz4.b(th, f2aVar);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        zl4 zl4Var = this.o;
        dm4 dm4Var = dm4.a;
        if (zl4Var != dm4Var) {
            this.o = dm4Var;
            try {
                this.c.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
            zl4Var.g();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        zl4 zl4Var = this.o;
        dm4 dm4Var = dm4.a;
        if (zl4Var == dm4Var) {
            j47.Z(th);
        } else {
            this.o = dm4Var;
            this.a.onError(th);
        }
    }
}
