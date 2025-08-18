package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class xz8 extends pnf {
    public static final /* synthetic */ bc7[] V0;
    public final q0e A0;
    public final w7c B0;
    public final q0e C0;
    public final w7c D0;
    public final q0e E0;
    public final w7c F0;
    public final q0e G0;
    public final w7c H0;
    public final q0e I0;
    public final w7c J0;
    public final q0e K0;
    public final w7c L0;
    public final q0e M0;
    public final w7c N0;
    public final q0e O0;
    public final q0e P0;
    public final q0e Q0;
    public final w7c R0;
    public final m58 S0;
    public final s35 T0;
    public final w7c U0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final j0e b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final w4d y0 = mqd.D();
    public final s35 z0;

    static {
        oi9 oi9Var = new oi9(xz8.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        V0 = new bc7[]{oi9Var};
    }

    public xz8(Set set, Long l, boolean z, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, w7c w7cVar) {
        this.b = w7cVar;
        this.c = je7Var;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var5;
        this.Z = je7Var6;
        this.s0 = je7Var7;
        this.t0 = je7Var10;
        this.u0 = je7Var2;
        this.v0 = je7Var8;
        this.w0 = je7Var9;
        this.x0 = je7Var11;
        lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.z0 = new s35(0);
        q0e q0eVarA = r0e.a(null);
        this.A0 = q0eVarA;
        this.B0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.C0 = q0eVarA2;
        this.D0 = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(null);
        this.E0 = q0eVarA3;
        this.F0 = new w7c(q0eVarA3);
        q0e q0eVarA4 = r0e.a(null);
        this.G0 = q0eVarA4;
        this.H0 = new w7c(q0eVarA4);
        q0e q0eVarA5 = r0e.a(null);
        this.I0 = q0eVarA5;
        mn5 mn5VarF = od2.F(new tz8(q0eVarA5, this, 0), ((w9a) ((kke) je7Var2.getValue())).b());
        c32 c32Var = wld.a;
        this.J0 = od2.X(mn5VarF, this.a, c32Var, null);
        q0e q0eVarA6 = r0e.a(null);
        this.K0 = q0eVarA6;
        this.L0 = od2.X(od2.F(new tz8(q0eVarA6, this, 1), ((w9a) ((kke) je7Var2.getValue())).b()), this.a, c32Var, null);
        q0e q0eVarA7 = r0e.a(null);
        this.M0 = q0eVarA7;
        this.N0 = new w7c(q0eVarA7);
        q0e q0eVarA8 = r0e.a(Boolean.FALSE);
        this.O0 = q0eVarA8;
        q0e q0eVarA9 = r0e.a(null);
        this.P0 = q0eVarA9;
        q0e q0eVarA10 = r0e.a(set != null ? new yy8(set, l, z) : null);
        this.Q0 = q0eVarA10;
        this.R0 = od2.X(od2.F(od2.t(q0eVarA10, q0eVarA9, q0eVarA8, new mz8(this, null)), ((w9a) ((kke) je7Var2.getValue())).b()), this.a, c32Var, null);
        this.S0 = new m58(w7cVar, 5);
        this.T0 = new s35(0);
        this.U0 = od2.X(od2.x(new m58(w7cVar, 6)), this.a, c32Var, null);
    }

    public static void C(xz8 xz8Var, Long l, CharSequence charSequence, Integer num, int i) {
        az8 az8Var = null;
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        boolean z = (i & 8) != 0;
        q0e q0eVar = xz8Var.I0;
        if (q0eVar.getValue() != null) {
            q0eVar.setValue(null);
        }
        if (l != null) {
            xz8Var.P0.m(null, new bz8(charSequence, num));
            az8Var = new az8(l.longValue(), z);
        }
        xz8Var.K0.setValue(az8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.xz8 r11, defpackage.yy8 r12, defpackage.bz8 r13, boolean r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz8.q(xz8, yy8, bz8, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.xz8 r13, defpackage.az8 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.nz8
            if (r0 == 0) goto L16
            r0 = r15
            nz8 r0 = (defpackage.nz8) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t0 = r1
            goto L1b
        L16:
            nz8 r0 = new nz8
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            dz8 r13 = r0.Y
            az8 r14 = r0.X
            xz8 r0 = r0.o
            defpackage.od2.a0(r15)
            r10 = r13
            goto L80
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            az8 r14 = r0.X
            xz8 r13 = r0.o
            defpackage.od2.a0(r15)
            goto L62
        L45:
            defpackage.od2.a0(r15)
            if (r14 != 0) goto L4d
        L4a:
            r1 = r3
            goto Ld3
        L4d:
            java.lang.Long r15 = new java.lang.Long
            long r6 = r14.a
            r15.<init>(r6)
            r0.o = r13
            r0.X = r14
            r0.t0 = r5
            java.lang.Object r15 = r13.x(r15, r5, r0)
            if (r15 != r1) goto L62
            goto Ld3
        L62:
            dz8 r15 = (defpackage.dz8) r15
            je7 r2 = r13.X
            java.lang.Object r2 = r2.getValue()
            r79 r2 = (defpackage.r79) r2
            long r6 = r14.a
            r0.o = r13
            r0.X = r14
            r0.Y = r15
            r0.t0 = r4
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L7d
            goto Ld3
        L7d:
            r10 = r15
            r15 = r0
            r0 = r13
        L80:
            cu8 r15 = (defpackage.cu8) r15
            if (r10 == 0) goto L4a
            if (r15 != 0) goto L87
            goto L4a
        L87:
            je7 r13 = r0.v0
            java.lang.Object r13 = r13.getValue()
            ida r13 = (defpackage.ida) r13
            java.lang.String r1 = r15.s0
            java.util.List r2 = r15.R0
            java.lang.CharSequence r13 = r13.l(r1, r2)
            je7 r0 = r0.v0
            java.lang.Object r0 = r0.getValue()
            ida r0 = (defpackage.ida) r0
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r3)
            int r1 = defpackage.tu0.G(r1)
            java.lang.CharSequence r9 = r0.j(r13, r2, r1)
            xy8 r1 = new xy8
            long r7 = r14.a
            g20 r13 = defpackage.g20.c
            boolean r13 = r15.m(r13)
            if (r13 != 0) goto Lcc
            g20 r13 = defpackage.g20.o
            boolean r13 = r15.m(r13)
            if (r13 == 0) goto Lcb
            goto Lcc
        Lcb:
            r5 = 0
        Lcc:
            r11 = r5
            boolean r12 = r14.b
            r6 = r1
            r6.<init>(r7, r9, r10, r11, r12)
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz8.r(xz8, az8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void y(xz8 xz8Var, boolean z, boolean z2, int i) {
        sy8 sy8Var;
        if ((i & 1) != 0) {
            z = false;
        }
        int i2 = 2;
        if ((i & 2) != 0) {
            z2 = false;
        }
        q0e q0eVar = xz8Var.A0;
        p35 p35Var = (p35) q0eVar.getValue();
        uy8 uy8Var = p35Var != null ? (uy8) p35Var.a : null;
        if (z2) {
            if ((uy8Var != null ? uy8Var.a : 0) != 2) {
                return;
            }
        }
        p35 p35Var2 = (p35) xz8Var.C0.getValue();
        if (p35Var2 != null && (sy8Var = (sy8) p35Var2.a) != null && sy8Var.a) {
            xz8Var.A(3, null);
            return;
        }
        if (z2) {
            i2 = 4;
        } else if (z) {
            i2 = 1;
        } else {
            if ((uy8Var != null ? uy8Var.a : 0) == 2) {
                i2 = 3;
            }
        }
        q0eVar.m(null, new p35(new uy8(i2)));
    }

    public static void z(xz8 xz8Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        xz8Var.A(i, null);
    }

    public final void A(int i, iv8 iv8Var) {
        sy8 sy8Var;
        q0e q0eVar = this.C0;
        p35 p35Var = (p35) q0eVar.getValue();
        boolean z = (p35Var == null || (sy8Var = (sy8) p35Var.a) == null) ? false : sy8Var.a;
        if (iv8Var == null) {
            iv8Var = (i == 3 || i == 2) ? iv8.a : z ? iv8.c : iv8.b;
        }
        this.E0.m(null, new p35(new ty8(iv8Var)));
        sy8 sy8Var2 = (z || i != 4) ? (z || i == 1) ? new sy8(true ^ z, i) : null : new sy8(false, i);
        if (sy8Var2 != null) {
            q0eVar.m(null, new p35(sy8Var2));
        }
    }

    public final void B(CharSequence charSequence, boolean z) {
        cz5 cz5Var;
        if ((charSequence == null || w9e.C0(charSequence)) && !t()) {
            return;
        }
        Long l = (Long) this.I0.getValue();
        zy8 zy8Var = (zy8) this.R0.a.getValue();
        if (zy8Var != null) {
            cz5Var = new cz5(zy8Var.a, zy8Var.b, zy8Var.c, charSequence, zy8Var.e.e);
        } else {
            cz5Var = null;
        }
        j47.T(this.a, ((w9a) ((kke) this.u0.getValue())).a(), null, new pz8(this, l, cz5Var, charSequence, z, null), 2);
        pnf.o(this.z0, new gz8(cz5Var));
    }

    public final void D(Long l) {
        q0e q0eVar = this.K0;
        if (q0eVar.getValue() != null) {
            q0eVar.setValue(null);
        }
        this.I0.setValue(l);
    }

    public final void s() {
        this.Q0.setValue(null);
        this.P0.setValue(null);
        this.O0.m(null, Boolean.FALSE);
    }

    public final boolean t() {
        return this.R0.a.getValue() != null && this.J0.a.getValue() == null;
    }

    public final Long u() {
        az8 az8Var = (az8) this.K0.getValue();
        if (az8Var != null) {
            return Long.valueOf(az8Var.a);
        }
        return null;
    }

    public final zy8 v() {
        return (zy8) this.R0.a.getValue();
    }

    public final Long w() {
        return (Long) this.I0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.Long r23, boolean r24, kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz8.x(java.lang.Long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
