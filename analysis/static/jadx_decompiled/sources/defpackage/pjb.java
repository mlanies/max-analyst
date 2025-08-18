package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pjb extends ffe implements a66 {
    public ljb X;
    public int Y;
    public final /* synthetic */ zjb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjb(zjb zjbVar, Continuation continuation) {
        super(2, continuation);
        this.Z = zjbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((pjb) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pjb(this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            zjb r7 = r10.Z
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            defpackage.od2.a0(r11)
            goto L81
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L20:
            defpackage.od2.a0(r11)
            goto L63
        L24:
            ljb r1 = r10.X
            defpackage.od2.a0(r11)
            goto L58
        L2a:
            defpackage.od2.a0(r11)
            je7 r11 = r7.c
            java.lang.Object r11 = r11.getValue()
            iy2 r11 = (defpackage.iy2) r11
            long r8 = r7.b
            jz2 r11 = (defpackage.jz2) r11
            w7c r11 = r11.m(r8)
            j0e r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            e52 r11 = (defpackage.e52) r11
            if (r11 == 0) goto L81
            ljb r1 = defpackage.zjb.r(r7, r11)
            r10.X = r1
            r10.Y = r6
            r8 = 200(0xc8, double:9.9E-322)
            java.lang.Object r11 = defpackage.j47.x(r8, r10)
            if (r11 != r0) goto L58
            return r0
        L58:
            r10.X = r3
            r10.Y = r5
            java.lang.Object r11 = defpackage.zjb.q(r7, r1, r10)
            if (r11 != r0) goto L63
            return r0
        L63:
            bc7[] r11 = defpackage.zjb.B0
            je7 r11 = r7.o
            java.lang.Object r11 = r11.getValue()
            kke r11 = (defpackage.kke) r11
            w9a r11 = (defpackage.w9a) r11
            cx7 r11 = r11.c()
            ojb r1 = new ojb
            r1.<init>(r7, r3)
            r10.Y = r4
            java.lang.Object r10 = defpackage.j47.t0(r11, r1, r10)
            if (r10 != r0) goto L81
            return r0
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjb.o(java.lang.Object):java.lang.Object");
    }
}
