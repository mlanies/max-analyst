package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cge {
    public final w0f a;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final qi9 i;
    public final String b = cge.class.getName();
    public final aj9 h = bj9.a();

    public cge(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, w0f w0fVar) {
        this.a = w0fVar;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var3;
        this.f = je7Var4;
        this.g = je7Var5;
        long[] jArr = usc.a;
        this.i = new qi9();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.cge r4, defpackage.d7f r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.a(cge, d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.cge r8, defpackage.v6f r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.b(cge, v6f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.cge r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r0 = 1
            r5.getClass()
            boolean r1 = r7 instanceof defpackage.nfe
            if (r1 == 0) goto L17
            r1 = r7
            nfe r1 = (defpackage.nfe) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.Y = r2
            goto L1c
        L17:
            nfe r1 = new nfe
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.o
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.Y
            r4 = 2
            if (r3 == 0) goto L3a
            if (r3 == r0) goto L36
            if (r3 != r4) goto L2e
            defpackage.od2.a0(r7)
            goto Ld1
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            defpackage.od2.a0(r7)
            goto L85
        L3a:
            defpackage.od2.a0(r7)
            je7 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            hbd r7 = (defpackage.hbd) r7
            jbd r7 = (defpackage.jbd) r7
            int r7 = r7.h
            boolean r7 = defpackage.fme.a(r7)
            if (r7 != 0) goto L88
            java.lang.String r6 = r5.b
            java.lang.String r7 = "shouldRetryOnException: no connection, await for connection available"
            defpackage.hm9.n(r6, r7)
            je7 r6 = r5.e
            java.lang.Object r6 = r6.getValue()
            hbd r6 = (defpackage.hbd) r6
            jbd r6 = (defpackage.jbd) r6
            ml0 r6 = r6.e
            kj6 r7 = defpackage.kj6.Y
            r6.getClass()
            ty9 r3 = new ty9
            r3.<init>(r6, r7, r0)
            bkg r6 = new bkg
            r7 = 27
            r6.<init>(r7, r5)
            kj6 r5 = defpackage.ft.e
            r66 r7 = defpackage.ft.d
            oz9 r4 = new oz9
            r4.<init>(r3, r6, r5, r7)
            r1.Y = r0
            java.lang.Object r5 = defpackage.s36.g(r4, r1)
            if (r5 != r2) goto L85
            goto Ld5
        L85:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto Ld5
        L88:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            r3 = 0
            if (r7 == 0) goto L96
            java.lang.String r5 = r5.b
            java.lang.String r6 = "shouldRetryOnException: skipped retry on TamHttpUrlExpiredException"
            defpackage.hm9.n0(r5, r6)
        L94:
            r0 = r3
            goto Ld1
        L96:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpErrorException
            if (r7 == 0) goto Lb9
            r7 = r6
            one.me.sdk.transfer.exceptions.HttpErrorException r7 = (one.me.sdk.transfer.exceptions.HttpErrorException) r7
            eq6 r7 = r7.a
            boolean r7 = defpackage.nu0.x(r7)
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "shouldRetryOnException: error isCritical="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.p(r5, r1, r6)
            if (r7 != 0) goto L94
            goto Ld1
        Lb9:
            java.lang.String r5 = r5.b
            java.lang.String r7 = "shouldRetryOnException: can retry error"
            defpackage.hm9.l0(r5, r7, r6)
            int r5 = defpackage.ft4.o
            kt4 r5 = defpackage.kt4.SECONDS
            long r5 = defpackage.z7.R(r0, r5)
            r1.Y = r4
            java.lang.Object r5 = defpackage.j47.y(r5, r1)
            if (r5 != r2) goto Ld1
            goto Ld5
        Ld1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.c(cge, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.d7f r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gfe
            if (r0 == 0) goto L13
            r0 = r11
            gfe r0 = (defpackage.gfe) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            gfe r0 = new gfe
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.od2.a0(r11)
            goto L78
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            d7f r10 = r0.X
            cge r9 = r0.o
            defpackage.od2.a0(r11)
            goto L6b
        L3b:
            defpackage.od2.a0(r11)
            java.lang.String r11 = r9.b
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L45
            goto L5e
        L45:
            boolean r6 = r2.c()
            if (r6 == 0) goto L5e
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cancelling upload="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L5e:
            r0.o = r9
            r0.X = r10
            r0.s0 = r5
            java.lang.Object r11 = r9.h(r10, r0)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            r0.o = r3
            r0.X = r3
            r0.s0 = r4
            java.lang.Object r9 = r9.g(r10, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.d(d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.v6f r9, defpackage.it3 r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.hfe
            if (r0 == 0) goto L13
            r0 = r11
            hfe r0 = (defpackage.hfe) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            hfe r0 = new hfe
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            it3 r10 = r0.Y
            v6f r9 = r0.X
            cge r8 = r0.o
            defpackage.od2.a0(r11)
            goto L6b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.od2.a0(r11)
            java.lang.String r11 = r8.b
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L40
            goto L55
        L40:
            boolean r5 = r2.c()
            if (r5 == 0) goto L55
            us7 r5 = defpackage.us7.X
            d7f r6 = r9.a
            java.lang.String r6 = r6.a
            java.lang.String r7 = "copyFromUri: started for uri="
            java.lang.String r6 = defpackage.wg0.i(r7, r6)
            r2.d(r5, r11, r6, r3)
        L55:
            a81 r11 = new a81
            r2 = 13
            r11.<init>(r8, r9, r10, r2)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.t0 = r4
            java.lang.Object r11 = defpackage.ema.C(r11, r0)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = defpackage.kj6.h(r11)
            if (r0 == 0) goto La3
            java.lang.String r8 = r8.b
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L7a
            goto L8f
        L7a:
            boolean r1 = r0.c()
            if (r1 == 0) goto L8f
            us7 r1 = defpackage.us7.X
            d7f r2 = r9.a
            java.lang.String r2 = r2.a
            java.lang.String r4 = "copyFromUri: finished for uri="
            java.lang.String r2 = defpackage.wg0.i(r4, r2)
            r0.d(r1, r8, r2, r3)
        L8f:
            u6f r8 = r9.b()
            r8.b = r11
            java.lang.String r9 = r10.c
            r8.c = r9
            long r9 = r10.b
            r8.f = r9
            v6f r9 = new v6f
            r9.<init>(r8)
            return r9
        La3:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = "failed to copy file"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.e(v6f, it3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(v6f v6fVar, Continuation continuation) {
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "putInRepository: started for=" + v6fVar, null);
        }
        Object objE = s36.e(((y8f) this.f.getValue()).a(v6fVar), continuation);
        return objE == tx3.a ? objE : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.d7f r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jfe
            if (r0 == 0) goto L13
            r0 = r6
            jfe r0 = (defpackage.jfe) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            jfe r0 = new jfe
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            aj9 r4 = r0.Y
            d7f r5 = r0.X
            cge r0 = r0.o
            defpackage.od2.a0(r6)
            r6 = r4
            r4 = r0
            goto L4b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            defpackage.od2.a0(r6)
            r0.o = r4
            r0.X = r5
            aj9 r6 = r4.h
            r0.Y = r6
            r0.t0 = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = 0
            qi9 r4 = r4.i     // Catch: java.lang.Throwable -> L58
            java.lang.Object r4 = r4.i(r5)     // Catch: java.lang.Throwable -> L58
            mn5 r4 = (defpackage.mn5) r4     // Catch: java.lang.Throwable -> L58
            r6.e(r0)
            return r4
        L58:
            r4 = move-exception
            r6.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.g(d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object h(d7f d7fVar, Continuation continuation) {
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "removeFromRepository: started for=" + d7fVar, null);
        }
        Object objE = s36.e(((y8f) this.f.getValue()).c(d7fVar), continuation);
        return objE == tx3.a ? objE : e5f.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:16|44|45|(1:(1:49)(2:50|51))|55|23|(1:25)(6:26|27|28|45|(0)|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r15 = r4;
        r4 = r1;
        r1 = r15;
        r16 = r10;
        r10 = r2;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Path cross not found for [B:34:0x009a, B:39:0x00e9], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:45:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e6 -> B:44:0x0100). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fd -> B:44:0x0100). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.dle r18, long r19, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.i(dle, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
