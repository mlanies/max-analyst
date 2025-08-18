package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class uy9 implements f2a, zl4 {
    public Object X;
    public final /* synthetic */ int a = 1;
    public final erd b;
    public zl4 c;
    public boolean o;

    public uy9(erd erdVar) {
        this.b = erdVar;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    this.b.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                if (!this.o) {
                    this.o = true;
                    Object obj = this.X;
                    this.X = null;
                    if (obj == null) {
                        obj = null;
                    }
                    erd erdVar = this.b;
                    if (obj == null) {
                        erdVar.onError(new NoSuchElementException());
                        break;
                    } else {
                        erdVar.a(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.c, zl4Var)) {
                    this.c = zl4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.c, zl4Var)) {
                    this.c = zl4Var;
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
                if (!this.o) {
                    try {
                        if (((b7b) this.X).test(obj)) {
                            this.o = true;
                            this.c.g();
                            this.b.a(Boolean.TRUE);
                            break;
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        this.c.g();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.o) {
                    if (this.X == null) {
                        this.X = obj;
                        break;
                    } else {
                        this.o = true;
                        this.c.g();
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.c.g();
                break;
            default:
                this.c.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.c.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                if (!this.o) {
                    this.o = true;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }

    public uy9(erd erdVar, b7b b7bVar) {
        this.b = erdVar;
        this.X = b7bVar;
    }
}
