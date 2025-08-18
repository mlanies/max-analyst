package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ya3 extends AtomicReference implements ab3, zl4, Runnable, erd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object o;

    public ya3(ab3 ab3Var, ztc ztcVar) {
        this.a = 0;
        this.b = ab3Var;
        this.c = ztcVar;
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        ((erd) this.b).a(obj);
    }

    @Override // defpackage.ab3
    public void b() {
        switch (this.a) {
            case 0:
                dm4.c(this, ((ztc) this.c).b(this));
                break;
            default:
                ((ab3) this.b).b();
                break;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4Var)) {
                    ((ab3) this.b).c(this);
                    break;
                }
                break;
            case 1:
                dm4.e(this, zl4Var);
                break;
            default:
                dm4.e(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            case 1:
                dm4.a(this);
                uy1 uy1Var = (uy1) this.c;
                uy1Var.getClass();
                dm4.a(uy1Var);
                break;
            default:
                dm4.a(this);
                uy1 uy1Var2 = (uy1) this.c;
                uy1Var2.getClass();
                dm4.a(uy1Var2);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                dm4.c(this, ((ztc) this.c).b(this));
                break;
            case 1:
                ((ab3) this.b).onError(th);
                break;
            default:
                ((erd) this.b).onError(th);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.o;
                ab3 ab3Var = (ab3) this.b;
                if (th == null) {
                    ab3Var.b();
                    break;
                } else {
                    this.o = null;
                    ab3Var.onError(th);
                    break;
                }
            case 1:
                ((pa3) this.o).i(this);
                break;
            default:
                ((iqd) this.o).k(this);
                break;
        }
    }

    public ya3(erd erdVar, iqd iqdVar) {
        this.a = 2;
        this.b = erdVar;
        this.o = iqdVar;
        this.c = new uy1(2);
    }

    public ya3(ab3 ab3Var, pa3 pa3Var) {
        this.a = 1;
        this.b = ab3Var;
        this.o = pa3Var;
        this.c = new uy1(2);
    }
}
