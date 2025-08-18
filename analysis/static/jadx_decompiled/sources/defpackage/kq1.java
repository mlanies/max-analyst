package defpackage;

/* loaded from: classes.dex */
public final class kq1 extends m32 {
    public final a66 Y;

    public kq1(a66 a66Var, lx3 lx3Var, int i, int i2) {
        super(a66Var, lx3Var, i, i2, 0);
        this.Y = a66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.m32, defpackage.l32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.iab r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jq1
            if (r0 == 0) goto L13
            r0 = r6
            jq1 r0 = (defpackage.jq1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            jq1 r0 = new jq1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            iab r5 = r0.o
            defpackage.od2.a0(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r4 = super.j(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            fab r5 = (defpackage.fab) r5
            e32 r4 = r5.a
            boolean r4 = r4.p()
            if (r4 == 0) goto L4c
            e5f r4 = defpackage.e5f.a
            return r4
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq1.j(iab, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.m32, defpackage.l32
    public final l32 k(lx3 lx3Var, int i, int i2) {
        return new kq1(this.Y, lx3Var, i, i2);
    }
}
