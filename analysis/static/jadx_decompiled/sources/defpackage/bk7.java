package defpackage;

import android.text.method.LinkMovementMethod;

/* loaded from: classes.dex */
public final class bk7 extends LinkMovementMethod {
    public static bk7 a;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r2 <= r1.getLineRight(r0)) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.widget.TextView r5, android.text.Spannable r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = defpackage.iu0.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L26
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L26
        L13:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r2 = "VanillaIceCream"
            java.lang.String r1 = r2.toUpperCase(r1)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L26
            goto L70
        L26:
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto L2f
            if (r0 != 0) goto L70
        L2f:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r5.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r5.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getScrollX()
            int r2 = r2 + r0
            int r0 = r5.getScrollY()
            int r0 = r0 + r1
            android.text.Layout r1 = r5.getLayout()
            if (r0 < 0) goto L75
            int r3 = r1.getHeight()
            if (r0 <= r3) goto L5a
            goto L75
        L5a:
            int r0 = r1.getLineForVertical(r0)
            float r2 = (float) r2
            float r3 = r1.getLineLeft(r0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L75
            float r0 = r1.getLineRight(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L70
            goto L75
        L70:
            boolean r4 = super.onTouchEvent(r5, r6, r7)
            return r4
        L75:
            android.text.Selection.removeSelection(r6)
            boolean r4 = android.text.method.Touch.onTouchEvent(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk7.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
