package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ouf {
    public final long a;
    public final long b;
    public final sx3 c;
    public final Context d;
    public final j0e e;
    public final kxf f;
    public final String g;
    public final je7 h;
    public final je7 i;
    public final kld j;
    public final v7c k;
    public volatile w97 l;

    public ouf(long j, long j2, sx3 sx3Var, Context context, w7c w7cVar, je7 je7Var, je7 je7Var2) {
        StringBuilder sbK = au1.k(j, "webapp_biom_s_key_", "_");
        sbK.append(j2);
        kxf kxfVar = new kxf(sbK.toString(), true);
        this.a = j;
        this.b = j2;
        this.c = sx3Var;
        this.d = context;
        this.e = w7cVar;
        this.f = kxfVar;
        this.g = ouf.class.getName();
        this.h = je7Var;
        this.i = je7Var2;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.j = kldVarB;
        this.k = new v7c(kldVarB);
    }

    public static final mtf a(ouf oufVar) {
        return (mtf) oufVar.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ouf r6, defpackage.hn0 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.xtf
            if (r0 == 0) goto L13
            r0 = r8
            xtf r0 = (defpackage.xtf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            xtf r0 = new xtf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            hn0 r7 = r0.X
            ouf r6 = r0.o
            defpackage.od2.a0(r8)
            goto L53
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.od2.a0(r8)
            kke r8 = r6.e()
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            ytf r2 = new ytf
            r2.<init>(r6, r3)
            r0.o = r6
            r0.X = r7
            r0.s0 = r4
            java.lang.Object r8 = defpackage.j47.t0(r8, r2, r0)
            if (r8 != r1) goto L53
            goto L78
        L53:
            puf r8 = (defpackage.puf) r8
            nn0 r0 = new nn0
            boolean r1 = r6.f()
            boolean r2 = r8.e
            boolean r5 = r8.f
            java.lang.String r8 = r8.d
            if (r8 == 0) goto L6c
            int r8 = r8.length()
            if (r8 != 0) goto L6a
            goto L6c
        L6a:
            r8 = 0
            goto L6d
        L6c:
            r8 = r4
        L6d:
            r8 = r8 ^ r4
            r0.<init>(r1, r2, r5, r8)
            r7.a(r0)
            r6.l = r3
            e5f r1 = defpackage.e5f.a
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.b(ouf, hn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ouf r5, defpackage.in0 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.auf
            if (r0 == 0) goto L13
            r0 = r7
            auf r0 = (defpackage.auf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            auf r0 = new auf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            in0 r6 = r0.X
            ouf r5 = r0.o
            defpackage.od2.a0(r7)
            goto L53
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.od2.a0(r7)
            kke r7 = r5.e()
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            buf r2 = new buf
            r2.<init>(r5, r4)
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L53
            goto L78
        L53:
            puf r7 = (defpackage.puf) r7
            if (r7 == 0) goto L59
            java.lang.String r4 = r7.d
        L59:
            e5f r1 = defpackage.e5f.a
            if (r7 == 0) goto L70
            if (r4 == 0) goto L70
            int r7 = r4.length()
            if (r7 != 0) goto L66
            goto L70
        L66:
            kxf r5 = r5.f
            java.lang.String r5 = defpackage.kxf.a(r5, r4)
            r6.a(r5)
            goto L78
        L70:
            vuf r5 = new vuf
            r5.<init>()
            r6.b(r5)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.c(ouf, in0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ouf r7, defpackage.ln0 r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.muf
            if (r0 == 0) goto L13
            r0 = r9
            muf r0 = (defpackage.muf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            muf r0 = new muf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            ln0 r8 = r0.o
            defpackage.od2.a0(r9)
            goto L5d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.od2.a0(r9)
            java.lang.String r9 = r8.d
            if (r9 != 0) goto L3c
        L3a:
            r1 = r3
            goto L61
        L3c:
            kxf r2 = r7.f
            java.lang.String r9 = r2.b(r9)
            kke r2 = r7.e()
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            nuf r5 = new nuf
            r6 = 0
            r5.<init>(r7, r9, r6)
            r0.o = r8
            r0.Z = r4
            java.lang.Object r7 = defpackage.j47.t0(r2, r5, r0)
            if (r7 != r1) goto L5d
            goto L61
        L5d:
            r8.a(r3)
            goto L3a
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.d(ouf, ln0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String g(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.length() > 128 ? w9e.Y0(128, str) : str;
    }

    public final kke e() {
        return (kke) this.i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:3:0x0002, B:59:0x00cd, B:69:0x00f2, B:62:0x00d4, B:64:0x00da, B:7:0x0022, B:8:0x0028, B:10:0x0030, B:12:0x0038, B:15:0x0040, B:21:0x0051, B:23:0x0057, B:25:0x0061, B:27:0x006d, B:32:0x007d, B:47:0x00a8, B:52:0x00b8, B:53:0x00bd, B:50:0x00b2, B:35:0x0085, B:38:0x008a, B:40:0x0096, B:43:0x00a0, B:31:0x0079, B:57:0x00c6), top: B:78:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:3:0x0002, B:59:0x00cd, B:69:0x00f2, B:62:0x00d4, B:64:0x00da, B:7:0x0022, B:8:0x0028, B:10:0x0030, B:12:0x0038, B:15:0x0040, B:21:0x0051, B:23:0x0057, B:25:0x0061, B:27:0x006d, B:32:0x007d, B:47:0x00a8, B:52:0x00b8, B:53:0x00bd, B:50:0x00b2, B:35:0x0085, B:38:0x008a, B:40:0x0096, B:43:0x00a0, B:31:0x0079, B:57:0x00c6), top: B:78:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:3:0x0002, B:59:0x00cd, B:69:0x00f2, B:62:0x00d4, B:64:0x00da, B:7:0x0022, B:8:0x0028, B:10:0x0030, B:12:0x0038, B:15:0x0040, B:21:0x0051, B:23:0x0057, B:25:0x0061, B:27:0x006d, B:32:0x007d, B:47:0x00a8, B:52:0x00b8, B:53:0x00bd, B:50:0x00b2, B:35:0x0085, B:38:0x008a, B:40:0x0096, B:43:0x00a0, B:31:0x0079, B:57:0x00c6), top: B:78:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.mn0 r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.h(mn0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.kn0 r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.duf
            if (r0 == 0) goto L13
            r0 = r11
            duf r0 = (defpackage.duf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            duf r0 = new duf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r4) goto L2e
            defpackage.od2.a0(r11)
            goto Ld6
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            kn0 r10 = r0.X
            ouf r9 = r0.o
            defpackage.od2.a0(r11)
            goto L6c
        L3e:
            defpackage.od2.a0(r11)
            boolean r11 = r9.f()
            if (r11 != 0) goto L50
            suf r9 = new suf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L50:
            kke r11 = r9.e()
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            euf r2 = new euf
            r2.<init>(r9, r5)
            r0.o = r9
            r0.X = r10
            r0.s0 = r6
            java.lang.Object r11 = defpackage.j47.t0(r11, r2, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            puf r11 = (defpackage.puf) r11
            if (r11 != 0) goto L79
            suf r9 = new suf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L79:
            boolean r2 = r11.e
            if (r2 == 0) goto L8c
            boolean r11 = r11.f
            if (r11 == 0) goto L8c
            tuf r9 = new tuf
            evf r11 = defpackage.evf.s0
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L8c:
            w97 r11 = r9.l
            if (r11 == 0) goto L98
            s0 r2 = new s0
            r2.<init>()
            r11.b(r2)
        L98:
            r9.l = r10
            int r10 = defpackage.mla.b
            eqe r11 = new eqe
            r11.<init>(r10)
            mg3 r10 = new mg3
            int r2 = defpackage.mla.a
            eqe r7 = new eqe
            r7.<init>(r2)
            r2 = 3
            r10.<init>(r6, r7, r2, r6)
            mg3 r2 = new mg3
            int r7 = defpackage.mla.d
            eqe r8 = new eqe
            r8.<init>(r7)
            r2.<init>(r4, r8, r4, r6)
            mg3[] r10 = new defpackage.mg3[]{r10, r2}
            java.util.List r10 = defpackage.y53.M(r10)
            kld r9 = r9.j
            qtf r2 = new qtf
            r2.<init>(r11, r10)
            r0.o = r5
            r0.X = r5
            r0.s0 = r4
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Ld6
            return r1
        Ld6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.i(kn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.hn0 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.j(hn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.in0 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.k(in0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ln0 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.juf
            if (r0 == 0) goto L13
            r0 = r10
            juf r0 = (defpackage.juf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            juf r0 = new juf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            defpackage.od2.a0(r10)
            goto Ld7
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ln0 r9 = r0.X
            java.lang.Object r8 = r0.o
            ouf r8 = (defpackage.ouf) r8
            defpackage.od2.a0(r10)     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            goto L7f
        L43:
            java.lang.Object r8 = r0.o
            r9 = r8
            ln0 r9 = (defpackage.ln0) r9
            defpackage.od2.a0(r10)
            goto Ld4
        L4d:
            defpackage.od2.a0(r10)
            java.lang.String r10 = r9.d
            if (r10 == 0) goto Lba
            int r10 = r10.length()
            if (r10 != 0) goto L5b
            goto Lba
        L5b:
            kxf r10 = r8.f     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            java.lang.String r2 = r9.d     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            java.lang.String r10 = r10.b(r2)     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            kke r2 = r8.e()     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            w9a r2 = (defpackage.w9a) r2     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            nx3 r2 = r2.b()     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            luf r6 = new luf     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            r6.<init>(r8, r10, r7)     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            r0.o = r8     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            r0.X = r9     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            r0.s0 = r5     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            java.lang.Object r10 = defpackage.j47.t0(r2, r6, r0)     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            if (r10 != r1) goto L7f
            return r1
        L7f:
            r9.a(r3)     // Catch: android.security.keystore.UserNotAuthenticatedException -> L83
            goto Ld7
        L83:
            java.lang.String r10 = r8.g
            java.lang.String r2 = "Can't update token because need auth by biometry"
            defpackage.hm9.n0(r10, r2)
            w97 r10 = r8.l
            if (r10 == 0) goto L96
            s0 r2 = new s0
            r2.<init>()
            r10.b(r2)
        L96:
            r8.l = r9
            java.lang.String r9 = r9.e
            java.lang.String r9 = g(r9)
            kld r10 = r8.j
            ntf r2 = new ntf
            j0e r8 = r8.e
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r2.<init>(r7, r8, r9)
            r0.o = r7
            r0.X = r7
            r0.s0 = r4
            java.lang.Object r8 = r10.a(r2, r0)
            if (r8 != r1) goto Ld7
            return r1
        Lba:
            kke r10 = r8.e()
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            kuf r2 = new kuf
            r2.<init>(r8, r9, r7)
            r0.o = r9
            r0.s0 = r6
            java.lang.Object r8 = defpackage.j47.t0(r10, r2, r0)
            if (r8 != r1) goto Ld4
            return r1
        Ld4:
            r9.a(r3)
        Ld7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.l(ln0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
