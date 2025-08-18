package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class mp0 extends CountDownLatch implements erd, ab3, b38 {
    public Object a;
    public Throwable b;
    public zl4 c;
    public volatile boolean o;

    @Override // defpackage.erd
    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.ab3
    public final void b() {
        countDown();
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        this.c = zl4Var;
        if (this.o) {
            zl4Var.g();
        }
    }

    public final Object d() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.o = true;
                zl4 zl4Var = this.c;
                if (zl4Var != null) {
                    zl4Var.g();
                }
                throw q45.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw q45.f(th);
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}
