package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class td7 extends AtomicReference implements gs5, xae, zl4 {
    public final qj3 a;
    public final qj3 b;
    public final f6 c;
    public final qj3 o;

    public td7(tx7 tx7Var, sx7 sx7Var) {
        r66 r66Var = ft.d;
        rr5 rr5Var = rr5.a;
        this.a = tx7Var;
        this.b = sx7Var;
        this.c = r66Var;
        this.o = rr5Var;
    }

    @Override // defpackage.vae
    public final void b() {
        Object obj = get();
        zae zaeVar = zae.a;
        if (obj != zaeVar) {
            lazySet(zaeVar);
            try {
                this.c.run();
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
            }
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        zae.a(this);
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (h()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            c37.B(th);
            ((xae) get()).cancel();
            onError(th);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.c(this, xaeVar)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                c37.B(th);
                xaeVar.cancel();
                onError(th);
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        zae.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == zae.a;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        ((xae) get()).j(j);
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        Object obj = get();
        zae zaeVar = zae.a;
        if (obj == zaeVar) {
            j47.Z(th);
            return;
        }
        lazySet(zaeVar);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            j47.Z(new CompositeException(th, th2));
        }
    }
}
