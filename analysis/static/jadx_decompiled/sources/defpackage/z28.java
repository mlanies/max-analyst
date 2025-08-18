package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z28 extends AtomicReference implements b38, zl4, Runnable, erd {
    public final Object X;
    public final /* synthetic */ int a;
    public final ztc b;
    public Object c;
    public Throwable o;

    public /* synthetic */ z28(Object obj, ztc ztcVar, int i) {
        this.a = i;
        this.X = obj;
        this.b = ztcVar;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                dm4.c(this, this.b.b(this));
                break;
            default:
                this.c = obj;
                dm4.c(this, this.b.b(this));
                break;
        }
    }

    @Override // defpackage.b38, defpackage.ab3
    public void b() {
        dm4.c(this, this.b.b(this));
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4Var)) {
                    ((b38) this.X).c(this);
                    break;
                }
                break;
            default:
                if (dm4.e(this, zl4Var)) {
                    ((erd) this.X).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return dm4.b((zl4) get());
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                dm4.c(this, this.b.b(this));
                break;
            default:
                this.o = th;
                dm4.c(this, this.b.b(this));
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = this.o;
                b38 b38Var = (b38) this.X;
                if (th == null) {
                    Object obj = this.c;
                    if (obj == null) {
                        b38Var.b();
                        break;
                    } else {
                        this.c = null;
                        b38Var.a(obj);
                        break;
                    }
                } else {
                    this.o = null;
                    b38Var.onError(th);
                    break;
                }
            default:
                Throwable th2 = this.o;
                erd erdVar = (erd) this.X;
                if (th2 == null) {
                    erdVar.a(this.c);
                    break;
                } else {
                    erdVar.onError(th2);
                    break;
                }
        }
    }
}
