package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m50 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ p50 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(p50 p50Var, Continuation continuation) {
        super(2, continuation);
        this.Y = p50Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m50 m50Var = (m50) n((v50) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m50Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m50 m50Var = new m50(this.Y, continuation);
        m50Var.X = obj;
        return m50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.X
            v50 r4 = (defpackage.v50) r4
            p50 r3 = r3.Y
            r3.Q0 = r4
            if (r4 == 0) goto L2d
            java.lang.Long r0 = r3.O0
            java.lang.Long r1 = r4.a
            boolean r0 = defpackage.tpa.f(r1, r0)
            if (r0 != 0) goto L18
            goto L2d
        L18:
            vu4 r0 = defpackage.vu4.a
            l30 r4 = r4.c
            boolean r0 = defpackage.tpa.f(r4, r0)
            if (r0 == 0) goto L29
            r0 = 0
            r1 = 0
            u70 r2 = r3.D0
            r2.c(r0, r1)
        L29:
            r3.d(r4)
            goto L32
        L2d:
            o84 r4 = defpackage.o84.c
            r3.d(r4)
        L32:
            e5f r3 = defpackage.e5f.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m50.o(java.lang.Object):java.lang.Object");
    }
}
