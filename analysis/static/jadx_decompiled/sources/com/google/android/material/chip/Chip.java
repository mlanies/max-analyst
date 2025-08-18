package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import defpackage.bq4;
import defpackage.dpe;
import defpackage.e62;
import defpackage.gjd;
import defpackage.ivb;
import defpackage.ju0;
import defpackage.k03;
import defpackage.k4;
import defpackage.l03;
import defpackage.m03;
import defpackage.m18;
import defpackage.m2c;
import defpackage.mqd;
import defpackage.n03;
import defpackage.n18;
import defpackage.nu0;
import defpackage.omf;
import defpackage.rjd;
import defpackage.rl0;
import defpackage.s36;
import defpackage.sre;
import defpackage.tsb;
import defpackage.voe;
import defpackage.wc9;
import defpackage.wz2;
import defpackage.y18;
import defpackage.y8g;
import defpackage.z2c;
import defpackage.z7;
import defpackage.z8g;
import defpackage.zmf;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements m03, rjd, n18 {
    public static final int L0 = m2c.Widget_MaterialComponents_Chip_Action;
    public static final Rect M0 = new Rect();
    public static final int[] N0 = {R.attr.state_selected};
    public static final int[] O0 = {R.attr.state_checkable};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public CharSequence F0;
    public final l03 G0;
    public boolean H0;
    public final Rect I0;
    public final RectF J0;
    public final k03 K0;
    public n03 s0;
    public InsetDrawable t0;
    public RippleDrawable u0;
    public View.OnClickListener v0;
    public CompoundButton.OnCheckedChangeListener w0;
    public m18 x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i = 1;
        int i2 = tsb.chipStyle;
        int i3 = L0;
        super(y18.a(context, attributeSet, i2, i3), attributeSet, i2);
        this.I0 = new Rect();
        this.J0 = new RectF();
        this.K0 = new k03(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        n03 n03Var = new n03(context2, attributeSet, i2, i3);
        TypedArray typedArrayD = sre.d(n03Var.q1, attributeSet, z2c.Chip, i2, i3, new int[0]);
        n03Var.R1 = typedArrayD.hasValue(z2c.Chip_shapeAppearance);
        int i4 = z2c.Chip_chipSurfaceColor;
        Context context3 = n03Var.q1;
        ColorStateList colorStateListQ = ju0.q(context3, typedArrayD, i4);
        if (n03Var.J0 != colorStateListQ) {
            n03Var.J0 = colorStateListQ;
            n03Var.onStateChange(n03Var.getState());
        }
        ColorStateList colorStateListQ2 = ju0.q(context3, typedArrayD, z2c.Chip_chipBackgroundColor);
        if (n03Var.K0 != colorStateListQ2) {
            n03Var.K0 = colorStateListQ2;
            n03Var.onStateChange(n03Var.getState());
        }
        float dimension = typedArrayD.getDimension(z2c.Chip_chipMinHeight, 0.0f);
        if (n03Var.L0 != dimension) {
            n03Var.L0 = dimension;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        if (typedArrayD.hasValue(z2c.Chip_chipCornerRadius)) {
            n03Var.E(typedArrayD.getDimension(z2c.Chip_chipCornerRadius, 0.0f));
        }
        n03Var.J(ju0.q(context3, typedArrayD, z2c.Chip_chipStrokeColor));
        n03Var.K(typedArrayD.getDimension(z2c.Chip_chipStrokeWidth, 0.0f));
        n03Var.T(ju0.q(context3, typedArrayD, z2c.Chip_rippleColor));
        String text = typedArrayD.getText(z2c.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(n03Var.Q0, text);
        dpe dpeVar = n03Var.w1;
        if (!zEquals) {
            n03Var.Q0 = text;
            dpeVar.e = true;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        int i5 = z2c.Chip_android_textAppearance;
        voe voeVar = (!typedArrayD.hasValue(i5) || (resourceId3 = typedArrayD.getResourceId(i5, 0)) == 0) ? null : new voe(context3, resourceId3);
        voeVar.k = typedArrayD.getDimension(z2c.Chip_android_textSize, voeVar.k);
        dpeVar.c(voeVar, context3);
        int i6 = typedArrayD.getInt(z2c.Chip_android_ellipsize, 0);
        if (i6 == 1) {
            n03Var.O1 = TextUtils.TruncateAt.START;
        } else if (i6 == 2) {
            n03Var.O1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i6 == 3) {
            n03Var.O1 = TextUtils.TruncateAt.END;
        }
        n03Var.I(typedArrayD.getBoolean(z2c.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            n03Var.I(typedArrayD.getBoolean(z2c.Chip_chipIconEnabled, false));
        }
        n03Var.F(ju0.s(context3, typedArrayD, z2c.Chip_chipIcon));
        if (typedArrayD.hasValue(z2c.Chip_chipIconTint)) {
            n03Var.H(ju0.q(context3, typedArrayD, z2c.Chip_chipIconTint));
        }
        n03Var.G(typedArrayD.getDimension(z2c.Chip_chipIconSize, -1.0f));
        n03Var.Q(typedArrayD.getBoolean(z2c.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            n03Var.Q(typedArrayD.getBoolean(z2c.Chip_closeIconEnabled, false));
        }
        n03Var.L(ju0.s(context3, typedArrayD, z2c.Chip_closeIcon));
        n03Var.P(ju0.q(context3, typedArrayD, z2c.Chip_closeIconTint));
        n03Var.N(typedArrayD.getDimension(z2c.Chip_closeIconSize, 0.0f));
        n03Var.A(typedArrayD.getBoolean(z2c.Chip_android_checkable, false));
        n03Var.D(typedArrayD.getBoolean(z2c.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            n03Var.D(typedArrayD.getBoolean(z2c.Chip_checkedIconEnabled, false));
        }
        n03Var.B(ju0.s(context3, typedArrayD, z2c.Chip_checkedIcon));
        if (typedArrayD.hasValue(z2c.Chip_checkedIconTint)) {
            n03Var.C(ju0.q(context3, typedArrayD, z2c.Chip_checkedIconTint));
        }
        int i7 = z2c.Chip_showMotionSpec;
        n03Var.g1 = (!typedArrayD.hasValue(i7) || (resourceId2 = typedArrayD.getResourceId(i7, 0)) == 0) ? null : wc9.a(context3, resourceId2);
        int i8 = z2c.Chip_hideMotionSpec;
        n03Var.h1 = (!typedArrayD.hasValue(i8) || (resourceId = typedArrayD.getResourceId(i8, 0)) == 0) ? null : wc9.a(context3, resourceId);
        float dimension2 = typedArrayD.getDimension(z2c.Chip_chipStartPadding, 0.0f);
        if (n03Var.i1 != dimension2) {
            n03Var.i1 = dimension2;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        n03Var.S(typedArrayD.getDimension(z2c.Chip_iconStartPadding, 0.0f));
        n03Var.R(typedArrayD.getDimension(z2c.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(z2c.Chip_textStartPadding, 0.0f);
        if (n03Var.l1 != dimension3) {
            n03Var.l1 = dimension3;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        float dimension4 = typedArrayD.getDimension(z2c.Chip_textEndPadding, 0.0f);
        if (n03Var.m1 != dimension4) {
            n03Var.m1 = dimension4;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        n03Var.O(typedArrayD.getDimension(z2c.Chip_closeIconStartPadding, 0.0f));
        n03Var.M(typedArrayD.getDimension(z2c.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(z2c.Chip_chipEndPadding, 0.0f);
        if (n03Var.p1 != dimension5) {
            n03Var.p1 = dimension5;
            n03Var.invalidateSelf();
            n03Var.y();
        }
        n03Var.Q1 = typedArrayD.getDimensionPixelSize(z2c.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = z2c.Chip;
        sre.a(context2, attributeSet, i2, i3);
        sre.b(context2, attributeSet, iArr, i2, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        this.C0 = typedArrayObtainStyledAttributes.getBoolean(z2c.Chip_ensureMinTouchTargetSize, false);
        this.E0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(z2c.Chip_chipMinTouchTargetSize, (float) Math.ceil(mqd.h(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(n03Var);
        WeakHashMap weakHashMap = zmf.a;
        n03Var.k(omf.i(this));
        int[] iArr2 = z2c.Chip;
        sre.a(context2, attributeSet, i2, i3);
        sre.b(context2, attributeSet, iArr2, i2, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, i3);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(z2c.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.G0 = new l03(this, this);
        g();
        if (!zHasValue) {
            setOutlineProvider(new e62(this, i));
        }
        setChecked(this.y0);
        setText(n03Var.Q0);
        setEllipsize(n03Var.O1);
        j();
        if (!this.s0.P1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        i();
        if (this.C0) {
            setMinHeight(this.E0);
        }
        this.D0 = getLayoutDirection();
        super.setOnCheckedChangeListener(new wz2(i, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.J0;
        rectF.setEmpty();
        if (e() && this.v0 != null) {
            n03 n03Var = this.s0;
            Rect bounds = n03Var.getBounds();
            rectF.setEmpty();
            if (n03Var.W()) {
                float f = n03Var.p1 + n03Var.o1 + n03Var.a1 + n03Var.n1 + n03Var.m1;
                if (bq4.a(n03Var) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.I0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private voe getTextAppearance() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.w1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            refreshDrawableState();
        }
    }

    public final void d(int i) {
        this.E0 = i;
        if (!this.C0) {
            InsetDrawable insetDrawable = this.t0;
            if (insetDrawable == null) {
                h();
                return;
            } else {
                if (insetDrawable != null) {
                    this.t0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    h();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.s0.L0));
        int iMax2 = Math.max(0, i - this.s0.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.t0;
            if (insetDrawable2 == null) {
                h();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.t0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    h();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.t0 != null) {
            Rect rect = new Rect();
            this.t0.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                h();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.t0 = new InsetDrawable((Drawable) this.s0, i2, i3, i2, i3);
        h();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.H0 ? super.dispatchHoverEvent(motionEvent) : this.G0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.H0
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        L9:
            l03 r0 = r9.G0
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L85
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6f
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L85
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L85
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L85
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L85
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L85
            int r1 = r0.l
            if (r1 == r2) goto L6d
            r4 = 16
            boolean r1 = r0.s(r1, r4, r6)
        L6d:
            r4 = r3
            goto L85
        L6f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7b
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L85
        L7b:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L85
            boolean r4 = r0.q(r3, r6)
        L85:
            if (r4 == 0) goto L8c
            int r0 = r0.l
            if (r0 == r2) goto L8c
            return r3
        L8c:
            boolean r9 = super.dispatchKeyEvent(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        n03 n03Var = this.s0;
        boolean z = false;
        if (n03Var != null && n03.x(n03Var.X0)) {
            n03 n03Var2 = this.s0;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.B0) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.A0) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.z0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.B0) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A0) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.z0) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(n03Var2.K1, iArr)) {
                n03Var2.K1 = iArr;
                if (n03Var2.W()) {
                    z = n03Var2.z(n03Var2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            Object obj = n03Var.X0;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof y8g) {
                ((z8g) ((y8g) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        n03 n03Var = this.s0;
        return n03Var != null && n03Var.c1;
    }

    public final void g() {
        n03 n03Var;
        if (!e() || (n03Var = this.s0) == null || !n03Var.W0 || this.v0 == null) {
            zmf.j(this, null);
            this.H0 = false;
        } else {
            zmf.j(this, this.G0);
            this.H0 = true;
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.F0)) {
            return this.F0;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).v0.a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.t0;
        return insetDrawable == null ? this.s0 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.e1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.f1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.K0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return Math.max(0.0f, n03Var.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.s0;
    }

    public float getChipEndPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.p1;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        n03 n03Var = this.s0;
        if (n03Var == null || (drawable = n03Var.S0) == 0) {
            return null;
        }
        if (!(drawable instanceof y8g)) {
            return drawable;
        }
        ((z8g) ((y8g) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.U0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.T0;
        }
        return null;
    }

    public float getChipMinHeight() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.L0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.i1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.N0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.O0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        n03 n03Var = this.s0;
        if (n03Var == null || (drawable = n03Var.X0) == 0) {
            return null;
        }
        if (!(drawable instanceof y8g)) {
            return drawable;
        }
        ((z8g) ((y8g) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.b1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.o1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.a1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.n1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.Z0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.O1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.H0) {
            l03 l03Var = this.G0;
            if (l03Var.l == 1 || l03Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wc9 getHideMotionSpec() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.h1;
        }
        return null;
    }

    public float getIconEndPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.k1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.j1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.P0;
        }
        return null;
    }

    public gjd getShapeAppearanceModel() {
        return this.s0.a.a;
    }

    public wc9 getShowMotionSpec() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.g1;
        }
        return null;
    }

    public float getTextEndPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.m1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            return n03Var.l1;
        }
        return 0.0f;
    }

    public final void h() {
        ColorStateList colorStateListValueOf = this.s0.P0;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.u0 = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        n03 n03Var = this.s0;
        if (n03Var.L1) {
            n03Var.L1 = false;
            n03Var.M1 = null;
            n03Var.onStateChange(n03Var.getState());
        }
        RippleDrawable rippleDrawable = this.u0;
        WeakHashMap weakHashMap = zmf.a;
        setBackground(rippleDrawable);
        i();
    }

    public final void i() {
        n03 n03Var;
        if (TextUtils.isEmpty(getText()) || (n03Var = this.s0) == null) {
            return;
        }
        int iU = (int) (n03Var.u() + n03Var.p1 + n03Var.m1);
        n03 n03Var2 = this.s0;
        int iT = (int) (n03Var2.t() + n03Var2.i1 + n03Var2.l1);
        if (this.t0 != null) {
            Rect rect = new Rect();
            this.t0.getPadding(rect);
            iT += rect.left;
            iU += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = zmf.a;
        setPaddingRelative(iT, paddingTop, iU, paddingBottom);
    }

    public final void j() {
        TextPaint paint = getPaint();
        n03 n03Var = this.s0;
        if (n03Var != null) {
            paint.drawableState = n03Var.getState();
        }
        voe textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.K0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nu0.N(this, this.s0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N0);
        }
        if (f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.H0) {
            l03 l03Var = this.G0;
            int i2 = l03Var.l;
            if (i2 != Integer.MIN_VALUE) {
                l03Var.j(i2);
            }
            if (z) {
                l03Var.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.c) {
                i = 0;
                for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(ivb.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) k4.a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.D0 != i) {
            this.D0 = i;
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.z0
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.z0
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.v0
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.H0
            if (r0 == 0) goto L43
            l03 r0 = r5.G0
            r0.x(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.F0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u0) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.u0) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.A(z);
        }
    }

    public void setCheckableResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.A(n03Var.q1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        n03 n03Var = this.s0;
        if (n03Var == null) {
            this.y0 = z;
        } else if (n03Var.c1) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.B(s36.n(n03Var.q1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.C(z7.n(n03Var.q1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.D(n03Var.q1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.K0 == colorStateList) {
            return;
        }
        n03Var.K0 = colorStateList;
        n03Var.onStateChange(n03Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListN;
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.K0 == (colorStateListN = z7.n(n03Var.q1, i))) {
            return;
        }
        n03Var.K0 = colorStateListN;
        n03Var.onStateChange(n03Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.E(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.E(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(n03 n03Var) {
        n03 n03Var2 = this.s0;
        if (n03Var2 != n03Var) {
            if (n03Var2 != null) {
                n03Var2.N1 = new WeakReference(null);
            }
            this.s0 = n03Var;
            n03Var.P1 = false;
            n03Var.N1 = new WeakReference(this);
            d(this.E0);
        }
    }

    public void setChipEndPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.p1 == f) {
            return;
        }
        n03Var.p1 = f;
        n03Var.invalidateSelf();
        n03Var.y();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float dimension = n03Var.q1.getResources().getDimension(i);
            if (n03Var.p1 != dimension) {
                n03Var.p1 = dimension;
                n03Var.invalidateSelf();
                n03Var.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.F(s36.n(n03Var.q1, i));
        }
    }

    public void setChipIconSize(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.G(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.G(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.H(z7.n(n03Var.q1, i));
        }
    }

    public void setChipIconVisible(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.I(n03Var.q1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.L0 == f) {
            return;
        }
        n03Var.L0 = f;
        n03Var.invalidateSelf();
        n03Var.y();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float dimension = n03Var.q1.getResources().getDimension(i);
            if (n03Var.L0 != dimension) {
                n03Var.L0 = dimension;
                n03Var.invalidateSelf();
                n03Var.y();
            }
        }
    }

    public void setChipStartPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.i1 == f) {
            return;
        }
        n03Var.i1 = f;
        n03Var.invalidateSelf();
        n03Var.y();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float dimension = n03Var.q1.getResources().getDimension(i);
            if (n03Var.i1 != dimension) {
                n03Var.i1 = dimension;
                n03Var.invalidateSelf();
                n03Var.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.J(z7.n(n03Var.q1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.K(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.K(n03Var.q1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.L(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.b1 == charSequence) {
            return;
        }
        rl0 rl0VarC = rl0.c();
        n03Var.b1 = rl0VarC.d(charSequence, rl0VarC.c);
        n03Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.M(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.L(s36.n(n03Var.q1, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.N(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.O(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.P(z7.n(n03Var.q1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.s0 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.O1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.C0 = z;
        d(this.E0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(wc9 wc9Var) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.h1 = wc9Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.h1 = wc9.a(n03Var.q1, i);
        }
    }

    public void setIconEndPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.R(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.R(n03Var.q1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.S(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.S(n03Var.q1.getResources().getDimension(i));
        }
    }

    @Override // defpackage.n18
    public void setInternalOnCheckedChangeListener(m18 m18Var) {
        this.x0 = m18Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.s0 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.Q1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.v0 = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.T(colorStateList);
        }
        if (this.s0.L1) {
            return;
        }
        h();
    }

    public void setRippleColorResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.T(z7.n(n03Var.q1, i));
            if (this.s0.L1) {
                return;
            }
            h();
        }
    }

    @Override // defpackage.rjd
    public void setShapeAppearanceModel(gjd gjdVar) {
        this.s0.setShapeAppearanceModel(gjdVar);
    }

    public void setShowMotionSpec(wc9 wc9Var) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.g1 = wc9Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.g1 = wc9.a(n03Var.q1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        n03 n03Var = this.s0;
        if (n03Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(n03Var.P1 ? null : charSequence, bufferType);
        n03 n03Var2 = this.s0;
        if (n03Var2 == null || TextUtils.equals(n03Var2.Q0, charSequence)) {
            return;
        }
        n03Var2.Q0 = charSequence;
        n03Var2.w1.e = true;
        n03Var2.invalidateSelf();
        n03Var2.y();
    }

    public void setTextAppearance(voe voeVar) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.w1.c(voeVar, n03Var.q1);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.m1 == f) {
            return;
        }
        n03Var.m1 = f;
        n03Var.invalidateSelf();
        n03Var.y();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float dimension = n03Var.q1.getResources().getDimension(i);
            if (n03Var.m1 != dimension) {
                n03Var.m1 = dimension;
                n03Var.invalidateSelf();
                n03Var.y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            dpe dpeVar = n03Var.w1;
            voe voeVar = dpeVar.g;
            if (voeVar != null) {
                voeVar.k = fApplyDimension;
                dpeVar.a.setTextSize(fApplyDimension);
                n03Var.a();
            }
        }
        j();
    }

    public void setTextStartPadding(float f) {
        n03 n03Var = this.s0;
        if (n03Var == null || n03Var.l1 == f) {
            return;
        }
        n03Var.l1 = f;
        n03Var.invalidateSelf();
        n03Var.y();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            float dimension = n03Var.q1.getResources().getDimension(i);
            if (n03Var.l1 != dimension) {
                n03Var.l1 = dimension;
                n03Var.invalidateSelf();
                n03Var.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.Q(z);
        }
        g();
    }

    public void setCheckedIconVisible(boolean z) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        n03 n03Var = this.s0;
        if (n03Var != null) {
            n03Var.I(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            Context context2 = n03Var.q1;
            n03Var.w1.c(new voe(context2, i), context2);
        }
        j();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        n03 n03Var = this.s0;
        if (n03Var != null) {
            Context context = n03Var.q1;
            n03Var.w1.c(new voe(context, i), context);
        }
        j();
    }
}
