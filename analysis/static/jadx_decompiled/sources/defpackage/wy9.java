package defpackage;

/* loaded from: classes.dex */
public final class wy9 implements f2a, zl4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final ol0 b;
    public final Object c;
    public zl4 o;

    public /* synthetic */ wy9(Object obj, Object obj2, ol0 ol0Var, int i) {
        this.a = i;
        this.Y = obj;
        this.b = ol0Var;
        this.c = obj2;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Object obj = this.c;
                    f2a f2aVar = (f2a) this.Y;
                    f2aVar.e(obj);
                    f2aVar.b();
                    break;
                }
                break;
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).a(this.c);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    ((f2a) this.Y).c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    ((erd) this.Y).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        break;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.o.g();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        break;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        this.o.g();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.o.g();
                break;
            default:
                this.o.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    ((f2a) this.Y).onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }
}
