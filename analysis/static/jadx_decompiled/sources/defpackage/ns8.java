package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ns8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public ns8(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
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
    public final java.lang.Object a(java.util.List r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.js8
            if (r0 == 0) goto L13
            r0 = r6
            js8 r0 = (defpackage.js8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            js8 r0 = new js8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ns8 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r6)
            je7 r6 = r4.a
            java.lang.Object r6 = r6.getValue()
            r79 r6 = (defpackage.r79) r6
            r0.o = r4
            r0.Z = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L52
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L52:
            je7 r5 = r4.d
            java.lang.Object r5 = r5.getValue()
            iy2 r5 = (defpackage.iy2) r5
            java.lang.Object r0 = defpackage.x53.g0(r6)
            cu8 r0 = (defpackage.cu8) r0
            long r0 = r0.t0
            jz2 r5 = (defpackage.jz2) r5
            w7c r5 = r5.m(r0)
            j0e r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            e52 r5 = (defpackage.e52) r5
            if (r5 != 0) goto L75
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L75:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7c
            goto L94
        L7c:
            java.util.Iterator r6 = r6.iterator()
        L80:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r6.next()
            cu8 r0 = (defpackage.cu8) r0
            boolean r0 = r4.b(r5, r0)
            r0 = r0 ^ r3
            if (r0 == 0) goto L80
            r3 = 0
        L94:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(e52 e52Var, cu8 cu8Var) {
        if (!e52Var.M()) {
            boolean zX = e52Var.x();
            boolean z = ((se5) g()).t() && e52Var.y() && cu8Var.Y == ((hyc) f()).t();
            boolean z2 = ((se5) g()).t() && (e52Var.d0() || oag.s(e52Var.e(e52Var.Y), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            if (e52Var.I()) {
                return zX || z || z2;
            }
            if (zX && (e52Var.d0() || e52Var.b0())) {
                return true;
            }
        }
        if (cu8Var.o()) {
            return false;
        }
        long jT = ((hyc) f()).t();
        long j = cu8Var.Y;
        if (j != jT && (j != 0 || !e52Var.F())) {
            return false;
        }
        if (e52Var.F() && j != 0) {
            return false;
        }
        long jN = (((hyc) f()).n() - cu8Var.o) / 1000;
        qyc qycVar = (qyc) ((y7d) this.f.getValue());
        qycVar.getClass();
        return jN < ((long) ((int) qycVar.q(PmsKey.f35edittimeout, (long) 86400))) && cu8Var.c != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.c(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(long r9, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.d(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.util.Set r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ms8
            if (r0 == 0) goto L13
            r0 = r8
            ms8 r0 = (defpackage.ms8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ms8 r0 = new ms8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ns8 r6 = r0.o
            defpackage.od2.a0(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.od2.a0(r8)
            je7 r8 = r6.a
            java.lang.Object r8 = r8.getValue()
            r79 r8 = (defpackage.r79) r8
            r0.o = r6
            r0.Z = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8.isEmpty()
            nz4 r0 = defpackage.nz4.a
            if (r7 == 0) goto L52
            return r0
        L52:
            je7 r7 = r6.d
            java.lang.Object r7 = r7.getValue()
            iy2 r7 = (defpackage.iy2) r7
            java.lang.Object r1 = defpackage.x53.g0(r8)
            cu8 r1 = (defpackage.cu8) r1
            long r1 = r1.t0
            jz2 r7 = (defpackage.jz2) r7
            w7c r7 = r7.m(r1)
            j0e r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            e52 r7 = (defpackage.e52) r7
            if (r7 != 0) goto L73
            return r0
        L73:
            kl7 r0 = defpackage.j1e.l()
            gs8 r1 = defpackage.gs8.b
            r0.add(r1)
            java.util.Iterator r1 = r8.iterator()
        L80:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            cu8 r2 = (defpackage.cu8) r2
            sw8 r4 = r6.h()
            r4.getClass()
            boolean r2 = defpackage.sw8.c(r7, r2)
            if (r2 != 0) goto L80
            goto L9f
        L9a:
            gs8 r1 = defpackage.gs8.a
            r0.add(r1)
        L9f:
            java.util.Iterator r8 = r8.iterator()
        La3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r8.next()
            cu8 r1 = (defpackage.cu8) r1
            long r1 = r1.Y
            q33 r4 = r6.f()
            hyc r4 = (defpackage.hyc) r4
            long r4 = r4.t()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto Lc1
            r1 = r3
            goto Lc2
        Lc1:
            r1 = 0
        Lc2:
            qe5 r2 = r6.g()
            boolean r1 = defpackage.sw8.a(r7, r2, r1)
            if (r1 != 0) goto La3
            goto Ld2
        Lcd:
            gs8 r6 = defpackage.gs8.Y
            r0.add(r6)
        Ld2:
            kl7 r6 = defpackage.j1e.d(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns8.e(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final q33 f() {
        return (q33) this.e.getValue();
    }

    public final qe5 g() {
        return (qe5) this.g.getValue();
    }

    public final sw8 h() {
        return (sw8) this.c.getValue();
    }
}
