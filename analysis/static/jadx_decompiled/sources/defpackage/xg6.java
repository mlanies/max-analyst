package defpackage;

/* loaded from: classes2.dex */
public final class xg6 {
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final j0e a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final q0e e;
    public final w7c f;
    public final kld g;
    public final v7c h;

    static {
        int i2 = ft4.o;
        i = z7.R(5, kt4.SECONDS);
    }

    public xg6(sx3 sx3Var, kke kkeVar, j0e j0eVar, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = j0eVar;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var;
        q0e q0eVarA = r0e.a(zg6.a);
        this.e = q0eVarA;
        this.f = new w7c(q0eVarA);
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.g = kldVarB;
        this.h = new v7c(kldVarB);
        od2.L(od2.F(new zn5(new j31(new t03(j0eVar, 11), ((wr1) ((kr1) je7Var2.getValue())).I, sg6.s0, 4), new vw(2, this, xg6.class, "handleChat", "handleChat(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 21), 5), ((w9a) kkeVar).b()), sx3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xg6 r9, defpackage.kpa r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.tg6
            if (r0 == 0) goto L16
            r0 = r11
            tg6 r0 = (defpackage.tg6) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t0 = r1
            goto L1b
        L16:
            tg6 r0 = new tg6
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            aqe r9 = r0.Y
            java.lang.String r10 = r0.X
            q0e r0 = r0.o
            defpackage.od2.a0(r11)
            goto Laf
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.a
            e52 r11 = (defpackage.e52) r11
            java.lang.Object r10 = r10.b
            d04 r10 = (defpackage.d04) r10
            k10 r2 = r11.r()
            java.lang.String r10 = r10.c
            je7 r4 = r9.b
            java.lang.Object r4 = r4.getValue()
            kr1 r4 = (defpackage.kr1) r4
            wr1 r4 = (defpackage.wr1) r4
            boolean r4 = r4.p()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L6b
            if (r2 == 0) goto L61
            java.lang.String r4 = r2.a
            goto L62
        L61:
            r4 = r6
        L62:
            boolean r10 = defpackage.tpa.f(r10, r4)
            if (r10 != 0) goto L69
            goto L6b
        L69:
            r10 = r5
            goto L6c
        L6b:
            r10 = r3
        L6c:
            k92 r4 = r11.b
            if (r4 == 0) goto L81
            k10 r4 = r4.T
            if (r4 == 0) goto L81
            java.lang.String r7 = r4.c
            boolean r7 = defpackage.oag.u(r7)
            if (r7 == 0) goto L81
            int r4 = r4.d
            if (r4 <= 0) goto L81
            r5 = r3
        L81:
            q0e r4 = r9.e
            if (r5 == 0) goto Lba
            boolean r11 = r11.M()
            if (r11 != 0) goto Lba
            if (r2 == 0) goto Lba
            if (r10 == 0) goto Lba
            int r10 = defpackage.nea.a
            aqe r11 = new aqe
            int r5 = r2.d
            r11.<init>(r10, r5)
            r0.o = r4
            java.lang.String r10 = r2.a
            r0.X = r10
            r0.Y = r11
            r0.t0 = r3
            java.util.List r2 = r2.e
            java.io.Serializable r9 = r9.b(r2, r0)
            if (r9 != r1) goto Lab
            goto Lc1
        Lab:
            r0 = r4
            r8 = r11
            r11 = r9
            r9 = r8
        Laf:
            java.util.List r11 = (java.util.List) r11
            yg6 r1 = new yg6
            r1.<init>(r10, r9, r11)
            r0.setValue(r1)
            goto Lbf
        Lba:
            zg6 r9 = defpackage.zg6.a
            r4.m(r6, r9)
        Lbf:
            e5f r1 = defpackage.e5f.a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg6.a(xg6, kpa, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.util.List r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.vg6
            if (r0 == 0) goto L13
            r0 = r12
            vg6 r0 = (defpackage.vg6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vg6 r0 = new vg6
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            nz4 r3 = defpackage.nz4.a
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.od2.a0(r12)
            goto L97
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.od2.a0(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L3d
            return r3
        L3d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r11, r2)
            r12.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L4c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L6c
            java.lang.Object r7 = r2.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            je7 r9 = r10.d
            java.lang.Object r9 = r9.getValue()
            ds3 r9 = (defpackage.ds3) r9
            w7c r7 = r9.c(r7)
            r12.add(r7)
            goto L4c
        L6c:
            java.util.List r12 = defpackage.x53.D0(r12)
            mn5[] r2 = new defpackage.mn5[r5]
            java.lang.Object[] r12 = r12.toArray(r2)
            mn5[] r12 = (defpackage.mn5[]) r12
            j31 r2 = new j31
            r7 = 5
            r2.<init>(r12, r11, r10, r7)
            long r10 = defpackage.xg6.i
            long r10 = defpackage.ft4.e(r10)
            wg6 r12 = new wg6
            r7 = 2
            r12.<init>(r7, r6)
            ac r10 = defpackage.nu0.h(r2, r10, r12)
            r0.Y = r4
            java.lang.Object r12 = defpackage.od2.A(r10, r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            pjc r12 = (defpackage.pjc) r12
            java.lang.Object r10 = r12.a
            boolean r11 = r10 instanceof defpackage.njc
            if (r11 == 0) goto La0
            r10 = r6
        La0:
            uj3[] r10 = (defpackage.uj3[]) r10
            if (r10 == 0) goto Ld7
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r10.length
        Laa:
            if (r5 >= r12) goto Ld6
            r0 = r10[r5]
            if (r0 != 0) goto Lb2
            r1 = r6
            goto Lce
        Lb2:
            kpa r1 = new kpa
            long r7 = r0.n()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r7)
            java.lang.CharSequence r4 = r0.m()
            uc0 r2 = defpackage.oag.a(r4, r2)
            kk0 r4 = defpackage.kk0.a
            java.lang.String r0 = r0.p(r4)
            r1.<init>(r2, r0)
        Lce:
            if (r1 == 0) goto Ld3
            r11.add(r1)
        Ld3:
            int r5 = r5 + 1
            goto Laa
        Ld6:
            r6 = r11
        Ld7:
            if (r6 != 0) goto Lda
            goto Ldb
        Lda:
            r3 = r6
        Ldb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg6.b(java.util.List, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
