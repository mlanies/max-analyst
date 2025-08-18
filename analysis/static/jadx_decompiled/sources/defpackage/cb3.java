package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cb3 implements ab3, zl4, b38, f2a, erd {
    public final /* synthetic */ int a;
    public zl4 b;
    public final Object c;
    public Object o;

    public /* synthetic */ cb3(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    @Override // defpackage.b38, defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                b38 b38Var = (b38) this.c;
                try {
                    Object objMo131apply = ((b66) this.o).mo131apply(obj);
                    Objects.requireNonNull(objMo131apply, "The mapper returned a null item");
                    b38Var.a(objMo131apply);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    b38Var.onError(th);
                    return;
                }
            case 2:
                zl4 zl4Var = this.b;
                dm4 dm4Var = dm4.a;
                if (zl4Var != dm4Var) {
                    try {
                        ((e38) this.o).b.accept(obj);
                        this.b = dm4Var;
                        ((b38) this.c).a(obj);
                        d();
                        break;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        f(th2);
                        return;
                    }
                }
                break;
            case 3:
                this.b = dm4.a;
                ((erd) this.c).a(obj);
                break;
            case 4:
            case 5:
            default:
                ((erd) this.c).a(obj);
                try {
                    ((f6) this.o).run();
                    break;
                } catch (Throwable th3) {
                    c37.B(th3);
                    j47.Z(th3);
                }
            case 6:
                ((erd) this.c).a(obj);
                try {
                    ((qj3) this.o).accept(obj);
                    break;
                } catch (Throwable th4) {
                    c37.B(th4);
                    j47.Z(th4);
                    return;
                }
        }
    }

    @Override // defpackage.ab3
    public void b() {
        switch (this.a) {
            case 0:
                ab3 ab3Var = (ab3) this.c;
                db3 db3Var = (db3) this.o;
                if (this.b != dm4.a) {
                    try {
                        db3Var.o.run();
                        db3Var.X.run();
                        ab3Var.b();
                        try {
                            db3Var.Y.run();
                            break;
                        } catch (Throwable th) {
                            c37.B(th);
                            j47.Z(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        ab3Var.onError(th2);
                        return;
                    }
                }
                break;
            case 1:
                ((b38) this.c).b();
                break;
            case 2:
                zl4 zl4Var = this.b;
                dm4 dm4Var = dm4.a;
                if (zl4Var != dm4Var) {
                    try {
                        ((e38) this.o).o.run();
                        this.b = dm4Var;
                        ((b38) this.c).b();
                        d();
                        break;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        f(th3);
                        return;
                    }
                }
                break;
            case 3:
                this.b = dm4.a;
                erd erdVar = (erd) this.c;
                Object obj = this.o;
                if (obj == null) {
                    erdVar.onError(new NoSuchElementException("The MaybeSource is empty"));
                    break;
                } else {
                    erdVar.a(obj);
                    break;
                }
            case 4:
                Collection collection = (Collection) this.o;
                this.o = null;
                f2a f2aVar = (f2a) this.c;
                f2aVar.e(collection);
                f2aVar.b();
                break;
            default:
                Collection collection2 = (Collection) this.o;
                this.o = null;
                ((erd) this.c).a(collection2);
                break;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                ab3 ab3Var = (ab3) this.c;
                try {
                    ((db3) this.o).b.accept(zl4Var);
                    if (dm4.f(this.b, zl4Var)) {
                        this.b = zl4Var;
                        ab3Var.c(this);
                        break;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    zl4Var.g();
                    this.b = dm4.a;
                    ab3Var.c(iz4.a);
                    ab3Var.onError(th);
                    return;
                }
                break;
            case 1:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((b38) this.c).c(this);
                    break;
                }
                break;
            case 2:
                b38 b38Var = (b38) this.c;
                if (dm4.f(this.b, zl4Var)) {
                    try {
                        ((e38) this.o).getClass();
                        this.b = zl4Var;
                        b38Var.c(this);
                        break;
                    } catch (Throwable th2) {
                        c37.B(th2);
                        zl4Var.g();
                        this.b = dm4.a;
                        b38Var.c(iz4.a);
                        b38Var.onError(th2);
                        return;
                    }
                }
                break;
            case 3:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((erd) this.c).c(this);
                    break;
                }
                break;
            case 4:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((f2a) this.c).c(this);
                    break;
                }
                break;
            case 5:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((erd) this.c).c(this);
                    break;
                }
                break;
            case 6:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((erd) this.c).c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.b, zl4Var)) {
                    this.b = zl4Var;
                    ((erd) this.c).c(this);
                    break;
                }
                break;
        }
    }

    public void d() {
        try {
            ((e38) this.o).getClass();
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
        }
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        switch (this.a) {
            case 4:
                ((Collection) this.o).add(obj);
                break;
            default:
                ((Collection) this.o).add(obj);
                break;
        }
    }

    public void f(Throwable th) {
        try {
            ((e38) this.o).c.accept(th);
        } catch (Throwable th2) {
            c37.B(th2);
            th = new CompositeException(th, th2);
        }
        this.b = dm4.a;
        ((b38) this.c).onError(th);
        d();
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                try {
                    ((db3) this.o).Z.run();
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                }
                this.b.g();
                break;
            case 1:
                zl4 zl4Var = this.b;
                this.b = dm4.a;
                zl4Var.g();
                break;
            case 2:
                try {
                    ((e38) this.o).getClass();
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(th2);
                }
                this.b.g();
                this.b = dm4.a;
                break;
            case 3:
                this.b.g();
                this.b = dm4.a;
                break;
            case 4:
                this.b.g();
                break;
            case 5:
                this.b.g();
                break;
            case 6:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.b.h();
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                db3 db3Var = (db3) this.o;
                if (this.b == dm4.a) {
                    j47.Z(th);
                    break;
                } else {
                    try {
                        db3Var.c.accept(th);
                        db3Var.X.run();
                    } catch (Throwable th2) {
                        c37.B(th2);
                        th = new CompositeException(th, th2);
                    }
                    ((ab3) this.c).onError(th);
                    try {
                        db3Var.Y.run();
                        break;
                    } catch (Throwable th3) {
                        c37.B(th3);
                        j47.Z(th3);
                        return;
                    }
                }
            case 1:
                ((b38) this.c).onError(th);
                break;
            case 2:
                if (this.b != dm4.a) {
                    f(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            case 3:
                this.b = dm4.a;
                ((erd) this.c).onError(th);
                break;
            case 4:
                this.o = null;
                ((f2a) this.c).onError(th);
                break;
            case 5:
                this.o = null;
                ((erd) this.c).onError(th);
                break;
            case 6:
                ((erd) this.c).onError(th);
                break;
            default:
                ((erd) this.c).onError(th);
                try {
                    ((f6) this.o).run();
                    break;
                } catch (Throwable th4) {
                    c37.B(th4);
                    j47.Z(th4);
                }
        }
    }

    public cb3(db3 db3Var, ab3 ab3Var) {
        this.a = 0;
        this.o = db3Var;
        this.c = ab3Var;
    }
}
