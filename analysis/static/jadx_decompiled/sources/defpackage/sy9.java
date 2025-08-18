package defpackage;

/* loaded from: classes.dex */
public final class sy9 implements f2a, zl4 {
    public boolean X;
    public final /* synthetic */ int a;
    public final f2a b;
    public final b7b c;
    public zl4 o;

    public /* synthetic */ sy9(f2a f2aVar, b7b b7bVar, int i) {
        this.a = i;
        this.b = f2aVar;
        this.c = b7bVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Boolean bool = Boolean.FALSE;
                    f2a f2aVar = this.b;
                    f2aVar.e(bool);
                    f2aVar.b();
                    break;
                }
                break;
            case 1:
                this.b.b();
                break;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.b();
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
                    this.b.c(this);
                    break;
                }
                break;
            case 1:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.b.c(this);
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
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.g();
                            Boolean bool = Boolean.TRUE;
                            f2a f2aVar = this.b;
                            f2aVar.e(bool);
                            f2aVar.b();
                            break;
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        this.o.g();
                        onError(th);
                        return;
                    }
                }
                break;
            case 1:
                boolean z = this.X;
                f2a f2aVar2 = this.b;
                if (z) {
                    f2aVar2.e(obj);
                    break;
                } else {
                    try {
                        if (!this.c.test(obj)) {
                            this.X = true;
                            f2aVar2.e(obj);
                            break;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        this.o.g();
                        f2aVar2.onError(th2);
                        return;
                    }
                }
                break;
            default:
                if (!this.X) {
                    f2a f2aVar3 = this.b;
                    f2aVar3.e(obj);
                    try {
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.g();
                            f2aVar3.b();
                            break;
                        }
                    } catch (Throwable th3) {
                        c37.B(th3);
                        this.o.g();
                        onError(th3);
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
            case 1:
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
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            case 1:
                this.b.onError(th);
                break;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }
}
