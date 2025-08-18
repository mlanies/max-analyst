package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class gqf extends w1f {
    public static final String[] S0 = {"android:visibility:visibility", "android:visibility:parent"};
    public int R0 = 3;

    public static void Q(g2f g2fVar) {
        int visibility = g2fVar.b.getVisibility();
        HashMap map = g2fVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = g2fVar.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fqf R(defpackage.g2f r8, defpackage.g2f r9) {
        /*
            fqf r0 = new fqf
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqf.R(g2f, g2f):fqf");
    }

    public abstract ObjectAnimator S(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2);

    public abstract ObjectAnimator T(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2);

    @Override // defpackage.w1f
    public void e(g2f g2fVar) {
        Q(g2fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (R(r(r5, false), v(r5, false)).a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d5  */
    @Override // defpackage.w1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r21, defpackage.g2f r22, defpackage.g2f r23) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqf.l(android.view.ViewGroup, g2f, g2f):android.animation.Animator");
    }

    @Override // defpackage.w1f
    public final String[] u() {
        return S0;
    }

    @Override // defpackage.w1f
    public final boolean x(g2f g2fVar, g2f g2fVar2) {
        if (g2fVar == null && g2fVar2 == null) {
            return false;
        }
        if (g2fVar != null && g2fVar2 != null && g2fVar2.a.containsKey("android:visibility:visibility") != g2fVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        fqf fqfVarR = R(g2fVar, g2fVar2);
        if (fqfVarR.a) {
            return fqfVarR.c == 0 || fqfVarR.d == 0;
        }
        return false;
    }
}
