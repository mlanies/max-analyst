package defpackage;

/* loaded from: classes2.dex */
public abstract class w97 implements z97 {
    public final zt0 a = c37.a(Integer.MAX_VALUE, 0, 6);
    public final ua3 b = ngg.a();

    public final void a(Object obj) {
        this.a.i(null);
        this.b.makeCompleting$kotlinx_coroutines_core(new pjc(obj));
    }

    public final void b(Throwable th) {
        this.a.i(null);
        ua3 ua3Var = this.b;
        ua3Var.getClass();
        ua3Var.makeCompleting$kotlinx_coroutines_core(new lb3(th, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.a66 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.s97
            if (r0 == 0) goto L13
            r0 = r7
            s97 r0 = (defpackage.s97) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            s97 r0 = new s97
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.o
            w97 r5 = (defpackage.w97) r5
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L6c
            goto L6c
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            w97 r5 = r0.X
            java.lang.Object r6 = r0.o
            a66 r6 = (defpackage.a66) r6
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L6c
            goto L52
        L40:
            defpackage.od2.a0(r7)
            ua3 r7 = r5.b     // Catch: java.lang.Throwable -> L6c
            r0.o = r6     // Catch: java.lang.Throwable -> L6c
            r0.X = r5     // Catch: java.lang.Throwable -> L6c
            r0.s0 = r4     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.awaitInternal(r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r1) goto L52
            return r1
        L52:
            pjc r7 = (defpackage.pjc) r7     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.a     // Catch: java.lang.Throwable -> L6c
            boolean r2 = r7 instanceof defpackage.njc     // Catch: java.lang.Throwable -> L6c
            r2 = r2 ^ r4
            if (r2 == 0) goto L6c
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L6c
            r0.o = r5     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r0.X = r2     // Catch: java.lang.Throwable -> L6c
            r0.s0 = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6c
            if (r6 != r1) goto L6c
            return r1
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.c(a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.a66 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.t97
            if (r0 == 0) goto L13
            r0 = r8
            t97 r0 = (defpackage.t97) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            t97 r0 = new t97
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.o
            w97 r6 = (defpackage.w97) r6
            defpackage.od2.a0(r8)
            goto La9
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.X
            w97 r6 = (defpackage.w97) r6
            java.lang.Object r7 = r0.o
            a66 r7 = (defpackage.a66) r7
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L46
            goto L8d
        L46:
            r8 = move-exception
            goto L90
        L48:
            java.lang.Object r6 = r0.X
            w97 r6 = (defpackage.w97) r6
            java.lang.Object r7 = r0.o
            a66 r7 = (defpackage.a66) r7
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L46
            goto L66
        L54:
            defpackage.od2.a0(r8)
            ua3 r8 = r6.b     // Catch: java.lang.Throwable -> L46
            r0.o = r7     // Catch: java.lang.Throwable -> L46
            r0.X = r6     // Catch: java.lang.Throwable -> L46
            r0.s0 = r5     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = r8.awaitInternal(r0)     // Catch: java.lang.Throwable -> L46
            if (r8 != r1) goto L66
            return r1
        L66:
            pjc r8 = (defpackage.pjc) r8     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = r8.a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r8 instanceof defpackage.njc     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L8d
            java.lang.Throwable r8 = defpackage.pjc.a(r8)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L81
            r0.o = r7     // Catch: java.lang.Throwable -> L46
            r0.X = r6     // Catch: java.lang.Throwable -> L46
            r0.s0 = r4     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L46
            if (r8 != r1) goto L8d
            return r1
        L81:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L46
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L46
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L46
            throw r2     // Catch: java.lang.Throwable -> L46
        L8d:
            e5f r8 = defpackage.e5f.a     // Catch: java.lang.Throwable -> L46
            goto L96
        L90:
            njc r2 = new njc
            r2.<init>(r8)
            r8 = r2
        L96:
            java.lang.Throwable r2 = defpackage.pjc.a(r8)
            if (r2 == 0) goto La9
            r0.o = r6
            r0.X = r8
            r0.s0 = r3
            java.lang.Object r7 = r7.invoke(r2, r0)
            if (r7 != r1) goto La9
            return r1
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.d(a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xwf r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.u97
            if (r0 == 0) goto L13
            r0 = r6
            u97 r0 = (defpackage.u97) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            u97 r0 = new u97
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            w97 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r6)
            v97 r6 = new v97
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = defpackage.j1e.k(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.e(xwf, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
