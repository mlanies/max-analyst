package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import defpackage.bof;
import defpackage.fm;
import defpackage.ow3;
import defpackage.rw3;
import defpackage.x6g;
import defpackage.z04;
import defpackage.z2c;
import defpackage.zmf;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends bof {
    public final Rect c;
    public final Rect d;
    public int e;
    public final int f;

    public AppBarLayout$ScrollingViewBehavior() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    public static fm A(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof fm) {
                return (fm) view;
            }
        }
        return null;
    }

    public final int B(View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof fm) {
            fm fmVar = (fm) view;
            int totalScrollRange = fmVar.getTotalScrollRange();
            int downNestedPreScrollRange = fmVar.getDownNestedPreScrollRange();
            ow3 ow3Var = ((rw3) fmVar.getLayoutParams()).a;
            int iD = ow3Var instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) ow3Var).D() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iD > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iD / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return z04.p((int) (f * i2), 0, i2);
    }

    @Override // defpackage.ow3
    public final boolean f(View view, View view2) {
        return view2 instanceof fm;
    }

    @Override // defpackage.ow3
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ow3 ow3Var = ((rw3) view2.getLayoutParams()).a;
        if (ow3Var instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) ow3Var).j) + this.e) - B(view2);
            WeakHashMap weakHashMap = zmf.a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) view2;
        if (!fmVar.z0) {
            return false;
        }
        fmVar.g(fmVar.h(view));
        return false;
    }

    @Override // defpackage.ow3
    public final void i(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof fm) {
            zmf.j(coordinatorLayout, null);
        }
    }

    @Override // defpackage.ow3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        fm fmVarA;
        x6g lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (fmVarA = A(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = zmf.a;
            if (fmVarA.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = fmVarA.getTotalScrollRange() + size;
        int measuredHeight = fmVarA.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.q(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // defpackage.ow3
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        fm fmVarA = A(coordinatorLayout.d(view));
        if (fmVarA != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = coordinatorLayout.getWidth();
            int height = coordinatorLayout.getHeight();
            Rect rect3 = this.c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                fmVarA.f(false, !z, true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bof
    public final void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        fm fmVarA = A(coordinatorLayout.d(view));
        if (fmVarA == null) {
            coordinatorLayout.p(view, i);
            this.e = 0;
            return;
        }
        rw3 rw3Var = (rw3) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) rw3Var).leftMargin;
        int bottom = fmVarA.getBottom() + ((ViewGroup.MarginLayoutParams) rw3Var).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) rw3Var).rightMargin;
        int bottom2 = ((fmVarA.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) rw3Var).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        x6g lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = zmf.a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        int i2 = rw3Var.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int i3 = i2;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.d;
        Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
        int iB = B(fmVarA);
        view.layout(rect2.left, rect2.top - iB, rect2.right, rect2.bottom - iB);
        this.e = rect2.top - fmVarA.getBottom();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.ScrollingViewBehavior_Layout);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
