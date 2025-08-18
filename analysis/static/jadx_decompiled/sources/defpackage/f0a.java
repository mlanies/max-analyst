package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f0a implements f2a, zl4 {
    public final /* synthetic */ int a;
    public final f2a b;
    public final b66 c;
    public zl4 o;

    public /* synthetic */ f0a(f2a f2aVar, b66 b66Var, int i) {
        this.a = i;
        this.b = f2aVar;
        this.c = b66Var;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                zl4 zl4Var = this.o;
                dm4 dm4Var = dm4.a;
                if (zl4Var != dm4Var) {
                    this.o = dm4Var;
                    this.b.b();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (this.o != dm4.a) {
                    try {
                        for (Object obj2 : (Iterable) this.c.mo131apply(obj)) {
                            try {
                                try {
                                    Objects.requireNonNull(obj2, "The iterator returned a null value");
                                    this.b.e(obj2);
                                } catch (Throwable th) {
                                    c37.B(th);
                                    this.o.g();
                                    onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                c37.B(th2);
                                this.o.g();
                                onError(th2);
                                return;
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        this.o.g();
                        onError(th3);
                        return;
                    }
                }
                break;
            default:
                this.b.e(obj);
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.o.g();
                this.o = dm4.a;
                break;
            default:
                this.o.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.o.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                zl4 zl4Var = this.o;
                dm4 dm4Var = dm4.a;
                if (zl4Var != dm4Var) {
                    this.o = dm4Var;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                f2a f2aVar = this.b;
                try {
                    Object objMo131apply = this.c.mo131apply(th);
                    if (objMo131apply != null) {
                        f2aVar.e(objMo131apply);
                        f2aVar.b();
                        break;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        f2aVar.onError(nullPointerException);
                        break;
                    }
                } catch (Throwable th2) {
                    c37.B(th2);
                    f2aVar.onError(new CompositeException(th, th2));
                }
        }
    }
}
