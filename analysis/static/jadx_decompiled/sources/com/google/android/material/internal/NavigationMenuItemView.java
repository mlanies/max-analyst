package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aq4;
import defpackage.br8;
import defpackage.by5;
import defpackage.fr0;
import defpackage.ivb;
import defpackage.pr8;
import defpackage.qic;
import defpackage.rh7;
import defpackage.stb;
import defpackage.swe;
import defpackage.vic;
import defpackage.vsb;
import defpackage.vyb;
import defpackage.yub;
import defpackage.zmf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends by5 implements pr8 {
    public static final int[] F0 = {R.attr.state_checked};
    public br8 A0;
    public ColorStateList B0;
    public boolean C0;
    public Drawable D0;
    public final fr0 E0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public final boolean x0;
    public final CheckedTextView y0;
    public FrameLayout z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = true;
        fr0 fr0Var = new fr0(4, this);
        this.E0 = fr0Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(vyb.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(stb.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ivb.design_menu_item_text);
        this.y0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        zmf.j(checkedTextView, fr0Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.z0 == null) {
                this.z0 = (FrameLayout) ((ViewStub) findViewById(ivb.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.z0.removeAllViews();
            this.z0.addView(view);
        }
    }

    @Override // defpackage.pr8
    public final void d(br8 br8Var) {
        StateListDrawable stateListDrawable;
        this.A0 = br8Var;
        int i = br8Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(br8Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(vsb.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = zmf.a;
            setBackground(stateListDrawable);
        }
        setCheckable(br8Var.isCheckable());
        setChecked(br8Var.isChecked());
        setEnabled(br8Var.isEnabled());
        setTitle(br8Var.X);
        setIcon(br8Var.getIcon());
        setActionView(br8Var.getActionView());
        setContentDescription(br8Var.B0);
        swe.a(this, br8Var.C0);
        br8 br8Var2 = this.A0;
        CharSequence charSequence = br8Var2.X;
        CheckedTextView checkedTextView = this.y0;
        if (charSequence == null && br8Var2.getIcon() == null && this.A0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.z0;
            if (frameLayout != null) {
                rh7 rh7Var = (rh7) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) rh7Var).width = -1;
                this.z0.setLayoutParams(rh7Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.z0;
        if (frameLayout2 != null) {
            rh7 rh7Var2 = (rh7) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) rh7Var2).width = -2;
            this.z0.setLayoutParams(rh7Var2);
        }
    }

    @Override // defpackage.pr8
    public br8 getItemData() {
        return this.A0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        br8 br8Var = this.A0;
        if (br8Var != null && br8Var.isCheckable() && this.A0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.w0 != z) {
            this.w0 = z;
            this.E0.h(this.y0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.y0;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.x0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                aq4.h(drawable, this.B0);
            }
            int i = this.u0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.v0) {
            if (this.D0 == null) {
                Resources resources = getResources();
                int i2 = yub.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = vic.a;
                Drawable drawableA = qic.a(resources, i2, theme);
                this.D0 = drawableA;
                if (drawableA != null) {
                    int i3 = this.u0;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.D0;
        }
        this.y0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.y0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.u0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        this.C0 = colorStateList != null;
        br8 br8Var = this.A0;
        if (br8Var != null) {
            setIcon(br8Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.v0 = z;
    }

    public void setTextAppearance(int i) {
        this.y0.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y0.setText(charSequence);
    }
}
