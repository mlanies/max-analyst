package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mk3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zk3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk3(zk3 zk3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zk3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mk3 mk3Var = (mk3) n((p22) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mk3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mk3 mk3Var = new mk3(this.Y, continuation);
        mk3Var.X = obj;
        return mk3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.X
            p22 r8 = (defpackage.p22) r8
            zk3 r7 = r7.Y
            q0e r0 = r7.c
            java.lang.Object r1 = r0.getValue()
            m22 r1 = (defpackage.m22) r1
            r2 = 0
            if (r1 == 0) goto L58
            q0e r3 = r7.h
            java.lang.Object r3 = r3.getValue()
            p22 r3 = (defpackage.p22) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L31
            if (r8 == 0) goto L2c
            java.lang.String r6 = r8.b
            java.lang.String r3 = r3.b
            boolean r3 = defpackage.tpa.f(r3, r6)
            r3 = r3 ^ r5
            goto L2d
        L2c:
            r3 = r4
        L2d:
            if (r3 != r5) goto L31
            r3 = r5
            goto L32
        L31:
            r3 = r4
        L32:
            if (r8 == 0) goto L36
            java.lang.String r2 = r8.b
        L36:
            if (r2 == 0) goto L41
            int r2 = r2.length()
            if (r2 != 0) goto L3f
            goto L41
        L3f:
            r2 = r4
            goto L42
        L41:
            r2 = r5
        L42:
            r2 = r2 ^ r5
            if (r2 == 0) goto L51
            if (r8 == 0) goto L4d
            boolean r8 = r8.e
            if (r8 != 0) goto L4d
            r8 = r5
            goto L4e
        L4d:
            r8 = r4
        L4e:
            if (r8 == 0) goto L51
            goto L52
        L51:
            r5 = r4
        L52:
            r8 = 9
            m22 r2 = defpackage.m22.a(r1, r3, r5, r4, r8)
        L58:
            r0.setValue(r2)
            khe r8 = r7.g
            java.lang.Object r8 = r8.getValue()
            f22 r8 = (defpackage.f22) r8
            java.util.List r8 = r8.a(r7)
            q0e r7 = r7.d
            r7.setValue(r8)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk3.o(java.lang.Object):java.lang.Object");
    }
}
