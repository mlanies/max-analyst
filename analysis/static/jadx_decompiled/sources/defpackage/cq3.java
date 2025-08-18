package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cq3 extends pab {
    public final boolean f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public m83 m;
    public final xs2 n;
    public final je7 o;
    public final je7 p;
    public final sj4 q;
    public final je7 r;
    public final q0e s;

    public cq3(long j, sx3 sx3Var, boolean z) {
        super(j);
        this.f = z;
        xcb xcbVar = xcb.a;
        je7 je7VarE = xcbVar.e();
        this.g = je7VarE;
        this.h = xcbVar.c();
        khe kheVarD = xcbVar.getAccessor().d(y7b.class);
        this.i = kheVarD;
        this.j = xcbVar.getAccessor().d(yj3.class);
        this.k = xcbVar.getAccessor().d(ck3.class);
        this.l = xcbVar.getAccessor().d(qq3.class);
        je7 je7VarF = xcbVar.f();
        this.n = new xs2();
        this.o = tu0.r(3, new zf3(6));
        this.p = tu0.r(3, new zf3(7));
        sj4 sj4VarA = ((ecb) xcbVar.getAccessor().c(ecb.class)).a(j);
        this.q = sj4VarA;
        this.r = xcbVar.getAccessor().d(xb9.class);
        q0e q0eVarA = r0e.a(nz4.a);
        this.s = q0eVarA;
        m83 m83Var = new m83(j);
        this.m = m83Var;
        od2.L(new zn5(m83Var.i, new yp3(this, null), 5), sx3Var);
        od2.L(od2.F(new zn5(od2.t(new t03(od2.D(((ds3) je7VarE.getValue()).c(j), new aq3(this, j, null)), 11), new w7c(((w7b) ((y7b) kheVarD.getValue()).a.getValue()).d().c(j)), new w7c(q0eVarA), new zp3(this, (Continuation) null)), new lq0(2, this, cq3.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 13), 5), ((w9a) ((kke) je7VarF.getValue())).a()), sx3Var);
        od2.L(od2.F(new zn5(new v7c(sj4VarA.d), new lq0(2, this, cq3.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 14), 5), ((w9a) ((kke) je7VarF.getValue())).a()), sx3Var);
    }

    @Override // defpackage.pab
    public final void C(Continuation continuation) {
        ((qq3) this.l.getValue()).a(this.a);
    }

    public final kpa D(uj3 uj3Var) {
        List listD;
        k92 k92Var;
        hm9.n(cq3.class.getName(), "buildAppBarAndItems " + uj3Var);
        tab tabVar = new tab(uj3Var.n(), uj3Var.c(), uj3Var.r(), uj3Var.p(kk0.b), uj3Var.d(), uj3Var.m(), null, new iqe(((w7b) ((y7b) this.i.getValue()).a.getValue()).b(uj3Var)), new iqe(bre.c(uj3Var.j())), uj3Var.s() || uj3Var.k() != 0, uj3Var.u(), 64);
        n1d n1dVar = (n1d) this.c.getValue();
        je7 je7Var = this.h;
        jz2 jz2Var = (jz2) ((iy2) je7Var.getValue());
        long j = this.a;
        e52 e52VarQ = jz2Var.q(j);
        n1dVar.getClass();
        kl7 kl7VarL = j1e.l();
        n1dVar.b(kl7VarL, uj3Var, e52VarQ);
        ida idaVarA = n1dVar.a();
        CharSequence charSequenceL = uj3Var.l(n1dVar.a());
        idaVarA.getClass();
        CharSequence charSequenceA = idaVarA.a(charSequenceL, false, true, false, true, null, true);
        if (charSequenceA != null && charSequenceA.length() != 0) {
            kl7VarL.add(new wib(charSequenceA, new eqe(uj3Var.t() ? yea.F : yea.G)));
        }
        long jO = uj3Var.o();
        lib libVar = null;
        if (jO > 0) {
            zua zuaVar = (zua) n1dVar.b.getValue();
            String strValueOf = String.valueOf(jO);
            je7 je7Var2 = n1dVar.c;
            String strA = zqe.a(zuaVar, strValueOf, ((t33) ((q33) je7Var2.getValue())).g.getString("app.location.country.code", null), ((hyc) ((q33) je7Var2.getValue())).r());
            if (strA != null && strA.length() > 1) {
                kl7VarL.add(new ajb(strA));
            }
        }
        kl7VarL.add(new oib());
        kl7 kl7VarD = j1e.d(kl7VarL);
        mv0 mv0Var = (mv0) this.b.getValue();
        e52 e52VarQ2 = ((jz2) ((iy2) je7Var.getValue())).q(j);
        mv0Var.getClass();
        if (uj3Var.s()) {
            listD = y53.M(new l7a(wea.p1, Integer.valueOf(yea.M), (Integer) null, Integer.valueOf(woc.h1), (Integer) null, 52), mv0.c());
        } else {
            kl7 kl7VarL2 = j1e.l();
            if (!this.f) {
                kl7VarL2.add(mv0.d());
            }
            if (!uj3Var.t() && !uj3Var.w() && uj3Var.k() == 0) {
                kl7VarL2.add(new l7a(wea.l, Integer.valueOf(yea.k), (Integer) null, Integer.valueOf(woc.c0), (Integer) null, 52));
                kl7VarL2.add(new l7a(wea.q1, Integer.valueOf(yea.N), (Integer) null, Integer.valueOf(woc.n2), (Integer) null, 52));
            }
            if (((e52VarQ2 == null || (k92Var = e52VarQ2.b) == null) ? null : k92Var.c) != i92.o && e52VarQ2 != null) {
                kl7VarL2.add(e52VarQ2.V((q33) mv0Var.a.getValue()) ? mv0.a() : mv0.b());
            }
            listD = j1e.d(kl7VarL2);
        }
        zcb zcbVar = (zcb) this.o.getValue();
        zcbVar.getClass();
        kl7 kl7VarL3 = j1e.l();
        kl7VarL3.add((l7a) zcbVar.a.getValue());
        kl7VarL3.add((l7a) zcbVar.b.getValue());
        if (!uj3Var.s()) {
            kl7VarL3.add((l7a) zcbVar.e.getValue());
        }
        kl7VarL3.add((l7a) zcbVar.f.getValue());
        kl7 kl7VarD2 = j1e.d(kl7VarL3);
        if (!uj3Var.c() && !uj3Var.s() && uj3Var.k() == 0) {
            libVar = new lib(yea.h, null, 14);
        }
        kl7 kl7VarL4 = j1e.l();
        if ((!listD.isEmpty()) || (!kl7VarD2.isEmpty())) {
            kl7VarL4.add(new kib(listD, kl7VarD2, true));
        }
        if (libVar != null) {
            kl7VarL4.add(libVar);
        }
        kl7VarL4.addAll(kl7VarD);
        return new kpa(tabVar, j1e.d(kl7VarL4));
    }

    public final uj3 E() {
        return (uj3) ((ds3) this.g.getValue()).c(this.a).a.getValue();
    }

    @Override // defpackage.pab
    public final void a(Continuation continuation) {
        ((ck3) this.k.getValue()).a(this.a);
    }

    @Override // defpackage.pab
    public final void d() {
        sj4 sj4Var = this.q;
        sj4Var.b.f(sj4Var);
        m83 m83Var = this.m;
        if (m83Var != null) {
            d83 d83Var = (d83) m83Var.e.getValue();
            d83Var.a.f(d83Var);
            bc7[] bc7VarArr = m83.m;
            bc7 bc7Var = bc7VarArr[0];
            w4d w4dVar = m83Var.l;
            x77 x77Var = (x77) w4dVar.T0(m83Var, bc7Var);
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            w4dVar.o1(m83Var, bc7VarArr[0], null);
        }
        this.m = null;
    }

    @Override // defpackage.pab
    public final ka1 e() {
        return new jkb(this.a, hdb.X);
    }

    @Override // defpackage.pab
    public final String h() {
        uj3 uj3VarE = E();
        if (uj3VarE != null) {
            return uj3VarE.g();
        }
        return null;
    }

    @Override // defpackage.pab
    public final Long i() {
        e52 e52VarQ = ((jz2) ((iy2) this.h.getValue())).q(this.a);
        if (e52VarQ != null) {
            return Long.valueOf(e52VarQ.a);
        }
        return null;
    }

    @Override // defpackage.pab
    public final Long j() {
        e52 e52VarQ = ((jz2) ((iy2) this.h.getValue())).q(this.a);
        if (e52VarQ != null) {
            return Long.valueOf(e52VarQ.b.a);
        }
        return null;
    }

    @Override // defpackage.pab
    public final int k() {
        return 2;
    }

    @Override // defpackage.pab
    public final hdb l() {
        return hdb.X;
    }

    @Override // defpackage.pab
    public final Object n(Continuation continuation) {
        return ((jz2) ((iy2) this.h.getValue())).u(this.a, continuation);
    }

    @Override // defpackage.pab
    public final String o() {
        uj3 uj3VarE = E();
        if (uj3VarE != null) {
            return Long.valueOf(uj3VarE.o()).toString();
        }
        return null;
    }

    @Override // defpackage.pab
    public final boolean r() {
        return true;
    }

    @Override // defpackage.pab
    public final void s() {
        m83 m83Var = this.m;
        if (m83Var != null) {
            vxd vxdVarT = j47.T(m83Var.k, null, vx3.b, new k83(m83Var, null), 1);
            m83Var.l.o1(m83Var, m83.m[0], vxdVarT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bq3
            if (r0 == 0) goto L13
            r0 = r5
            bq3 r0 = (defpackage.bq3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            bq3 r0 = new bq3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r5)
            je7 r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            yj3 r5 = (defpackage.yj3) r5
            r0.Y = r3
            long r2 = r4.a
            r5.a(r2)
            e5f r4 = defpackage.e5f.a
            if (r4 != r1) goto L46
            return r1
        L46:
            zlb r4 = new zlb
            int r5 = defpackage.woc.m
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            int r5 = defpackage.yea.E0
            eqe r1 = new eqe
            r1.<init>(r5)
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pab
    public final boolean w() {
        m83 m83Var = this.m;
        if (m83Var == null) {
            return false;
        }
        u83 u83Var = (u83) m83Var.h.getValue();
        p83 p83Var = u83Var instanceof p83 ? (p83) u83Var : null;
        return p83Var != null && p83Var.b;
    }

    @Override // defpackage.pab
    public final c64 x() {
        dp3 dp3Var = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=contact");
    }

    @Override // defpackage.pab
    public final amb y() {
        tab tabVar;
        CharSequence charSequence;
        mab mabVar = (mab) this.e.a.getValue();
        if (mabVar == null || (tabVar = mabVar.a) == null || (charSequence = tabVar.e) == null) {
            return null;
        }
        return ((gcb) this.p.getValue()).a(2, charSequence, false);
    }
}
