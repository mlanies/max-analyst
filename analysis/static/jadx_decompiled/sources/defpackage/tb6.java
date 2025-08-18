package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tb6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ ta3 Z;
    public final /* synthetic */ yf4 s0;
    public final /* synthetic */ xb6 t0;
    public final /* synthetic */ boolean u0;
    public es8 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb6(Object obj, Continuation continuation, ta3 ta3Var, yf4 yf4Var, xb6 xb6Var, boolean z) {
        super(2, continuation);
        this.Y = obj;
        this.Z = ta3Var;
        this.s0 = yf4Var;
        this.t0 = xb6Var;
        this.u0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tb6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tb6(this.Y, continuation, this.Z, this.s0, this.t0, this.u0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r8.A0 == 2) goto L22;
     */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            yf4 r2 = r7.s0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            defpackage.od2.a0(r8)
            goto L7d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1a:
            es8 r1 = r7.v0
            defpackage.od2.a0(r8)
            goto L43
        L20:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.Y
            r1 = r8
            es8 r1 = (defpackage.es8) r1
            cu8 r8 = r1.a
            long r5 = r8.t0
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            ta3 r5 = r7.Z
            ua3 r5 = (defpackage.ua3) r5
            r5.makeCompleting$kotlinx_coroutines_core(r8)
            r7.v0 = r1
            r7.X = r3
            java.lang.Object r8 = r2.a(r7)
            if (r8 != r0) goto L43
            return r0
        L43:
            e52 r8 = (defpackage.e52) r8
            xb6 r3 = r7.t0
            je7 r5 = r3.d
            java.lang.Object r5 = r5.getValue()
            q33 r5 = (defpackage.q33) r5
            hyc r5 = (defpackage.hyc) r5
            long r5 = r5.t()
            k92 r8 = r8.b
            boolean r8 = r8.f(r5)
            boolean r5 = r7.u0
            if (r5 != 0) goto L93
            if (r8 == 0) goto L71
            uj3 r8 = r1.b
            boolean r8 = r8.Y
            if (r8 == 0) goto L71
            cu8 r8 = r1.a
            cu8 r5 = r8.C0
            if (r5 == 0) goto L93
            int r8 = r8.A0
            if (r8 != r4) goto L93
        L71:
            r8 = 0
            r7.v0 = r8
            r7.X = r4
            java.lang.Object r8 = defpackage.xb6.a(r3, r2, r1, r7)
            if (r8 != r0) goto L7d
            return r0
        L7d:
            bw8 r8 = (defpackage.bw8) r8
            i9d r7 = new i9d
            nz4 r5 = defpackage.nz4.a
            r3 = 0
            r4 = 0
            r1 = 0
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            r7.b = r8
            k9d r8 = new k9d
            r8.<init>(r7)
            goto L9d
        L93:
            h8d r7 = new h8d
            r7.<init>(r1)
            i8d r8 = new i8d
            r8.<init>(r7)
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb6.o(java.lang.Object):java.lang.Object");
    }
}
