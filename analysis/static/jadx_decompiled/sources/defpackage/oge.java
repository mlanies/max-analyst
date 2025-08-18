package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oge extends nd7 {
    public int k;
    public int l = -1;
    public final /* synthetic */ SwipeDismissBehavior m;

    public oge(SwipeDismissBehavior swipeDismissBehavior) {
        this.m = swipeDismissBehavior;
    }

    @Override // defpackage.nd7
    public final void H(View view, int i) {
        this.l = i;
        this.k = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.m;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.nd7
    public final void I(int i) {
        this.m.getClass();
    }

    @Override // defpackage.nd7
    public final void J(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.m;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.k);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // defpackage.nd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.l = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.m
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = defpackage.zmf.a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r2) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.k
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.k
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r8 = r8.k
            int r0 = r8 - r11
            goto L69
        L66:
            int r0 = r8.k
            r2 = r4
        L69:
            dnf r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.n(r0, r10)
            if (r8 == 0) goto L7f
            i76 r8 = new i76
            r8.<init>(r3, r9, r2)
            java.util.WeakHashMap r10 = defpackage.zmf.a
            r9.postOnAnimation(r8)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oge.K(android.view.View, float, float):void");
    }

    @Override // defpackage.nd7
    public final boolean W(View view, int i) {
        int i2 = this.l;
        return (i2 == -1 || i2 == i) && this.m.x(view);
    }

    @Override // defpackage.nd7
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = zmf.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.m.d;
        if (i2 == 0) {
            if (z) {
                width = this.k - view.getWidth();
                width2 = this.k;
            } else {
                width = this.k;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.k - view.getWidth();
            width2 = this.k + view.getWidth();
        } else if (z) {
            width = this.k;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.k - view.getWidth();
            width2 = this.k;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.nd7
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.nd7
    public final int x(View view) {
        return view.getWidth();
    }
}
