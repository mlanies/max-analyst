package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vk1 extends ffe implements g66 {
    public /* synthetic */ long X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ oa s0;

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        vk1 vk1Var = new vk1(5, (Continuation) obj5);
        vk1Var.X = jLongValue;
        vk1Var.Y = zBooleanValue;
        vk1Var.Z = zBooleanValue2;
        vk1Var.s0 = (oa) obj4;
        return vk1Var.o(e5f.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            defpackage.od2.a0(r6)
            long r0 = r5.X
            boolean r6 = r5.Y
            boolean r2 = r5.Z
            oa r5 = r5.s0
            if (r6 == 0) goto L29
            if (r2 != 0) goto L29
            java.util.Set r6 = r5.b
            boolean r6 = r6.isEmpty()
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L29
            long r3 = r5.c
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L29
            java.util.Map r5 = r5.a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r2
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk1.o(java.lang.Object):java.lang.Object");
    }
}
