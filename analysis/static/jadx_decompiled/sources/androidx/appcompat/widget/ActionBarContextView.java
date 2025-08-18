package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b7;
import defpackage.e0d;
import defpackage.e7;
import defpackage.j7;
import defpackage.mvb;
import defpackage.p3c;
import defpackage.qr8;
import defpackage.s36;
import defpackage.vof;
import defpackage.vsb;
import defpackage.w;
import defpackage.wq8;
import defpackage.zmf;
import defpackage.zyb;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public View A0;
    public LinearLayout B0;
    public TextView C0;
    public TextView D0;
    public final int E0;
    public final int F0;
    public boolean G0;
    public final int H0;
    public final w a;
    public final Context b;
    public ActionMenuView c;
    public e7 o;
    public int s0;
    public vof t0;
    public boolean u0;
    public boolean v0;
    public CharSequence w0;
    public CharSequence x0;
    public View y0;
    public View z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i = vsb.actionModeStyle;
        super(context, attributeSet, i);
        w wVar = new w();
        wVar.c = this;
        wVar.b = false;
        this.a = wVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(vsb.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.ActionMode, i, 0);
        int i2 = p3c.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : s36.n(context, resourceId));
        this.E0 = typedArrayObtainStyledAttributes.getResourceId(p3c.ActionMode_titleTextStyle, 0);
        this.F0 = typedArrayObtainStyledAttributes.getResourceId(p3c.ActionMode_subtitleTextStyle, 0);
        this.s0 = typedArrayObtainStyledAttributes.getLayoutDimension(p3c.ActionMode_height, 0);
        this.H0 = typedArrayObtainStyledAttributes.getResourceId(p3c.ActionMode_closeItemLayout, zyb.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(j7 j7Var) {
        View view = this.y0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.H0, (ViewGroup) this, false);
            this.y0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.y0);
        }
        View viewFindViewById = this.y0.findViewById(mvb.action_mode_close_button);
        this.z0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new e0d(1, j7Var));
        wq8 wq8VarC = j7Var.c();
        e7 e7Var = this.o;
        if (e7Var != null) {
            e7Var.f();
            b7 b7Var = e7Var.E0;
            if (b7Var != null && b7Var.b()) {
                b7Var.j.dismiss();
            }
        }
        e7 e7Var2 = new e7(getContext());
        this.o = e7Var2;
        e7Var2.w0 = true;
        e7Var2.x0 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        wq8VarC.b(this.o, this.b);
        e7 e7Var3 = this.o;
        qr8 qr8Var = e7Var3.s0;
        if (qr8Var == null) {
            qr8 qr8Var2 = (qr8) e7Var3.o.inflate(e7Var3.Y, (ViewGroup) this, false);
            e7Var3.s0 = qr8Var2;
            qr8Var2.b(e7Var3.c);
            e7Var3.i();
        }
        qr8 qr8Var3 = e7Var3.s0;
        if (qr8Var != qr8Var3) {
            ((ActionMenuView) qr8Var3).setPresenter(e7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) qr8Var3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void d() {
        if (this.B0 == null) {
            LayoutInflater.from(getContext()).inflate(zyb.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.B0 = linearLayout;
            this.C0 = (TextView) linearLayout.findViewById(mvb.action_bar_title);
            this.D0 = (TextView) this.B0.findViewById(mvb.action_bar_subtitle);
            int i = this.E0;
            if (i != 0) {
                this.C0.setTextAppearance(getContext(), i);
            }
            int i2 = this.F0;
            if (i2 != 0) {
                this.D0.setTextAppearance(getContext(), i2);
            }
        }
        this.C0.setText(this.w0);
        this.D0.setText(this.x0);
        boolean z = !TextUtils.isEmpty(this.w0);
        boolean z2 = !TextUtils.isEmpty(this.x0);
        this.D0.setVisibility(z2 ? 0 : 8);
        this.B0.setVisibility((z || z2) ? 0 : 8);
        if (this.B0.getParent() == null) {
            addView(this.B0);
        }
    }

    public final void e() {
        removeAllViews();
        this.A0 = null;
        this.c = null;
        this.o = null;
        View view = this.z0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.t0 != null ? this.a.a : getVisibility();
    }

    public int getContentHeight() {
        return this.s0;
    }

    public CharSequence getSubtitle() {
        return this.x0;
    }

    public CharSequence getTitle() {
        return this.w0;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            vof vofVar = this.t0;
            if (vofVar != null) {
                vofVar.b();
            }
            super.setVisibility(i);
        }
    }

    public final vof i(int i, long j) {
        vof vofVar = this.t0;
        if (vofVar != null) {
            vofVar.b();
        }
        w wVar = this.a;
        if (i != 0) {
            vof vofVarA = zmf.a(this);
            vofVarA.a(0.0f);
            vofVarA.c(j);
            ((ActionBarContextView) wVar.c).t0 = vofVarA;
            wVar.a = i;
            vofVarA.d(wVar);
            return vofVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        vof vofVarA2 = zmf.a(this);
        vofVarA2.a(1.0f);
        vofVarA2.c(j);
        ((ActionBarContextView) wVar.c).t0 = vofVarA2;
        wVar.a = i;
        vofVarA2.d(wVar);
        return vofVarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p3c.ActionBar, vsb.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p3c.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        e7 e7Var = this.o;
        if (e7Var != null) {
            Configuration configuration2 = e7Var.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            e7Var.A0 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            wq8 wq8Var = e7Var.c;
            if (wq8Var != null) {
                wq8Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e7 e7Var = this.o;
        if (e7Var != null) {
            e7Var.f();
            b7 b7Var = this.o.E0;
            if (b7Var == null || !b7Var.b()) {
                return;
            }
            b7Var.j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.v0 = false;
        }
        if (!this.v0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.v0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.v0 = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.y0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y0.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(i7, paddingTop, paddingTop2, this.y0, z2) + i7;
            paddingRight = z2 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.B0;
        if (linearLayout != null && this.A0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.B0, z2);
        }
        View view2 = this.A0;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.s0;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.y0;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y0.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.B0;
        if (linearLayout != null && this.A0 == null) {
            if (this.G0) {
                this.B0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.B0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.B0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.A0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.A0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.s0 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u0 = false;
        }
        if (!this.u0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.u0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.u0 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.s0 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.A0;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0 = view;
        if (view != null && (linearLayout = this.B0) != null) {
            removeView(linearLayout);
            this.B0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.x0 = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.w0 = charSequence;
        d();
        zmf.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.G0) {
            requestLayout();
        }
        this.G0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
