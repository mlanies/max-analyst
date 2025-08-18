package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pqd extends AtomicReference implements f2a, zl4 {
    public final erd a;
    public final iqd b;
    public boolean c;

    public pqd(erd erdVar, iqd iqdVar) {
        this.a = erdVar;
        this.b = iqdVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.k(new wva(this, 4, this.a));
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.e(this, zl4Var)) {
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        ((zl4) get()).g();
        b();
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return dm4.b((zl4) get());
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.c) {
            j47.Z(th);
        } else {
            this.c = true;
            this.a.onError(th);
        }
    }
}
