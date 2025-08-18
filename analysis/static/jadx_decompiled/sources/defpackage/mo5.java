package defpackage;

/* loaded from: classes2.dex */
public final class mo5 implements on5 {
    public final /* synthetic */ sx3 X;
    public final /* synthetic */ lx3 Y;
    public final /* synthetic */ lec a;
    public final /* synthetic */ long b;
    public final /* synthetic */ iab c;
    public final /* synthetic */ mec o;

    public mo5(lec lecVar, long j, iab iabVar, mec mecVar, sx3 sx3Var, lx3 lx3Var) {
        this.a = lecVar;
        this.b = j;
        this.c = iabVar;
        this.o = mecVar;
        this.X = sx3Var;
        this.Y = lx3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.on5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof defpackage.lo5
            if (r2 == 0) goto L17
            r2 = r1
            lo5 r2 = (defpackage.lo5) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            lo5 r2 = new lo5
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L36
            if (r4 != r6) goto L2e
            mo5 r0 = r2.o
            defpackage.od2.a0(r1)
            goto L69
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            defpackage.od2.a0(r1)
            int r1 = defpackage.ft4.o
            long r7 = java.lang.System.nanoTime()
            kt4 r1 = defpackage.kt4.NANOSECONDS
            long r7 = defpackage.z7.S(r7, r1)
            long r11 = defpackage.ft4.e(r7)
            lec r1 = r0.a
            long r13 = r1.a
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 >= 0) goto L77
            long r7 = r0.b
            long r11 = r11 + r7
            r1.a = r11
            r2.o = r0
            r2.Z = r6
            iab r1 = r0.c
            fab r1 = (defpackage.fab) r1
            e32 r1 = r1.a
            r4 = r22
            java.lang.Object r1 = r1.o(r4, r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            mec r0 = r0.o
            java.lang.Object r0 = r0.a
            yf4 r0 = (defpackage.yf4) r0
            if (r0 == 0) goto La6
            z87 r0 = (defpackage.z87) r0
            r0.cancel(r5)
            goto La6
        L77:
            r4 = r22
            mec r1 = r0.o
            java.lang.Object r2 = r1.a
            yf4 r2 = (defpackage.yf4) r2
            if (r2 == 0) goto L86
            z87 r2 = (defpackage.z87) r2
            r2.cancel(r5)
        L86:
            ko5 r2 = new ko5
            long r6 = r0.b
            lx3 r3 = r0.Y
            lec r10 = r0.a
            iab r8 = r0.c
            r20 = 0
            r9 = r2
            r15 = r6
            r17 = r3
            r18 = r8
            r19 = r22
            r9.<init>(r10, r11, r13, r15, r17, r18, r19, r20)
            r3 = 3
            sx3 r0 = r0.X
            zf4 r0 = defpackage.j47.h(r0, r5, r2, r3)
            r1.a = r0
        La6:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
