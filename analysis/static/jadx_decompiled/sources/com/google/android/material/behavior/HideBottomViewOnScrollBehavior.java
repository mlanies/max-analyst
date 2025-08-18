package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.au1;
import defpackage.h6;
import defpackage.og;
import defpackage.ow3;
import defpackage.tsb;
import defpackage.vb5;
import defpackage.z7;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends ow3 {
    public static final int i = tsb.motionDurationLong2;
    public static final int j = tsb.motionDurationMedium4;
    public static final int k = tsb.motionEasingEmphasizedInterpolator;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public ViewPropertyAnimator h;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.ow3
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = z7.P(i, 225, view.getContext());
        this.c = z7.P(j, 175, view.getContext());
        Context context = view.getContext();
        vb5 vb5Var = og.d;
        int i3 = k;
        this.d = z7.Q(context, i3, vb5Var);
        this.e = z7.Q(view.getContext(), i3, og.c);
        return false;
    }

    @Override // defpackage.ow3
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i3 > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
            this.h = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new h6(6, this));
            return;
        }
        if (i3 >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            au1.r(it2.next());
            throw null;
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new h6(6, this));
    }

    @Override // defpackage.ow3
    public boolean u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
