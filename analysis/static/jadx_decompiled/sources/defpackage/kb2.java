package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb2(zb2 zb2Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2Var;
        this.s0 = str;
        this.t0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kb2(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            r2 = 1
            zb2 r3 = r8.Z
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L27
            if (r1 == r2) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            defpackage.od2.a0(r9)
            goto L66
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1d:
            zb2 r3 = r8.X
            defpackage.od2.a0(r9)
            goto L58
        L23:
            defpackage.od2.a0(r9)
            goto L47
        L27:
            defpackage.od2.a0(r9)
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.Y = r2
            r9.getClass()
            ukc r1 = new ukc
            java.lang.String r6 = r8.s0
            int r7 = r8.t0
            r1.<init>(r9, r6, r7)
            ilc r9 = r9.a
            java.lang.Object r9 = defpackage.z04.e0(r9, r1, r8)
            if (r9 != r0) goto L47
            return r0
        L47:
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.X = r3
            r8.Y = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r0) goto L58
            return r0
        L58:
            java.util.List r9 = (java.util.List) r9
            r1 = 0
            r8.X = r1
            r8.Y = r4
            java.lang.Object r8 = defpackage.zb2.j(r3, r9, r2, r8)
            if (r8 != r0) goto L66
            return r0
        L66:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.o(java.lang.Object):java.lang.Object");
    }
}
