package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ef1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ef1 ef1Var = (ef1) n((oa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ef1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ef1 ef1Var = new ef1(this.Y, continuation);
        ef1Var.X = obj;
        return ef1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r3 = defpackage.j1e.d(r4);
     */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.X
            oa r12 = (defpackage.oa) r12
            of1 r11 = r11.Y
            ir1 r0 = r11.Y
            long r1 = r12.c
            r0.h(r1)
        L10:
            q0e r0 = r11.C0
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            na r2 = (defpackage.na) r2
            java.util.Map r3 = r12.a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L29
            int r4 = defpackage.b8a.g2
            eqe r5 = new eqe
            r5.<init>(r4)
            goto L35
        L29:
            int r4 = defpackage.a8a.a
            int r5 = r3.size()
            aqe r6 = new aqe
            r6.<init>(r4, r5)
            r5 = r6
        L35:
            qx7 r4 = r11.Z
            r4.getClass()
            int r4 = r3.size()
            r6 = 5
            if (r4 > r6) goto L46
            java.util.ArrayList r3 = defpackage.qx7.b(r3)
            goto La3
        L46:
            kl7 r4 = defpackage.j1e.l()
            java.util.Set r7 = r3.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L53:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r7.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L9a
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            if (r8 >= r6) goto L7a
            java.lang.Object r8 = r9.getKey()
            gg1 r8 = (defpackage.gg1) r8
            java.lang.Object r9 = r9.getValue()
            bo1 r9 = (defpackage.bo1) r9
            z9f r8 = defpackage.qx7.d(r8, r9)
            r4.add(r8)
            r8 = r10
            goto L53
        L7a:
            aaf r6 = new aaf
            int r7 = defpackage.b8a.h2
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            gqe r8 = new gqe
            java.util.List r3 = defpackage.ys.m0(r3)
            r8.<init>(r7, r3)
            r6.<init>(r8)
            r4.add(r6)
            goto L9f
        L9a:
            defpackage.y53.R()
            r11 = 0
            throw r11
        L9f:
            kl7 r3 = defpackage.j1e.d(r4)
        La3:
            r2.getClass()
            na r2 = new na
            r2.<init>(r5, r3)
            boolean r0 = r0.c(r1, r2)
            if (r0 == 0) goto L10
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef1.o(java.lang.Object):java.lang.Object");
    }
}
