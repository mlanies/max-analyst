package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class uq0 {
    public final yu2 a;
    public final q33 b;
    public final t03 c;

    public uq0(yu2 yu2Var, q33 q33Var, bt2 bt2Var, kke kkeVar) {
        this.a = yu2Var;
        this.b = q33Var;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "bottom-bar-counters"));
        v7c v7cVar = new v7c(bt2Var.a);
        int i = ft4.o;
        this.c = new t03(od2.X(new zn5(od2.M(m6d.O(v7cVar, z7.R(1, kt4.SECONDS)), new rq0(this, null)), new sq0(this, null)), contextScopeA, wld.b, null), 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.uq0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.tq0
            if (r0 == 0) goto L16
            r0 = r7
            tq0 r0 = (defpackage.tq0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            tq0 r0 = new tq0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            ru2 r6 = r0.X
            uq0 r0 = r0.o
            defpackage.od2.a0(r7)
            r1 = r6
            r6 = r0
            goto L50
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.od2.a0(r7)
            ru2 r7 = defpackage.ru2.a
            r0.o = r6
            r0.X = r7
            r0.s0 = r3
            yu2 r0 = r6.a
            jz2 r0 = (defpackage.jz2) r0
            java.lang.Object r0 = r0.r(r7)
            if (r0 != r1) goto L4e
            goto L9d
        L4e:
            r1 = r7
            r7 = r0
        L50:
            java.util.List r7 = (java.util.List) r7
            yu2 r0 = r6.a
            jz2 r0 = (defpackage.jz2) r0
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r0 = r0.s(r1, r2, r4, r5)
            java.util.ArrayList r7 = defpackage.x53.t0(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L6f
            goto L97
        L6f:
            java.util.Iterator r7 = r7.iterator()
        L73:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            e52 r0 = (defpackage.e52) r0
            k92 r2 = r0.b
            int r2 = r2.m
            if (r2 <= 0) goto L73
            q33 r2 = r6.b
            boolean r0 = r0.V(r2)
            if (r0 != 0) goto L73
            int r1 = r1 + 1
            if (r1 < 0) goto L92
            goto L73
        L92:
            defpackage.y53.Q()
            r6 = 0
            throw r6
        L97:
            hy3 r6 = new hy3
            r6.<init>(r1)
            r1 = r6
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.a(uq0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
