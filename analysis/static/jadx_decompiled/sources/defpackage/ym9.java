package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ym9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ an9 Z;
    public final /* synthetic */ wuc s0;
    public final /* synthetic */ spa t0;
    public final /* synthetic */ ms7 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym9(int i, an9 an9Var, wuc wucVar, spa spaVar, ms7 ms7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = an9Var;
        this.s0 = wucVar;
        this.t0 = spaVar;
        this.u0 = ms7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ym9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ym9(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.X
            wuc r2 = r12.s0
            r3 = 1
            e5f r4 = defpackage.e5f.a
            an9 r5 = r12.Z
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 == r7) goto L1e
            if (r1 != r6) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1e:
            defpackage.od2.a0(r13)
            goto L67
        L22:
            defpackage.od2.a0(r13)
            goto L36
        L26:
            defpackage.od2.a0(r13)
            int r8 = r12.Y
            if (r8 != r3) goto L4f
            r12.X = r3
            java.lang.Object r13 = defpackage.an9.a(r5, r12)
            if (r13 != r0) goto L36
            return r0
        L36:
            r12.X = r7
            r5.getClass()
            int r6 = r2.a
            r7 = 0
            int r8 = r12.Y
            spa r9 = r12.t0
            r10 = 1
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L4b
            goto L4c
        L4b:
            r12 = r4
        L4c:
            if (r12 != r0) goto L67
            return r0
        L4f:
            r12.X = r6
            r5.getClass()
            int r6 = r2.a
            ms7 r7 = r12.u0
            spa r9 = r12.t0
            r10 = 0
            r11 = r12
            java.lang.Object r12 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L63
            goto L64
        L63:
            r12 = r4
        L64:
            if (r12 != r0) goto L67
            return r0
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym9.o(java.lang.Object):java.lang.Object");
    }
}
