package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.a;
import defpackage.aq4;
import defpackage.gse;
import defpackage.hq4;
import defpackage.i2c;
import defpackage.in;
import defpackage.io;
import defpackage.k8g;
import defpackage.kmf;
import defpackage.l12;
import defpackage.oy4;
import defpackage.p3c;
import defpackage.s36;
import defpackage.twb;
import defpackage.uc;
import defpackage.umf;
import defpackage.vsb;
import defpackage.vw4;
import defpackage.ww4;
import defpackage.z04;
import defpackage.z7;
import defpackage.zmf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements ww4 {
    public static final l12 f1 = new l12(Float.class, "thumbPos", 10);
    public static final int[] g1 = {R.attr.state_checked};
    public int A0;
    public boolean B0;
    public CharSequence C0;
    public CharSequence D0;
    public CharSequence E0;
    public CharSequence F0;
    public boolean G0;
    public int H0;
    public final int I0;
    public float J0;
    public float K0;
    public final VelocityTracker L0;
    public final int M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public boolean V0;
    public final TextPaint W0;
    public final ColorStateList X0;
    public StaticLayout Y0;
    public StaticLayout Z0;
    public Drawable a;
    public final uc a1;
    public ColorStateList b;
    public ObjectAnimator b1;
    public PorterDuff.Mode c;
    public in c1;
    public oy4 d1;
    public final Rect e1;
    public boolean o;
    public boolean s0;
    public Drawable t0;
    public ColorStateList u0;
    public PorterDuff.Mode v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int i = vsb.switchStyle;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.o = false;
        this.s0 = false;
        this.u0 = null;
        this.v0 = null;
        this.w0 = false;
        this.x0 = false;
        this.L0 = VelocityTracker.obtain();
        this.V0 = true;
        this.e1 = new Rect();
        gse.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.W0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        k8g k8gVarX = k8g.x(context, attributeSet, p3c.SwitchCompat, i, 0);
        int[] iArr = p3c.SwitchCompat;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        Drawable drawableN = k8gVarX.n(p3c.SwitchCompat_android_thumb);
        this.a = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(this);
        }
        Drawable drawableN2 = k8gVarX.n(p3c.SwitchCompat_track);
        this.t0 = drawableN2;
        if (drawableN2 != null) {
            drawableN2.setCallback(this);
        }
        int i2 = p3c.SwitchCompat_android_textOn;
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        setTextOnInternal(typedArray.getText(i2));
        setTextOffInternal(typedArray.getText(p3c.SwitchCompat_android_textOff));
        this.G0 = typedArray.getBoolean(p3c.SwitchCompat_showText, true);
        this.y0 = typedArray.getDimensionPixelSize(p3c.SwitchCompat_thumbTextPadding, 0);
        this.z0 = typedArray.getDimensionPixelSize(p3c.SwitchCompat_switchMinWidth, 0);
        this.A0 = typedArray.getDimensionPixelSize(p3c.SwitchCompat_switchPadding, 0);
        this.B0 = typedArray.getBoolean(p3c.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListL = k8gVarX.l(p3c.SwitchCompat_thumbTint);
        if (colorStateListL != null) {
            this.b = colorStateListL;
            this.o = true;
        }
        PorterDuff.Mode modeC = hq4.c(typedArray.getInt(p3c.SwitchCompat_thumbTintMode, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.s0 = true;
        }
        if (this.o || this.s0) {
            b();
        }
        ColorStateList colorStateListL2 = k8gVarX.l(p3c.SwitchCompat_trackTint);
        if (colorStateListL2 != null) {
            this.u0 = colorStateListL2;
            this.w0 = true;
        }
        PorterDuff.Mode modeC2 = hq4.c(typedArray.getInt(p3c.SwitchCompat_trackTintMode, -1), null);
        if (this.v0 != modeC2) {
            this.v0 = modeC2;
            this.x0 = true;
        }
        if (this.w0 || this.x0) {
            c();
        }
        int resourceId2 = typedArray.getResourceId(p3c.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p3c.TextAppearance);
            int i3 = p3c.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i3, 0)) == 0 || (colorStateList = z7.n(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i3) : colorStateList;
            if (colorStateList != null) {
                this.X0 = colorStateList;
            } else {
                this.X0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i4 = typedArrayObtainStyledAttributes.getInt(p3c.TextAppearance_android_typeface, -1);
            int i5 = typedArrayObtainStyledAttributes.getInt(p3c.TextAppearance_android_textStyle, -1);
            Typeface typeface = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i5 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i6 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(p3c.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                uc ucVar = new uc();
                ucVar.a = context2.getResources().getConfiguration().locale;
                this.a1 = ucVar;
            } else {
                this.a1 = null;
            }
            setTextOnInternal(this.C0);
            setTextOffInternal(this.E0);
            typedArrayObtainStyledAttributes.recycle();
        }
        new io(this).f(attributeSet, i);
        k8gVarX.z();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.I0 = viewConfiguration.getScaledTouchSlop();
        this.M0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private in getEmojiTextViewHelper() {
        if (this.c1 == null) {
            this.c1 = new in(this);
        }
        return this.c1;
    }

    private boolean getTargetCheckedState() {
        return this.N0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.N0 : this.N0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.t0;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.e1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect rectB = drawable2 != null ? hq4.b(drawable2) : hq4.c;
        return ((((this.O0 - this.Q0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.E0 = charSequence;
        in emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodF0 = ((z04) emojiTextViewHelper.b.b).f0(this.a1);
        if (transformationMethodF0 != null) {
            charSequence = transformationMethodF0.getTransformation(charSequence, this);
        }
        this.F0 = charSequence;
        this.Z0 = null;
        if (this.G0) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.C0 = charSequence;
        in emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodF0 = ((z04) emojiTextViewHelper.b.b).f0(this.a1);
        if (transformationMethodF0 != null) {
            charSequence = transformationMethodF0.getTransformation(charSequence, this);
        }
        this.D0 = charSequence;
        this.Y0 = null;
        if (this.G0) {
            e();
        }
    }

    @Override // defpackage.ww4
    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void b() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.o || this.s0) {
                Drawable drawableMutate = drawable.mutate();
                this.a = drawableMutate;
                if (this.o) {
                    aq4.h(drawableMutate, this.b);
                }
                if (this.s0) {
                    aq4.i(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.t0;
        if (drawable != null) {
            if (this.w0 || this.x0) {
                Drawable drawableMutate = drawable.mutate();
                this.t0 = drawableMutate;
                if (this.w0) {
                    aq4.h(drawableMutate, this.u0);
                }
                if (this.x0) {
                    aq4.i(this.t0, this.v0);
                }
                if (this.t0.isStateful()) {
                    this.t0.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        setTextOnInternal(this.C0);
        setTextOffInternal(this.E0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.R0;
        int i4 = this.S0;
        int i5 = this.T0;
        int i6 = this.U0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect rectB = drawable != null ? hq4.b(drawable) : hq4.c;
        Drawable drawable2 = this.t0;
        Rect rect = this.e1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.t0.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.t0.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.Q0 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                aq4.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            aq4.e(drawable, f, f2);
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            aq4.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.t0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        if (this.d1 == null && this.c1.b() && vw4.p != null) {
            vw4 vw4VarA = vw4.a();
            int iB = vw4VarA.b();
            if (iB == 3 || iB == 0) {
                oy4 oy4Var = new oy4(this);
                this.d1 = oy4Var;
                vw4VarA.i(oy4Var);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.O0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.A0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.O0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.A0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.G0;
    }

    public boolean getSplitTrack() {
        return this.B0;
    }

    public int getSwitchMinWidth() {
        return this.z0;
    }

    public int getSwitchPadding() {
        return this.A0;
    }

    public CharSequence getTextOff() {
        return this.E0;
    }

    public CharSequence getTextOn() {
        return this.C0;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public final float getThumbPosition() {
        return this.N0;
    }

    public int getThumbTextPadding() {
        return this.y0;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.t0;
    }

    public ColorStateList getTrackTintList() {
        return this.u0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.v0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b1.end();
        this.b1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.t0;
        Rect rect = this.e1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.S0;
        int i2 = this.U0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.B0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = hq4.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.Y0 : this.Z0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.X0;
            TextPaint textPaint = this.W0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.C0 : this.E0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.a != null) {
            Drawable drawable = this.t0;
            Rect rect = this.e1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = hq4.b(this.a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.O0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.O0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.P0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.P0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.P0;
        }
        this.R0 = paddingLeft;
        this.S0 = paddingTop;
        this.U0 = height;
        this.T0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.G0) {
            StaticLayout staticLayout = this.Y0;
            TextPaint textPaint = this.W0;
            if (staticLayout == null) {
                CharSequence charSequence = this.D0;
                this.Y0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Z0 == null) {
                CharSequence charSequence2 = this.F0;
                this.Z0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.a;
        Rect rect = this.e1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.Q0 = Math.max(this.G0 ? (this.y0 * 2) + Math.max(this.Y0.getWidth(), this.Z0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.t0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect rectB = hq4.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.V0 ? Math.max(this.z0, (this.Q0 * 2) + iMax + iMax2) : this.z0;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.O0 = iMax3;
        this.P0 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.C0 : this.E0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.C0;
                if (string == null) {
                    string = getResources().getString(i2c.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = zmf.a;
                new kmf(twb.tag_state_description, CharSequence.class, 64, 30, 1).g(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.E0;
            if (string2 == null) {
                string2 = getResources().getString(i2c.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = zmf.a;
            new kmf(twb.tag_state_description, CharSequence.class, 64, 30, 1).g(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.b1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1, zIsChecked ? 1.0f : 0.0f);
        this.b1 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.b1.setAutoCancel(true);
        this.b1.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // defpackage.ww4
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.C0);
        setTextOffInternal(this.E0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.V0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.G0 != z) {
            this.G0 = z;
            requestLayout();
            if (z) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.B0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.z0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.W0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.E0;
        if (string == null) {
            string = getResources().getString(i2c.abc_capital_off);
        }
        WeakHashMap weakHashMap = zmf.a;
        new kmf(twb.tag_state_description, CharSequence.class, 64, 30, 1).g(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.C0;
        if (string == null) {
            string = getResources().getString(i2c.abc_capital_on);
        }
        WeakHashMap weakHashMap = zmf.a;
        new kmf(twb.tag_state_description, CharSequence.class, 64, 30, 1).g(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.N0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(s36.n(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.y0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.o = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.s0 = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.t0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(s36.n(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        this.w0 = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.v0 = mode;
        this.x0 = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.t0;
    }
}
