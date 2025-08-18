package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n50 extends ffe implements a66 {
    public /* synthetic */ float X;
    public final /* synthetic */ p50 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(p50 p50Var, Continuation continuation) {
        super(2, continuation);
        this.Y = p50Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n50 n50Var = (n50) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n50Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n50 n50Var = new n50(this.Y, continuation);
        n50Var.X = ((Number) obj).floatValue();
        return n50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            defpackage.od2.a0(r5)
            float r5 = r4.X
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r5)
            p50 r4 = r4.Y
            v50 r5 = r4.Q0
            r1 = 0
            if (r5 == 0) goto L14
            java.lang.Long r5 = r5.a
            goto L15
        L14:
            r5 = r1
        L15:
            u70 r2 = r4.D0
            if (r5 == 0) goto L43
            java.lang.Long r3 = r4.O0
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L30
            v50 r3 = r4.Q0
            if (r3 == 0) goto L27
            l30 r1 = r3.c
        L27:
            vu4 r3 = defpackage.vu4.a
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 == 0) goto L30
            goto L43
        L30:
            boolean r1 = r2.G0
            if (r1 == 0) goto L35
            goto L48
        L35:
            float r0 = r0.floatValue()
            java.lang.Long r4 = r4.O0
            boolean r4 = r5.equals(r4)
            r2.c(r0, r4)
            goto L48
        L43:
            r4 = 0
            r5 = 0
            r2.c(r4, r5)
        L48:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n50.o(java.lang.Object):java.lang.Object");
    }
}
