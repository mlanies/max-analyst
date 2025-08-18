package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class lp0 extends CountDownLatch implements f2a, zl4 {
    public Object a;
    public Throwable b;
    public zl4 c;
    public volatile boolean o;

    @Override // defpackage.f2a
    public final void b() {
        countDown();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        this.c = zl4Var;
        if (this.o) {
            zl4Var.g();
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.g();
            countDown();
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        this.o = true;
        zl4 zl4Var = this.c;
        if (zl4Var != null) {
            zl4Var.g();
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.o;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
