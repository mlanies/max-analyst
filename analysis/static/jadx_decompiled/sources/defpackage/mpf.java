package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public abstract class mpf {
    public static final Rect a = new Rect();
    public static final int[] b = new int[2];

    public static final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final kpf b(ViewGroup viewGroup, k56 k56Var) {
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        lpf lpfVar = new lpf(k56Var, viewTreeObserver, viewGroup);
        viewTreeObserver.addOnGlobalLayoutListener(lpfVar);
        if (viewGroup.isAttachedToWindow()) {
            if (viewGroup.isAttachedToWindow()) {
                viewGroup.addOnAttachStateChangeListener(new jpf(viewGroup, lpfVar, viewTreeObserver, viewGroup, 1));
            } else {
                a(lpfVar, viewTreeObserver, viewGroup);
            }
        } else if (!viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new jpf(viewGroup, lpfVar, viewTreeObserver, viewGroup, 0));
        } else if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new jpf(viewGroup, lpfVar, viewTreeObserver, viewGroup, 2));
        } else {
            a(lpfVar, viewTreeObserver, viewGroup);
        }
        return new kpf(viewTreeObserver, viewGroup, lpfVar);
    }

    public static final Rect c(View view, View view2) {
        int left = view.getLeft();
        int top = view.getTop();
        Object parent = view.getParent();
        while (parent != view2 && (parent instanceof View)) {
            View view3 = (View) parent;
            int scrollX = left - view3.getScrollX();
            int scrollY = top - view3.getScrollY();
            left = scrollX + view3.getLeft();
            top = scrollY + view3.getTop();
            parent = view3.getParent();
        }
        int width = view.getWidth() + left;
        int height = view.getHeight() + top;
        Rect rect = a;
        rect.set(left, top, width, height);
        return rect;
    }

    public static final void d(Rect rect, View view) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
