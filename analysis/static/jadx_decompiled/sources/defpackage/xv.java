package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xv extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ yf4 Z;
    public final /* synthetic */ yf4 s0;
    public final /* synthetic */ bx t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(zf4 zf4Var, zf4 zf4Var2, bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = zf4Var;
        this.s0 = zf4Var2;
        this.t0 = bxVar;
        this.u0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xv((zf4) this.Z, (zf4) this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.Y
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            defpackage.od2.a0(r8)
            goto L67
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1b:
            int r1 = r7.X
            defpackage.od2.a0(r8)
            goto L46
        L21:
            defpackage.od2.a0(r8)
            goto L33
        L25:
            defpackage.od2.a0(r8)
            r7.Y = r4
            yf4 r8 = r7.Z
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L33
            return r0
        L33:
            java.lang.Number r8 = (java.lang.Number) r8
            int r1 = r8.intValue()
            r7.X = r1
            r7.Y = r3
            yf4 r8 = r7.s0
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L46
            return r0
        L46:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r1 > 0) goto L50
            if (r8 <= 0) goto L67
        L50:
            bc7[] r8 = defpackage.bx.F
            bx r8 = r7.t0
            long r3 = r8.i()
            long r5 = r7.u0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L67
            r7.Y = r2
            java.lang.Object r7 = r8.s(r5, r7)
            if (r7 != r0) goto L67
            return r0
        L67:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv.o(java.lang.Object):java.lang.Object");
    }
}
