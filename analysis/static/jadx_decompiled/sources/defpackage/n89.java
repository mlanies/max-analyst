package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n89 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ o89 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ cz5 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n89(o89 o89Var, long j, CharSequence charSequence, Long l, boolean z, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = o89Var;
        this.s0 = j;
        this.t0 = charSequence;
        this.u0 = l;
        this.v0 = z;
        this.w0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new n89(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            boolean r4 = r0.v0
            java.lang.CharSequence r5 = r0.t0
            r6 = 2
            long r7 = r0.s0
            o89 r9 = r0.Z
            if (r2 == 0) goto L33
            if (r2 == r3) goto L29
            if (r2 != r6) goto L21
            java.lang.Object r0 = r0.X
            k9d r0 = (defpackage.k9d) r0
            defpackage.od2.a0(r17)
            r2 = r0
            r0 = r17
            goto L8f
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L29:
            java.lang.Object r2 = r0.X
            java.util.List r2 = (java.util.List) r2
            defpackage.od2.a0(r17)
            r3 = r17
            goto L57
        L33:
            defpackage.od2.a0(r17)
            je7 r2 = r9.e
            java.lang.Object r2 = r2.getValue()
            dc6 r2 = (defpackage.dc6) r2
            java.util.List r2 = r2.b(r5, r7)
            je7 r10 = r9.d
            java.lang.Object r10 = r10.getValue()
            x19 r10 = (defpackage.x19) r10
            r0.X = r2
            r0.Y = r3
            java.lang.Long r3 = r0.u0
            java.lang.Object r3 = r10.a(r7, r3, r0)
            if (r3 != r1) goto L57
            return r1
        L57:
            bw8 r3 = (defpackage.bw8) r3
            java.lang.CharSequence r5 = defpackage.w9e.b1(r5)
            java.lang.String r13 = r5.toString()
            i9d r5 = new i9d
            if (r2 != 0) goto L67
            nz4 r2 = defpackage.nz4.a
        L67:
            r15 = r2
            long r11 = r0.s0
            r14 = 1
            r10 = r5
            r10.<init>(r11, r13, r14, r15)
            r5.b = r3
            r2 = r4 ^ 1
            r5.e = r2
            k9d r2 = new k9d
            r2.<init>(r5)
            je7 r3 = r9.c
            java.lang.Object r3 = r3.getValue()
            xb6 r3 = (defpackage.xb6) r3
            r0.X = r2
            r0.Y = r6
            cz5 r5 = r0.w0
            java.lang.Object r0 = r3.b(r5, r0)
            if (r0 != r1) goto L8f
            return r1
        L8f:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            e5f r3 = defpackage.e5f.a
            if (r1 == 0) goto La8
            je7 r0 = r9.b
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            r2.getClass()
            r0.a(r2)
            return r3
        La8:
            kl7 r1 = defpackage.j1e.l()
            r1.add(r2)
            r1.addAll(r0)
            kl7 r0 = defpackage.j1e.d(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r0)
            h8d r0 = new h8d
            r2 = 2
            r0.<init>(r7, r1, r2)
            r0.e = r4
            h9d r1 = new h9d
            r1.<init>(r0)
            je7 r0 = r9.b
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            r0.a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n89.o(java.lang.Object):java.lang.Object");
    }
}
