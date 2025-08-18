package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j39 extends ffe implements a66 {
    public l29 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ n59 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j39(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j39) n((kpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j39 j39Var = new j39(this.s0, continuation);
        j39Var.Z = obj;
        return j39Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Y
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            n59 r7 = r9.s0
            if (r1 == 0) goto L32
            if (r1 == r6) goto L28
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            defpackage.od2.a0(r10)
            goto L75
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L20:
            java.lang.Object r1 = r9.Z
            l29 r1 = (defpackage.l29) r1
            defpackage.od2.a0(r10)
            goto L69
        L28:
            l29 r1 = r9.X
            java.lang.Object r6 = r9.Z
            e52 r6 = (defpackage.e52) r6
            defpackage.od2.a0(r10)
            goto L56
        L32:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Z
            kpa r10 = (defpackage.kpa) r10
            java.lang.Object r1 = r10.a
            e52 r1 = (defpackage.e52) r1
            java.lang.Object r10 = r10.b
            l29 r10 = (defpackage.l29) r10
            bc7[] r8 = defpackage.n59.D1
            w5f r8 = r7.D()
            r9.Z = r1
            r9.X = r10
            r9.Y = r6
            java.lang.Object r6 = r8.a(r1, r10, r9)
            if (r6 != r0) goto L54
            return r0
        L54:
            r6 = r1
            r1 = r10
        L56:
            bc7[] r10 = defpackage.n59.D1
            l89 r10 = r7.B()
            r9.Z = r1
            r9.X = r3
            r9.Y = r5
            java.lang.Object r10 = r10.e(r6, r1, r9)
            if (r10 != r0) goto L69
            return r0
        L69:
            q0e r10 = r7.p1
            r9.Z = r3
            r9.Y = r4
            r10.setValue(r1)
            if (r2 != r0) goto L75
            return r0
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j39.o(java.lang.Object):java.lang.Object");
    }
}
