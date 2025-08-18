package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w92 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ka2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w92(ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w92 w92Var = (w92) n((wu4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w92Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w92 w92Var = new w92(this.Y, continuation);
        w92Var.X = obj;
        return w92Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.X
            wu4 r11 = (defpackage.wu4) r11
            ka2 r10 = r10.Y
            bc7[] r0 = defpackage.ka2.E
            r10.getClass()
            meb r0 = new meb
            java.lang.String r2 = r11.a
            long r3 = r11.b
            java.lang.String r5 = r11.d
            java.lang.CharSequence r6 = r11.c
            q0e r11 = r10.i
            java.lang.Object r11 = r11.getValue()
            wu4 r11 = (defpackage.wu4) r11
            r1 = 0
            if (r11 == 0) goto L33
            q0e r7 = r10.j
            java.lang.Object r7 = r7.getValue()
            jv4 r7 = (defpackage.jv4) r7
            boolean r11 = r11.a(r7)
            r7 = 1
            if (r11 != r7) goto L33
            goto L34
        L33:
            r7 = r1
        L34:
            boolean r8 = r10.p
            r9 = 1
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            zu4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            q0e r1 = r10.b
        L45:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            meb r3 = (defpackage.meb) r3
            boolean r2 = r1.c(r2, r0)
            if (r2 == 0) goto L45
            q0e r2 = r10.c
        L54:
            java.lang.Object r10 = r2.getValue()
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r10 = r2.c(r10, r11)
            if (r10 == 0) goto L54
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w92.o(java.lang.Object):java.lang.Object");
    }
}
