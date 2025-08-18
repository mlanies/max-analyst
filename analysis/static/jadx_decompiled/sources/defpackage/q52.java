package defpackage;

/* loaded from: classes2.dex */
public final class q52 implements on5 {
    public int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ u52 c;
    public final /* synthetic */ long o;

    public q52(on5 on5Var, u52 u52Var, long j) {
        this.c = u52Var;
        this.o = j;
        this.b = on5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.on5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r13 instanceof defpackage.p52
            if (r2 == 0) goto L15
            r2 = r13
            p52 r2 = (defpackage.p52) r2
            int r3 = r2.X
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.X = r3
            goto L1a
        L15:
            p52 r2 = new p52
            r2.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r2.o
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.X
            if (r4 == 0) goto L31
            if (r4 != r1) goto L29
            defpackage.od2.a0(r13)
            goto Lab
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.od2.a0(r13)
            int r13 = r11.a
            int r4 = r13 + 1
            r11.a = r4
            if (r13 < 0) goto Lae
            if (r13 != 0) goto La0
            r13 = r12
            uj3 r13 = (defpackage.uj3) r13
            if (r13 == 0) goto La0
            java.lang.String r13 = r13.d()
            if (r13 != 0) goto L4a
            goto La0
        L4a:
            u52 r4 = r11.c
            s35 r4 = r4.w0
            fjb r5 = new fjb
            int r6 = defpackage.yea.e2
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            gqe r7 = new gqe
            java.util.List r13 = defpackage.ys.m0(r13)
            r7.<init>(r6, r13)
            mg3 r13 = new mg3
            int r6 = defpackage.wea.y0
            int r8 = defpackage.yea.f2
            eqe r9 = new eqe
            r9.<init>(r8)
            r13.<init>(r6, r9, r1, r0)
            mg3 r6 = new mg3
            int r8 = defpackage.wea.z0
            int r9 = defpackage.yea.g2
            eqe r10 = new eqe
            r10.<init>(r9)
            r9 = 2
            r6.<init>(r8, r10, r9, r0)
            mg3[] r13 = new defpackage.mg3[]{r13, r6}
            java.util.List r13 = defpackage.y53.M(r13)
            long r8 = r11.o
            long[] r6 = new long[r1]
            r6[r0] = r8
            kpa r0 = new kpa
            java.lang.String r8 = "profile:adminslist:ids_to_delete"
            r0.<init>(r8, r6)
            kpa[] r0 = new defpackage.kpa[]{r0}
            android.os.Bundle r0 = defpackage.dy7.g(r0)
            r6 = 0
            r5.<init>(r7, r6, r13, r0)
            defpackage.pnf.o(r4, r5)
        La0:
            r2.X = r1
            on5 r11 = r11.b
            java.lang.Object r11 = r11.a(r12, r2)
            if (r11 != r3) goto Lab
            return r3
        Lab:
            e5f r11 = defpackage.e5f.a
            return r11
        Lae:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Index overflow has happened"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q52.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
