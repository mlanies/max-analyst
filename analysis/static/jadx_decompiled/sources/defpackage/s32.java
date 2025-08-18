package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class s32 extends l32 {
    public final mn5 o;

    public s32(int i, int i2, lx3 lx3Var, mn5 mn5Var) {
        super(lx3Var, i, i2);
        this.o = mn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // defpackage.l32, defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            e5f r0 = defpackage.e5f.a
            tx3 r1 = defpackage.tx3.a
            int r2 = r6.b
            r3 = -3
            if (r2 != r3) goto L70
            lx3 r2 = r8.getContext()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            ai0 r4 = new ai0
            r5 = 11
            r4.<init>(r5)
            lx3 r5 = r6.a
            java.lang.Object r3 = r5.fold(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L29
            lx3 r3 = r2.plus(r5)
            goto L2e
        L29:
            r3 = 0
            lx3 r3 = defpackage.v3c.m(r2, r5, r3)
        L2e:
            boolean r4 = defpackage.tpa.f(r3, r2)
            if (r4 == 0) goto L3c
            java.lang.Object r6 = r6.n(r7, r8)
            if (r6 != r1) goto L77
        L3a:
            r0 = r6
            goto L77
        L3c:
            vu4 r4 = defpackage.vu4.b
            jx3 r5 = r3.get(r4)
            jx3 r2 = r2.get(r4)
            boolean r2 = defpackage.tpa.f(r5, r2)
            if (r2 == 0) goto L70
            lx3 r2 = r8.getContext()
            boolean r4 = r7 instanceof defpackage.z5d
            if (r4 != 0) goto L5f
            boolean r4 = r7 instanceof defpackage.gr9
            if (r4 == 0) goto L59
            goto L5f
        L59:
            y40 r4 = new y40
            r4.<init>(r7, r2)
            r7 = r4
        L5f:
            r32 r2 = new r32
            r4 = 0
            r2.<init>(r6, r4)
            java.lang.Object r6 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r3)
            java.lang.Object r6 = defpackage.f46.g0(r3, r7, r6, r2, r8)
            if (r6 != r1) goto L77
            goto L3a
        L70:
            java.lang.Object r6 = super.d(r7, r8)
            if (r6 != r1) goto L77
            goto L3a
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s32.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.l32
    public final Object j(iab iabVar, Continuation continuation) {
        Object objN = n(new z5d(iabVar), continuation);
        return objN == tx3.a ? objN : e5f.a;
    }

    public abstract Object n(on5 on5Var, Continuation continuation);

    @Override // defpackage.l32
    public final String toString() {
        return this.o + " -> " + super.toString();
    }
}
