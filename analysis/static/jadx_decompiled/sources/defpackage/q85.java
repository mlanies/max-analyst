package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class q85 extends w4d {
    public final /* synthetic */ r85 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q85(r85 r85Var) {
        super(1);
        this.c = r85Var;
    }

    @Override // defpackage.w4d
    public final l4 D(int i) {
        return new l4(AccessibilityNodeInfo.obtain(this.c.r(i).a));
    }

    @Override // defpackage.w4d
    public final l4 E(int i) {
        r85 r85Var = this.c;
        int i2 = i == 2 ? r85Var.k : r85Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return D(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // defpackage.w4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(int r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r85 r6 = r6.c
            android.view.View r0 = r6.i
            r1 = -1
            if (r7 == r1) goto L64
            r1 = 1
            if (r8 == r1) goto L5f
            r2 = 2
            if (r8 == r2) goto L5a
            r2 = 64
            r3 = 0
            r4 = 65536(0x10000, float:9.1835E-41)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r2) goto L2f
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L1f
            boolean r6 = r6.s(r7, r8, r9)
            goto L6a
        L1f:
            int r8 = r6.k
            if (r8 != r7) goto L2c
            r6.k = r5
            r0.invalidate()
            r6.x(r7, r4)
            goto L2d
        L2c:
            r1 = r3
        L2d:
            r6 = r1
            goto L6a
        L2f:
            android.view.accessibility.AccessibilityManager r8 = r6.h
            boolean r9 = r8.isEnabled()
            if (r9 == 0) goto L2c
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L3e
            goto L2c
        L3e:
            int r8 = r6.k
            if (r8 == r7) goto L2c
            if (r8 == r5) goto L4e
            r6.k = r5
            android.view.View r9 = r6.i
            r9.invalidate()
            r6.x(r8, r4)
        L4e:
            r6.k = r7
            r0.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r6.x(r7, r8)
            goto L2d
        L5a:
            boolean r6 = r6.j(r7)
            goto L6a
        L5f:
            boolean r6 = r6.w(r7)
            goto L6a
        L64:
            java.util.WeakHashMap r6 = defpackage.zmf.a
            boolean r6 = r0.performAccessibilityAction(r8, r9)
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q85.K(int, int, android.os.Bundle):boolean");
    }
}
