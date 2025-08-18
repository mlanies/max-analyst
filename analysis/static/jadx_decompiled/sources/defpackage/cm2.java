package defpackage;

/* loaded from: classes2.dex */
public final class cm2 {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public cm2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        this.g = je7Var7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tl2
            if (r0 == 0) goto L13
            r0 = r8
            tl2 r0 = (defpackage.tl2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            tl2 r0 = new tl2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            java.lang.String r3 = "cm2"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L5c
        L29:
            r5 = move-exception
            goto L57
        L2b:
            r5 = move-exception
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "cancel %d"
            defpackage.hm9.m(r3, r2, r8)
            je7 r5 = r5.b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            he5 r5 = (defpackage.he5) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.Y = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r5.q(r6, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L5c
            return r1
        L57:
            java.lang.String r6 = "cancel failure!"
            defpackage.hm9.p(r3, r6, r5)
        L5c:
            e5f r5 = defpackage.e5f.a
            return r5
        L5f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ul2
            if (r0 == 0) goto L13
            r0 = r6
            ul2 r0 = (defpackage.ul2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ul2 r0 = new ul2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            java.lang.String r3 = "cm2"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L53
        L29:
            r5 = move-exception
            goto L4e
        L2b:
            r5 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r6)
            java.lang.String r6 = "cancelAll"
            defpackage.hm9.n(r3, r6)
            je7 r5 = r5.b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            he5 r5 = (defpackage.he5) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.Y = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r5.r(r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L53
            return r1
        L4e:
            java.lang.String r6 = "cancelAll failure!"
            defpackage.hm9.p(r3, r6, r5)
        L53:
            e5f r5 = defpackage.e5f.a
            return r5
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gi9 r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.c(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final m7b d() {
        return (m7b) this.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[LOOP:0: B:76:0x021b->B:97:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r22, defpackage.sl2 r23, defpackage.sl2 r24, defpackage.mn5 r25, kotlin.coroutines.Continuation r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.e(java.util.Set, sl2, sl2, mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:34:0x011d, B:39:0x012c], limit reached: 163 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d1 -> B:55:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0276 -> B:73:0x029c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.util.Set r54, defpackage.sl2 r55, defpackage.sl2 r56, defpackage.mn5 r57, kotlin.coroutines.Continuation r58) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.f(java.util.Set, sl2, sl2, mn5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.sl2 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.am2
            if (r0 == 0) goto L13
            r0 = r15
            am2 r0 = (defpackage.am2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            am2 r0 = new am2
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.util.Iterator r13 = r0.Y
            sl2 r14 = r0.X
            cm2 r2 = r0.o
            defpackage.od2.a0(r15)
            goto L73
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            sl2 r14 = r0.X
            cm2 r13 = r0.o
            defpackage.od2.a0(r15)
            goto L6b
        L42:
            defpackage.od2.a0(r15)
            java.util.Map r15 = r14.a
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L4e
            return r3
        L4e:
            je7 r15 = r13.e
            java.lang.Object r15 = r15.getValue()
            iy2 r15 = (defpackage.iy2) r15
            java.util.Map r2 = r14.a
            java.util.Set r2 = r2.keySet()
            r0.o = r13
            r0.X = r14
            r0.t0 = r5
            jz2 r15 = (defpackage.jz2) r15
            java.lang.Object r15 = r15.p(r2, r0)
            if (r15 != r1) goto L6b
            return r1
        L6b:
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
            r2 = r13
            r13 = r15
        L73:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto Lcc
            java.lang.Object r15 = r13.next()
            e52 r15 = (defpackage.e52) r15
            java.util.Map r5 = r14.a
            k92 r6 = r15.b
            long r6 = r6.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object r5 = r5.get(r8)
            ql2 r5 = (defpackage.ql2) r5
            if (r5 != 0) goto L93
            goto L73
        L93:
            k92 r6 = r15.b
            b92 r6 = r6.a()
            long r6 = r6.d
            long r8 = r5.l
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L73
            je7 r6 = r2.e
            java.lang.Object r6 = r6.getValue()
            iy2 r6 = (defpackage.iy2) r6
            r0.o = r2
            r0.X = r14
            r0.Y = r13
            r0.t0 = r4
            r8 = r6
            jz2 r8 = (defpackage.jz2) r8
            r8.getClass()
            xy2 r6 = new xy2
            long r9 = r15.a
            long r11 = r5.l
            r7 = r6
            r7.<init>()
            java.lang.Object r15 = defpackage.ema.C(r6, r0)
            if (r15 != r1) goto Lc8
            goto Lc9
        Lc8:
            r15 = r3
        Lc9:
            if (r15 != r1) goto L73
            return r1
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.g(sl2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009e -> B:31:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.sl2 r17, defpackage.mn5 r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.h(sl2, mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
