package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x0b extends ffe implements a66 {
    public e52 X;
    public long Y;
    public long Z;
    public int s0;
    public final /* synthetic */ y0b t0;
    public final /* synthetic */ int u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0b(y0b y0bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.t0 = y0bVar;
        this.u0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x0b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x0b(this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r26) throws java.lang.Throwable {
        /*
            r25 = this;
            r6 = r25
            tx3 r7 = defpackage.tx3.a
            int r0 = r6.s0
            e5f r8 = defpackage.e5f.a
            r9 = 2
            r1 = 1
            y0b r10 = r6.t0
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L1f
            if (r0 != r9) goto L17
            defpackage.od2.a0(r26)
            goto L8a
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            long r0 = r6.Z
            long r2 = r6.Y
            e52 r4 = r6.X
            defpackage.od2.a0(r26)
            r22 = r0
            r20 = r2
            r19 = r4
            goto L65
        L2f:
            defpackage.od2.a0(r26)
            j0e r0 = r10.a
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            e52 r11 = (defpackage.e52) r11
            if (r11 != 0) goto L3e
            return r8
        L3e:
            k92 r0 = r11.b
            long r12 = r0.a
            es8 r0 = r11.X
            if (r0 == 0) goto L8a
            cu8 r0 = r0.a
            long r14 = r0.b
            r6.X = r11
            r6.Y = r12
            r6.Z = r14
            r6.s0 = r1
            long r1 = r11.a
            ps2 r0 = r10.c
            r3 = r12
            r5 = r25
            r0.a(r1, r3, r5)
            if (r8 != r7) goto L5f
            return r7
        L5f:
            r19 = r11
            r20 = r12
            r22 = r14
        L65:
            kke r0 = r10.b
            w9a r0 = (defpackage.w9a) r0
            cx7 r0 = r0.c()
            w0b r1 = new w0b
            r24 = 0
            y0b r2 = r6.t0
            int r3 = r6.u0
            r16 = r1
            r17 = r2
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r22, r24)
            r2 = 0
            r6.X = r2
            r6.s0 = r9
            java.lang.Object r0 = defpackage.j47.t0(r0, r1, r6)
            if (r0 != r7) goto L8a
            return r7
        L8a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0b.o(java.lang.Object):java.lang.Object");
    }
}
