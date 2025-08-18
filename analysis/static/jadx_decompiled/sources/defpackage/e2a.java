package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e2a extends AtomicBoolean implements f2a, zl4 {
    public final f2a a;
    public final ztc b;
    public zl4 c;

    public e2a(f2a f2aVar, f55 f55Var) {
        this.a = f2aVar;
        this.b = f55Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (get()) {
            return;
        }
        this.a.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.c, zl4Var)) {
            this.c = zl4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (get()) {
            return;
        }
        this.a.e(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.b(new q57(15, this));
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (get()) {
            j47.Z(th);
        } else {
            this.a.onError(th);
        }
    }
}
