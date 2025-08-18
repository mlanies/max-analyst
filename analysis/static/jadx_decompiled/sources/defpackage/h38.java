package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h38 extends AtomicReference implements b38, zl4, ab3 {
    public final /* synthetic */ int a;
    public final erd b;
    public final iqd c;

    public /* synthetic */ h38(erd erdVar, iqd iqdVar, int i) {
        this.a = i;
        this.b = erdVar;
        this.c = iqdVar;
    }

    @Override // defpackage.b38, defpackage.erd
    public void a(Object obj) {
        this.b.a(obj);
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        switch (this.a) {
            case 0:
                zl4 zl4Var = (zl4) get();
                if (zl4Var != dm4.a && compareAndSet(zl4Var, null)) {
                    this.c.k(new imc(this.b, this, false, 24));
                    break;
                }
                break;
            default:
                this.c.k(new wva(this, 4, this.b));
                break;
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.e(this, zl4Var)) {
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.e(this, zl4Var)) {
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
                this.b.onError(th);
                break;
            default:
                this.b.onError(th);
                break;
        }
    }
}
