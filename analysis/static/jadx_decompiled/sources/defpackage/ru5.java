package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ru5 extends ffe implements a66 {
    public Set X;
    public int Y;
    public final /* synthetic */ su5 Z;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru5(su5 su5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = su5Var;
        this.s0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ru5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ru5(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.Y
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            su5 r5 = r12.Z
            r9 = 1
            if (r1 == 0) goto L29
            if (r1 == r9) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            defpackage.od2.a0(r13)
            goto L80
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1f:
            java.util.Set r1 = r12.X
            defpackage.od2.a0(r13)
            goto L6d
        L25:
            defpackage.od2.a0(r13)
            goto L37
        L29:
            defpackage.od2.a0(r13)
            x3c r13 = r5.a
            r12.Y = r9
            java.lang.Object r13 = r13.f(r12)
            if (r13 != r0) goto L37
            return r0
        L37:
            r1 = r13
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r10 = r12.s0
            boolean r13 = defpackage.w9e.C0(r10)
            r13 = r13 ^ r9
            if (r13 == 0) goto L6d
            je7 r13 = r5.b
            java.lang.Object r13 = r13.getValue()
            ta2 r13 = (defpackage.ta2) r13
            java.util.List r7 = defpackage.x53.D0(r1)
            r12.X = r1
            r12.Y = r4
            zb2 r13 = (defpackage.zb2) r13
            r13.getClass()
            ya2 r4 = new ya2
            r11 = 0
            r6 = r4
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            lx3 r13 = r13.Y
            java.lang.Object r13 = defpackage.j47.t0(r13, r4, r12)
            if (r13 != r0) goto L69
            goto L6a
        L69:
            r13 = r2
        L6a:
            if (r13 != r0) goto L6d
            return r0
        L6d:
            kld r13 = r5.d
            qu5 r4 = new qu5
            r4.<init>(r1)
            r1 = 0
            r12.X = r1
            r12.Y = r3
            java.lang.Object r12 = r13.a(r4, r12)
            if (r12 != r0) goto L80
            return r0
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru5.o(java.lang.Object):java.lang.Object");
    }
}
