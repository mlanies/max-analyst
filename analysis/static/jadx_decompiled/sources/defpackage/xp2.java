package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xp2 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ rq2 t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ cz5 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp2(Uri uri, long j, rq2 rq2Var, Long l, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = uri;
        this.s0 = j;
        this.t0 = rq2Var;
        this.u0 = l;
        this.v0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xp2(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            tx3 r6 = defpackage.tx3.a
            int r0 = r12.Y
            e5f r7 = defpackage.e5f.a
            r1 = 3
            r2 = 2
            r3 = 1
            long r8 = r12.s0
            rq2 r10 = r12.t0
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            defpackage.od2.a0(r13)
            r0 = r13
            goto Lcf
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.Object r0 = r12.X
            e9d r0 = (defpackage.e9d) r0
            defpackage.od2.a0(r13)
            r2 = r13
            goto L84
        L2c:
            java.lang.Object r0 = r12.X
            d9d r0 = (defpackage.d9d) r0
            defpackage.od2.a0(r13)
            r4 = r0
            r0 = r13
            goto L67
        L36:
            defpackage.od2.a0(r13)
            android.net.Uri r0 = r12.Z
            java.lang.String r0 = r0.toString()
            aqd r4 = new aqd
            r11 = 7
            r4.<init>(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            d9d r4 = new d9d
            r4.<init>(r8, r0)
            je7 r0 = r10.H0
            java.lang.Object r0 = r0.getValue()
            x19 r0 = (defpackage.x19) r0
            r12.X = r4
            r12.Y = r3
            java.lang.Long r3 = r12.u0
            java.lang.Object r0 = r0.a(r8, r3, r12)
            if (r0 != r6) goto L67
            return r6
        L67:
            bw8 r0 = (defpackage.bw8) r0
            r4.b = r0
            e9d r0 = r4.a()
            je7 r3 = r10.F0
            java.lang.Object r3 = r3.getValue()
            xb6 r3 = (defpackage.xb6) r3
            r12.X = r0
            r12.Y = r2
            cz5 r2 = r12.v0
            java.lang.Object r2 = r3.b(r2, r12)
            if (r2 != r6) goto L84
            return r6
        L84:
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L97
            s8g r1 = defpackage.rq2.r(r10)
            r0.getClass()
            r1.a(r0)
            return r7
        L97:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r0)
            r3.addAll(r2)
            h8d r0 = new h8d
            r2 = 2
            r0.<init>(r8, r3, r2)
            h9d r2 = new h9d
            r2.<init>(r0)
            s8g r0 = defpackage.rq2.r(r10)
            r0.a(r2)
            je7 r0 = r10.E0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            lu0 r3 = (defpackage.lu0) r3
            r0 = 0
            r12.X = r0
            r12.Y = r1
            r2 = 1
            cz5 r4 = r12.v0
            long r0 = r12.s0
            r5 = r12
            java.lang.Object r0 = defpackage.mq9.g(r0, r2, r3, r4, r5)
            if (r0 != r6) goto Lcf
            return r6
        Lcf:
            zo2 r0 = (defpackage.zo2) r0
            s35 r1 = r10.b1
            defpackage.pnf.o(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp2.o(java.lang.Object):java.lang.Object");
    }
}
