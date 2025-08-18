package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k8b implements py9 {
    public final yw1 a;
    public final ci9 b;
    public p8b c;
    public final pu9 d;
    public b76 e;
    public boolean f = false;

    public k8b(yw1 yw1Var, ci9 ci9Var, pu9 pu9Var) {
        this.a = yw1Var;
        this.b = ci9Var;
        this.d = pu9Var;
        synchronized (this) {
            this.c = (p8b) ci9Var.d();
        }
    }

    @Override // defpackage.py9
    public final void a(Object obj) {
        zw1 zw1Var = (zw1) obj;
        zw1 zw1Var2 = zw1.CLOSING;
        p8b p8bVar = p8b.a;
        if (zw1Var == zw1Var2 || zw1Var == zw1.CLOSED || zw1Var == zw1.RELEASING || zw1Var == zw1.RELEASED) {
            b(p8bVar);
            if (this.f) {
                this.f = false;
                b76 b76Var = this.e;
                if (b76Var != null) {
                    b76Var.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((zw1Var == zw1.OPENING || zw1Var == zw1.OPEN || zw1Var == zw1.PENDING_OPEN) && !this.f) {
            b(p8bVar);
            ArrayList arrayList = new ArrayList();
            yw1 yw1Var = this.a;
            b76 b76VarA = b76.a(f8.g(new u00(this, yw1Var, arrayList, 22)));
            yt8 yt8Var = new yt8(19, this);
            ok4 ok4VarK = ju0.k();
            b76VarA.getClass();
            k12 k12VarK = kq0.K(b76VarA, yt8Var, ok4VarK);
            iw1 iw1Var = new iw1(2, this);
            k12 k12VarK2 = kq0.K(k12VarK, new re6(15, iw1Var), ju0.k());
            this.e = k12VarK2;
            kq0.a(k12VarK2, new vq7(10, this, arrayList, yw1Var, false), ju0.k());
            this.f = true;
        }
    }

    public final void b(p8b p8bVar) {
        synchronized (this) {
            try {
                if (this.c.equals(p8bVar)) {
                    return;
                }
                this.c = p8bVar;
                Objects.toString(p8bVar);
                this.b.i(p8bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.py9
    public final void onError(Throwable th) {
        b76 b76Var = this.e;
        if (b76Var != null) {
            b76Var.cancel(false);
            this.e = null;
        }
        b(p8b.a);
    }
}
