package defpackage;

/* loaded from: classes.dex */
public final class cp5 implements mn5 {
    public final /* synthetic */ mn5 a;
    public final /* synthetic */ c66 b;

    public cp5(mn5 mn5Var, c66 c66Var) {
        this.a = mn5Var;
        this.b = c66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bp5
            if (r0 == 0) goto L13
            r0 = r10
            bp5 r0 = (defpackage.bp5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            bp5 r0 = new bp5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.Z
            iqc r8 = (defpackage.iqc) r8
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r9 = move-exception
            goto L84
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.Z
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.od2.a0(r10)
            goto L9c
        L44:
            on5 r9 = r0.s0
            java.lang.Object r8 = r0.Z
            cp5 r8 = (defpackage.cp5) r8
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L4e
            goto L65
        L4e:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L88
        L53:
            defpackage.od2.a0(r10)
            mn5 r10 = r8.a     // Catch: java.lang.Throwable -> L4e
            r0.Z = r8     // Catch: java.lang.Throwable -> L4e
            r0.s0 = r9     // Catch: java.lang.Throwable -> L4e
            r0.X = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r10 = r10.d(r9, r0)     // Catch: java.lang.Throwable -> L4e
            if (r10 != r1) goto L65
            return r1
        L65:
            iqc r10 = new iqc
            lx3 r2 = r0.b
            r10.<init>(r9, r2)
            c66 r8 = r8.b     // Catch: java.lang.Throwable -> L82
            r0.Z = r10     // Catch: java.lang.Throwable -> L82
            r0.s0 = r6     // Catch: java.lang.Throwable -> L82
            r0.X = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r8.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r8 != r1) goto L7b
            return r1
        L7b:
            r8 = r10
        L7c:
            r8.p()
            e5f r8 = defpackage.e5f.a
            return r8
        L82:
            r9 = move-exception
            r8 = r10
        L84:
            r8.p()
            throw r9
        L88:
            jte r10 = new jte
            r10.<init>(r8)
            c66 r9 = r9.b
            r0.Z = r8
            r0.s0 = r6
            r0.X = r4
            java.lang.Object r9 = defpackage.z04.b(r10, r9, r8, r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp5.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
