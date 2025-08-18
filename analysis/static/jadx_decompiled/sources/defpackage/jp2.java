package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jp2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp2(rq2 rq2Var, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jp2(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.X
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            rq2 r5 = r13.Y
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            defpackage.od2.a0(r14)
            goto L9e
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1d:
            defpackage.od2.a0(r14)
            goto L2d
        L21:
            defpackage.od2.a0(r14)
            r13.X = r4
            java.lang.Object r14 = r5.y(r13)
            if (r14 != r0) goto L2d
            return r0
        L2d:
            java.lang.Number r14 = (java.lang.Number) r14
            long r8 = r14.longValue()
            int r14 = defpackage.xoc.n0
            int r1 = r13.Z
            if (r1 != r14) goto L4d
            je7 r14 = r5.x0
            java.lang.Object r14 = r14.getValue()
            q33 r14 = (defpackage.q33) r14
            hyc r14 = (defpackage.hyc) r14
            long r6 = r14.n()
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
        L4a:
            long r6 = r6 + r10
        L4b:
            r10 = r6
            goto L80
        L4d:
            int r14 = defpackage.xoc.o0
            if (r1 != r14) goto L63
            je7 r14 = r5.x0
            java.lang.Object r14 = r14.getValue()
            q33 r14 = (defpackage.q33) r14
            hyc r14 = (defpackage.hyc) r14
            long r6 = r14.n()
            r10 = 18000000(0x112a880, double:8.8931816E-317)
            goto L4a
        L63:
            int r14 = defpackage.xoc.m0
            if (r1 != r14) goto L79
            je7 r14 = r5.x0
            java.lang.Object r14 = r14.getValue()
            q33 r14 = (defpackage.q33) r14
            hyc r14 = (defpackage.hyc) r14
            long r6 = r14.n()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L4a
        L79:
            int r14 = defpackage.xoc.p0
            if (r1 != r14) goto Lb2
            r6 = -1
            goto L4b
        L80:
            bc7[] r14 = defpackage.rq2.f1
            kke r14 = r5.u()
            w9a r14 = (defpackage.w9a) r14
            nx3 r14 = r14.b()
            ip2 r1 = new ip2
            rq2 r7 = r13.Y
            r12 = 0
            r6 = r1
            r6.<init>(r7, r8, r10, r12)
            r13.X = r3
            java.lang.Object r13 = defpackage.j47.t0(r14, r1, r13)
            if (r13 != r0) goto L9e
            return r0
        L9e:
            s35 r13 = r5.b1
            ep2 r14 = new ep2
            int r0 = defpackage.yoc.J
            int r1 = defpackage.woc.m
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            r1 = 0
            r14.<init>(r0, r1, r4, r3)
            defpackage.pnf.o(r13, r14)
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp2.o(java.lang.Object):java.lang.Object");
    }
}
