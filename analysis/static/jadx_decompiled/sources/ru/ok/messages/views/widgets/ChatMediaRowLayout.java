package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.bk4;
import defpackage.fk4;
import defpackage.zg2;

/* loaded from: classes2.dex */
public class ChatMediaRowLayout extends FrameLayout {
    public final bk4 a;

    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        this.a = bk4.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        WindowInsets rootWindowInsets;
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        View rootView = getRootView();
        Rect rect = null;
        if (rootView != null && (rootWindowInsets = rootView.getRootWindowInsets()) != null) {
            rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
        }
        if (rect != null) {
            measuredWidth -= rect.left + rect.right;
        }
        this.a.getClass();
        int iB = (measuredWidth - (fk4.b((int) 1.0f) * 2)) / 3;
        if (iB < size) {
            i = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public void setListener(zg2 zg2Var) {
    }
}
