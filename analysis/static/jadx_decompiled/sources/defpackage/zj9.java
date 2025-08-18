package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zj9 extends u2 implements n4d, m4d {
    public final boolean A0;
    public final boolean B0;
    public iq1 C0;
    public up7 X;
    public final xdf Y;
    public List Z;
    public final tj9 c;
    public pq7 o;
    public long s0;
    public ref t0;
    public awa u0;
    public final ad v0;
    public final p4d w0;
    public final zi5 x0;
    public final bn0 y0;
    public final o45 z0;

    public zj9(dl9 dl9Var, tj9 tj9Var, boolean z, boolean z2, ad adVar, p4d p4dVar, kk5 kk5Var, bn0 bn0Var, o45 o45Var, xdf xdfVar) {
        super(0, dl9Var);
        this.c = tj9Var;
        this.A0 = z;
        this.B0 = z2;
        this.w0 = p4dVar;
        this.v0 = adVar;
        this.x0 = kk5Var;
        this.y0 = bn0Var;
        this.z0 = o45Var;
        this.Y = xdfVar;
        dl9Var.r(this);
        oq7 oq7Var = new oq7();
        oq7Var.b = false;
        oq7Var.d = z;
        oq7Var.e = false;
        oq7Var.g = false;
        oq7Var.h = false;
        oq7Var.i = mqb.P_2160;
        oq7Var.k = 0;
        oq7Var.n = false;
        if (p4dVar.l == 2) {
            oq7Var.b = false;
        }
        pq7 pq7Var = new pq7(oq7Var);
        this.o = pq7Var;
        dl9Var.A(pq7Var);
    }

    @Override // defpackage.n4d
    public final void B1(Set set) {
        d2(new uj9(this, 3));
    }

    public final void Z1(up7 up7Var) {
        int i = 14;
        int i2 = 2;
        int i3 = 1;
        hm9.m("zj9", "setLocalMedia: %s", up7Var.c);
        this.X = up7Var;
        this.u0 = this.w0.e(up7Var);
        cqc.b(this.C0);
        cqc.b(null);
        if (up7Var.b()) {
            d2(new uj9(this, i3));
            hm9.n("zj9", "setupVideoLocalMedia");
            cqc.b(this.C0);
            if (!((up7Var instanceof j00) && oag.t(((j00) up7Var).u0.s)) && this.B0) {
                d2(new mu1(14));
                hm9.n("zj9", "initVideoLocalMedias");
                rqd rqdVar = new rqd(new q1a(1, new vj9(this, i3)).m(muc.a()).i(ce.a()), new vj9(this, i2), i2);
                e5 e5Var = new e5(i, this);
                iq1 iq1Var = new iq1(ft.e, 2, ft.f);
                Objects.requireNonNull(iq1Var, "observer is null");
                try {
                    rqdVar.k(new cb3(iq1Var, 7, e5Var));
                    this.C0 = iq1Var;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    c37.B(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                hm9.n("zj9", "localMedia instanceof EditAttachLocalMedia -> can't edit video -> hide controls");
                d2(new mu1(13));
            }
        } else if (up7Var.a != 1 || up7Var.d()) {
            d2(new mu1(12));
        } else {
            d2(new uj9(this, i2));
            d2(new uj9(this, 4));
            d2(new uj9(this, 0));
        }
        d2(new uj9(this, 3));
    }

    public final void a2() {
        Set set;
        up7 up7Var = this.X;
        if (up7Var == null) {
            return;
        }
        boolean zB = up7Var.b();
        p4d p4dVar = this.w0;
        if (zB) {
            if (p4dVar.j(this.X)) {
                p4dVar.r(this.X);
                return;
            } else {
                c2();
                return;
            }
        }
        up7 up7Var2 = this.X;
        if (up7Var2.a != 1) {
            p4dVar.r(up7Var2);
            return;
        }
        if (!p4dVar.j(up7Var2)) {
            p4dVar.r(this.X);
            return;
        }
        r4d r4dVarH = p4dVar.h(this.X);
        if (r4dVarH != null) {
            r4dVarH.f = false;
        }
        p4dVar.n();
        if (r4dVarH == null || (set = p4dVar.e) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                ((q96) it.next()).a(r4dVarH);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public final void b2() {
        up7 up7Var = this.X;
        awa awaVar = this.u0;
        p4d p4dVar = this.w0;
        p4dVar.a(up7Var, p4dVar.a.size());
        r4d r4dVarH = p4dVar.h(up7Var);
        if (r4dVarH != null) {
            r4dVarH.c = awaVar;
        }
        p4dVar.b.put(Long.valueOf(up7Var.b), awaVar);
        p4dVar.m(r4dVarH);
    }

    public final void c2() {
        Object next;
        ref refVar = this.t0;
        p4d p4dVar = this.w0;
        if (refVar == null) {
            p4dVar.q(this.X, null);
            return;
        }
        List list = this.Z;
        if (list == null) {
            next = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                try {
                    if (((nqb) next).a == this.t0.a) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            next = null;
        }
        nqb nqbVar = (nqb) next;
        if (nqbVar == null || nqbVar.f) {
            ref refVar2 = this.t0;
            if (refVar2.b == 0.0f && refVar2.c == 1.0f && !refVar2.d) {
                p4dVar.q(this.X, null);
                return;
            }
        }
        p4dVar.q(this.X, this.t0);
    }

    public final void d2(l66 l66Var) {
        pq7 pq7Var = this.o;
        oq7 oq7Var = new oq7();
        oq7Var.a = pq7Var.a;
        oq7Var.b = pq7Var.b;
        oq7Var.c = pq7Var.c;
        oq7Var.d = pq7Var.o;
        oq7Var.e = pq7Var.X;
        oq7Var.f = pq7Var.Y;
        oq7Var.g = pq7Var.Z;
        oq7Var.h = pq7Var.s0;
        oq7Var.i = pq7Var.t0;
        oq7Var.j = pq7Var.u0;
        oq7Var.k = pq7Var.v0;
        oq7Var.l = pq7Var.w0;
        oq7Var.m = pq7Var.x0;
        oq7Var.n = pq7Var.y0;
        oq7Var.o = pq7Var.z0;
        oq7 oq7Var2 = (oq7) l66Var.apply(oq7Var);
        oq7Var2.getClass();
        pq7 pq7Var2 = new pq7(oq7Var2);
        if (pq7Var2.equals(this.o)) {
            return;
        }
        hm9.m("zj9", "updateViewState: %s", this.o);
        this.o = pq7Var2;
        ((dl9) ((kk9) this.b)).A(pq7Var2);
    }

    @Override // defpackage.m4d
    public final void s1(r4d r4dVar) {
        d2(new uj9(this, 0));
        d2(new uj9(this, 4));
    }
}
