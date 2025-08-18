package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iq5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xld Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ si9 s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq5(xld xldVar, mn5 mn5Var, si9 si9Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = xldVar;
        this.Z = mn5Var;
        this.s0 = si9Var;
        this.t0 = obj;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iq5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new iq5(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 4
            r3 = 3
            r4 = 1
            mn5 r5 = r8.Z
            r6 = 2
            si9 r7 = r8.s0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            defpackage.od2.a0(r9)
            goto L50
        L23:
            defpackage.od2.a0(r9)
            goto L75
        L27:
            defpackage.od2.a0(r9)
            c32 r9 = defpackage.wld.a
            xld r1 = r8.Y
            if (r1 != r9) goto L39
            r8.X = r4
            java.lang.Object r8 = r5.d(r7, r8)
            if (r8 != r0) goto L75
            return r0
        L39:
            nd2 r9 = defpackage.wld.b
            r4 = 0
            if (r1 != r9) goto L59
            j0e r9 = r7.i()
            gq5 r1 = new gq5
            r1.<init>(r6, r4)
            r8.X = r6
            java.lang.Object r9 = defpackage.od2.z(r9, r1, r8)
            if (r9 != r0) goto L50
            return r0
        L50:
            r8.X = r3
            java.lang.Object r8 = r5.d(r7, r8)
            if (r8 != r0) goto L75
            return r0
        L59:
            j0e r9 = r7.i()
            mn5 r9 = r1.b(r9)
            mn5 r9 = defpackage.od2.x(r9)
            hq5 r1 = new hq5
            java.lang.Object r3 = r8.t0
            r1.<init>(r5, r7, r3, r4)
            r8.X = r2
            java.lang.Object r8 = defpackage.od2.r(r9, r1, r8)
            if (r8 != r0) goto L75
            return r0
        L75:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq5.o(java.lang.Object):java.lang.Object");
    }
}
