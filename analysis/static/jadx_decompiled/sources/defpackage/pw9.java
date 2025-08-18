package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pw9 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ rw9 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw9(rw9 rw9Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Z = rw9Var;
        this.s0 = j;
        this.t0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pw9(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
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
            r3 = 3
            r4 = 2
            r5 = 1
            rw9 r6 = r10.Z
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.od2.a0(r11)
            goto L78
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1f:
            e52 r1 = r10.X
            defpackage.od2.a0(r11)
            goto L54
        L25:
            defpackage.od2.a0(r11)
            goto L41
        L29:
            defpackage.od2.a0(r11)
            je7 r11 = r6.b
            java.lang.Object r11 = r11.getValue()
            iy2 r11 = (defpackage.iy2) r11
            r10.Y = r5
            jz2 r11 = (defpackage.jz2) r11
            long r7 = r10.s0
            java.lang.Comparable r11 = r11.j(r7, r10)
            if (r11 != r0) goto L41
            return r0
        L41:
            r1 = r11
            e52 r1 = (defpackage.e52) r1
            if (r1 != 0) goto L47
            return r2
        L47:
            r10.X = r1
            r10.Y = r4
            long r4 = r10.t0
            java.lang.Object r11 = defpackage.rw9.b(r6, r1, r4, r10)
            if (r11 != r0) goto L54
            return r0
        L54:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L78
            je7 r11 = r6.X
            java.lang.Object r11 = r11.getValue()
            r4 = r11
            qx9 r4 = (defpackage.qx9) r4
            k92 r11 = r1.b
            long r5 = r11.a
            r11 = 0
            r10.X = r11
            r10.Y = r3
            long r7 = r10.t0
            r9 = r10
            java.lang.Object r10 = r4.g(r5, r7, r9)
            if (r10 != r0) goto L78
            return r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw9.o(java.lang.Object):java.lang.Object");
    }
}
