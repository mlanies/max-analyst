package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zq5 implements gs5, zl4 {
    public boolean X;
    public Object Y;
    public final /* synthetic */ int a = 1;
    public final erd b;
    public final Object c;
    public xae o;

    public zq5(erd erdVar, Object obj) {
        this.b = erdVar;
        this.c = obj;
    }

    @Override // defpackage.vae
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    this.b.a(this.c);
                    break;
                }
                break;
            default:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    Object obj = this.Y;
                    this.Y = null;
                    if (obj == null) {
                        obj = this.c;
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

    @Override // defpackage.vae
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        ((ol0) this.Y).accept(this.c, obj);
                        break;
                    } catch (Throwable th) {
                        c37.B(th);
                        this.o.cancel();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.X) {
                    if (this.Y == null) {
                        this.Y = obj;
                        break;
                    } else {
                        this.X = true;
                        this.o.cancel();
                        this.o = zae.a;
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        switch (this.a) {
            case 0:
                if (zae.e(this.o, xaeVar)) {
                    this.o = xaeVar;
                    this.b.c(this);
                    xaeVar.j(Long.MAX_VALUE);
                    break;
                }
                break;
            default:
                if (zae.e(this.o, xaeVar)) {
                    this.o = xaeVar;
                    this.b.c(this);
                    xaeVar.j(Long.MAX_VALUE);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.o.cancel();
                this.o = zae.a;
                break;
            default:
                this.o.cancel();
                this.o = zae.a;
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
            case 0:
                if (this.o == zae.a) {
                }
                break;
            default:
                if (this.o == zae.a) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                if (!this.X) {
                    this.X = true;
                    this.o = zae.a;
                    this.b.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }

    public zq5(erd erdVar, Object obj, ol0 ol0Var) {
        this.b = erdVar;
        this.Y = ol0Var;
        this.c = obj;
    }
}
