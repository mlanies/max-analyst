package defpackage;

/* loaded from: classes2.dex */
public final class c67 extends pnf implements dh3 {
    public final w4d A0;
    public final w4d B0;
    public final qec C0;
    public int D0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final s35 t0;
    public final s35 u0;
    public final kld v0;
    public final m32 w0;
    public final q0e x0;
    public final w7c y0;
    public final w4d z0;
    public static final /* synthetic */ bc7[] F0 = {new oi9(c67.class, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, c67.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;"), new oi9(c67.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;")};
    public static final yxc E0 = new yxc(12);

    public c67() {
        c57 c57Var = c57.a;
        khe kheVarD = c57Var.getAccessor().d(ib6.class);
        khe kheVarD2 = c57Var.getAccessor().d(oc6.class);
        khe kheVarD3 = c57Var.getAccessor().d(zua.class);
        khe kheVarD4 = c57Var.getAccessor().d(iy2.class);
        khe kheVarD5 = c57Var.getAccessor().d(blb.class);
        khe kheVarD6 = c57Var.getAccessor().d(gh3.class);
        khe kheVarD7 = c57Var.getAccessor().d(kke.class);
        khe kheVarD8 = c57Var.getAccessor().d(q33.class);
        snf snfVar = new snf(kheVarD6, new g27(5));
        this.b = snfVar;
        this.c = kheVarD;
        this.o = kheVarD2;
        this.X = kheVarD4;
        this.Y = kheVarD5;
        this.Z = kheVarD7;
        this.s0 = kheVarD8;
        this.t0 = new s35(0);
        this.u0 = new s35(0);
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.v0 = kldVarB;
        this.w0 = od2.N(kldVarB, new t03(snfVar.o, 11));
        q0e q0eVarA = r0e.a(daa.b);
        this.x0 = q0eVarA;
        this.y0 = od2.X(new sb1(q0eVarA, this, kheVarD7, kheVarD3, 3), this.a, wld.a, new my3((eaa) q0eVarA.getValue(), Integer.MAX_VALUE, new eqe(hca.i)));
        this.z0 = mqd.D();
        this.A0 = mqd.D();
        this.B0 = mqd.D();
        this.C0 = new qec("[^0-9+]");
        this.D0 = Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.c67 r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.t57
            if (r0 == 0) goto L13
            r0 = r9
            t57 r0 = (defpackage.t57) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            t57 r0 = new t57
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.o
            jqe r6 = (defpackage.jqe) r6
            defpackage.od2.a0(r9)
            goto L95
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.o
            c67 r6 = (defpackage.c67) r6
            defpackage.od2.a0(r9)
            goto L6d
        L3f:
            defpackage.od2.a0(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L52
            int r7 = defpackage.yoc.f0
            eqe r8 = new eqe
            r8.<init>(r7)
        L4f:
            r7 = r6
            r6 = r8
            goto L81
        L52:
            int r8 = r7.length()
            int r9 = r6.D0
            if (r8 <= r9) goto L62
            int r7 = defpackage.yoc.g0
            eqe r8 = new eqe
            r8.<init>(r7)
            goto L4f
        L62:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r9 = r(r7, r6, r0)
            if (r9 != r1) goto L6d
            goto L9d
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L7d
            int r7 = defpackage.hca.d
            eqe r8 = new eqe
            r8.<init>(r7)
            goto L4f
        L7d:
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            if (r6 == 0) goto L95
            kld r7 = r7.v0
            g57 r8 = new g57
            r8.<init>(r6)
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L95
            goto L9d
        L95:
            if (r6 != 0) goto L98
            goto L99
        L98:
            r4 = 0
        L99:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c67.q(c67, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(java.lang.String r8, defpackage.c67 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.u57
            if (r0 == 0) goto L13
            r0 = r10
            u57 r0 = (defpackage.u57) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            u57 r0 = new u57
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.Long r8 = r0.o
            defpackage.od2.a0(r10)
            goto L7c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.od2.a0(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r8.length()
            r5 = r4
        L3f:
            if (r5 >= r2) goto L53
            char r6 = r8.charAt(r5)
            char r6 = (char) r6
            char r7 = (char) r6
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto L50
            r10.append(r6)
        L50:
            int r5 = r5 + 1
            goto L3f
        L53:
            java.lang.String r8 = r10.toString()
            java.lang.Long r8 = defpackage.dae.f0(r8)
            je7 r10 = r9.Y
            java.lang.Object r10 = r10.getValue()
            blb r10 = (defpackage.blb) r10
            je7 r9 = r9.s0
            java.lang.Object r9 = r9.getValue()
            q33 r9 = (defpackage.q33) r9
            hyc r9 = (defpackage.hyc) r9
            long r5 = r9.t()
            r0.o = r8
            r0.Y = r3
            java.lang.Object r10 = r10.a(r5, r0)
            if (r10 != r1) goto L7c
            return r1
        L7c:
            oab r10 = (defpackage.oab) r10
            uj3 r9 = r10.d
            long r9 = r9.o()
            if (r8 != 0) goto L87
            goto L90
        L87:
            long r0 = r8.longValue()
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L90
            goto L91
        L90:
            r3 = r4
        L91:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c67.r(java.lang.String, c67, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.b.o;
    }

    @Override // defpackage.pnf
    public final void p() {
        bc7[] bc7VarArr = F0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.z0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        bc7 bc7Var2 = bc7VarArr[1];
        w4d w4dVar2 = this.A0;
        x77 x77Var2 = (x77) w4dVar2.T0(this, bc7Var2);
        if (x77Var2 != null) {
            x77Var2.cancel(null);
        }
        w4dVar2.o1(this, bc7VarArr[1], null);
        bc7 bc7Var3 = bc7VarArr[2];
        w4d w4dVar3 = this.B0;
        x77 x77Var3 = (x77) w4dVar3.T0(this, bc7Var3);
        if (x77Var3 != null) {
            x77Var3.cancel(null);
        }
        w4dVar3.o1(this, bc7VarArr[2], null);
    }
}
