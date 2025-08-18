package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e79 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ n79 Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e79(je7 je7Var, je7 je7Var2, n79 n79Var, Continuation continuation) {
        super(2, continuation);
        this.Y = je7Var;
        this.Z = n79Var;
        this.s0 = je7Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e79) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n79 n79Var = this.Z;
        return new e79(this.Y, this.s0, n79Var, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r2) goto L11
            defpackage.od2.a0(r7)
            goto L4f
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L19:
            defpackage.od2.a0(r7)
            goto L3b
        L1d:
            defpackage.od2.a0(r7)
            je7 r7 = r6.Y
            java.lang.Object r7 = r7.getValue()
            ds3 r7 = (defpackage.ds3) r7
            r6.X = r4
            r7.getClass()
            md1 r1 = new md1
            r4 = 29
            r1.<init>(r4, r7)
            java.lang.Object r7 = defpackage.ema.C(r1, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            uj3 r7 = (defpackage.uj3) r7
            d79 r1 = new d79
            je7 r4 = r6.s0
            r1.<init>(r4, r7, r3)
            r6.X = r2
            r4 = 100
            java.lang.Object r7 = defpackage.fp3.I(r4, r1, r6)
            if (r7 != r0) goto L4f
            return r0
        L4f:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L6e
            n79 r6 = r6.Z
            q0e r6 = r6.v0
            java.lang.Object r0 = r6.getValue()
            kua r0 = (defpackage.kua) r0
            dk r0 = r0.a()
            androidx.core.graphics.drawable.IconCompat r7 = androidx.core.graphics.drawable.IconCompat.b(r7)
            r0.X = r7
            kua r7 = r0.a()
            r6.m(r3, r7)
        L6e:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e79.o(java.lang.Object):java.lang.Object");
    }
}
