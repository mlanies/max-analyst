package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class br5 extends AtomicReference implements erd, f2a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ br5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 0:
                cr5 cr5Var = (cr5) this.b;
                cr5Var.z0 = obj;
                cr5Var.A0 = 2;
                cr5Var.a();
                break;
            case 1:
                dz9 dz9Var = (dz9) this.b;
                dz9Var.v0 = obj;
                dz9Var.w0 = 2;
                dz9Var.a();
                break;
            default:
                ((erd) this.b).a(obj);
                break;
        }
    }

    @Override // defpackage.f2a
    public void b() {
        k1a k1aVar = (k1a) this.b;
        dm4.a(k1aVar.Y);
        if (k1aVar.getAndIncrement() == 0) {
            k1aVar.c.d(k1aVar.a);
        }
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4Var);
                break;
            case 1:
                dm4.c(this, zl4Var);
                break;
            case 2:
                dm4.e(this, zl4Var);
                break;
            default:
                dm4.e(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        ((k1a) this.b).a();
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                cr5 cr5Var = (cr5) this.b;
                if (cr5Var.a.a(th)) {
                    if (cr5Var.c != 3) {
                        cr5Var.X.cancel();
                    }
                    cr5Var.A0 = 0;
                    cr5Var.a();
                    break;
                }
                break;
            case 1:
                dz9 dz9Var = (dz9) this.b;
                if (dz9Var.a.a(th)) {
                    if (dz9Var.c != 3) {
                        dz9Var.X.g();
                    }
                    dz9Var.w0 = 0;
                    dz9Var.a();
                    break;
                }
                break;
            case 2:
                k1a k1aVar = (k1a) this.b;
                dm4.a(k1aVar.Y);
                az azVar = k1aVar.c;
                if (azVar.a(th) && k1aVar.getAndIncrement() == 0) {
                    azVar.d(k1aVar.a);
                    break;
                }
                break;
            default:
                ((erd) this.b).onError(th);
                break;
        }
    }

    public br5(k1a k1aVar) {
        this.a = 2;
        this.b = k1aVar;
    }
}
