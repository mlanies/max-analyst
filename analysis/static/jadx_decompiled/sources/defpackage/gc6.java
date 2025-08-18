package defpackage;

/* loaded from: classes2.dex */
public final class gc6 {
    public final je7 a;
    public final je7 b;

    public gc6(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, java.lang.Long r10, java.lang.String r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.fc6
            if (r0 == 0) goto L13
            r0 = r12
            fc6 r0 = (defpackage.fc6) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            fc6 r0 = new fc6
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.String r7 = r0.X
            java.lang.Object r8 = r0.o
            java.lang.String r8 = (java.lang.String) r8
            defpackage.od2.a0(r12)
            goto Lbb
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            long r8 = r0.Y
            java.lang.Object r7 = r0.o
            gc6 r7 = (defpackage.gc6) r7
            defpackage.od2.a0(r12)     // Catch: java.lang.Throwable -> L44
            goto L89
        L44:
            r10 = move-exception
            goto L8c
        L46:
            defpackage.od2.a0(r12)
            gs9 r12 = new gs9
            if (r11 == 0) goto L53
            boolean r2 = defpackage.w9e.C0(r11)
            if (r2 == 0) goto L54
        L53:
            r11 = r5
        L54:
            sla r2 = defpackage.sla.p2
            r6 = 17
            r12.<init>(r2, r6)
            java.lang.String r2 = "botId"
            r12.i(r8, r2)
            if (r10 == 0) goto L6b
            java.lang.Object r2 = r12.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r6 = "chatId"
            r2.put(r6, r10)
        L6b:
            if (r11 == 0) goto L72
            java.lang.String r10 = "startParam"
            r12.p(r10, r11)
        L72:
            je7 r10 = r7.a     // Catch: java.lang.Throwable -> L44
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L44
            pk r10 = (defpackage.pk) r10     // Catch: java.lang.Throwable -> L44
            r0.o = r7     // Catch: java.lang.Throwable -> L44
            r0.Y = r8     // Catch: java.lang.Throwable -> L44
            r0.t0 = r4     // Catch: java.lang.Throwable -> L44
            k4a r10 = (defpackage.k4a) r10     // Catch: java.lang.Throwable -> L44
            java.lang.Object r12 = r10.J(r12, r0)     // Catch: java.lang.Throwable -> L44
            if (r12 != r1) goto L89
            return r1
        L89:
            rxf r12 = (defpackage.rxf) r12     // Catch: java.lang.Throwable -> L44
            goto L91
        L8c:
            njc r12 = new njc
            r12.<init>(r10)
        L91:
            boolean r10 = r12 instanceof defpackage.njc
            if (r10 == 0) goto L96
            r12 = r5
        L96:
            rxf r12 = (defpackage.rxf) r12
            if (r12 != 0) goto L9b
            return r5
        L9b:
            java.lang.String r10 = r12.c
            if (r10 != 0) goto La0
            return r5
        La0:
            je7 r7 = r7.b
            java.lang.Object r7 = r7.getValue()
            uc6 r7 = (defpackage.uc6) r7
            r0.o = r10
            java.lang.String r11 = r12.o
            r0.X = r11
            r0.t0 = r3
            kk0 r12 = defpackage.kk0.c
            java.lang.Object r12 = r7.a(r8, r12, r0)
            if (r12 != r1) goto Lb9
            return r1
        Lb9:
            r8 = r10
            r7 = r11
        Lbb:
            rc6 r12 = (defpackage.rc6) r12
            java.lang.String r9 = r12.a
            la9 r10 = new la9
            java.lang.CharSequence r9 = defpackage.w9e.b1(r9)
            java.lang.String r9 = r9.toString()
            r10.<init>(r9, r8, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc6.a(long, java.lang.Long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
