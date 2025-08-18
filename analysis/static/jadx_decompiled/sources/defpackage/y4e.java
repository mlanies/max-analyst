package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y4e {
    public final je7 a;
    public final je7 b;

    public y4e(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public static /* synthetic */ Object d(y4e y4eVar, String str, long j, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            j = 0;
        }
        return y4eVar.c(str2, j, 50, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r5, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.v4e
            if (r0 == 0) goto L13
            r0 = r7
            v4e r0 = (defpackage.v4e) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            v4e r0 = new v4e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r7)
            goto L64
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r7)
            je7 r4 = r4.a
            java.lang.Object r7 = r4.getValue()
            o2e r7 = (defpackage.o2e) r7
            java.util.concurrent.ConcurrentHashMap r7 = r7.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r7.get(r2)
            d2e r7 = (defpackage.d2e) r7
            if (r7 != 0) goto L6d
            java.lang.Object r4 = r4.getValue()
            o2e r4 = (defpackage.o2e) r4
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            java.util.List r5 = java.util.Collections.singletonList(r7)
            uqd r4 = r4.b(r5)
            r0.Y = r3
            java.lang.Object r7 = defpackage.s36.f(r4, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = defpackage.x53.i0(r7)
            r7 = r4
            d2e r7 = (defpackage.d2e) r7
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4e.a(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r16, long r17, int r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof defpackage.w4e
            if (r2 == 0) goto L16
            r2 = r1
            w4e r2 = (defpackage.w4e) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.Z = r3
            goto L1b
        L16:
            w4e r2 = new w4e
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r0 = r2.o
            gu r0 = (defpackage.gu) r0
            defpackage.od2.a0(r1)
            goto L85
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r0 = r2.o
            y4e r0 = (defpackage.y4e) r0
            defpackage.od2.a0(r1)
            goto L67
        L41:
            defpackage.od2.a0(r1)
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            pk r1 = (defpackage.pk) r1
            au r4 = new au
            r8 = 2
            r9 = 0
            r7 = r4
            r10 = r17
            r12 = r19
            r13 = r16
            r7.<init>(r8, r9, r10, r12, r13)
            r2.o = r0
            r2.Z = r6
            k4a r1 = (defpackage.k4a) r1
            java.lang.Object r1 = r1.J(r4, r2)
            if (r1 != r3) goto L67
            return r3
        L67:
            gu r1 = (defpackage.gu) r1
            je7 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            o2e r0 = (defpackage.o2e) r0
            java.util.List r4 = r1.c
            uqd r0 = r0.b(r4)
            r2.o = r1
            r2.Z = r5
            java.lang.Object r0 = defpackage.s36.f(r0, r2)
            if (r0 != r3) goto L82
            return r3
        L82:
            r14 = r1
            r1 = r0
            r0 = r14
        L85:
            java.util.List r1 = (java.util.List) r1
            t4e r2 = new t4e
            long r3 = r0.Y
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4e.b(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, long r15, int r17, kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof defpackage.x4e
            if (r2 == 0) goto L16
            r2 = r1
            x4e r2 = (defpackage.x4e) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.Y = r3
            goto L1b
        L16:
            x4e r2 = new x4e
            r2.<init>(r13, r1)
        L1b:
            java.lang.Object r1 = r2.o
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L32
            if (r4 != r5) goto L2a
            defpackage.od2.a0(r1)
            goto L54
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            defpackage.od2.a0(r1)
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            au r1 = new au
            r7 = 3
            r8 = 0
            r6 = r1
            r9 = r15
            r11 = r17
            r12 = r14
            r6.<init>(r7, r8, r9, r11, r12)
            r2.Y = r5
            k4a r0 = (defpackage.k4a) r0
            java.lang.Object r1 = r0.J(r1, r2)
            if (r1 != r3) goto L54
            return r3
        L54:
            gu r1 = (defpackage.gu) r1
            u4e r0 = new u4e
            java.util.List r2 = r1.o
            long r3 = r1.Y
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4e.c(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
