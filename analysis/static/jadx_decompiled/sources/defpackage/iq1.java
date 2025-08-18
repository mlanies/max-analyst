package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iq1 extends AtomicReference implements ab3, zl4, erd, b38, f2a {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ iq1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                lazySet(dm4.a);
                try {
                    ((qj3) this.b).accept(obj);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            case 3:
                ((b38) this.c).a(obj);
                break;
            case 4:
                ((b38) this.b).a(obj);
                break;
            case 5:
            default:
                try {
                    Object objMo131apply = ((b66) this.c).mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null CompletableSource");
                    pa3 pa3Var = (pa3) objMo131apply;
                    if (!h()) {
                        pa3Var.i(this);
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    onError(th2);
                    return;
                }
                break;
            case 6:
                ((erd) this.b).a(obj);
                break;
        }
    }

    @Override // defpackage.ab3
    public void b() {
        switch (this.a) {
            case 0:
                try {
                    ((f6) this.c).run();
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
                lazySet(dm4.a);
                break;
            case 1:
                ((pa3) this.c).i(new imc(this, (ab3) this.b, false, 12));
                break;
            case 2:
            default:
                ((ab3) this.b).b();
                break;
            case 3:
                ((b38) this.c).b();
                break;
            case 4:
                zl4 zl4Var = (zl4) get();
                if (zl4Var != dm4.a && compareAndSet(zl4Var, null)) {
                    ((f38) this.c).a(new g38((b38) this.b, this));
                    break;
                }
                break;
            case 5:
                ((f2a) this.b).b();
                break;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                dm4.e(this, zl4Var);
                break;
            case 1:
                if (dm4.e(this, zl4Var)) {
                    ((ab3) this.b).c(this);
                    break;
                }
                break;
            case 2:
                dm4.e(this, zl4Var);
                break;
            case 3:
                dm4.e(this, zl4Var);
                break;
            case 4:
                if (dm4.e(this, zl4Var)) {
                    ((b38) this.b).c(this);
                    break;
                }
                break;
            case 5:
                dm4.e((AtomicReference) this.c, zl4Var);
                break;
            case 6:
                if (dm4.f((zl4) this.c, zl4Var)) {
                    this.c = zl4Var;
                    ((erd) this.b).c(this);
                    break;
                }
                break;
            default:
                dm4.c(this, zl4Var);
                break;
        }
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        ((f2a) this.b).e(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                break;
            case 1:
                dm4.a(this);
                break;
            case 2:
                dm4.a(this);
                break;
            case 3:
                dm4.a(this);
                uy1 uy1Var = (uy1) this.b;
                uy1Var.getClass();
                dm4.a(uy1Var);
                break;
            case 4:
                dm4.a(this);
                break;
            case 5:
                dm4.a((AtomicReference) this.c);
                dm4.a(this);
                break;
            case 6:
                f6 f6Var = (f6) getAndSet(null);
                if (f6Var != null) {
                    try {
                        f6Var.run();
                    } catch (Throwable th) {
                        c37.B(th);
                        j47.Z(th);
                    }
                    ((zl4) this.c).g();
                    break;
                }
                break;
            default:
                dm4.a(this);
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
            case 0:
                return get() == dm4.a;
            case 1:
                return dm4.b((zl4) get());
            case 2:
                return get() == dm4.a;
            case 3:
                return dm4.b((zl4) get());
            case 4:
                return dm4.b((zl4) get());
            case 5:
                return dm4.b((zl4) get());
            case 6:
                return ((zl4) this.c).h();
            default:
                return dm4.b((zl4) get());
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    ((qj3) this.b).accept(th);
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(th2);
                }
                lazySet(dm4.a);
                break;
            case 1:
                ((ab3) this.b).onError(th);
                break;
            case 2:
                lazySet(dm4.a);
                try {
                    ((qj3) this.c).accept(th);
                    break;
                } catch (Throwable th3) {
                    c37.B(th3);
                    j47.Z(new CompositeException(th, th3));
                    return;
                }
            case 3:
                ((b38) this.c).onError(th);
                break;
            case 4:
                ((b38) this.b).onError(th);
                break;
            case 5:
                ((f2a) this.b).onError(th);
                break;
            case 6:
                ((erd) this.b).onError(th);
                break;
            default:
                ((ab3) this.b).onError(th);
                break;
        }
    }

    public iq1(f2a f2aVar) {
        this.a = 5;
        this.b = f2aVar;
        this.c = new AtomicReference();
    }

    public iq1(erd erdVar, f6 f6Var) {
        this.a = 6;
        this.b = erdVar;
        lazySet(f6Var);
    }

    public iq1(b38 b38Var) {
        this.a = 3;
        this.c = b38Var;
        this.b = new uy1(2);
    }
}
