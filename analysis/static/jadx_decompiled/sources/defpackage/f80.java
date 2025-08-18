package defpackage;

/* loaded from: classes2.dex */
public final class f80 {
    public final je7 a;
    public final je7 b;

    public f80(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.e80
            if (r0 == 0) goto L13
            r0 = r9
            e80 r0 = (defpackage.e80) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            e80 r0 = new e80
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            f80 r6 = r0.o
            defpackage.od2.a0(r9)
            goto L84
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.od2.a0(r9)
            je7 r9 = r6.b
            java.lang.Object r9 = r9.getValue()
            e5a r9 = (defpackage.e5a) r9
            r0.o = r6
            r0.Z = r3
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ome r9 = (defpackage.ome) r9
            x70 r2 = new x70
            sla r4 = defpackage.sla.u0
            r2.<init>(r4)
            r4 = 0
            if (r8 == 0) goto L5b
            int r5 = r8.length()
            if (r5 != 0) goto L59
            goto L5b
        L59:
            r5 = r4
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r5 = r5 ^ r3
            if (r5 == 0) goto La0
            java.lang.String r5 = "token"
            r2.p(r5, r8)
            if (r7 == 0) goto L6c
            int r8 = r7.length()
            if (r8 != 0) goto L6d
        L6c:
            r4 = r3
        L6d:
            r8 = r4 ^ 1
            if (r8 == 0) goto L94
            java.lang.String r8 = "verifyCode"
            r2.p(r8, r7)
            java.lang.String r7 = "authTokenType"
            java.lang.String r8 = "CHECK_CODE"
            r2.p(r7, r8)
            java.lang.Object r9 = r9.e(r2, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            y70 r9 = (defpackage.y70) r9
            je7 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            ad r6 = (defpackage.ad) r6
            java.lang.String r7 = "CONFIRM_PHONE_SUCCESS"
            r6.f(r7)
            return r9
        L94:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'verifyCode' can't be null when param 'authTokenType' is 'PHONE' or 'PHONE_CONFIRM'"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        La0:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "AuthCmd param 'token' can't be null"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f80.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
