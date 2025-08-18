package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.a0;
import defpackage.aq4;
import defpackage.au1;
import defpackage.b18;
import defpackage.bkg;
import defpackage.c18;
import defpackage.d18;
import defpackage.gjd;
import defpackage.i8g;
import defpackage.ju0;
import defpackage.m2c;
import defpackage.mqd;
import defpackage.nu0;
import defpackage.rjd;
import defpackage.s36;
import defpackage.sre;
import defpackage.tsb;
import defpackage.y18;
import defpackage.z2c;
import defpackage.z7;
import defpackage.zmf;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, rjd {
    public static final int[] F0 = {R.attr.state_checkable};
    public static final int[] G0 = {R.attr.state_checked};
    public static final int H0 = m2c.Widget_MaterialComponents_Button;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public final d18 o;
    public final LinkedHashSet s0;
    public b18 t0;
    public PorterDuff.Mode u0;
    public ColorStateList v0;
    public Drawable w0;
    public String x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        int i = tsb.materialButtonStyle;
        int i2 = H0;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        this.s0 = new LinkedHashSet();
        this.C0 = false;
        this.D0 = false;
        Context context2 = getContext();
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.MaterialButton, i, i2, new int[0]);
        this.B0 = typedArrayD.getDimensionPixelSize(z2c.MaterialButton_iconPadding, 0);
        int i3 = typedArrayD.getInt(z2c.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.u0 = mqd.A(i3, mode);
        this.v0 = ju0.q(getContext(), typedArrayD, z2c.MaterialButton_iconTint);
        this.w0 = ju0.s(getContext(), typedArrayD, z2c.MaterialButton_icon);
        this.E0 = typedArrayD.getInteger(z2c.MaterialButton_iconGravity, 1);
        this.y0 = typedArrayD.getDimensionPixelSize(z2c.MaterialButton_iconSize, 0);
        d18 d18Var = new d18(this, gjd.b(context2, attributeSet, i, i2).c());
        this.o = d18Var;
        d18Var.c = typedArrayD.getDimensionPixelOffset(z2c.MaterialButton_android_insetLeft, 0);
        d18Var.d = typedArrayD.getDimensionPixelOffset(z2c.MaterialButton_android_insetRight, 0);
        d18Var.e = typedArrayD.getDimensionPixelOffset(z2c.MaterialButton_android_insetTop, 0);
        d18Var.f = typedArrayD.getDimensionPixelOffset(z2c.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(z2c.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(z2c.MaterialButton_cornerRadius, -1);
            d18Var.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            i8g i8gVarE = d18Var.b.e();
            i8gVarE.e = new a0(f);
            i8gVarE.f = new a0(f);
            i8gVarE.g = new a0(f);
            i8gVarE.h = new a0(f);
            d18Var.c(i8gVarE.c());
            d18Var.p = true;
        }
        d18Var.h = typedArrayD.getDimensionPixelSize(z2c.MaterialButton_strokeWidth, 0);
        d18Var.i = mqd.A(typedArrayD.getInt(z2c.MaterialButton_backgroundTintMode, -1), mode);
        d18Var.j = ju0.q(getContext(), typedArrayD, z2c.MaterialButton_backgroundTint);
        d18Var.k = ju0.q(getContext(), typedArrayD, z2c.MaterialButton_strokeColor);
        d18Var.l = ju0.q(getContext(), typedArrayD, z2c.MaterialButton_rippleColor);
        d18Var.q = typedArrayD.getBoolean(z2c.MaterialButton_android_checkable, false);
        d18Var.t = typedArrayD.getDimensionPixelSize(z2c.MaterialButton_elevation, 0);
        d18Var.r = typedArrayD.getBoolean(z2c.MaterialButton_toggleCheckedStateOnClick, true);
        WeakHashMap weakHashMap = zmf.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(z2c.MaterialButton_android_background)) {
            d18Var.o = true;
            setSupportBackgroundTintList(d18Var.j);
            setSupportBackgroundTintMode(d18Var.i);
        } else {
            d18Var.e();
        }
        setPaddingRelative(paddingStart + d18Var.c, paddingTop + d18Var.e, paddingEnd + d18Var.d, paddingBottom + d18Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.B0);
        e(this.w0 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean b() {
        d18 d18Var = this.o;
        return d18Var != null && d18Var.q;
    }

    public final boolean c() {
        d18 d18Var = this.o;
        return (d18Var == null || d18Var.o) ? false : true;
    }

    public final void d() {
        int i = this.E0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.w0, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.w0, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.w0, null, null);
        }
    }

    public final void e(boolean z) {
        Drawable drawable = this.w0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.w0 = drawableMutate;
            aq4.h(drawableMutate, this.v0);
            PorterDuff.Mode mode = this.u0;
            if (mode != null) {
                aq4.i(this.w0, mode);
            }
            int intrinsicWidth = this.y0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.w0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.y0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.w0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.w0;
            int i = this.z0;
            int i2 = this.A0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.w0.setVisible(true, z);
        }
        if (z) {
            d();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.E0;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.w0) || (((i3 == 3 || i3 == 4) && drawable5 != this.w0) || ((i3 == 16 || i3 == 32) && drawable4 != this.w0))) {
            d();
        }
    }

    public final void f(int i, int i2) {
        if (this.w0 == null || getLayout() == null) {
            return;
        }
        int i3 = this.E0;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.z0 = 0;
                if (i3 == 16) {
                    this.A0 = 0;
                    e(false);
                    return;
                }
                int intrinsicHeight = this.y0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.w0.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.B0) - getPaddingBottom()) / 2);
                if (this.A0 != iMax) {
                    this.A0 = iMax;
                    e(false);
                    return;
                }
                return;
            }
            return;
        }
        this.A0 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.E0;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.z0 = 0;
            e(false);
            return;
        }
        int intrinsicWidth = this.y0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.w0.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = zmf.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.B0) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.E0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.z0 != paddingEnd) {
            this.z0 = paddingEnd;
            e(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.x0)) {
            return (b() ? CompoundButton.class : Button.class).getName();
        }
        return this.x0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (c()) {
            return this.o.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.w0;
    }

    public int getIconGravity() {
        return this.E0;
    }

    public int getIconPadding() {
        return this.B0;
    }

    public int getIconSize() {
        return this.y0;
    }

    public ColorStateList getIconTint() {
        return this.v0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.u0;
    }

    public int getInsetBottom() {
        return this.o.f;
    }

    public int getInsetTop() {
        return this.o.e;
    }

    public ColorStateList getRippleColor() {
        if (c()) {
            return this.o.l;
        }
        return null;
    }

    public gjd getShapeAppearanceModel() {
        if (c()) {
            return this.o.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (c()) {
            return this.o.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (c()) {
            return this.o.h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return c() ? this.o.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return c() ? this.o.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.C0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            nu0.N(this, this.o.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F0);
        }
        if (this.C0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.C0);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(this.C0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c18)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c18 c18Var = (c18) parcelable;
        super.onRestoreInstanceState(c18Var.a);
        setChecked(c18Var.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c18 c18Var = new c18(super.onSaveInstanceState());
        c18Var.c = this.C0;
        return c18Var;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.o.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.w0 != null) {
            if (this.w0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.x0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!c()) {
            super.setBackgroundColor(i);
            return;
        }
        d18 d18Var = this.o;
        if (d18Var.b(false) != null) {
            d18Var.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!c()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        d18 d18Var = this.o;
        d18Var.o = true;
        ColorStateList colorStateList = d18Var.j;
        MaterialButton materialButton = d18Var.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(d18Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? s36.n(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (c()) {
            this.o.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.C0 != z) {
            this.C0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.C0;
                if (!materialButtonToggleGroup.t0) {
                    materialButtonToggleGroup.b(getId(), z2);
                }
            }
            if (this.D0) {
                return;
            }
            this.D0 = true;
            Iterator it = this.s0.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
            this.D0 = false;
        }
    }

    public void setCornerRadius(int i) {
        if (c()) {
            d18 d18Var = this.o;
            if (d18Var.p && d18Var.g == i) {
                return;
            }
            d18Var.g = i;
            d18Var.p = true;
            float f = i;
            i8g i8gVarE = d18Var.b.e();
            i8gVarE.e = new a0(f);
            i8gVarE.f = new a0(f);
            i8gVarE.g = new a0(f);
            i8gVarE.h = new a0(f);
            d18Var.c(i8gVarE.c());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (c()) {
            this.o.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.w0 != drawable) {
            this.w0 = drawable;
            e(true);
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? s36.n(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.y0 != i) {
            this.y0 = i;
            e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.u0 != mode) {
            this.u0 = mode;
            e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(z7.n(getContext(), i));
    }

    public void setInsetBottom(int i) {
        d18 d18Var = this.o;
        d18Var.d(d18Var.e, i);
    }

    public void setInsetTop(int i) {
        d18 d18Var = this.o;
        d18Var.d(i, d18Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b18 b18Var) {
        this.t0 = b18Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b18 b18Var = this.t0;
        if (b18Var != null) {
            ((MaterialButtonToggleGroup) ((bkg) b18Var).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (c()) {
            d18 d18Var = this.o;
            if (d18Var.l != colorStateList) {
                d18Var.l = colorStateList;
                MaterialButton materialButton = d18Var.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (c()) {
            setRippleColor(z7.n(getContext(), i));
        }
    }

    @Override // defpackage.rjd
    public void setShapeAppearanceModel(gjd gjdVar) {
        if (!c()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.o.c(gjdVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (c()) {
            d18 d18Var = this.o;
            d18Var.n = z;
            d18Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (c()) {
            d18 d18Var = this.o;
            if (d18Var.k != colorStateList) {
                d18Var.k = colorStateList;
                d18Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (c()) {
            setStrokeColor(z7.n(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (c()) {
            d18 d18Var = this.o;
            if (d18Var.h != i) {
                d18Var.h = i;
                d18Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!c()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        d18 d18Var = this.o;
        if (d18Var.j != colorStateList) {
            d18Var.j = colorStateList;
            if (d18Var.b(false) != null) {
                aq4.h(d18Var.b(false), d18Var.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!c()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        d18 d18Var = this.o;
        if (d18Var.i != mode) {
            d18Var.i = mode;
            if (d18Var.b(false) == null || d18Var.i == null) {
                return;
            }
            aq4.i(d18Var.b(false), d18Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        f(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.o.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.C0);
    }
}
