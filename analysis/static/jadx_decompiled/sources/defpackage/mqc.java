package defpackage;

/* loaded from: classes.dex */
public final class mqc implements mn5, vy1 {
    public final a66 a;

    public mqc(a66 a66Var) {
        this.a = a66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.o0
            if (r0 == 0) goto L13
            r0 = r7
            o0 r0 = (defpackage.o0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            o0 r0 = new o0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            iqc r5 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L51
        L2b:
            r6 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r7)
            iqc r7 = new iqc
            lx3 r2 = r0.b
            r7.<init>(r6, r2)
            r0.o = r7     // Catch: java.lang.Throwable -> L5b
            r0.Z = r4     // Catch: java.lang.Throwable -> L5b
            a66 r5 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.invoke(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != r1) goto L4c
            goto L4d
        L4c:
            r5 = r3
        L4d:
            if (r5 != r1) goto L50
            return r1
        L50:
            r5 = r7
        L51:
            r5.p()
            return r3
        L55:
            r6 = r5
            goto L59
        L57:
            r5 = move-exception
            goto L55
        L59:
            r5 = r7
            goto L5d
        L5b:
            r6 = move-exception
            goto L59
        L5d:
            r5.p()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqc.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
