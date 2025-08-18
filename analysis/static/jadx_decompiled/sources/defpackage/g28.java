package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g28 extends AtomicReference implements b38, zl4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public Object o;

    public g28(qj3 qj3Var, qj3 qj3Var2, f6 f6Var) {
        this.b = qj3Var;
        this.c = qj3Var2;
        this.o = f6Var;
    }

    @Override // defpackage.b38, defpackage.erd
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lazySet(dm4.a);
                try {
                    ((qj3) this.b).accept(obj);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
            default:
                try {
                    Object objMo131apply = ((b66) this.c).mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null MaybeSource");
                    f38 f38Var = (f38) objMo131apply;
                    if (!h()) {
                        f38Var.a(new gd1(14, this));
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    ((b38) this.b).onError(th2);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.b38, defpackage.ab3
    public final void b() {
        switch (this.a) {
            case 0:
                lazySet(dm4.a);
                try {
                    ((f6) this.o).run();
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            default:
                ((b38) this.b).b();
                break;
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.e(this, zl4Var);
                break;
            default:
                if (dm4.f((zl4) this.o, zl4Var)) {
                    this.o = zl4Var;
                    ((b38) this.b).c(this);
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
                ((zl4) this.o).g();
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
                lazySet(dm4.a);
                try {
                    ((qj3) this.c).accept(th);
                    break;
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(new CompositeException(th, th2));
                    return;
                }
            default:
                ((b38) this.b).onError(th);
                break;
        }
    }

    public g28(b38 b38Var, b66 b66Var) {
        this.b = b38Var;
        this.c = b66Var;
    }
}
