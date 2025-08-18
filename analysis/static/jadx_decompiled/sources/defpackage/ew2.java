package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ew2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ td6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew2(gw2 gw2Var, td6 td6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2Var;
        this.Z = td6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ew2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ew2(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            td6 r5 = r11.Z
            gw2 r6 = r11.Y
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.od2.a0(r12)
            goto L91
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1f:
            defpackage.od2.a0(r12)
            goto L65
        L23:
            defpackage.od2.a0(r12)
            bc7[] r12 = defpackage.gw2.Q0
            je7 r12 = r6.t0
            java.lang.Object r12 = r12.getValue()
            q33 r12 = (defpackage.q33) r12
            hyc r12 = (defpackage.hyc) r12
            long r7 = r12.t()
            long r9 = r5.c
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L4e
            int r11 = defpackage.jpc.A2
            eqe r12 = new eqe
            r12.<init>(r11)
            rnd r11 = new rnd
            r11.<init>(r12)
            s35 r12 = r6.I0
            defpackage.pnf.o(r12, r11)
            return r2
        L4e:
            kke r12 = r6.Z
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            dw2 r1 = new dw2
            r7 = 0
            r1.<init>(r6, r5, r7)
            r11.X = r4
            java.lang.Object r12 = defpackage.j47.t0(r12, r1, r11)
            if (r12 != r0) goto L65
            return r0
        L65:
            wm3 r12 = r5.v0
            vm3 r1 = defpackage.vm3.BOT
            java.util.List r12 = r12.u0
            boolean r12 = r12.contains(r1)
            long r7 = r5.c
            if (r12 != 0) goto L80
            bc7[] r11 = defpackage.gw2.Q0
            iy2 r11 = r6.s()
            jz2 r11 = (defpackage.jz2) r11
            e52 r11 = r11.q(r7)
            goto L94
        L80:
            bc7[] r12 = defpackage.gw2.Q0
            iy2 r12 = r6.s()
            r11.X = r3
            jz2 r12 = (defpackage.jz2) r12
            java.lang.Object r12 = r12.u(r7, r11)
            if (r12 != r0) goto L91
            return r0
        L91:
            r11 = r12
            e52 r11 = (defpackage.e52) r11
        L94:
            if (r11 == 0) goto L9f
            gy2 r12 = defpackage.gy2.c
            long r0 = r11.a
            c64 r11 = defpackage.gy2.a2(r12, r0)
            goto Lbf
        L9f:
            gy2 r11 = defpackage.gy2.c
            long r0 = r5.c
            r11.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = ":profile?id="
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r12 = "&type=contact"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            c64 r12 = new c64
            r12.<init>(r11)
            r11 = r12
        Lbf:
            s35 r12 = r6.H0
            defpackage.pnf.o(r12, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew2.o(java.lang.Object):java.lang.Object");
    }
}
