package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eya extends pnf {
    public static final /* synthetic */ bc7[] F0;
    public final q0e A0;
    public final w7c B0;
    public final q0e C0;
    public final q0e D0;
    public volatile gi9 E0;
    public final q33 X;
    public final k56 Y;
    public final oa2 Z;
    public final String b;
    public final pu2 c;
    public final qn3 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final w4d w0;
    public final w7c x0;
    public final q0e y0;
    public final w7c z0;

    static {
        oi9 oi9Var = new oi9(eya.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        F0 = new bc7[]{oi9Var};
    }

    public eya(String str, pu2 pu2Var, qn3 qn3Var, q33 q33Var, fya fyaVar, oa2 oa2Var, kke kkeVar, je7 je7Var, v07 v07Var, khe kheVar) {
        ys2 ys2Var = ys2.a;
        ys2Var.getAccessor().d(y7d.class);
        khe kheVarD = ys2Var.getAccessor().d(zrc.class);
        this.b = str;
        this.c = pu2Var;
        this.o = qn3Var;
        this.X = q33Var;
        this.Y = fyaVar;
        this.Z = oa2Var;
        this.s0 = je7Var;
        this.t0 = v07Var;
        this.u0 = kheVar;
        this.v0 = kheVarD;
        this.w0 = mqd.D();
        nz4 nz4Var = nz4.a;
        q0e q0eVarA = r0e.a(nz4Var);
        this.x0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(Boolean.TRUE);
        this.y0 = q0eVarA2;
        this.z0 = new w7c(q0eVarA2);
        Continuation continuation = null;
        q0e q0eVarA3 = r0e.a(null);
        this.A0 = q0eVarA3;
        this.B0 = new w7c(q0eVarA3);
        this.C0 = r0e.a(0L);
        q0e q0eVarA4 = r0e.a(nz4Var);
        this.D0 = q0eVarA4;
        this.E0 = vv7.a();
        zn5 zn5Var = new zn5(new aya(new j31(pu2Var.y0, q0eVarA4, new c3(this, continuation, 21), 4), this, 1), new v59(2, q0eVarA, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 5);
        w9a w9aVar = (w9a) kkeVar;
        od2.L(od2.F(zn5Var, w9aVar.a()), this.a);
        String strG = ((t33) q33Var).g("user.Phone", null);
        StringBuilder sb = new StringBuilder();
        int length = strG.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strG.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        Long lF0 = dae.f0(sb.toString());
        od2.L(od2.F(new zn5(new sb1(new j31(this.o.a(), new zn5(new aya(new aya(this.C0, this, 0), this, 2), new vxa(2, null)), new ax2(3, continuation, 1), 4), new yw2(new ky6(9), 3), this, lF0, 4), new v59(2, this.D0, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 5), w9aVar.a()), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pxa q(defpackage.eya r16, defpackage.nl2 r17) {
        /*
            r0 = r17
            r16.getClass()
            java.lang.Long r1 = r0.C0
            java.lang.CharSequence r2 = r0.o
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L13
            int r1 = r2.length()
            if (r1 != 0) goto L1c
        L13:
            int r1 = defpackage.r8a.G
            eqe r2 = new eqe
            r2.<init>(r1)
        L1a:
            r9 = r2
            goto L27
        L1c:
            if (r2 == 0) goto L25
            iqe r1 = new iqe
            r1.<init>(r2)
            r9 = r1
            goto L27
        L25:
            r2 = 0
            goto L1a
        L27:
            oa2 r1 = defpackage.oa2.a
            r2 = r16
            oa2 r2 = r2.Z
            if (r2 == r1) goto L3b
            oa2 r1 = defpackage.oa2.b
            if (r2 != r1) goto L38
            boolean r1 = r0.F0
            if (r1 == 0) goto L38
            goto L3b
        L38:
            r1 = 0
        L39:
            r15 = r1
            goto L3d
        L3b:
            r1 = 1
            goto L39
        L3d:
            pxa r1 = new pxa
            gza r13 = new gza
            fza r2 = defpackage.fza.a
            long r4 = r0.a
            r13.<init>(r4, r2)
            boolean r12 = r0.u0
            java.lang.CharSequence r14 = r0.E0
            long r6 = r0.D0
            java.lang.CharSequence r8 = r0.c
            android.net.Uri r10 = r0.b
            boolean r11 = r0.t0
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eya.q(eya, nl2):pxa");
    }

    @Override // defpackage.pnf
    public final void p() {
        r().i = null;
    }

    public final yx7 r() {
        return (yx7) this.s0.getValue();
    }
}
