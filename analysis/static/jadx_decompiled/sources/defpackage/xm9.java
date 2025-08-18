package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xm9 extends ffe implements a66 {
    public ms7 X;
    public spa Y;
    public int Z;
    public final /* synthetic */ an9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm9(an9 an9Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = an9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xm9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xm9(this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Z
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            an9 r5 = r9.s0
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            defpackage.od2.a0(r10)
            goto Lc1
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1d:
            spa r1 = r9.Y
            ms7 r6 = r9.X
            defpackage.od2.a0(r10)
            goto L47
        L25:
            defpackage.od2.a0(r10)
            java.util.concurrent.atomic.AtomicReference r10 = r5.k
            java.lang.Object r10 = r10.get()
            r6 = r10
            ms7 r6 = (defpackage.ms7) r6
            java.util.concurrent.atomic.AtomicReference r10 = r5.j
            java.lang.Object r10 = r10.get()
            r1 = r10
            spa r1 = (defpackage.spa) r1
            r9.X = r6
            r9.Y = r1
            r9.Z = r4
            java.lang.Object r10 = defpackage.an9.a(r5, r9)
            if (r10 != r0) goto L47
            return r0
        L47:
            if (r1 != 0) goto L4b
            spa r1 = defpackage.spa.f
        L4b:
            r10 = 0
            r9.X = r10
            r9.Y = r10
            r9.Z = r3
            r5.getClass()
            if (r6 == 0) goto L62
            java.util.Map r7 = r6.e
            if (r7 == 0) goto L62
            java.lang.String r8 = "screen_to"
            java.lang.Object r7 = r7.get(r8)
            goto L63
        L62:
            r7 = r10
        L63:
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto L6a
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L6b
        L6a:
            r7 = r10
        L6b:
            if (r7 != 0) goto L6e
            goto L8a
        L6e:
            int r8 = r7.intValue()
            if (r8 != r4) goto L8a
            if (r6 == 0) goto L81
            java.util.Map r4 = r6.e
            if (r4 == 0) goto L81
            java.lang.String r7 = "screen_from"
            java.lang.Object r4 = r4.get(r7)
            goto L82
        L81:
            r4 = r10
        L82:
            boolean r7 = r4 instanceof java.lang.Integer
            if (r7 == 0) goto L89
            r10 = r4
            java.lang.Integer r10 = (java.lang.Integer) r10
        L89:
            r7 = r10
        L8a:
            if (r7 != 0) goto L99
            java.lang.Class<an9> r9 = defpackage.an9.class
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "Can't send WARM_START event because last screenTo is empty"
            defpackage.hm9.n0(r9, r10)
        L97:
            r9 = r2
            goto Lbe
        L99:
            int r10 = r7.intValue()
            ky7 r10 = r5.b(r10, r6, r1)
            ms7 r10 = r5.c(r3, r10)
            java.util.concurrent.atomic.AtomicReference r1 = r5.k
            iz0 r3 = new iz0
            r4 = 7
            r3.<init>(r4, r10)
            r1.updateAndGet(r3)
            je7 r1 = r5.c
            java.lang.Object r1 = r1.getValue()
            ad r1 = (defpackage.ad) r1
            java.lang.Object r9 = r1.k(r10, r9)
            if (r9 != r0) goto L97
        Lbe:
            if (r9 != r0) goto Lc1
            return r0
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm9.o(java.lang.Object):java.lang.Object");
    }
}
