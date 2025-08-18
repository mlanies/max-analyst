package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ps9 {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final ContextScope g;

    public ps9(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, kke kkeVar, ox3 ox3Var) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
        this.g = j1e.a(((w9a) kkeVar).b().limitedParallelism(1, "notif-msg-delayed-logic").plus(ox3Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ps9 r30, long r31, defpackage.fs8 r33, kotlin.coroutines.Continuation r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps9.a(ps9, long, fs8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final hs9 b(ps9 ps9Var, ks9 ks9Var) {
        long j = ks9Var.c;
        fs8 fs8Var = ks9Var.Y;
        if (fs8Var != null) {
            return new hs9(j, null, fs8Var, false, 0L, false);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ls9
            if (r0 == 0) goto L13
            r0 = r8
            ls9 r0 = (defpackage.ls9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            ls9 r0 = new ls9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r8)
            goto L6b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            long r6 = r0.X
            ps9 r5 = r0.o
            defpackage.od2.a0(r8)
            goto L54
        L3a:
            defpackage.od2.a0(r8)
            je7 r8 = r5.a
            java.lang.Object r8 = r8.getValue()
            iy2 r8 = (defpackage.iy2) r8
            r0.o = r5
            r0.X = r6
            r0.s0 = r4
            jz2 r8 = (defpackage.jz2) r8
            java.lang.Object r8 = r8.k(r6, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            e52 r8 = (defpackage.e52) r8
            if (r8 != 0) goto L6b
            ms9 r8 = new ms9
            r2 = 0
            r8.<init>(r5, r6, r2)
            r0.o = r2
            r0.s0 = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = defpackage.fp3.I(r5, r8, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps9.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
