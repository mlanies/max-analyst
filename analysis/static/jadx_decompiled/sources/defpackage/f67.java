package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f67 extends ffe implements a66 {
    public uj3 X;
    public int Y;
    public final /* synthetic */ h67 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f67(h67 h67Var, Continuation continuation) {
        super(2, continuation);
        this.Z = h67Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new f67(this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r7 = r16
            tx3 r8 = defpackage.tx3.a
            int r0 = r7.Y
            e5f r9 = defpackage.e5f.a
            r10 = 0
            r11 = 3
            r1 = 2
            r2 = 1
            h67 r12 = r7.Z
            if (r0 == 0) goto L32
            if (r0 == r2) goto L2c
            if (r0 == r1) goto L23
            if (r0 != r11) goto L1b
            defpackage.od2.a0(r17)
            goto Ld7
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            uj3 r0 = r7.X
            defpackage.od2.a0(r17)
            r13 = r0
            r0 = r17
            goto L7e
        L2c:
            defpackage.od2.a0(r17)
            r0 = r17
            goto L54
        L32:
            defpackage.od2.a0(r17)
            je7 r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            blb r0 = (defpackage.blb) r0
            je7 r3 = r12.Z
            java.lang.Object r3 = r3.getValue()
            q33 r3 = (defpackage.q33) r3
            hyc r3 = (defpackage.hyc) r3
            long r3 = r3.t()
            r7.Y = r2
            java.lang.Object r0 = r0.a(r3, r7)
            if (r0 != r8) goto L54
            return r8
        L54:
            oab r0 = (defpackage.oab) r0
            uj3 r13 = r0.d
            kk0 r0 = defpackage.kk0.c
            java.lang.String r0 = r13.p(r0)
            if (r0 == 0) goto L81
            iv6 r2 = defpackage.s36.o()
            r3 = 6
            wv6 r3 = defpackage.h5a.b(r0, r10, r3)
            r7.X = r13
            r7.Y = r1
            r4 = 0
            r6 = 14
            r14 = 0
            r0 = r2
            r1 = r3
            r2 = r14
            r5 = r16
            java.lang.Object r0 = defpackage.fm9.u(r0, r1, r2, r4, r5, r6)
            if (r0 != r8) goto L7e
            return r8
        L7e:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L82
        L81:
            r0 = r10
        L82:
            iqb r1 = new iqb
            java.lang.String r2 = r13.d()
            if (r2 != 0) goto L8c
            java.lang.String r2 = ""
        L8c:
            java.lang.String r3 = r13.j()
            oq9 r4 = one.me.sdk.uikit.qr.QrCodeGenerator.a
            je7 r4 = r12.X
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            java.lang.String r4 = r4.p()
            r5 = 244(0xf4, float:3.42E-43)
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = defpackage.tu0.G(r5)
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r13 = defpackage.fk4.d()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r6 = r6 * r13
            int r6 = defpackage.tu0.G(r6)
            android.graphics.Bitmap r0 = one.me.sdk.uikit.qr.QrCodeGenerator.a(r4, r5, r6, r0)
            r1.<init>(r2, r3, r0)
            r7.X = r10
            r7.Y = r11
            q0e r0 = r12.s0
            r0.m(r10, r1)
            if (r9 != r8) goto Ld7
            return r8
        Ld7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f67.o(java.lang.Object):java.lang.Object");
    }
}
