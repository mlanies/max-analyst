package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class za2 extends ffe implements a66 {
    public String X;
    public zb2 Y;
    public int Z;
    public final /* synthetic */ zb2 s0;
    public final /* synthetic */ String t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za2(zb2 zb2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.s0 = zb2Var;
        this.t0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((za2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new za2(this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 1
            tx3 r1 = defpackage.tx3.a
            int r2 = r8.Z
            zb2 r3 = r8.s0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L2e
            if (r2 == r0) goto L2a
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            java.lang.String r8 = r8.X
            defpackage.od2.a0(r9)
            goto L72
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            zb2 r3 = r8.Y
            java.lang.String r2 = r8.X
            defpackage.od2.a0(r9)
            r7 = r2
            r2 = r9
            r9 = r7
            goto L61
        L2a:
            defpackage.od2.a0(r9)
            goto L4c
        L2e:
            defpackage.od2.a0(r9)
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.Z = r0
            r9.getClass()
            tkc r2 = new tkc
            java.lang.String r6 = r8.t0
            r2.<init>(r9, r6, r0)
            ilc r9 = r9.a
            java.lang.Object r9 = defpackage.z04.e0(r9, r2, r8)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = defpackage.zb2.K0
            alc r2 = r3.e()
            r8.X = r9
            r8.Y = r3
            r8.Z = r5
            java.lang.Object r2 = r2.d(r8)
            if (r2 != r1) goto L61
            return r1
        L61:
            java.util.List r2 = (java.util.List) r2
            r8.X = r9
            r5 = 0
            r8.Y = r5
            r8.Z = r4
            java.lang.Object r8 = defpackage.zb2.j(r3, r2, r0, r8)
            if (r8 != r1) goto L71
            return r1
        L71:
            r8 = r9
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za2.o(java.lang.Object):java.lang.Object");
    }
}
