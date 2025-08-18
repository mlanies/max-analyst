package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cn2 extends pab {
    public final y7g f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final String k;
    public final je7 l;
    public final khe m;
    public final khe n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final AtomicLong t;

    public cn2(long j, sx3 sx3Var, y7g y7gVar) {
        super(j);
        this.f = y7gVar;
        xcb xcbVar = xcb.a;
        je7 je7VarC = xcbVar.c();
        this.g = je7VarC;
        this.h = xcbVar.e();
        je7 je7VarF = xcbVar.f();
        this.i = je7VarF;
        this.j = xcbVar.g();
        xcbVar.d();
        this.k = cn2.class.getName();
        this.l = xcbVar.getAccessor().d(fl7.class);
        this.m = new khe(new m52(22));
        this.n = new khe(new m52(23));
        this.o = xcbVar.getAccessor().d(r12.class);
        this.p = xcbVar.b();
        this.q = tu0.r(3, new m52(24));
        this.r = tu0.r(3, new m52(25));
        this.s = xcbVar.getAccessor().d(c97.class);
        this.t = new AtomicLong();
        od2.L(od2.F(new zn5(new t03(new ac(new mqc(new bn2(new t03(((jz2) ((iy2) je7VarC.getValue())).m(j), 11), null, sx3Var, this)), 12, this), 11), new lq0(2, this, cn2.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 8), 5), ((w9a) ((kke) je7VarF.getValue())).a()), sx3Var);
    }

    @Override // defpackage.pab
    public final void C(Continuation continuation) {
    }

    public final e52 D() {
        return (e52) ((jz2) ((iy2) this.g.getValue())).m(this.a).a.getValue();
    }

    @Override // defpackage.pab
    public final void a(Continuation continuation) {
    }

    @Override // defpackage.pab
    public final boolean b() {
        e52 e52VarD = D();
        if (e52VarD != null) {
            return e52VarD.a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.vm2
            if (r0 == 0) goto L13
            r0 = r9
            vm2 r0 = (defpackage.vm2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            vm2 r0 = new vm2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.util.concurrent.atomic.AtomicLong r6 = r0.o
            defpackage.od2.a0(r9)
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.od2.a0(r9)
            e52 r9 = r6.D()
            if (r9 != 0) goto L3d
            return r3
        L3d:
            a20 r8 = defpackage.nd7.k(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.t
            je7 r6 = r6.o
            java.lang.Object r6 = r6.getValue()
            r12 r6 = (defpackage.r12) r6
            r0.o = r2
            r0.Z = r4
            long r4 = r9.a
            java.lang.Long r9 = r6.a(r4, r7, r8)
            if (r9 != r1) goto L58
            return r1
        L58:
            r6 = r2
        L59:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r6.set(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn2.c(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pab
    public final void d() {
    }

    @Override // defpackage.pab
    public final ka1 e() {
        return new jkb(this.a, hdb.c);
    }

    @Override // defpackage.pab
    public final long g() {
        return this.t.get();
    }

    @Override // defpackage.pab
    public final String h() {
        k92 k92Var;
        e52 e52VarD = D();
        if (e52VarD == null || (k92Var = e52VarD.b) == null) {
            return null;
        }
        return k92Var.I;
    }

    @Override // defpackage.pab
    public final Long i() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.pab
    public final Long j() {
        e52 e52VarD = D();
        if (e52VarD != null) {
            return Long.valueOf(e52VarD.b.a);
        }
        return null;
    }

    @Override // defpackage.pab
    public final int k() {
        e52 e52VarD = D();
        return (e52VarD == null || !e52VarD.I()) ? 1 : 3;
    }

    @Override // defpackage.pab
    public final hdb l() {
        return hdb.c;
    }

    @Override // defpackage.pab
    public final long m() {
        return this.a;
    }

    @Override // defpackage.pab
    public final Object n(Continuation continuation) {
        return D();
    }

    @Override // defpackage.pab
    public final boolean p() {
        e52 e52VarD = D();
        return e52VarD != null && e52VarD.I();
    }

    @Override // defpackage.pab
    public final boolean q() {
        e52 e52VarD = D();
        return e52VarD != null && e52VarD.d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.wm2
            if (r0 == 0) goto L13
            r0 = r7
            wm2 r0 = (defpackage.wm2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wm2 r0 = new wm2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            defpackage.od2.a0(r7)
            goto L76
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.od2.a0(r7)
            goto L72
        L37:
            defpackage.od2.a0(r7)
            e52 r7 = r6.D()
            if (r7 == 0) goto L47
            boolean r7 = r7.S()
            if (r7 != r5) goto L47
            goto L53
        L47:
            e52 r7 = r6.D()
            if (r7 == 0) goto L73
            boolean r7 = r7.b()
            if (r7 != r5) goto L73
        L53:
            e52 r7 = r6.D()
            if (r7 == 0) goto L60
            k92 r7 = r7.b
            if (r7 == 0) goto L60
            java.lang.String r7 = r7.I
            goto L61
        L60:
            r7 = r4
        L61:
            je7 r6 = r6.s
            java.lang.Object r6 = r6.getValue()
            c97 r6 = (defpackage.c97) r6
            r0.Y = r5
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            return r4
        L73:
            r0.Y = r3
            r7 = r4
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn2.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pab
    public final e5f u() {
        e52 e52VarD = D();
        mab mabVar = (mab) this.e.a.getValue();
        e5f e5fVar = e5f.a;
        if (e52VarD == null || mabVar == null) {
            return e5fVar;
        }
        List listH = e52VarD.h();
        String strG = e52VarD.g(kk0.b, jk0.a);
        tab tabVar = mabVar.a;
        f(mab.a(mabVar, new tab(tabVar.a, tabVar.b, listH, strG, tabVar.e, tabVar.f, tabVar.g, tabVar.h, tabVar.i, tabVar.j, tabVar.k), null, 6));
        return e5fVar;
    }

    @Override // defpackage.pab
    public final Object v(long j, boolean z, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) ((kke) this.i.getValue())).b(), new xm2(this, j, z, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    @Override // defpackage.pab
    public final c64 x() {
        dp3 dp3Var = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    @Override // defpackage.pab
    public final amb y() {
        tab tabVar;
        CharSequence charSequence;
        mab mabVar = (mab) this.e.a.getValue();
        if (mabVar == null || (tabVar = mabVar.a) == null || (charSequence = tabVar.e) == null) {
            return null;
        }
        int iK = k();
        e52 e52VarD = D();
        je7 je7Var = this.r;
        if (e52VarD == null || !e52VarD.c()) {
            gcb gcbVar = (gcb) je7Var.getValue();
            e52 e52VarD2 = D();
            return gcbVar.a(iK, charSequence, e52VarD2 != null && e52VarD2.b0());
        }
        gcb gcbVar2 = (gcb) je7Var.getValue();
        gcbVar2.getClass();
        int iS = au1.s(iK);
        if (iS == 0) {
            gqe gqeVar = new gqe(yea.p1, ys.m0(new Object[]{charSequence}));
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mg3(wea.Q, new eqe(yea.m1), 1, false));
            kl7VarL.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
            return new vlb(gqeVar, null, j1e.d(kl7VarL), null);
        }
        if (iS == 1) {
            return gcbVar2.c();
        }
        if (iS != 2) {
            if (iS == 3) {
                return gcbVar2.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        gqe gqeVar2 = new gqe(yea.l1, ys.m0(new Object[]{charSequence}));
        eqe eqeVar = new eqe(yea.k1);
        kl7 kl7VarL2 = j1e.l();
        kl7VarL2.add(new mg3(wea.Q, new eqe(yea.m1), 1, false));
        kl7VarL2.add(new mg3(wea.y, new eqe(yea.n1), 3, false));
        return new vlb(gqeVar2, eqeVar, j1e.d(kl7VarL2), null);
    }

    @Override // defpackage.pab
    public final amb z(long j) {
        String strD;
        uj3 uj3Var = (uj3) ((ds3) this.h.getValue()).c(j).a.getValue();
        if (uj3Var == null || (strD = uj3Var.d()) == null) {
            return null;
        }
        gcb gcbVar = (gcb) this.r.getValue();
        int iK = k();
        gcbVar.getClass();
        int iS = au1.s(iK);
        if (iS == 0) {
            return new vlb(new gqe(yea.l2, ys.m0(new Object[]{strD})), null, y53.M(new mg3(wea.B0, new eqe(yea.f2), 1, false), new mg3(wea.D0, new eqe(yea.h2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:participant_id_for_action", Long.valueOf(j))));
        }
        if (iS == 1 || iS == 2 || iS == 3) {
            return gcbVar.c();
        }
        throw new NoWhenBranchMatchedException();
    }
}
