package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g96 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ z96 Z;
    public final /* synthetic */ b86 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g96(z96 z96Var, b86 b86Var, Continuation continuation) {
        super(2, continuation);
        this.Z = z96Var;
        this.s0 = b86Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g96) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g96(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.Y
            e5f r2 = defpackage.e5f.a
            java.lang.String r3 = "z96"
            r4 = 3
            r5 = 2
            r6 = 1
            b86 r7 = r11.s0
            r8 = 0
            z96 r9 = r11.Z
            if (r1 == 0) goto L34
            if (r1 == r6) goto L30
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            java.util.List r11 = r11.X
            defpackage.od2.a0(r12)
            goto Laf
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L27:
            java.util.List r1 = r11.X
            defpackage.od2.a0(r12)
            r10 = r1
            r1 = r12
            r12 = r10
            goto L8b
        L30:
            defpackage.od2.a0(r12)
            goto L71
        L34:
            defpackage.od2.a0(r12)
            q0e r12 = r9.z0
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L46
            return r2
        L46:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "start fetch medias for "
            r12.<init>(r1)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.n(r3, r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            q0e r1 = r9.z0
            r1.m(r8, r12)
            a86 r12 = r7.a
            hq7 r1 = r9.X
            fz6 r1 = (defpackage.fz6) r1
            java.util.List r12 = r1.c(r12)
            r11.Y = r6
            java.lang.Object r12 = defpackage.z96.q(r9, r12, r11)
            if (r12 != r0) goto L71
            return r0
        L71:
            java.util.List r12 = (java.util.List) r12
            q0e r1 = r9.w0
            r1.setValue(r12)
            w86 r1 = r9.y0
            int r1 = r1.b
            r11.X = r12
            r11.Y = r5
            hq7 r5 = r9.X
            fz6 r5 = (defpackage.fz6) r5
            java.lang.Object r1 = r5.d(r7, r1, r11)
            if (r1 != r0) goto L8b
            return r0
        L8b:
            gq7 r1 = (defpackage.gq7) r1
            q0e r5 = r9.z0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.m(r8, r6)
            boolean r5 = r1 instanceof defpackage.eq7
            if (r5 == 0) goto L99
            return r2
        L99:
            boolean r5 = r1 instanceof defpackage.fq7
            if (r5 == 0) goto Lcc
            fq7 r1 = (defpackage.fq7) r1
            java.util.List r1 = r1.a
            r11.X = r12
            r11.Y = r4
            java.lang.Object r11 = defpackage.z96.q(r9, r1, r11)
            if (r11 != r0) goto Lac
            return r0
        Lac:
            r10 = r12
            r12 = r11
            r11 = r10
        Laf:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = defpackage.x53.t0(r11, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "finish fetch medias for "
            r12.<init>(r0)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.n(r3, r12)
            q0e r12 = r9.w0
            r12.m(r8, r11)
            return r2
        Lcc:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g96.o(java.lang.Object):java.lang.Object");
    }
}
