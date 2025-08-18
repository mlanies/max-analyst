package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kb9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xb9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb9(xb9 xb9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xb9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kb9) n((gi9) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kb9 kb9Var = new kb9(this.Z, continuation);
        kb9Var.Y = obj;
        return kb9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            tx3 r2 = defpackage.tx3.a
            int r3 = r0.X
            if (r3 == 0) goto L18
            if (r3 != r1) goto L10
            defpackage.od2.a0(r19)
            goto L80
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L18:
            defpackage.od2.a0(r19)
            java.lang.Object r3 = r0.Y
            gi9 r3 = (defpackage.gi9) r3
            gi9 r4 = new gi9
            int r5 = r3.d
            r4.<init>(r5)
            long[] r5 = r3.b
            long[] r3 = r3.a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L67
            r7 = 0
            r8 = r7
        L31:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L63
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L4b:
            if (r13 >= r11) goto L61
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r5[r14]
            r4.a(r14)
        L5e:
            long r9 = r9 >> r12
            int r13 = r13 + r1
            goto L4b
        L61:
            if (r11 != r12) goto L67
        L63:
            if (r8 == r6) goto L67
            int r8 = r8 + r1
            goto L31
        L67:
            xb9 r3 = r0.Z
            java.util.List r4 = r3.b(r4)
            int r5 = defpackage.ft4.o
            r5 = 10
            kt4 r6 = defpackage.kt4.SECONDS
            long r5 = defpackage.z7.R(r5, r6)
            r0.X = r1
            java.lang.Object r0 = r3.j(r5, r4, r0)
            if (r0 != r2) goto L80
            return r2
        L80:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb9.o(java.lang.Object):java.lang.Object");
    }
}
