package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class hk0 extends FrameLayout {
    public static final qjf w0 = new qjf(1);
    public final gjd a;
    public int b;
    public final float c;
    public final float o;
    public final int s0;
    public final int t0;
    public ColorStateList u0;
    public PorterDuff.Mode v0;

    /* JADX WARN: Multi-variable type inference failed */
    public hk0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(y18.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, z2c.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.SnackbarLayout_elevation)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.SnackbarLayout_elevation, 0);
            WeakHashMap weakHashMap = zmf.a;
            omf.s(this, dimensionPixelSize);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(z2c.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(z2c.SnackbarLayout_shapeAppearanceOverlay)) {
            this.a = gjd.b(context2, attributeSet, 0, 0).c();
        }
        this.c = typedArrayObtainStyledAttributes.getFloat(z2c.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(ju0.q(context2, typedArrayObtainStyledAttributes, z2c.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(mqd.A(typedArrayObtainStyledAttributes.getInt(z2c.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.o = typedArrayObtainStyledAttributes.getFloat(z2c.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.SnackbarLayout_android_maxWidth, -1);
        this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(w0);
        setFocusable(true);
        if (getBackground() == null) {
            int iN = mr0.N(mr0.z(this, tsb.colorSurface), getBackgroundOverlayColorAlpha(), mr0.z(this, tsb.colorOnSurface));
            gjd gjdVar = this.a;
            if (gjdVar != null) {
                int i = ik0.a;
                q18 q18Var = new q18(gjdVar);
                q18Var.l(ColorStateList.valueOf(iN));
                gradientDrawable = q18Var;
            } else {
                Resources resources = getResources();
                int i2 = ik0.a;
                float dimension = resources.getDimension(stb.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iN);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.u0;
            if (colorStateList != null) {
                aq4.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = zmf.a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(ik0 ik0Var) {
    }

    public float getActionTextColorAlpha() {
        return this.o;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.t0;
    }

    public int getMaxWidth() {
        return this.s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.s0;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.u0 != null) {
            drawable = drawable.mutate();
            aq4.h(drawable, this.u0);
            aq4.i(drawable, this.v0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            aq4.h(drawableMutate, colorStateList);
            aq4.i(drawableMutate, this.v0);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.v0 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            aq4.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : w0);
        super.setOnClickListener(onClickListener);
    }
}
