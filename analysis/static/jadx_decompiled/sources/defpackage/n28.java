package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes.dex */
public final class n28 implements erd, zl4, b38 {
    public final /* synthetic */ int a;
    public final b38 b;
    public final b7b c;
    public zl4 o;

    public /* synthetic */ n28(b38 b38Var, b7b b7bVar, int i) {
        this.a = i;
        this.b = b38Var;
        this.c = b7bVar;
    }

    @Override // defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                b38 b38Var = this.b;
                try {
                    if (!this.c.test(obj)) {
                        b38Var.b();
                        break;
                    } else {
                        b38Var.a(obj);
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    b38Var.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                break;
        }
    }

    @Override // defpackage.b38, defpackage.ab3
    public void b() {
        this.b.b();
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
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

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                zl4 zl4Var = this.o;
                this.o = dm4.a;
                zl4Var.g();
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

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                break;
            default:
                b38 b38Var = this.b;
                try {
                    if (!this.c.test(th)) {
                        b38Var.onError(th);
                        break;
                    } else {
                        b38Var.b();
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    b38Var.onError(new CompositeException(th, th2));
                }
        }
    }
}
