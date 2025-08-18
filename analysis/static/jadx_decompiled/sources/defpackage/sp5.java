package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sp5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ c66 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp5(im4 im4Var, y03 y03Var, Continuation continuation) {
        super(2, continuation);
        this.Z = im4Var;
        this.s0 = y03Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sp5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sp5 sp5Var = new sp5((im4) this.Z, (y03) this.s0, continuation);
        sp5Var.Y = obj;
        return sp5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.X
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r5 = r5.Y
            rp5 r5 = (defpackage.rp5) r5
            defpackage.od2.a0(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L11
            goto L3c
        L11:
            r6 = move-exception
            goto L38
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1b:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.Y
            on5 r6 = (defpackage.on5) r6
            mn5 r1 = r5.Z
            rp5 r3 = new rp5
            c66 r4 = r5.s0
            r3.<init>(r4, r6)
            r5.Y = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            r5.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            java.lang.Object r5 = r1.d(r3, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            if (r5 != r0) goto L3c
            return r0
        L36:
            r6 = move-exception
            r5 = r3
        L38:
            java.lang.Object r0 = r6.a
            if (r0 != r5) goto L3f
        L3c:
            e5f r5 = defpackage.e5f.a
            return r5
        L3f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp5.o(java.lang.Object):java.lang.Object");
    }
}
