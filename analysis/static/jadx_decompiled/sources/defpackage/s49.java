package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s49 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
        this.s0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((s49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new s49(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.Y
            e5f r2 = defpackage.e5f.a
            r3 = 1
            r4 = 0
            java.util.List r5 = r11.s0
            n59 r6 = r11.Z
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L16
            e52 r11 = r11.X
            defpackage.od2.a0(r12)
            goto L54
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1e:
            defpackage.od2.a0(r12)
            w7c r12 = r6.o1
            j0e r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            e52 r12 = (defpackage.e52) r12
            if (r12 != 0) goto L2e
            return r2
        L2e:
            q33 r1 = r6.y0
            hyc r1 = (defpackage.hyc) r1
            long r7 = r1.t()
            k92 r1 = r12.b
            boolean r1 = r1.f(r7)
            if (r1 != 0) goto L5f
            je7 r1 = r6.F0
            java.lang.Object r1 = r1.getValue()
            ns8 r1 = (defpackage.ns8) r1
            r11.X = r12
            r11.Y = r3
            java.lang.Object r11 = r1.a(r5, r11)
            if (r11 != r0) goto L51
            return r0
        L51:
            r10 = r12
            r12 = r11
            r11 = r10
        L54:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L5e
            r12 = r3
            goto L61
        L5e:
            r12 = r11
        L5f:
            r11 = r12
            r12 = r4
        L61:
            bc7[] r0 = defpackage.n59.D1
            je7 r0 = r6.F0
            java.lang.Object r0 = r0.getValue()
            ns8 r0 = (defpackage.ns8) r0
            r0.getClass()
            boolean r0 = r11.e0()
            if (r0 != 0) goto L76
        L74:
            r11 = r4
            goto L7e
        L76:
            boolean r11 = r11.I()
            if (r11 == 0) goto L7d
            goto L74
        L7d:
            r11 = r3
        L7e:
            mg3 r0 = defpackage.hs8.a
            int r0 = r5.size()
            int r1 = defpackage.nda.b
            aqe r7 = new aqe
            r7.<init>(r1, r0)
            kl7 r0 = defpackage.j1e.l()
            if (r11 == 0) goto La2
            mg3 r11 = new mg3
            int r1 = defpackage.mda.m
            int r8 = defpackage.oda.F
            eqe r9 = new eqe
            r9.<init>(r8)
            r11.<init>(r1, r9, r3, r4)
            r0.add(r11)
        La2:
            if (r12 == 0) goto Lb5
            mg3 r11 = new mg3
            int r12 = defpackage.mda.n
            int r1 = defpackage.oda.E
            eqe r8 = new eqe
            r8.<init>(r1)
            r11.<init>(r12, r8, r3, r4)
            r0.add(r11)
        Lb5:
            mg3 r11 = defpackage.hs8.a
            r0.add(r11)
            kl7 r11 = defpackage.j1e.d(r0)
            fnd r12 = new fnd
            r0 = 0
            r12.<init>(r5, r7, r0, r11)
            s35 r11 = r6.u1
            defpackage.pnf.o(r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s49.o(java.lang.Object):java.lang.Object");
    }
}
