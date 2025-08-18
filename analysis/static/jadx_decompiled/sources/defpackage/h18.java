package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class h18 extends a4 {
    public final /* synthetic */ int d;

    public /* synthetic */ h18(int i) {
        this.d = i;
    }

    @Override // defpackage.a4
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        int scrollRange;
        switch (this.d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                this.a.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                l4Var.j(false);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate2 = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = l4Var.a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                l4Var.h(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    l4Var.j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        l4Var.b(f4.g);
                        l4Var.b(f4.k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        l4Var.b(f4.f);
                        l4Var.b(f4.l);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // defpackage.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La0
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1f
        L1c:
            r6 = r0
            goto La0
        L1f:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3c
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3c
            int r3 = r1.height()
        L3c:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L76
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4f
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4f
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L76
            goto L1c
        L4f:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            goto La0
        L76:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L1c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
        La0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h18.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
