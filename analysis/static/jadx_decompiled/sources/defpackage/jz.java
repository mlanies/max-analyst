package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jz extends ffe implements a66 {
    public String X;
    public Integer Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ kz t0;
    public final /* synthetic */ cu8 u0;
    public final /* synthetic */ int v0;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ boolean x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(kz kzVar, cu8 cu8Var, int i, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.t0 = kzVar;
        this.u0 = cu8Var;
        this.v0 = i;
        this.w0 = l;
        this.x0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jz jzVar = new jz(this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
        jzVar.s0 = obj;
        return jzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            cu8 r4 = r0.u0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L35
            if (r2 == r6) goto L2b
            if (r2 != r5) goto L23
            java.lang.Integer r1 = r0.Y
            java.lang.String r2 = r0.X
            java.lang.Object r5 = r0.s0
            java.lang.String r5 = (java.lang.String) r5
            defpackage.od2.a0(r19)
            r11 = r1
            r10 = r2
            r9 = r5
            r2 = r19
            goto La8
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.Object r2 = r0.s0
            yf4 r2 = (defpackage.yf4) r2
            defpackage.od2.a0(r19)
            r7 = r19
            goto L8e
        L35:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.s0
            sx3 r2 = (defpackage.sx3) r2
            kz r7 = r0.t0
            je7 r8 = r7.e
            java.lang.Object r8 = r8.getValue()
            zu8 r8 = (defpackage.zu8) r8
            es8 r11 = defpackage.zu8.a(r8, r4)
            iz r8 = new iz
            cu8 r14 = r0.u0
            java.lang.Long r15 = r0.w0
            kz r13 = r0.t0
            boolean r9 = r0.x0
            r17 = 0
            r12 = r8
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            r15 = 3
            zf4 r8 = defpackage.j47.h(r2, r3, r8, r15)
            int r9 = r0.v0
            if (r9 != 0) goto L73
            je7 r7 = r7.h
            java.lang.Object r7 = r7.getValue()
            ida r7 = (defpackage.ida) r7
            int r7 = r7.f()
            r13 = r7
            goto L74
        L73:
            r13 = r9
        L74:
            hz r7 = new hz
            r14 = 0
            kz r10 = r0.t0
            java.lang.Long r12 = r0.w0
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            zf4 r2 = defpackage.j47.h(r2, r3, r7, r15)
            r0.s0 = r2
            r0.Z = r6
            java.lang.Object r7 = r8.awaitInternal(r0)
            if (r7 != r1) goto L8e
            return r1
        L8e:
            fz r7 = (defpackage.fz) r7
            java.lang.String r8 = r7.a
            r0.s0 = r8
            java.lang.String r9 = r7.b
            r0.X = r9
            java.lang.Integer r7 = r7.c
            r0.Y = r7
            r0.Z = r5
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto La5
            return r1
        La5:
            r11 = r7
            r10 = r9
            r9 = r8
        La8:
            r8 = r2
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r1 = r4.b()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            int r1 = r2.intValue()
            java.lang.Long r0 = r0.w0
            if (r0 != 0) goto Lc0
            if (r1 <= r6) goto Lc0
            r12 = r2
            goto Lc1
        Lc0:
            r12 = r3
        Lc1:
            boolean r13 = r4.t()
            ez r0 = new ez
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz.o(java.lang.Object):java.lang.Object");
    }
}
