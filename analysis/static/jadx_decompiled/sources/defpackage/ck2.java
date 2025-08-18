package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ck2 extends pnf implements ad8 {
    public static final /* synthetic */ bc7[] d1 = {new oi9(ck2.class, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, ck2.class, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new oi9(ck2.class, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;"), new oi9(ck2.class, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;")};
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public t29 F0;
    public final Set G0;
    public final Set H0;
    public final AtomicReference I0;
    public final AtomicReference J0;
    public final AtomicReference K0;
    public final AtomicReference L0;
    public final AtomicLong M0;
    public final s35 N0;
    public final s35 O0;
    public final q0e P0;
    public final w7c Q0;
    public final q0e R0;
    public final w7c S0;
    public final q0e T0;
    public final w7c U0;
    public final q0e V0;
    public final w7c W0;
    public final boolean X;
    public final kld X0;
    public final boolean Y;
    public final v7c Y0;
    public final Context Z;
    public final w4d Z0;
    public final w4d a1;
    public final long b;
    public final w4d b1;
    public final String c;
    public final w4d c1;
    public final long o;
    public final r79 s0;
    public final kke t0;
    public final pk u0;
    public final v19 v0;
    public final String w0 = ck2.class.getName();
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public ck2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, long j, String str, long j2, boolean z, boolean z2, Context context, r79 r79Var, kke kkeVar, pk pkVar, v19 v19Var) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = z;
        this.Y = z2;
        this.Z = context;
        this.s0 = r79Var;
        this.t0 = kkeVar;
        this.u0 = pkVar;
        this.v0 = v19Var;
        this.x0 = je7Var;
        this.y0 = je7Var3;
        this.z0 = je7Var4;
        this.A0 = je7Var5;
        this.B0 = je7Var6;
        this.C0 = je7Var7;
        this.D0 = je7Var8;
        this.E0 = je7Var9;
        b10 b10Var = b10.PHOTO;
        b10 b10Var2 = b10.VIDEO;
        this.G0 = bcd.a0("PHOTO", "VIDEO");
        this.H0 = bcd.a0(b10Var, b10Var2);
        this.I0 = new AtomicReference(null);
        this.J0 = new AtomicReference(new bj2(false, false));
        this.K0 = new AtomicReference(null);
        this.L0 = new AtomicReference(null);
        this.M0 = new AtomicLong();
        this.N0 = new s35(0);
        this.O0 = new s35(0);
        q0e q0eVarA = r0e.a(cj2.c);
        this.P0 = q0eVarA;
        this.Q0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(new aj2("", "", "", new zi2(null, false, false, 7)));
        this.R0 = q0eVarA2;
        this.S0 = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(new dj2(null));
        this.T0 = q0eVarA3;
        this.U0 = new w7c(q0eVarA3);
        q0e q0eVarA4 = r0e.a(new ej2((qb8) null, 3));
        this.V0 = q0eVarA4;
        this.W0 = new w7c(q0eVarA4);
        kld kldVarA = lld.a(1, 0, 2);
        this.X0 = kldVarA;
        this.Y0 = new v7c(kldVarA);
        this.Z0 = mqd.D();
        this.a1 = mqd.D();
        this.b1 = mqd.D();
        this.c1 = mqd.D();
        w9a w9aVar = (w9a) kkeVar;
        pnf.n(this, w9aVar.b(), null, new xi2(this, je7Var2, null), 2);
        od2.L(od2.F(new zn5(v19Var.e, new yi2(this, null), 5), w9aVar.b()), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.ck2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.fj2
            if (r0 == 0) goto L16
            r0 = r9
            fj2 r0 = (defpackage.fj2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            fj2 r0 = new fj2
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            defpackage.od2.a0(r9)
            goto L89
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            ck2 r7 = r0.o
            defpackage.od2.a0(r9)
            goto L7c
        L3e:
            defpackage.od2.a0(r9)
            q0e r9 = r7.P0
            java.lang.Object r9 = r9.getValue()
            cj2 r9 = (defpackage.cj2) r9
            java.util.List r9 = r9.a
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L89
            int r2 = r8.size()
            int r9 = r9.size()
            if (r2 == r9) goto L89
            java.lang.String r9 = r7.w0
            java.lang.String r2 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.hm9.n(r9, r2)
            java.lang.Object r8 = defpackage.x53.i0(r8)
            sb8 r8 = (defpackage.sb8) r8
            if (r8 == 0) goto L7f
            long r8 = r8.j()
            r0.o = r7
            r0.Z = r5
            r79 r2 = r7.s0
            java.lang.Object r9 = r2.a(r8, r0)
            if (r9 != r1) goto L7c
            goto L95
        L7c:
            cu8 r9 = (defpackage.cu8) r9
            goto L80
        L7f:
            r9 = r6
        L80:
            if (r9 != 0) goto L8b
            java.lang.String r7 = r7.w0
            java.lang.String r8 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.hm9.n0(r7, r8)
        L89:
            r1 = r3
            goto L95
        L8b:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r7 = r7.F(r9, r0)
            if (r7 != r1) goto L89
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.q(ck2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.ck2 r6, defpackage.yu8 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.r(ck2, yu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.ck2 r10, int r11, java.util.List r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.lj2
            if (r0 == 0) goto L16
            r0 = r13
            lj2 r0 = (defpackage.lj2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            lj2 r0 = new lj2
            r0.<init>(r10, r13)
        L1b:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L43
            if (r2 == r4) goto L38
            if (r2 != r5) goto L30
            defpackage.od2.a0(r13)
            goto Lca
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            sb8 r10 = r0.X
            ck2 r11 = r0.o
            defpackage.od2.a0(r13)
            r13 = r10
            r10 = r11
            goto Lbc
        L43:
            defpackage.od2.a0(r13)
            java.util.concurrent.atomic.AtomicReference r13 = r10.K0
            java.lang.Object r13 = r13.get()
            java.lang.String r13 = (java.lang.String) r13
            q0e r2 = r10.P0
            r6 = -1
            if (r13 == 0) goto L7a
            java.lang.Object r7 = r2.getValue()
            cj2 r7 = (defpackage.cj2) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L60:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L7a
            java.lang.Object r9 = r7.next()
            sb8 r9 = (defpackage.sb8) r9
            java.lang.String r9 = r9.x()
            boolean r9 = defpackage.tpa.f(r9, r13)
            if (r9 == 0) goto L77
            goto L7b
        L77:
            int r8 = r8 + 1
            goto L60
        L7a:
            r8 = r6
        L7b:
            if (r11 < 0) goto L7e
            goto L9d
        L7e:
            if (r8 < 0) goto L9c
            java.lang.Object r11 = r2.getValue()
            cj2 r11 = (defpackage.cj2) r11
            java.util.List r11 = r11.a
            int r11 = r11.size()
            int r13 = r12.size()
            if (r11 >= r13) goto L9a
            int r13 = r12.size()
            int r11 = r11 - r8
            int r11 = r13 - r11
            goto L9d
        L9a:
            r11 = r8
            goto L9d
        L9c:
            r11 = r6
        L9d:
            if (r11 < 0) goto Lca
            int r13 = r12.size()
            if (r11 >= r13) goto Lca
            java.lang.Object r13 = r12.get(r11)
            sb8 r13 = (defpackage.sb8) r13
            int r12 = r12.size()
            r0.o = r10
            r0.X = r13
            r0.s0 = r4
            java.lang.Object r11 = r10.D(r11, r13, r12, r0)
            if (r11 != r1) goto Lbc
            goto Lcb
        Lbc:
            r11 = 0
            r0.o = r11
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r10 = r10.C(r13, r0)
            if (r10 != r1) goto Lca
            goto Lcb
        Lca:
            r1 = r3
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.s(ck2, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.ck2 r10, defpackage.cu8 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.nj2
            if (r0 == 0) goto L16
            r0 = r12
            nj2 r0 = (defpackage.nj2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            nj2 r0 = new nj2
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L59
            if (r2 == r5) goto L4e
            if (r2 == r6) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            defpackage.od2.a0(r12)
            goto Lbc
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r0.X
            sb8 r10 = (defpackage.sb8) r10
            ck2 r11 = r0.o
            defpackage.od2.a0(r12)
            goto Laf
        L47:
            ck2 r10 = r0.o
            defpackage.od2.a0(r12)
        L4c:
            r11 = r10
            goto L86
        L4e:
            java.lang.Object r10 = r0.X
            r11 = r10
            cu8 r11 = (defpackage.cu8) r11
            ck2 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L6f
        L59:
            defpackage.od2.a0(r12)
            iy2 r12 = r10.w()
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            long r8 = r10.b
            java.lang.Object r12 = r12.d(r8, r0)
            if (r12 != r1) goto L6f
            goto Lbe
        L6f:
            e52 r12 = (defpackage.e52) r12
            je7 r2 = r10.y0
            java.lang.Object r2 = r2.getValue()
            u9a r2 = (defpackage.u9a) r2
            r0.o = r10
            r0.X = r7
            r0.s0 = r6
            java.lang.Object r12 = r2.j(r12, r11, r0)
            if (r12 != r1) goto L4c
            goto Lbe
        L86:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            java.util.List r10 = defpackage.tfg.B(r12)
            q0e r12 = r11.P0
            cj2 r2 = new cj2
            r5 = 0
            r2.<init>(r10, r6, r5)
            r12.m(r7, r2)
            java.lang.Object r12 = defpackage.x53.g0(r10)
            sb8 r12 = (defpackage.sb8) r12
            int r10 = r10.size()
            r0.o = r11
            r0.X = r12
            r0.s0 = r4
            java.lang.Object r10 = r11.D(r5, r12, r10, r0)
            if (r10 != r1) goto Lae
            goto Lbe
        Lae:
            r10 = r12
        Laf:
            r0.o = r7
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r10 = r11.C(r10, r0)
            if (r10 != r1) goto Lbc
            goto Lbe
        Lbc:
            e5f r1 = defpackage.e5f.a
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.t(ck2, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean u(ck2 ck2Var, zc8 zc8Var) {
        if (zc8Var != null) {
            if (zc8Var.d == ck2Var.b) {
                Set set = zc8Var.c;
                ArrayList arrayList = new ArrayList(z53.S(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b10) it.next()).toString());
                }
                if (x53.B0(arrayList).containsAll(ck2Var.G0)) {
                    return true;
                }
            }
        } else {
            ck2Var.getClass();
        }
        return false;
    }

    public final void A(long j, String str) {
        sb8 sb8VarX = x();
        if (sb8VarX != null && sb8VarX.j() == j && tpa.f(sb8VarX.x(), str)) {
            pnf.o(this.N0, new j35(4, false));
        }
    }

    public final void B(long j, String str) {
        sb8 sb8VarX = x();
        if (sb8VarX != null && sb8VarX.j() == j && tpa.f(sb8VarX.x(), str)) {
            pnf.o(this.N0, new j35(1, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(defpackage.sb8 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.C(sb8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(int r11, defpackage.sb8 r12, int r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.D(int, sb8, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(int i) {
        vxd vxdVarN = pnf.n(this, null, vx3.b, new pj2(this, i, null), 1);
        this.b1.o1(this, d1[2], vxdVarN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.cu8 r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck2.F(cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.ad8
    public final zc8 d() {
        zc8 zc8Var = (zc8) this.I0.get();
        return zc8Var == null ? new zc8(0L, 0L, this.H0, this.b) : zc8Var;
    }

    @Override // defpackage.pnf
    public final void p() {
        t29 t29Var = this.F0;
        if (t29Var != null) {
            ((bx) t29Var).h();
        }
        v19 v19Var = this.v0;
        v19Var.a.f(v19Var);
    }

    public final void v(long j, String str) {
        String str2 = this.w0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, "Media viewer. Call fetch video msg:" + j + ", attach:" + str, null);
        }
        this.Z0.o1(this, d1[0], j47.S(this.a, ((w9a) this.t0).b(), vx3.b, new gj2(this, j, str, null)));
    }

    public final iy2 w() {
        return (iy2) this.x0.getValue();
    }

    public final sb8 x() {
        Object next;
        String str = (String) this.K0.get();
        Iterator it = ((cj2) this.P0.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tpa.f(((sb8) next).x(), str)) {
                break;
            }
        }
        return (sb8) next;
    }

    public final sb8 y(long j, String str) {
        Object next;
        Iterator it = ((cj2) this.Q0.a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            sb8 sb8Var = (sb8) next;
            if (sb8Var.j() == j && str.equals(sb8Var.x())) {
                break;
            }
        }
        return (sb8) next;
    }

    public final void z(long j, String str) {
        sb8 sb8VarX = x();
        if (sb8VarX != null && sb8VarX.j() == j && tpa.f(sb8VarX.x(), str)) {
            pnf.o(this.N0, new j35(5, false));
        }
    }
}
