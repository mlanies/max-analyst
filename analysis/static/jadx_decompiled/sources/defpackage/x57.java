package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x57 extends ffe implements a66 {
    public String X;
    public int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ c67 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x57(c67 c67Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = str2;
        this.t0 = c67Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x57) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x57(this.t0, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
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
            c67 r6 = r10.t0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            defpackage.od2.a0(r11)
            goto L93
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L20:
            defpackage.od2.a0(r11)
            goto L78
        L24:
            java.lang.String r1 = r10.X
            defpackage.od2.a0(r11)
            goto L5b
        L2a:
            defpackage.od2.a0(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r10.Z
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            java.lang.String r1 = r10.s0
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            qec r7 = r6.C0
            java.lang.String r8 = ""
            java.lang.String r11 = r7.b(r8, r11)
            r10.X = r11
            r10.Y = r5
            java.lang.Object r1 = defpackage.c67.q(r6, r11, r1, r10)
            if (r1 != r0) goto L58
            return r0
        L58:
            r9 = r1
            r1 = r11
            r11 = r9
        L5b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L64
            return r2
        L64:
            je7 r11 = r6.c
            java.lang.Object r11 = r11.getValue()
            ib6 r11 = (defpackage.ib6) r11
            r5 = 0
            r10.X = r5
            r10.Y = r4
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L78
            return r0
        L78:
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto Lb0
            long r4 = r11.longValue()
            je7 r11 = r6.X
            java.lang.Object r11 = r11.getValue()
            iy2 r11 = (defpackage.iy2) r11
            r10.Y = r3
            jz2 r11 = (defpackage.jz2) r11
            java.lang.Object r11 = r11.u(r4, r10)
            if (r11 != r0) goto L93
            return r0
        L93:
            e52 r11 = (defpackage.e52) r11
            if (r11 == 0) goto Lb0
            s35 r10 = r6.u0
            e57 r0 = defpackage.e57.c
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r0.<init>(r1)
            long r3 = r11.a
            java.lang.String r11 = "&type=local"
            java.lang.String r11 = defpackage.zr6.k(r0, r3, r11)
            defpackage.wg0.k(r11, r10)
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x57.o(java.lang.Object):java.lang.Object");
    }
}
