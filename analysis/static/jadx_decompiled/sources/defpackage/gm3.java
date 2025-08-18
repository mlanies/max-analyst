package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gm3 extends ffe implements a66 {
    public final /* synthetic */ jm3 X;
    public final /* synthetic */ xu4 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm3(jm3 jm3Var, xu4 xu4Var, Continuation continuation) {
        super(2, continuation);
        this.X = jm3Var;
        this.Y = xu4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gm3(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            defpackage.od2.a0(r9)
            jm3 r9 = r8.X
            je7 r0 = r9.z
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            pk r1 = (defpackage.pk) r1
            xu4 r8 = r8.Y
            java.lang.String r0 = r8.c
            r2 = 0
            if (r0 == 0) goto L1e
            java.lang.CharSequence r0 = defpackage.w9e.b1(r0)
            java.lang.String r0 = r0.toString()
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
        L23:
            java.lang.String r3 = r8.f
            if (r3 == 0) goto L30
            java.lang.CharSequence r3 = defpackage.w9e.b1(r3)
            java.lang.String r3 = r3.toString()
            goto L31
        L30:
            r3 = r2
        L31:
            q0e r9 = r9.i
            java.lang.Object r4 = r9.getValue()
            xu4 r4 = (defpackage.xu4) r4
            if (r4 == 0) goto L3e
            java.lang.String r4 = r4.h
            goto L3f
        L3e:
            r4 = r2
        L3f:
            java.lang.String r8 = r8.h
            boolean r4 = defpackage.tpa.f(r4, r8)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L5a
            if (r8 == 0) goto L54
            int r4 = r8.length()
            if (r4 != 0) goto L52
            goto L54
        L52:
            r4 = 0
            goto L55
        L54:
            r4 = r5
        L55:
            r4 = r4 ^ r5
            if (r4 == 0) goto L5a
        L58:
            r6 = r8
            goto L79
        L5a:
            java.lang.Object r9 = r9.getValue()
            xu4 r9 = (defpackage.xu4) r9
            if (r9 == 0) goto L65
            java.lang.String r9 = r9.h
            goto L66
        L65:
            r9 = r2
        L66:
            boolean r9 = defpackage.tpa.f(r9, r8)
            r9 = r9 ^ r5
            if (r9 == 0) goto L78
            if (r8 == 0) goto L75
            int r8 = r8.length()
            if (r8 != 0) goto L78
        L75:
            java.lang.String r8 = "$REMOVE$"
            goto L58
        L78:
            r6 = r2
        L79:
            r5 = 0
            r7 = 0
            r4 = 0
            r2 = r0
            long r8 = defpackage.pk.b(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm3.o(java.lang.Object):java.lang.Object");
    }
}
