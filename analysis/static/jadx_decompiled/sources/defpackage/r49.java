package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r49 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ n59 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r49 r49Var = new r49(this.s0, this.Z, continuation);
        r49Var.Y = obj;
        return r49Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
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
            r4 = 0
            r5 = 3
            r6 = 1
            n59 r7 = r11.s0
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L25
            if (r1 == r3) goto L21
            if (r1 != r5) goto L19
            defpackage.od2.a0(r12)
            goto L9d
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L21:
            defpackage.od2.a0(r12)
            goto L71
        L25:
            java.lang.Object r1 = r11.Y
            yf4 r1 = (defpackage.yf4) r1
            defpackage.od2.a0(r12)
            goto L66
        L2d:
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.Y
            sx3 r12 = (defpackage.sx3) r12
            java.util.List r1 = r11.Z
            java.lang.Object r1 = defpackage.x53.i0(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L9d
            long r8 = r1.longValue()
            kke r1 = r7.Y
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            q49 r10 = new q49
            r10.<init>(r7, r8, r4)
            zf4 r1 = defpackage.j47.h(r12, r1, r10, r3)
            je7 r12 = r7.K0
            java.lang.Object r12 = r12.getValue()
            mw8 r12 = (defpackage.mw8) r12
            r11.Y = r1
            r11.X = r6
            java.lang.Object r12 = r12.a(r8, r11)
            if (r12 != r0) goto L66
            return r0
        L66:
            r11.Y = r4
            r11.X = r3
            java.lang.Object r12 = r1.a(r11)
            if (r12 != r0) goto L71
            return r0
        L71:
            cu8 r12 = (defpackage.cu8) r12
            if (r12 == 0) goto L9d
            bc7[] r1 = defpackage.n59.D1
            w5f r1 = r7.D()
            long r3 = r12.o
            r6 = 1
            long r3 = r3 - r6
            r11.X = r5
            s35 r12 = r1.f
            r12.getClass()
            t5f r1 = new t5f
            r1.<init>(r3)
            si9 r12 = r12.b
            java.lang.Object r11 = r12.a(r1, r11)
            if (r11 != r0) goto L95
            goto L96
        L95:
            r11 = r2
        L96:
            if (r11 != r0) goto L99
            goto L9a
        L99:
            r11 = r2
        L9a:
            if (r11 != r0) goto L9d
            return r0
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r49.o(java.lang.Object):java.lang.Object");
    }
}
