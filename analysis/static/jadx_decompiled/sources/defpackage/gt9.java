package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class gt9 {
    public final je7 a;
    public final int b = tu0.G(104 * fk4.d().getDisplayMetrics().density);
    public final bo0 c = new bo0(100, 1);
    public final id2 d;

    public gt9(Context context, je7 je7Var) {
        this.a = je7Var;
        this.d = new id2(100, 1, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.iv6 r12, defpackage.wv6 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.ct9
            if (r0 == 0) goto L14
            r0 = r14
            ct9 r0 = (defpackage.ct9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ct9 r0 = new ct9
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r11 = r6.X
            tx3 r14 = defpackage.tx3.a
            int r0 = r6.Z
            java.lang.String r8 = "fail to fetch bitmap"
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L3c
            if (r0 != r9) goto L34
            iv6 r12 = r6.o
            defpackage.od2.a0(r11)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L51
        L2e:
            r11 = move-exception
            goto L5e
        L30:
            r11 = move-exception
            goto L6a
        L32:
            r11 = move-exception
            goto L6b
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            defpackage.od2.a0(r11)
            r6.o = r12     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            r6.Z = r9     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            r5 = 0
            r7 = 12
            r3 = 200(0xc8, double:9.9E-322)
            r1 = r12
            r2 = r13
            java.lang.Object r11 = defpackage.fm9.u(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            if (r11 != r14) goto L51
            return r14
        L51:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            if (r11 == 0) goto L7d
            boolean r12 = r11.isRecycled()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L30 kotlinx.coroutines.TimeoutCancellationException -> L32
            r12 = r12 ^ r9
            if (r12 == 0) goto L7d
            r10 = r11
            goto L7d
        L5e:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            defpackage.hm9.p(r12, r8, r11)
            goto L7d
        L6a:
            throw r11
        L6b:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "fetch bitmap has timed out"
            r13.<init>(r14, r11)
            defpackage.hm9.l0(r12, r8, r13)
        L7d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt9.a(iv6, wv6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.e52 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dt9
            if (r0 == 0) goto L13
            r0 = r6
            dt9 r0 = (defpackage.dt9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            dt9 r0 = new dt9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e52 r5 = r0.X
            gt9 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            kk0 r6 = defpackage.kk0.b
            jk0 r2 = defpackage.jk0.a
            java.lang.String r6 = r5.g(r6, r2)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r6 = r4.d(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L62
            r4.getClass()
            r5.k0()
            r5.l0()
            java.lang.CharSequence r6 = r5.x0
            long r0 = r5.f()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt9.b(e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.uj3 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.et9
            if (r0 == 0) goto L13
            r0 = r6
            et9 r0 = (defpackage.et9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            et9 r0 = new et9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            uj3 r5 = r0.X
            gt9 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            kk0 r6 = defpackage.kk0.b
            java.lang.String r6 = r5.p(r6)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r6 = r4.d(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L5c
            r4.getClass()
            java.lang.CharSequence r6 = r5.m()
            long r0 = r5.n()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt9.c(uj3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ft9
            if (r0 == 0) goto L13
            r0 = r9
            ft9 r0 = (defpackage.ft9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            ft9 r0 = new ft9
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            java.lang.String r8 = r0.X
            gt9 r7 = r0.o
            defpackage.od2.a0(r9)
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.od2.a0(r9)
            if (r8 == 0) goto La7
            int r9 = r8.length()
            if (r9 != 0) goto L41
            goto La7
        L41:
            bo0 r9 = r7.c
            java.lang.Object r9 = r9.c(r8)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L66
            boolean r2 = r9.isRecycled()
            if (r2 != 0) goto L66
            android.graphics.Bitmap$Config r2 = r9.getConfig()     // Catch: java.lang.Throwable -> L5a
            android.graphics.Bitmap r7 = r9.copy(r2, r3)     // Catch: java.lang.Throwable -> L5a
            return r7
        L5a:
            r9 = move-exception
            java.lang.Class<gt9> r2 = defpackage.gt9.class
            java.lang.String r2 = r2.getName()
            java.lang.String r6 = "fail to copy bitmap"
            defpackage.hm9.p(r2, r6, r9)
        L66:
            vc0 r9 = defpackage.h5a.a
            j5a r9 = defpackage.j5a.a
            android.net.Uri r2 = defpackage.fp3.d(r8)
            xv6 r2 = defpackage.xv6.d(r2)
            uv6 r6 = defpackage.uv6.a
            r2.g = r6
            nj0 r9 = defpackage.h5a.a(r9)
            r2.l = r9
            wv6 r9 = r2.a()
            je7 r2 = r7.a
            java.lang.Object r2 = r2.getValue()
            iv6 r2 = (defpackage.iv6) r2
            r0.o = r7
            r0.X = r8
            r0.s0 = r5
            java.lang.Object r9 = r7.a(r2, r9, r0)
            if (r9 != r1) goto L95
            return r1
        L95:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto La7
            bo0 r7 = r7.c
            android.graphics.Bitmap$Config r0 = r9.getConfig()
            android.graphics.Bitmap r0 = r9.copy(r0, r3)
            r7.d(r8, r0)
            r4 = r9
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt9.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Bitmap e(CharSequence charSequence, long j) {
        tc0 tc0Var = (tc0) this.d.c(new kpa(charSequence, Long.valueOf(j)));
        if (tc0Var == null) {
            return null;
        }
        int i = this.b;
        return f8.B(tc0Var, i, i);
    }
}
