package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o96 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ z96 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o96(z96 z96Var, Continuation continuation) {
        super(2, continuation);
        this.Z = z96Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        o96 o96Var = new o96(this.Z, continuation);
        o96Var.Y = obj;
        return o96Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.X
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            java.lang.String r5 = "z96"
            z96 r6 = r10.Z
            r7 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            java.lang.Object r10 = r10.Y
            sx3 r10 = (defpackage.sx3) r10
            defpackage.od2.a0(r11)
            goto L9c
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L24:
            java.lang.Object r1 = r10.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r11)
            r9 = r1
            r1 = r11
            r11 = r9
            goto L60
        L2f:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.Y
            sx3 r11 = (defpackage.sx3) r11
            java.lang.String r1 = "loadMoreItems(): loadingItemsJob start"
            defpackage.hm9.n(r5, r1)
            q0e r1 = r6.z0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.m(r7, r8)
            q0e r1 = r6.B0
            java.lang.Object r1 = r1.getValue()
            b86 r1 = (defpackage.b86) r1
            if (r1 != 0) goto L4d
            return r2
        L4d:
            w86 r8 = r6.y0
            int r8 = r8.b
            r10.Y = r11
            r10.X = r4
            hq7 r4 = r6.X
            fz6 r4 = (defpackage.fz6) r4
            java.lang.Object r1 = r4.d(r1, r8, r10)
            if (r1 != r0) goto L60
            return r0
        L60:
            gq7 r1 = (defpackage.gq7) r1
            q0e r4 = r6.z0
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r4.m(r7, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "loadMoreItems(): get result "
            r4.<init>(r8)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            defpackage.hm9.n(r5, r4)
            boolean r4 = defpackage.j1e.z(r11)
            if (r4 != 0) goto L81
            return r2
        L81:
            boolean r4 = r1 instanceof defpackage.eq7
            if (r4 == 0) goto L86
            return r2
        L86:
            boolean r4 = r1 instanceof defpackage.fq7
            if (r4 == 0) goto Lba
            fq7 r1 = (defpackage.fq7) r1
            java.util.List r1 = r1.a
            r10.Y = r11
            r10.X = r3
            java.lang.Object r10 = defpackage.z96.q(r6, r1, r10)
            if (r10 != r0) goto L99
            return r0
        L99:
            r9 = r11
            r11 = r10
            r10 = r9
        L9c:
            java.util.List r11 = (java.util.List) r11
            boolean r10 = defpackage.j1e.z(r10)
            if (r10 != 0) goto La5
            return r2
        La5:
            q0e r10 = r6.w0
            java.lang.Object r0 = r10.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r11 = defpackage.x53.t0(r0, r11)
            r10.m(r7, r11)
            java.lang.String r10 = "loadMoreItems(): loadingItemsJob finish"
            defpackage.hm9.n(r5, r10)
            return r2
        Lba:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o96.o(java.lang.Object):java.lang.Object");
    }
}
