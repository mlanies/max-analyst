package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mb2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb2(zb2 zb2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mb2 mb2Var = new mb2(this.Z, this.s0, continuation);
        mb2Var.Y = obj;
        return mb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 3
            tx3 r1 = defpackage.tx3.a
            int r2 = r8.X
            r3 = 1
            zb2 r4 = r8.Z
            r5 = 2
            if (r2 == 0) goto L2a
            if (r2 == r3) goto L26
            if (r2 == r5) goto L1d
            if (r2 != r0) goto L15
            defpackage.od2.a0(r9)
            goto L6b
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1d:
            java.lang.Object r2 = r8.Y
            r4 = r2
            zb2 r4 = (defpackage.zb2) r4
            defpackage.od2.a0(r9)
            goto L5d
        L26:
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L2a:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            sx3 r9 = (defpackage.sx3) r9
            long r6 = r8.s0
            java.lang.String r9 = defpackage.zb2.K0     // Catch: java.lang.Throwable -> L4c
            alc r9 = r4.e()     // Catch: java.lang.Throwable -> L4c
            r8.X = r3     // Catch: java.lang.Throwable -> L4c
            r9.getClass()     // Catch: java.lang.Throwable -> L4c
            td5 r2 = new td5     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r9, r6, r0)     // Catch: java.lang.Throwable -> L4c
            ilc r9 = r9.a     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = defpackage.ote.j(r9, r2, r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r4.e()
            r8.Y = r4
            r8.X = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r8.Y = r2
            r8.X = r0
            java.lang.Object r8 = defpackage.zb2.j(r4, r9, r3, r8)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.o(java.lang.Object):java.lang.Object");
    }
}
