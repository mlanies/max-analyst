package defpackage;

/* loaded from: classes2.dex */
public final class b80 {
    public final je7 a;

    public b80(je7 je7Var) {
        this.a = je7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afc r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.a80
            if (r0 == 0) goto L13
            r0 = r11
            a80 r0 = (defpackage.a80) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            a80 r0 = new a80
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.od2.a0(r11)
            goto Lb5
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.od2.a0(r11)
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            e5a r9 = (defpackage.e5a) r9
            java.lang.String r11 = r10.a
            r2 = 0
            java.lang.Long r4 = r10.X
            if (r4 == 0) goto L44
            r5 = r3
            goto L45
        L44:
            r5 = r2
        L45:
            r0.Y = r3
            r9.getClass()
            au r6 = new au
            sla r7 = defpackage.sla.z0
            r8 = 7
            r6.<init>(r7, r8)
            if (r11 == 0) goto L5d
            int r7 = r11.length()
            if (r7 != 0) goto L5b
            goto L5d
        L5b:
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r7 = r7 ^ r3
            if (r7 == 0) goto Lc4
            java.lang.String r7 = "token"
            r6.p(r7, r11)
            java.lang.String r11 = "tokenType"
            java.lang.String r7 = "REGISTER"
            r6.p(r11, r7)
            java.lang.String r11 = r10.c
            if (r11 == 0) goto L77
            int r7 = r11.length()
            if (r7 != 0) goto L78
        L77:
            r2 = r3
        L78:
            r2 = r2 ^ r3
            if (r2 == 0) goto Lb8
            java.lang.String r2 = "firstName"
            r6.p(r2, r11)
            java.lang.String r10 = r10.o
            if (r10 == 0) goto L90
            int r11 = r10.length()
            if (r11 != 0) goto L8b
            goto L90
        L8b:
            java.lang.String r11 = "lastName"
            r6.p(r11, r10)
        L90:
            if (r4 == 0) goto L9b
            long r10 = r4.longValue()
            java.lang.String r2 = "photoId"
            r6.i(r10, r2)
        L9b:
            if (r5 == 0) goto La6
            java.lang.String r10 = defpackage.au1.e(r5)
            java.lang.String r11 = "avatarType"
            r6.p(r11, r10)
        La6:
            je7 r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            ome r9 = (defpackage.ome) r9
            java.lang.Object r11 = r9.e(r6, r0)
            if (r11 != r1) goto Lb5
            return r1
        Lb5:
            z70 r11 = (defpackage.z70) r11
            return r11
        Lb8:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'firstName' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lc4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "AuthConfirmCmd param 'token' can't be null"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b80.a(afc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
