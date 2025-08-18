package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nqd extends AtomicReference implements sqd, zl4, ab3 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public nqd(erd erdVar) {
        this.b = erdVar;
    }

    public void a(Object obj) {
        zl4 zl4Var;
        Object obj2 = get();
        dm4 dm4Var = dm4.a;
        if (obj2 == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
            return;
        }
        erd erdVar = (erd) this.b;
        try {
            if (obj == null) {
                erdVar.onError(q45.b("onSuccess called with a null value."));
            } else {
                erdVar.a(obj);
            }
            if (zl4Var != null) {
                zl4Var.g();
            }
        } catch (Throwable th) {
            if (zl4Var != null) {
                zl4Var.g();
            }
            throw th;
        }
    }

    @Override // defpackage.ab3
    public void b() {
        zz9 zz9Var = (zz9) this.b;
        zz9Var.X.c(this);
        zz9Var.b();
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public void c(zl4 zl4Var) {
        dm4.e(this, zl4Var);
    }

    public boolean d(Throwable th) {
        zl4 zl4Var;
        if (th == null) {
            th = q45.b("onError called with a null Throwable.");
        }
        Object obj = get();
        dm4 dm4Var = dm4.a;
        if (obj == dm4Var || (zl4Var = (zl4) getAndSet(dm4Var)) == dm4Var) {
            return false;
        }
        try {
            ((erd) this.b).onError(th);
        } finally {
            if (zl4Var != null) {
                zl4Var.g();
            }
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

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!d(th)) {
                    j47.Z(th);
                    break;
                }
                break;
            default:
                zz9 zz9Var = (zz9) this.b;
                zz9Var.X.c(this);
                zz9Var.onError(th);
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return nqd.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public nqd(zz9 zz9Var) {
        this.b = zz9Var;
    }
}
