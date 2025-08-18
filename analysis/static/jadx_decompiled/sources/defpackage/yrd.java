package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yrd extends AtomicReference implements erd, Runnable, zl4 {
    public final long X;
    public final TimeUnit Y;
    public final erd a;
    public final AtomicReference b = new AtomicReference();
    public final br5 c;
    public iqd o;

    public yrd(erd erdVar, iqd iqdVar, long j, TimeUnit timeUnit) {
        this.a = erdVar;
        this.o = iqdVar;
        this.X = j;
        this.Y = timeUnit;
        if (iqdVar != null) {
            this.c = new br5(3, erdVar);
        } else {
            this.c = null;
        }
    }

    @Override // defpackage.erd
    public final void a(Object obj) {
        zl4 zl4Var = (zl4) get();
        dm4 dm4Var = dm4.a;
        if (zl4Var == dm4Var || !compareAndSet(zl4Var, dm4Var)) {
            return;
        }
        dm4.a(this.b);
        this.a.a(obj);
    }

    @Override // defpackage.erd
    public final void c(zl4 zl4Var) {
        dm4.e(this, zl4Var);
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this);
        dm4.a(this.b);
        br5 br5Var = this.c;
        if (br5Var != null) {
            dm4.a(br5Var);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return dm4.b((zl4) get());
    }

    @Override // defpackage.erd
    public final void onError(Throwable th) {
        zl4 zl4Var = (zl4) get();
        dm4 dm4Var = dm4.a;
        if (zl4Var == dm4Var || !compareAndSet(zl4Var, dm4Var)) {
            j47.Z(th);
        } else {
            dm4.a(this.b);
            this.a.onError(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (dm4.a(this)) {
            iqd iqdVar = this.o;
            if (iqdVar == null) {
                this.a.onError(new TimeoutException(q45.e(this.X, this.Y)));
            } else {
                this.o = null;
                iqdVar.k(this.c);
            }
        }
    }
}
