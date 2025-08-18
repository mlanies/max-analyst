package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class sd7 extends AtomicReference implements f2a, zl4 {
    public final qj3 a;
    public final qj3 b;
    public final f6 c;
    public final qj3 o;

    public sd7(qj3 qj3Var, qj3 qj3Var2, f6 f6Var) {
        kj6 kj6Var = ft.e;
        this.a = qj3Var;
        this.b = qj3Var2;
        this.c = f6Var;
        this.o = kj6Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        if (h()) {
            return;
        }
        lazySet(dm4.a);
        try {
            this.c.run();
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.e(this, zl4Var)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                c37.B(th);
                zl4Var.g();
                onError(th);
            }
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (h()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            c37.B(th);
            ((zl4) get()).g();
            onError(th);
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == dm4.a;
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        if (h()) {
            j47.Z(th);
            return;
        }
        lazySet(dm4.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            j47.Z(new CompositeException(th, th2));
        }
    }
}
