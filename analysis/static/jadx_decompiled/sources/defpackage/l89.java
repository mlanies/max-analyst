package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l89 {
    public static final /* synthetic */ bc7[] p;
    public final v69 a;
    public final nx3 b;
    public final sx3 c;
    public final j0e d;
    public final j0e e;
    public final a66 f;
    public final m56 g;
    public final jc6 h;
    public final String i;
    public final je7 j;
    public final w4d k;
    public final AtomicReference l;
    public final q0e m;
    public final mn5 n;
    public final wwc o;

    static {
        oi9 oi9Var = new oi9(l89.class, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        p = new bc7[]{oi9Var};
    }

    public l89(v69 v69Var, nx3 nx3Var, sx3 sx3Var, j0e j0eVar, j0e j0eVar2, vw vwVar, wz7 wz7Var) {
        o19 o19Var = o19.a;
        kke kkeVar = (kke) o19Var.getAccessor().c(kke.class);
        khe kheVarD = o19Var.getAccessor().d(ome.class);
        khe kheVarD2 = o19Var.getAccessor().d(iy2.class);
        khe kheVarD3 = o19Var.getAccessor().d(r79.class);
        jc6 jc6Var = new jc6();
        jc6Var.a = kkeVar;
        jc6Var.b = jc6.class.getName();
        jc6Var.c = kheVarD;
        jc6Var.o = kheVarD2;
        jc6Var.X = kheVarD3;
        khe kheVarD4 = o19Var.getAccessor().d(r79.class);
        this.a = v69Var;
        this.b = nx3Var;
        this.c = sx3Var;
        this.d = j0eVar;
        this.e = j0eVar2;
        this.f = vwVar;
        this.g = wz7Var;
        this.h = jc6Var;
        this.i = l89.class.getName();
        this.j = kheVarD4;
        this.k = mqd.D();
        this.l = new AtomicReference(null);
        q0e q0eVarA = r0e.a(bxc.e);
        this.m = q0eVarA;
        this.n = od2.u(new w7c(q0eVarA), 60L);
        this.o = new wwc();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.l89 r10, long r11, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.a89
            if (r0 == 0) goto L13
            r0 = r13
            a89 r0 = (defpackage.a89) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            a89 r0 = new a89
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            long r11 = r0.X
            l89 r10 = r0.o
            defpackage.od2.a0(r13)
            goto L91
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            defpackage.od2.a0(r13)
            j0e r13 = r10.e
            java.lang.Object r13 = r13.getValue()
            l29 r13 = (defpackage.l29) r13
            one.me.messages.list.loader.MessageModel r13 = r13.d(r11)
            java.lang.String r2 = r10.i
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L4c
            goto L65
        L4c:
            boolean r7 = r6.c()
            if (r7 == 0) goto L65
            us7 r7 = defpackage.us7.X
            if (r13 == 0) goto L5b
            java.lang.String r8 = r13.m()
            goto L5c
        L5b:
            r8 = r4
        L5c:
            java.lang.String r9 = "loadIfNeedAndScrollToMessage="
            java.lang.String r8 = defpackage.wg0.i(r9, r8)
            r6.d(r7, r2, r8, r4)
        L65:
            if (r13 == 0) goto L7c
            java.util.concurrent.atomic.AtomicReference r11 = r10.l
            oe2 r12 = new oe2
            r0 = 7
            r12.<init>(r0)
            r11.updateAndGet(r12)
            wwc r10 = r10.o
            long r11 = r13.c
            r13 = 0
            r0 = 6
            defpackage.wwc.j(r10, r11, r13, r0)
            goto Lad
        L7c:
            je7 r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            r79 r13 = (defpackage.r79) r13
            r0.o = r10
            r0.X = r11
            r0.s0 = r5
            java.lang.Object r13 = r13.a(r11, r0)
            if (r13 != r1) goto L91
            goto Lc9
        L91:
            cu8 r13 = (defpackage.cu8) r13
            if (r13 != 0) goto Laf
            java.lang.String r10 = r10.i
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto L9c
            goto Lad
        L9c:
            boolean r0 = r13.c()
            if (r0 == 0) goto Lad
            us7 r0 = defpackage.us7.s0
            java.lang.String r1 = "Trying to scroll for non-existing messageId="
            java.lang.String r11 = defpackage.ey8.h(r11, r1)
            r13.d(r0, r10, r11, r4)
        Lad:
            r1 = r3
            goto Lc9
        Laf:
            java.util.concurrent.atomic.AtomicReference r0 = r10.l
            v79 r1 = new v79
            r2 = 0
            r1.<init>(r11, r2)
            r0.updateAndGet(r1)
            m56 r10 = r10.g
            long r11 = r13.k()
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r10.invoke(r13)
            goto Lad
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.a(l89, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.l89 r16, final long r17, long r19, boolean r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.d(l89, long, long, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.l29 r27, defpackage.e52 r28) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.b(l29, e52):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.e52 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.c(e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.e52 r13, defpackage.l29 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.j89
            if (r0 == 0) goto L13
            r0 = r15
            j89 r0 = (defpackage.j89) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            j89 r0 = new j89
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            l29 r14 = r0.Y
            e52 r13 = r0.X
            l89 r12 = r0.o
            defpackage.od2.a0(r15)
            goto Lc4
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            defpackage.od2.a0(r15)
            java.util.List r15 = r14.a
            int r15 = r15.size()
            r0.o = r12
            r0.X = r13
            r0.Y = r14
            r0.t0 = r4
            q0e r0 = r12.m
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            bxc r5 = (defpackage.bxc) r5
            k92 r2 = r13.b
            int r6 = r2.m
            boolean r8 = r13.B()
            q0e r2 = r12.m
            java.lang.Object r2 = r2.getValue()
            bxc r2 = (defpackage.bxc) r2
            boolean r7 = r2.b
            r9 = 0
            r10 = 8
            bxc r2 = defpackage.bxc.a(r5, r6, r7, r8, r9, r10)
            r5 = 0
            r0.m(r5, r2)
            java.lang.String r0 = r12.i
            ir6 r2 = defpackage.hm9.m
            r6 = 0
            if (r2 != 0) goto L77
            goto La3
        L77:
            boolean r7 = r2.c()
            if (r7 == 0) goto La3
            us7 r7 = defpackage.us7.X
            q0e r8 = r12.m
            java.lang.Object r8 = r8.getValue()
            if (r15 == 0) goto L89
            r9 = r4
            goto L8a
        L89:
            r9 = r6
        L8a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Update scroll btn, state="
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = ", hasMessages:"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            r2.d(r7, r0, r8, r5)
        La3:
            k92 r0 = r13.b
            java.lang.String r0 = r0.m0
            if (r0 == 0) goto Laf
            int r0 = r0.length()
            if (r0 != 0) goto Lb0
        Laf:
            r6 = r4
        Lb0:
            r0 = r6 ^ 1
            if (r0 == 0) goto Lc1
            if (r15 == 0) goto Lc1
            sx3 r15 = r12.c
            k89 r0 = new k89
            r0.<init>(r13, r12, r5)
            r2 = 3
            defpackage.j47.T(r15, r5, r5, r0, r2)
        Lc1:
            if (r3 != r1) goto Lc4
            return r1
        Lc4:
            r12.b(r14, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l89.e(e52, l29, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(vxd vxdVar) {
        this.k.o1(this, p[0], vxdVar);
    }
}
