package ru.ok.messages.video.widgets.doubleTap;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.an4;
import defpackage.bk4;
import defpackage.cn4;
import defpackage.fk4;
import defpackage.oj9;
import defpackage.sk9;
import defpackage.vm4;
import defpackage.x53;
import defpackage.xxb;
import java.util.Set;

/* loaded from: classes2.dex */
public class DoubleTapVideoViewWrapper extends FrameLayout {
    public an4 a;

    public DoubleTapVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        bk4 bk4VarB = bk4.b();
        View vm4Var = new vm4(getContext(), 1);
        vm4Var.setId(xxb.double_tap_video_view_wrapper__arrows_view_left);
        vm4Var.setVisibility(8);
        int i = bk4VarB.E;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i * 2);
        layoutParams.gravity = 8388627;
        super.addView(vm4Var, layoutParams);
        View vm4Var2 = new vm4(getContext(), 2);
        vm4Var2.setId(xxb.double_tap_video_view_wrapper__arrows_view_right);
        vm4Var2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(fk4.b((int) 100.0f), fk4.b((int) 200.0f));
        layoutParams2.gravity = 8388629;
        super.addView(vm4Var2, layoutParams2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view, getChildCount() - 2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sk9 sk9Var = (sk9) this.a;
        oj9 oj9Var = (oj9) x53.h0((Set) sk9Var.a);
        if (oj9Var != null) {
            View view = (View) sk9Var.c;
            Rect rect = oj9Var.Z;
            view.getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                cn4 cn4Var = oj9Var.c;
                cn4Var.b.onTouchEvent(motionEvent);
                if (cn4Var.c > 0) {
                    return true;
                }
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                oj9Var.X.onTouchEvent(motionEvent);
            } else {
                cn4 cn4Var2 = oj9Var.o;
                cn4Var2.b.onTouchEvent(motionEvent);
                if (cn4Var2.c > 0) {
                    return true;
                }
            }
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setTouchEventListener(an4 an4Var) {
        this.a = an4Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, getChildCount() - 2, layoutParams);
    }
}
