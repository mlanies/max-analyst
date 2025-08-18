package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ka2 extends gv4 {
    public static final /* synthetic */ bc7[] E = {new oi9(ka2.class, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, ka2.class, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;")};
    public final h35 A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final long n;
    public final AtomicBoolean o;
    public volatile boolean p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final w4d y;
    public final w4d z;

    public ka2(long j, sx3 sx3Var) {
        super(sx3Var);
        this.n = j;
        this.o = new AtomicBoolean(false);
        neb nebVar = neb.a;
        this.q = nebVar.b();
        je7 je7VarC = nebVar.c();
        this.r = je7VarC;
        this.s = nebVar.d();
        this.t = nebVar.getAccessor().d(zfc.class);
        this.u = nebVar.getAccessor().d(s8g.class);
        this.v = nebVar.getAccessor().d(t12.class);
        this.w = nebVar.getAccessor().d(r12.class);
        this.x = nebVar.getAccessor().d(yfc.class);
        this.y = mqd.D();
        this.z = mqd.D();
        this.A = new h35(y53.M(new sf7(), new kz4()));
        e52 e52VarP = p();
        this.B = e52VarP != null && e52VarP.I();
        e52 e52VarP2 = p();
        this.C = e52VarP2 != null && e52VarP2.d0();
        e52 e52VarP3 = p();
        this.D = e52VarP3 != null && e52VarP3.t();
        od2.L(od2.F(new zn5(new ac(new mqc(new ha2(new t03(((jz2) ((iy2) je7VarC.getValue())).m(j), 11), null, this)), 10, this), new w92(this, null), 5), ((w9a) q()).a()), sx3Var);
    }

    public static final void n(ka2 ka2Var) {
        vxd vxdVarS = j47.S(ka2Var.a, ((w9a) ka2Var.q()).b(), vx3.b, new z92(ka2Var, null));
        ka2Var.z.o1(ka2Var, E[1], vxdVarS);
    }

    public static final wu4 o(ka2 ka2Var, e52 e52Var) {
        ka2Var.getClass();
        String strG = e52Var.g(kk0.c, jk0.a);
        long j = e52Var.b.a;
        e52Var.l0();
        return new wu4(strG, j, e52Var.x0, e52Var.q(), null, e52Var.k(), e52Var.b.r0);
    }

    @Override // defpackage.gv4
    public final void a(int i) {
        j47.T(this.a, ((w9a) q()).a(), null, new x92(i, this, null), 2);
    }

    @Override // defpackage.gv4
    public final void b() {
        bc7[] bc7VarArr = E;
        bc7 bc7Var = bc7VarArr[1];
        w4d w4dVar = this.z;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[1], null);
        bc7 bc7Var2 = bc7VarArr[0];
        w4d w4dVar2 = this.y;
        x77 x77Var2 = (x77) w4dVar2.T0(this, bc7Var2);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        w4dVar2.o1(this, bc7VarArr[0], null);
    }

    @Override // defpackage.gv4
    public final boolean d() {
        return this.p;
    }

    @Override // defpackage.gv4
    public final long e() {
        return this.n;
    }

    @Override // defpackage.gv4
    public final void g(int i) {
        j47.T(this.a, ((w9a) q()).a(), null, new ba2(i, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ca2
            if (r0 == 0) goto L13
            r0 = r9
            ca2 r0 = (defpackage.ca2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ca2 r0 = new ca2
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
            e52 r9 = r6.p()
            if (r9 != 0) goto L3d
            return r3
        L3d:
            a20 r8 = defpackage.nd7.k(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.m
            je7 r6 = r6.w
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.h(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.gv4
    public final e5f i() {
        meb mebVarA;
        e52 e52VarP = p();
        e5f e5fVar = e5f.a;
        if (e52VarP == null) {
            return e5fVar;
        }
        q0e q0eVar = this.b;
        meb mebVar = (meb) q0eVar.getValue();
        if (mebVar != null) {
            mebVarA = meb.a(mebVar, e52VarP.b.b(kk0.c, jk0.a), false, 126);
        } else {
            mebVarA = null;
        }
        q0eVar.setValue(mebVarA);
        return e5fVar;
    }

    @Override // defpackage.gv4
    public final void j() {
        j47.T(this.a, ((w9a) q()).b(), null, new da2(this, null), 2);
    }

    @Override // defpackage.gv4
    public final void k() {
        j47.T(this.a, ((w9a) q()).a(), null, new ea2(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.ia2
            if (r0 == 0) goto L13
            r0 = r11
            ia2 r0 = (defpackage.ia2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ia2 r0 = new ia2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.od2.a0(r11)
            goto La3
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.od2.a0(r11)
            q0e r11 = r10.j
            java.lang.Object r2 = r11.getValue()
            wu4 r2 = (defpackage.wu4) r2
            if (r2 != 0) goto L40
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L40:
            e52 r4 = r10.p()
            if (r4 != 0) goto L49
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L49:
            java.lang.Object r5 = r11.getValue()
            wu4 r5 = (defpackage.wu4) r5
            r6 = 0
            if (r5 == 0) goto L55
            java.lang.String r5 = r5.d
            goto L56
        L55:
            r5 = r6
        L56:
            if (r5 != 0) goto L5a
            java.lang.String r5 = ""
        L5a:
            h35 r7 = r10.A
            r8 = 3
            a73 r5 = r7.a(r8, r5)
            if (r5 != 0) goto L65
            r7 = r3
            goto L66
        L65:
            r7 = 0
        L66:
            java.lang.Object r8 = r11.getValue()
            wu4 r8 = (defpackage.wu4) r8
            if (r8 == 0) goto L75
            r9 = 111(0x6f, float:1.56E-43)
            wu4 r5 = defpackage.wu4.c(r8, r6, r5, r6, r9)
            goto L76
        L75:
            r5 = r6
        L76:
            r11.setValue(r5)
            zu4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            q0e r5 = r10.c
            r5.setValue(r11)
            if (r7 != 0) goto L8b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L8b:
            kke r11 = r10.q()
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            ja2 r5 = new ja2
            r5.<init>(r2, r10, r4, r6)
            r0.Y = r3
            java.lang.Object r10 = defpackage.j47.t0(r11, r5, r0)
            if (r10 != r1) goto La3
            return r1
        La3:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka2.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.gv4
    public final void m(int i, String str) {
        wu4 wu4Var;
        q0e q0eVar = this.j;
        if (i == 131072) {
            wu4 wu4Var2 = (wu4) q0eVar.getValue();
            if (wu4Var2 == null) {
                return;
            }
            q0eVar.m(null, wu4.c(wu4Var2, str, null, null, 103));
            return;
        }
        if (i != 4 || (wu4Var = (wu4) q0eVar.getValue()) == null) {
            return;
        }
        q0eVar.m(null, wu4.c(wu4Var, null, null, str, 95));
    }

    public final e52 p() {
        return (e52) ((jz2) ((iy2) this.r.getValue())).m(this.n).a.getValue();
    }

    public final kke q() {
        return (kke) this.s.getValue();
    }
}
