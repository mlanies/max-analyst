package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.a0;
import defpackage.a07;
import defpackage.a14;
import defpackage.aq4;
import defpackage.b07;
import defpackage.c2f;
import defpackage.etb;
import defpackage.ft;
import defpackage.gjd;
import defpackage.gn;
import defpackage.hm9;
import defpackage.hme;
import defpackage.hq4;
import defpackage.hx3;
import defpackage.i8g;
import defpackage.ivb;
import defpackage.ju0;
import defpackage.k8g;
import defpackage.kpe;
import defpackage.l15;
import defpackage.lpe;
import defpackage.lt3;
import defpackage.m15;
import defpackage.m2c;
import defpackage.mpe;
import defpackage.mqd;
import defpackage.mr0;
import defpackage.myd;
import defpackage.npe;
import defpackage.nu0;
import defpackage.og;
import defpackage.p18;
import defpackage.q18;
import defpackage.q57;
import defpackage.qs4;
import defpackage.rl0;
import defpackage.rmf;
import defpackage.rnc;
import defpackage.s36;
import defpackage.s53;
import defpackage.s63;
import defpackage.sre;
import defpackage.stb;
import defpackage.tsb;
import defpackage.u08;
import defpackage.uh4;
import defpackage.ule;
import defpackage.vu4;
import defpackage.wa5;
import defpackage.wzb;
import defpackage.x04;
import defpackage.y04;
import defpackage.y18;
import defpackage.yj0;
import defpackage.z2c;
import defpackage.z7;
import defpackage.zmf;
import defpackage.zr6;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int N1 = m2c.Widget_Design_TextInputLayout;
    public static final int[][] O1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public boolean A0;
    public int A1;
    public mpe B0;
    public int B1;
    public AppCompatTextView C0;
    public int C1;
    public int D0;
    public int D1;
    public int E0;
    public int E1;
    public CharSequence F0;
    public boolean F1;
    public boolean G0;
    public final s53 G1;
    public AppCompatTextView H0;
    public boolean H1;
    public ColorStateList I0;
    public boolean I1;
    public int J0;
    public ValueAnimator J1;
    public wa5 K0;
    public boolean K1;
    public wa5 L0;
    public boolean L1;
    public ColorStateList M0;
    public boolean M1;
    public ColorStateList N0;
    public ColorStateList O0;
    public ColorStateList P0;
    public boolean Q0;
    public CharSequence R0;
    public boolean S0;
    public q18 T0;
    public q18 U0;
    public StateListDrawable V0;
    public boolean W0;
    public q18 X0;
    public q18 Y0;
    public gjd Z0;
    public final FrameLayout a;
    public boolean a1;
    public final myd b;
    public final int b1;
    public final m15 c;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public final Rect j1;
    public final Rect k1;
    public final RectF l1;
    public Typeface m1;
    public ColorDrawable n1;
    public EditText o;
    public int o1;
    public final LinkedHashSet p1;
    public ColorDrawable q1;
    public int r1;
    public CharSequence s0;
    public Drawable s1;
    public int t0;
    public ColorStateList t1;
    public int u0;
    public ColorStateList u1;
    public int v0;
    public int v1;
    public int w0;
    public int w1;
    public final b07 x0;
    public int x1;
    public boolean y0;
    public ColorStateList y1;
    public int z0;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i = tsb.textInputStyle;
        int i2 = N1;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = new b07(this);
        this.B0 = new hme(6);
        this.j1 = new Rect();
        this.k1 = new Rect();
        this.l1 = new RectF();
        this.p1 = new LinkedHashSet();
        s53 s53Var = new s53(this);
        this.G1 = s53Var;
        this.M1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = og.a;
        s53Var.W = linearInterpolator;
        s53Var.i(false);
        s53Var.V = linearInterpolator;
        s53Var.i(false);
        s53Var.l(8388659);
        int[] iArr = z2c.TextInputLayout;
        int[] iArr2 = {z2c.TextInputLayout_counterTextAppearance, z2c.TextInputLayout_counterOverflowTextAppearance, z2c.TextInputLayout_errorTextAppearance, z2c.TextInputLayout_helperTextTextAppearance, z2c.TextInputLayout_hintTextAppearance};
        sre.a(context2, attributeSet, i, i2);
        sre.b(context2, attributeSet, iArr, i, i2, iArr2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        k8g k8gVar = new k8g(context2, typedArrayObtainStyledAttributes);
        myd mydVar = new myd(this, k8gVar);
        this.b = mydVar;
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_hintEnabled, true);
        setHint(typedArrayObtainStyledAttributes.getText(z2c.TextInputLayout_android_hint));
        this.I1 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_hintAnimationEnabled, true);
        this.H1 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_expandedHintEnabled, true);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_android_minEms)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(z2c.TextInputLayout_android_minEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.TextInputLayout_android_minWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(z2c.TextInputLayout_android_maxEms, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.TextInputLayout_android_maxWidth, -1));
        }
        this.Z0 = gjd.b(context2, attributeSet, i, i2).c();
        this.b1 = context2.getResources().getDimensionPixelOffset(stb.mtrl_textinput_box_label_cutout_padding);
        this.d1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(z2c.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(stb.mtrl_textinput_box_stroke_width_default));
        this.g1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(stb.mtrl_textinput_box_stroke_width_focused));
        this.e1 = this.f1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(z2c.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(z2c.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(z2c.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(z2c.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        i8g i8gVarE = this.Z0.e();
        if (dimension >= 0.0f) {
            i8gVarE.e = new a0(dimension);
        }
        if (dimension2 >= 0.0f) {
            i8gVarE.f = new a0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            i8gVarE.g = new a0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            i8gVarE.h = new a0(dimension4);
        }
        this.Z0 = i8gVarE.c();
        ColorStateList colorStateListP = ju0.p(context2, k8gVar, z2c.TextInputLayout_boxBackgroundColor);
        if (colorStateListP != null) {
            int defaultColor = colorStateListP.getDefaultColor();
            this.z1 = defaultColor;
            this.i1 = defaultColor;
            if (colorStateListP.isStateful()) {
                this.A1 = colorStateListP.getColorForState(new int[]{-16842910}, -1);
                this.B1 = colorStateListP.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.C1 = colorStateListP.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.B1 = this.z1;
                ColorStateList colorStateListN = z7.n(context2, etb.mtrl_filled_background_color);
                this.A1 = colorStateListN.getColorForState(new int[]{-16842910}, -1);
                this.C1 = colorStateListN.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.i1 = 0;
            this.z1 = 0;
            this.A1 = 0;
            this.B1 = 0;
            this.C1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListL = k8gVar.l(z2c.TextInputLayout_android_textColorHint);
            this.u1 = colorStateListL;
            this.t1 = colorStateListL;
        }
        ColorStateList colorStateListP2 = ju0.p(context2, k8gVar, z2c.TextInputLayout_boxStrokeColor);
        this.x1 = typedArrayObtainStyledAttributes.getColor(z2c.TextInputLayout_boxStrokeColor, 0);
        this.v1 = lt3.a(context2, etb.mtrl_textinput_default_box_stroke_color);
        this.D1 = lt3.a(context2, etb.mtrl_textinput_disabled_color);
        this.w1 = lt3.a(context2, etb.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListP2 != null) {
            setBoxStrokeColorStateList(colorStateListP2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(ju0.p(context2, k8gVar, z2c.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_hintTextAppearance, 0));
        }
        this.O0 = k8gVar.l(z2c.TextInputLayout_cursorColor);
        this.P0 = k8gVar.l(z2c.TextInputLayout_cursorErrorColor);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(z2c.TextInputLayout_errorContentDescription);
        int i3 = typedArrayObtainStyledAttributes.getInt(z2c.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(z2c.TextInputLayout_helperText);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(z2c.TextInputLayout_placeholderText);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(z2c.TextInputLayout_counterMaxLength, -1));
        this.E0 = typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_counterTextAppearance, 0);
        this.D0 = typedArrayObtainStyledAttributes.getResourceId(z2c.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(z2c.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.D0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.E0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_errorTextColor)) {
            setErrorTextColor(k8gVar.l(z2c.TextInputLayout_errorTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(k8gVar.l(z2c.TextInputLayout_helperTextTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_hintTextColor)) {
            setHintTextColor(k8gVar.l(z2c.TextInputLayout_hintTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_counterTextColor)) {
            setCounterTextColor(k8gVar.l(z2c.TextInputLayout_counterTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(k8gVar.l(z2c.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z2c.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(k8gVar.l(z2c.TextInputLayout_placeholderTextColor));
        }
        m15 m15Var = new m15(this, k8gVar);
        this.c = m15Var;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(z2c.TextInputLayout_android_enabled, true);
        k8gVar.z();
        WeakHashMap weakHashMap = zmf.a;
        setImportantForAccessibility(2);
        rmf.m(this, 1);
        frameLayout.addView(mydVar);
        frameLayout.addView(m15Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.o;
        if (!(editText instanceof AutoCompleteTextView) || ft.n(editText)) {
            return this.T0;
        }
        int iZ = mr0.z(this.o, tsb.colorControlHighlight);
        int i = this.c1;
        int[][] iArr = O1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            q18 q18Var = this.T0;
            int i2 = this.i1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{mr0.N(iZ, 0.1f, i2), i2}), q18Var, q18Var);
        }
        Context context = getContext();
        q18 q18Var2 = this.T0;
        int iY = mr0.y(tsb.colorSurface, context, "TextInputLayout");
        q18 q18Var3 = new q18(q18Var2.a.a);
        int iN = mr0.N(iZ, 0.1f, iY);
        q18Var3.l(new ColorStateList(iArr, new int[]{iN, 0}));
        q18Var3.setTint(iY);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iN, iY});
        q18 q18Var4 = new q18(q18Var2.a.a);
        q18Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, q18Var3, q18Var4), q18Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.V0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.V0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.V0.addState(new int[0], f(false));
        }
        return this.V0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.U0 == null) {
            this.U0 = f(true);
        }
        return this.U0;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.o != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.o = editText;
        int i = this.t0;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.v0);
        }
        int i2 = this.u0;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.w0);
        }
        this.W0 = false;
        i();
        setTextInputAccessibilityDelegate(new lpe(this));
        Typeface typeface = this.o.getTypeface();
        s53 s53Var = this.G1;
        boolean zM = s53Var.m(typeface);
        boolean zO = s53Var.o(typeface);
        if (zM || zO) {
            s53Var.i(false);
        }
        float textSize = this.o.getTextSize();
        if (s53Var.l != textSize) {
            s53Var.l = textSize;
            s53Var.i(false);
        }
        float letterSpacing = this.o.getLetterSpacing();
        if (s53Var.g0 != letterSpacing) {
            s53Var.g0 = letterSpacing;
            s53Var.i(false);
        }
        int gravity = this.o.getGravity();
        s53Var.l((gravity & (-113)) | 48);
        if (s53Var.j != gravity) {
            s53Var.j = gravity;
            s53Var.i(false);
        }
        WeakHashMap weakHashMap = zmf.a;
        this.E1 = editText.getMinimumHeight();
        this.o.addTextChangedListener(new kpe(this, editText));
        if (this.t1 == null) {
            this.t1 = this.o.getHintTextColors();
        }
        if (this.Q0) {
            if (TextUtils.isEmpty(this.R0)) {
                CharSequence hint = this.o.getHint();
                this.s0 = hint;
                setHint(hint);
                this.o.setHint((CharSequence) null);
            }
            this.S0 = true;
        }
        p();
        if (this.C0 != null) {
            n(this.o.getText());
        }
        r();
        this.x0.b();
        this.b.bringToFront();
        m15 m15Var = this.c;
        m15Var.bringToFront();
        Iterator it = this.p1.iterator();
        while (it.hasNext()) {
            ((l15) it.next()).a(this);
        }
        m15Var.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.R0)) {
            return;
        }
        this.R0 = charSequence;
        s53 s53Var = this.G1;
        if (charSequence == null || !TextUtils.equals(s53Var.G, charSequence)) {
            s53Var.G = charSequence;
            s53Var.H = null;
            Bitmap bitmap = s53Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                s53Var.K = null;
            }
            s53Var.i(false);
        }
        if (this.F1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.G0 == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.H0;
            if (appCompatTextView != null) {
                this.a.addView(appCompatTextView);
                this.H0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.H0;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.H0 = null;
        }
        this.G0 = z;
    }

    public final void a(float f) {
        s53 s53Var = this.G1;
        if (s53Var.b == f) {
            return;
        }
        if (this.J1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J1 = valueAnimator;
            valueAnimator.setInterpolator(z7.Q(getContext(), tsb.motionEasingEmphasizedInterpolator, og.b));
            this.J1.setDuration(z7.P(tsb.motionDurationMedium4, 167, getContext()));
            this.J1.addUpdateListener(new yj0(8, this));
        }
        this.J1.setFloatValues(s53Var.b, f);
        this.J1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        q18 q18Var = this.T0;
        if (q18Var == null) {
            return;
        }
        gjd gjdVar = q18Var.a.a;
        gjd gjdVar2 = this.Z0;
        if (gjdVar != gjdVar2) {
            q18Var.setShapeAppearanceModel(gjdVar2);
        }
        if (this.c1 == 2 && (i = this.e1) > -1 && (i2 = this.h1) != 0) {
            q18 q18Var2 = this.T0;
            q18Var2.a.k = i;
            q18Var2.invalidateSelf();
            q18Var2.n(ColorStateList.valueOf(i2));
        }
        int iG = this.i1;
        if (this.c1 == 1) {
            iG = s63.g(this.i1, mr0.x(tsb.colorSurface, 0, getContext()));
        }
        this.i1 = iG;
        this.T0.l(ColorStateList.valueOf(iG));
        q18 q18Var3 = this.X0;
        if (q18Var3 != null && this.Y0 != null) {
            if (this.e1 > -1 && this.h1 != 0) {
                q18Var3.l(this.o.isFocused() ? ColorStateList.valueOf(this.v1) : ColorStateList.valueOf(this.h1));
                this.Y0.l(ColorStateList.valueOf(this.h1));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fE;
        if (!this.Q0) {
            return 0;
        }
        int i = this.c1;
        s53 s53Var = this.G1;
        if (i == 0) {
            fE = s53Var.e();
        } else {
            if (i != 2) {
                return 0;
            }
            fE = s53Var.e() / 2.0f;
        }
        return (int) fE;
    }

    public final wa5 d() {
        wa5 wa5Var = new wa5();
        wa5Var.c = z7.P(tsb.motionDurationShort2, 87, getContext());
        wa5Var.o = z7.Q(getContext(), tsb.motionEasingLinearInterpolator, og.a);
        return wa5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.s0 != null) {
            boolean z = this.S0;
            this.S0 = false;
            CharSequence hint = editText.getHint();
            this.o.setHint(this.s0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.o.setHint(hint);
                this.S0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.o) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.L1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        q18 q18Var;
        super.draw(canvas);
        boolean z = this.Q0;
        s53 s53Var = this.G1;
        if (z) {
            s53Var.d(canvas);
        }
        if (this.Y0 == null || (q18Var = this.X0) == null) {
            return;
        }
        q18Var.draw(canvas);
        if (this.o.isFocused()) {
            Rect bounds = this.Y0.getBounds();
            Rect bounds2 = this.X0.getBounds();
            float f = s53Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = og.c(iCenterX, f, bounds2.left);
            bounds.right = og.c(iCenterX, f, bounds2.right);
            this.Y0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.K1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.K1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            s53 r3 = r4.G1
            if (r3 == 0) goto L2f
            r3.R = r1
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.i(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.o
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = defpackage.zmf.a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.K1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.Q0 && !TextUtils.isEmpty(this.R0) && (this.T0 instanceof y04);
    }

    public final q18 f(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(stb.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.o;
        float popupElevation = editText instanceof u08 ? ((u08) editText).getPopupElevation() : getResources().getDimensionPixelOffset(stb.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(stb.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        rnc rncVar = new rnc();
        rnc rncVar2 = new rnc();
        rnc rncVar3 = new rnc();
        rnc rncVar4 = new rnc();
        vu4 vu4Var = new vu4();
        vu4 vu4Var2 = new vu4();
        vu4 vu4Var3 = new vu4();
        vu4 vu4Var4 = new vu4();
        a0 a0Var = new a0(f);
        a0 a0Var2 = new a0(f);
        a0 a0Var3 = new a0(dimensionPixelOffset);
        a0 a0Var4 = new a0(dimensionPixelOffset);
        gjd gjdVar = new gjd();
        gjdVar.a = rncVar;
        gjdVar.b = rncVar2;
        gjdVar.c = rncVar3;
        gjdVar.d = rncVar4;
        gjdVar.e = a0Var;
        gjdVar.f = a0Var2;
        gjdVar.g = a0Var4;
        gjdVar.h = a0Var3;
        gjdVar.i = vu4Var;
        gjdVar.j = vu4Var2;
        gjdVar.k = vu4Var3;
        gjdVar.l = vu4Var4;
        EditText editText2 = this.o;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof u08 ? ((u08) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = q18.I0;
            dropDownBackgroundTintList = ColorStateList.valueOf(mr0.y(tsb.colorSurface, context, q18.class.getSimpleName()));
        }
        q18 q18Var = new q18();
        q18Var.j(context);
        q18Var.l(dropDownBackgroundTintList);
        q18Var.k(popupElevation);
        q18Var.setShapeAppearanceModel(gjdVar);
        p18 p18Var = q18Var.a;
        if (p18Var.h == null) {
            p18Var.h = new Rect();
        }
        q18Var.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        q18Var.invalidateSelf();
        return q18Var;
    }

    public final int g(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.o.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.o;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public q18 getBoxBackground() {
        int i = this.c1;
        if (i == 1 || i == 2) {
            return this.T0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.i1;
    }

    public int getBoxBackgroundMode() {
        return this.c1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.d1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zT = mqd.t(this);
        RectF rectF = this.l1;
        return zT ? this.Z0.h.a(rectF) : this.Z0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zT = mqd.t(this);
        RectF rectF = this.l1;
        return zT ? this.Z0.g.a(rectF) : this.Z0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zT = mqd.t(this);
        RectF rectF = this.l1;
        return zT ? this.Z0.e.a(rectF) : this.Z0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zT = mqd.t(this);
        RectF rectF = this.l1;
        return zT ? this.Z0.f.a(rectF) : this.Z0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.x1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.y1;
    }

    public int getBoxStrokeWidth() {
        return this.f1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.g1;
    }

    public int getCounterMaxLength() {
        return this.z0;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.y0 && this.A0 && (appCompatTextView = this.C0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.N0;
    }

    public ColorStateList getCounterTextColor() {
        return this.M0;
    }

    public ColorStateList getCursorColor() {
        return this.O0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.P0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.t1;
    }

    public EditText getEditText() {
        return this.o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.u0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.u0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.A0;
    }

    public int getEndIconMode() {
        return this.c.w0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.B0;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.u0;
    }

    public CharSequence getError() {
        b07 b07Var = this.x0;
        if (b07Var.q) {
            return b07Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.x0.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.x0.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.x0.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        b07 b07Var = this.x0;
        if (b07Var.x) {
            return b07Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.x0.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.Q0) {
            return this.R0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G1.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        s53 s53Var = this.G1;
        return s53Var.f(s53Var.o);
    }

    public ColorStateList getHintTextColor() {
        return this.u1;
    }

    public mpe getLengthCounter() {
        return this.B0;
    }

    public int getMaxEms() {
        return this.u0;
    }

    public int getMaxWidth() {
        return this.w0;
    }

    public int getMinEms() {
        return this.t0;
    }

    public int getMinWidth() {
        return this.v0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.u0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.u0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.G0) {
            return this.F0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.J0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.I0;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public gjd getShapeAppearanceModel() {
        return this.Z0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.o.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.o.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.u0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.v0;
    }

    public CharSequence getSuffixText() {
        return this.c.D0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.E0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.E0;
    }

    public Typeface getTypeface() {
        return this.m1;
    }

    public final int h(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.o.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void i() throws Resources.NotFoundException {
        int i = this.c1;
        if (i == 0) {
            this.T0 = null;
            this.X0 = null;
            this.Y0 = null;
        } else if (i == 1) {
            this.T0 = new q18(this.Z0);
            this.X0 = new q18();
            this.Y0 = new q18();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(zr6.j(new StringBuilder(), this.c1, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.Q0 || (this.T0 instanceof y04)) {
                this.T0 = new q18(this.Z0);
            } else {
                gjd gjdVar = this.Z0;
                int i2 = y04.K0;
                if (gjdVar == null) {
                    gjdVar = new gjd();
                }
                this.T0 = new y04(new x04(gjdVar, new RectF()));
            }
            this.X0 = null;
            this.Y0 = null;
        }
        s();
        x();
        if (this.c1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.d1 = getResources().getDimensionPixelSize(stb.material_font_2_0_box_collapsed_padding_top);
            } else if (ju0.A(getContext())) {
                this.d1 = getResources().getDimensionPixelSize(stb.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.o != null && this.c1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.o;
                WeakHashMap weakHashMap = zmf.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_2_0_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ju0.A(getContext())) {
                EditText editText2 = this.o;
                WeakHashMap weakHashMap2 = zmf.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_1_3_padding_top), this.o.getPaddingEnd(), getResources().getDimensionPixelSize(stb.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.c1 != 0) {
            t();
        }
        EditText editText3 = this.o;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.c1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(m2c.TextAppearance_AppCompat_Caption);
        textView.setTextColor(lt3.a(getContext(), etb.design_error));
    }

    public final boolean m() {
        b07 b07Var = this.x0;
        return (b07Var.o != 1 || b07Var.r == null || TextUtils.isEmpty(b07Var.p)) ? false : true;
    }

    public final void n(Editable editable) throws Resources.NotFoundException {
        ((hme) this.B0).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.A0;
        int i = this.z0;
        String string = null;
        if (i == -1) {
            this.C0.setText(String.valueOf(length));
            this.C0.setContentDescription(null);
            this.A0 = false;
        } else {
            this.A0 = length > i;
            Context context = getContext();
            this.C0.setContentDescription(context.getString(this.A0 ? wzb.character_counter_overflowed_content_description : wzb.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.z0)));
            if (z != this.A0) {
                o();
            }
            rl0 rl0VarC = rl0.c();
            AppCompatTextView appCompatTextView = this.C0;
            String string2 = getContext().getString(wzb.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.z0));
            if (string2 == null) {
                rl0VarC.getClass();
            } else {
                string = rl0VarC.d(string2, rl0VarC.c).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.o == null || z == this.A0) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.C0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.A0 ? this.D0 : this.E0);
            if (!this.A0 && (colorStateList2 = this.M0) != null) {
                this.C0.setTextColor(colorStateList2);
            }
            if (!this.A0 || (colorStateList = this.N0) == null) {
                return;
            }
            this.C0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G1.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        m15 m15Var = this.c;
        m15Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.M1 = false;
        if (this.o != null && this.o.getMeasuredHeight() < (iMax = Math.max(m15Var.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.o.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.o.post(new ule(2, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.o;
        if (editText != null) {
            ThreadLocal threadLocal = uh4.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.j1;
            rect.set(0, 0, width, height);
            uh4.b(this, editText, rect);
            q18 q18Var = this.X0;
            if (q18Var != null) {
                int i5 = rect.bottom;
                q18Var.setBounds(rect.left, i5 - this.f1, rect.right, i5);
            }
            q18 q18Var2 = this.Y0;
            if (q18Var2 != null) {
                int i6 = rect.bottom;
                q18Var2.setBounds(rect.left, i6 - this.g1, rect.right, i6);
            }
            if (this.Q0) {
                float textSize = this.o.getTextSize();
                s53 s53Var = this.G1;
                if (s53Var.l != textSize) {
                    s53Var.l = textSize;
                    s53Var.i(false);
                }
                int gravity = this.o.getGravity();
                s53Var.l((gravity & (-113)) | 48);
                if (s53Var.j != gravity) {
                    s53Var.j = gravity;
                    s53Var.i(false);
                }
                if (this.o == null) {
                    throw new IllegalStateException();
                }
                boolean zT = mqd.t(this);
                int i7 = rect.bottom;
                Rect rect2 = this.k1;
                rect2.bottom = i7;
                int i8 = this.c1;
                if (i8 == 1) {
                    rect2.left = g(rect.left, zT);
                    rect2.top = rect.top + this.d1;
                    rect2.right = h(rect.right, zT);
                } else if (i8 != 2) {
                    rect2.left = g(rect.left, zT);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zT);
                } else {
                    rect2.left = this.o.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.o.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = s53Var.h;
                if (rect3.left != i9 || rect3.top != i10 || rect3.right != i11 || rect3.bottom != i12) {
                    rect3.set(i9, i10, i11, i12);
                    s53Var.S = true;
                }
                if (this.o == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = s53Var.U;
                textPaint.setTextSize(s53Var.l);
                textPaint.setTypeface(s53Var.z);
                textPaint.setLetterSpacing(s53Var.g0);
                float f = -textPaint.ascent();
                rect2.left = this.o.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.c1 != 1 || this.o.getMinLines() > 1) ? rect.top + this.o.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.o.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.c1 != 1 || this.o.getMinLines() > 1) ? rect.bottom - this.o.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = s53Var.g;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    s53Var.S = true;
                }
                s53Var.i(false);
                if (!e() || this.F1) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.M1;
        m15 m15Var = this.c;
        if (!z) {
            m15Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.M1 = true;
        }
        if (this.H0 != null && (editText = this.o) != null) {
            this.H0.setGravity(editText.getGravity());
            this.H0.setPadding(this.o.getCompoundPaddingLeft(), this.o.getCompoundPaddingTop(), this.o.getCompoundPaddingRight(), this.o.getCompoundPaddingBottom());
        }
        m15Var.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof npe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        npe npeVar = (npe) parcelable;
        super.onRestoreInstanceState(npeVar.a);
        setError(npeVar.c);
        if (npeVar.o) {
            post(new q57(29, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.a1) {
            hx3 hx3Var = this.Z0.e;
            RectF rectF = this.l1;
            float fA = hx3Var.a(rectF);
            float fA2 = this.Z0.f.a(rectF);
            float fA3 = this.Z0.h.a(rectF);
            float fA4 = this.Z0.g.a(rectF);
            gjd gjdVar = this.Z0;
            hm9 hm9Var = gjdVar.a;
            hm9 hm9Var2 = gjdVar.b;
            hm9 hm9Var3 = gjdVar.d;
            hm9 hm9Var4 = gjdVar.c;
            vu4 vu4Var = new vu4();
            vu4 vu4Var2 = new vu4();
            vu4 vu4Var3 = new vu4();
            vu4 vu4Var4 = new vu4();
            i8g.d(hm9Var2);
            i8g.d(hm9Var);
            i8g.d(hm9Var4);
            i8g.d(hm9Var3);
            a0 a0Var = new a0(fA2);
            a0 a0Var2 = new a0(fA);
            a0 a0Var3 = new a0(fA4);
            a0 a0Var4 = new a0(fA3);
            gjd gjdVar2 = new gjd();
            gjdVar2.a = hm9Var2;
            gjdVar2.b = hm9Var;
            gjdVar2.c = hm9Var3;
            gjdVar2.d = hm9Var4;
            gjdVar2.e = a0Var;
            gjdVar2.f = a0Var2;
            gjdVar2.g = a0Var4;
            gjdVar2.h = a0Var3;
            gjdVar2.i = vu4Var;
            gjdVar2.j = vu4Var2;
            gjdVar2.k = vu4Var3;
            gjdVar2.l = vu4Var4;
            this.a1 = z;
            setShapeAppearanceModel(gjdVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        npe npeVar = new npe(super.onSaveInstanceState());
        if (m()) {
            npeVar.c = getError();
        }
        m15 m15Var = this.c;
        npeVar.o = m15Var.w0 != 0 && m15Var.u0.o;
        return npeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.O0
            if (r0 == 0) goto L5
            goto L25
        L5:
            android.content.Context r0 = r4.getContext()
            int r1 = defpackage.tsb.colorControlActivated
            android.util.TypedValue r1 = defpackage.kq0.C(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L25
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1d
            android.content.res.ColorStateList r0 = defpackage.z7.n(r0, r3)
            goto L25
        L1d:
            int r0 = r1.data
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L25:
            android.widget.EditText r1 = r4.o
            if (r1 == 0) goto L50
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L30
            goto L50
        L30:
            android.widget.EditText r1 = r4.o
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.m()
            if (r2 != 0) goto L48
            androidx.appcompat.widget.AppCompatTextView r2 = r4.C0
            if (r2 == 0) goto L4d
            boolean r2 = r4.A0
            if (r2 == 0) goto L4d
        L48:
            android.content.res.ColorStateList r4 = r4.P0
            if (r4 == 0) goto L4d
            r0 = r4
        L4d:
            defpackage.aq4.h(r1, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.o;
        if (editText == null || this.c1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = hq4.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(gn.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.A0 && (appCompatTextView = this.C0) != null) {
            drawableMutate.setColorFilter(gn.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.o.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.o;
        if (editText == null || this.T0 == null) {
            return;
        }
        if ((this.W0 || editText.getBackground() == null) && this.c1 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.o;
            WeakHashMap weakHashMap = zmf.a;
            editText2.setBackground(editTextBoxBackground);
            this.W0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.i1 != i) {
            this.i1 = i;
            this.z1 = i;
            this.B1 = i;
            this.C1 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(lt3.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.z1 = defaultColor;
        this.i1 = defaultColor;
        this.A1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.B1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.C1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.c1) {
            return;
        }
        this.c1 = i;
        if (this.o != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.d1 = i;
    }

    public void setBoxCornerFamily(int i) {
        i8g i8gVarE = this.Z0.e();
        hx3 hx3Var = this.Z0.e;
        hm9 hm9VarF = nu0.f(i);
        i8gVarE.a = hm9VarF;
        i8g.d(hm9VarF);
        i8gVarE.e = hx3Var;
        hx3 hx3Var2 = this.Z0.f;
        hm9 hm9VarF2 = nu0.f(i);
        i8gVarE.b = hm9VarF2;
        i8g.d(hm9VarF2);
        i8gVarE.f = hx3Var2;
        hx3 hx3Var3 = this.Z0.h;
        hm9 hm9VarF3 = nu0.f(i);
        i8gVarE.d = hm9VarF3;
        i8g.d(hm9VarF3);
        i8gVarE.h = hx3Var3;
        hx3 hx3Var4 = this.Z0.g;
        hm9 hm9VarF4 = nu0.f(i);
        i8gVarE.c = hm9VarF4;
        i8g.d(hm9VarF4);
        i8gVarE.g = hx3Var4;
        this.Z0 = i8gVarE.c();
        b();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.x1 != i) {
            this.x1 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.v1 = colorStateList.getDefaultColor();
            this.D1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.w1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.x1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.x1 != colorStateList.getDefaultColor()) {
            this.x1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f1 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.g1 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.y0 != z) {
            b07 b07Var = this.x0;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.C0 = appCompatTextView;
                appCompatTextView.setId(ivb.textinput_counter);
                Typeface typeface = this.m1;
                if (typeface != null) {
                    this.C0.setTypeface(typeface);
                }
                this.C0.setMaxLines(1);
                b07Var.a(this.C0, 2);
                ((ViewGroup.MarginLayoutParams) this.C0.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(stb.mtrl_textinput_counter_margin_start));
                o();
                if (this.C0 != null) {
                    EditText editText = this.o;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                b07Var.g(this.C0, 2);
                this.C0 = null;
            }
            this.y0 = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.z0 != i) {
            if (i > 0) {
                this.z0 = i;
            } else {
                this.z0 = -1;
            }
            if (!this.y0 || this.C0 == null) {
                return;
            }
            EditText editText = this.o;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.D0 != i) {
            this.D0 = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            if (m() || (this.C0 != null && this.A0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.t1 = colorStateList;
        this.u1 = colorStateList;
        if (this.o != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.u0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.u0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        m15 m15Var = this.c;
        CharSequence text = i != 0 ? m15Var.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = m15Var.u0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        m15 m15Var = this.c;
        Drawable drawableN = i != 0 ? s36.n(m15Var.getContext(), i) : null;
        CheckableImageButton checkableImageButton = m15Var.u0;
        checkableImageButton.setImageDrawable(drawableN);
        if (drawableN != null) {
            ColorStateList colorStateList = m15Var.y0;
            PorterDuff.Mode mode = m15Var.z0;
            TextInputLayout textInputLayout = m15Var.a;
            a14.d(textInputLayout, checkableImageButton, colorStateList, mode);
            a14.I(textInputLayout, checkableImageButton, m15Var.y0);
        }
    }

    public void setEndIconMinSize(int i) {
        m15 m15Var = this.c;
        if (i < 0) {
            m15Var.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != m15Var.A0) {
            m15Var.A0 = i;
            CheckableImageButton checkableImageButton = m15Var.u0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = m15Var.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m15 m15Var = this.c;
        View.OnLongClickListener onLongClickListener = m15Var.C0;
        CheckableImageButton checkableImageButton = m15Var.u0;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m15 m15Var = this.c;
        m15Var.C0 = onLongClickListener;
        CheckableImageButton checkableImageButton = m15Var.u0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m15 m15Var = this.c;
        m15Var.B0 = scaleType;
        m15Var.u0.setScaleType(scaleType);
        m15Var.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m15 m15Var = this.c;
        if (m15Var.y0 != colorStateList) {
            m15Var.y0 = colorStateList;
            a14.d(m15Var.a, m15Var.u0, colorStateList, m15Var.z0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m15 m15Var = this.c;
        if (m15Var.z0 != mode) {
            m15Var.z0 = mode;
            a14.d(m15Var.a, m15Var.u0, m15Var.y0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        b07 b07Var = this.x0;
        if (!b07Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            b07Var.f();
            return;
        }
        b07Var.c();
        b07Var.p = charSequence;
        b07Var.r.setText(charSequence);
        int i = b07Var.n;
        if (i != 1) {
            b07Var.o = 1;
        }
        b07Var.i(i, b07Var.o, b07Var.h(b07Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        b07 b07Var = this.x0;
        b07Var.t = i;
        AppCompatTextView appCompatTextView = b07Var.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        b07 b07Var = this.x0;
        b07Var.s = charSequence;
        AppCompatTextView appCompatTextView = b07Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        b07 b07Var = this.x0;
        if (b07Var.q == z) {
            return;
        }
        b07Var.c();
        TextInputLayout textInputLayout = b07Var.h;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(b07Var.g, null);
            b07Var.r = appCompatTextView;
            appCompatTextView.setId(ivb.textinput_error);
            b07Var.r.setTextAlignment(5);
            Typeface typeface = b07Var.B;
            if (typeface != null) {
                b07Var.r.setTypeface(typeface);
            }
            int i = b07Var.u;
            b07Var.u = i;
            AppCompatTextView appCompatTextView2 = b07Var.r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i);
            }
            ColorStateList colorStateList = b07Var.v;
            b07Var.v = colorStateList;
            AppCompatTextView appCompatTextView3 = b07Var.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = b07Var.s;
            b07Var.s = charSequence;
            AppCompatTextView appCompatTextView4 = b07Var.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = b07Var.t;
            b07Var.t = i2;
            AppCompatTextView appCompatTextView5 = b07Var.r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = zmf.a;
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            b07Var.r.setVisibility(4);
            b07Var.a(b07Var.r, 0);
        } else {
            b07Var.f();
            b07Var.g(b07Var.r, 0);
            b07Var.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        b07Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        m15 m15Var = this.c;
        m15Var.i(i != 0 ? s36.n(m15Var.getContext(), i) : null);
        a14.I(m15Var.a, m15Var.c, m15Var.o);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m15 m15Var = this.c;
        CheckableImageButton checkableImageButton = m15Var.c;
        View.OnLongClickListener onLongClickListener = m15Var.t0;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m15 m15Var = this.c;
        m15Var.t0 = onLongClickListener;
        CheckableImageButton checkableImageButton = m15Var.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m15 m15Var = this.c;
        if (m15Var.o != colorStateList) {
            m15Var.o = colorStateList;
            a14.d(m15Var.a, m15Var.c, colorStateList, m15Var.s0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m15 m15Var = this.c;
        if (m15Var.s0 != mode) {
            m15Var.s0 = mode;
            a14.d(m15Var.a, m15Var.c, m15Var.o, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        b07 b07Var = this.x0;
        b07Var.u = i;
        AppCompatTextView appCompatTextView = b07Var.r;
        if (appCompatTextView != null) {
            b07Var.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        b07 b07Var = this.x0;
        b07Var.v = colorStateList;
        AppCompatTextView appCompatTextView = b07Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.H1 != z) {
            this.H1 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        b07 b07Var = this.x0;
        if (zIsEmpty) {
            if (b07Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!b07Var.x) {
            setHelperTextEnabled(true);
        }
        b07Var.c();
        b07Var.w = charSequence;
        b07Var.y.setText(charSequence);
        int i = b07Var.n;
        if (i != 2) {
            b07Var.o = 2;
        }
        b07Var.i(i, b07Var.o, b07Var.h(b07Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        b07 b07Var = this.x0;
        b07Var.A = colorStateList;
        AppCompatTextView appCompatTextView = b07Var.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        int i = 0;
        b07 b07Var = this.x0;
        if (b07Var.x == z) {
            return;
        }
        b07Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(b07Var.g, null);
            b07Var.y = appCompatTextView;
            appCompatTextView.setId(ivb.textinput_helper_text);
            b07Var.y.setTextAlignment(5);
            Typeface typeface = b07Var.B;
            if (typeface != null) {
                b07Var.y.setTypeface(typeface);
            }
            b07Var.y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = b07Var.y;
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i2 = b07Var.z;
            b07Var.z = i2;
            AppCompatTextView appCompatTextView3 = b07Var.y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i2);
            }
            ColorStateList colorStateList = b07Var.A;
            b07Var.A = colorStateList;
            AppCompatTextView appCompatTextView4 = b07Var.y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            b07Var.a(b07Var.y, 1);
            b07Var.y.setAccessibilityDelegate(new a07(i, b07Var));
        } else {
            b07Var.c();
            int i3 = b07Var.n;
            if (i3 == 2) {
                b07Var.o = 0;
            }
            b07Var.i(i3, b07Var.o, b07Var.h(b07Var.y, ""));
            b07Var.g(b07Var.y, 1);
            b07Var.y = null;
            TextInputLayout textInputLayout = b07Var.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        b07Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        b07 b07Var = this.x0;
        b07Var.z = i;
        AppCompatTextView appCompatTextView = b07Var.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.Q0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.I1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.Q0) {
            this.Q0 = z;
            if (z) {
                CharSequence hint = this.o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.R0)) {
                        setHint(hint);
                    }
                    this.o.setHint((CharSequence) null);
                }
                this.S0 = true;
            } else {
                this.S0 = false;
                if (!TextUtils.isEmpty(this.R0) && TextUtils.isEmpty(this.o.getHint())) {
                    this.o.setHint(this.R0);
                }
                setHintInternal(null);
            }
            if (this.o != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        s53 s53Var = this.G1;
        s53Var.k(i);
        this.u1 = s53Var.o;
        if (this.o != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.u1 != colorStateList) {
            if (this.t1 == null) {
                s53 s53Var = this.G1;
                if (s53Var.o != colorStateList) {
                    s53Var.o = colorStateList;
                    s53Var.i(false);
                }
            }
            this.u1 = colorStateList;
            if (this.o != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(mpe mpeVar) {
        this.B0 = mpeVar;
    }

    public void setMaxEms(int i) {
        this.u0 = i;
        EditText editText = this.o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.w0 = i;
        EditText editText = this.o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.t0 = i;
        EditText editText = this.o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.v0 = i;
        EditText editText = this.o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        m15 m15Var = this.c;
        m15Var.u0.setContentDescription(i != 0 ? m15Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        m15 m15Var = this.c;
        m15Var.u0.setImageDrawable(i != 0 ? s36.n(m15Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        m15 m15Var = this.c;
        if (z && m15Var.w0 != 1) {
            m15Var.g(1);
        } else if (z) {
            m15Var.getClass();
        } else {
            m15Var.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m15 m15Var = this.c;
        m15Var.y0 = colorStateList;
        a14.d(m15Var.a, m15Var.u0, colorStateList, m15Var.z0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m15 m15Var = this.c;
        m15Var.z0 = mode;
        a14.d(m15Var.a, m15Var.u0, m15Var.y0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.H0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.H0 = appCompatTextView;
            appCompatTextView.setId(ivb.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.H0;
            WeakHashMap weakHashMap = zmf.a;
            appCompatTextView2.setImportantForAccessibility(2);
            wa5 wa5VarD = d();
            this.K0 = wa5VarD;
            wa5VarD.b = 67L;
            this.L0 = d();
            setPlaceholderTextAppearance(this.J0);
            setPlaceholderTextColor(this.I0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.G0) {
                setPlaceholderTextEnabled(true);
            }
            this.F0 = charSequence;
        }
        EditText editText = this.o;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.J0 = i;
        AppCompatTextView appCompatTextView = this.H0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            AppCompatTextView appCompatTextView = this.H0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        myd mydVar = this.b;
        mydVar.getClass();
        mydVar.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mydVar.b.setText(charSequence);
        mydVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(gjd gjdVar) {
        q18 q18Var = this.T0;
        if (q18Var == null || q18Var.a.a == gjdVar) {
            return;
        }
        this.Z0 = gjdVar;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.o.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? s36.n(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        myd mydVar = this.b;
        if (i < 0) {
            mydVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != mydVar.u0) {
            mydVar.u0 = i;
            CheckableImageButton checkableImageButton = mydVar.o;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        myd mydVar = this.b;
        View.OnLongClickListener onLongClickListener = mydVar.w0;
        CheckableImageButton checkableImageButton = mydVar.o;
        checkableImageButton.setOnClickListener(onClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        myd mydVar = this.b;
        mydVar.w0 = onLongClickListener;
        CheckableImageButton checkableImageButton = mydVar.o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a14.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        myd mydVar = this.b;
        mydVar.v0 = scaleType;
        mydVar.o.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        myd mydVar = this.b;
        if (mydVar.s0 != colorStateList) {
            mydVar.s0 = colorStateList;
            a14.d(mydVar.a, mydVar.o, colorStateList, mydVar.t0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        myd mydVar = this.b;
        if (mydVar.t0 != mode) {
            mydVar.t0 = mode;
            a14.d(mydVar.a, mydVar.o, mydVar.s0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        m15 m15Var = this.c;
        m15Var.getClass();
        m15Var.D0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        m15Var.E0.setText(charSequence);
        m15Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.E0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.E0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(lpe lpeVar) {
        EditText editText = this.o;
        if (editText != null) {
            zmf.j(editText, lpeVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.m1) {
            this.m1 = typeface;
            s53 s53Var = this.G1;
            boolean zM = s53Var.m(typeface);
            boolean zO = s53Var.o(typeface);
            if (zM || zO) {
                s53Var.i(false);
            }
            b07 b07Var = this.x0;
            if (typeface != b07Var.B) {
                b07Var.B = typeface;
                AppCompatTextView appCompatTextView = b07Var.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = b07Var.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.C0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.c1 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.o;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.o;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.t1;
        s53 s53Var = this.G1;
        if (colorStateList2 != null) {
            s53Var.j(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.t1;
            s53Var.j(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.D1) : this.D1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.x0.r;
            s53Var.j(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.A0 && (appCompatTextView = this.C0) != null) {
            s53Var.j(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.u1) != null && s53Var.o != colorStateList) {
            s53Var.o = colorStateList;
            s53Var.i(false);
        }
        m15 m15Var = this.c;
        myd mydVar = this.b;
        if (z3 || !this.H1 || (isEnabled() && z4)) {
            if (z2 || this.F1) {
                ValueAnimator valueAnimator = this.J1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.J1.cancel();
                }
                if (z && this.I1) {
                    a(1.0f);
                } else {
                    s53Var.p(1.0f);
                }
                this.F1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.o;
                v(editText3 != null ? editText3.getText() : null);
                mydVar.x0 = false;
                mydVar.e();
                m15Var.F0 = false;
                m15Var.n();
                return;
            }
            return;
        }
        if (z2 || !this.F1) {
            ValueAnimator valueAnimator2 = this.J1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.J1.cancel();
            }
            if (z && this.I1) {
                a(0.0f);
            } else {
                s53Var.p(0.0f);
            }
            if (e() && (!((y04) this.T0).J0.v.isEmpty()) && e()) {
                ((y04) this.T0).r(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.F1 = true;
            AppCompatTextView appCompatTextView3 = this.H0;
            if (appCompatTextView3 != null && this.G0) {
                appCompatTextView3.setText((CharSequence) null);
                c2f.a(this.a, this.L0);
                this.H0.setVisibility(4);
            }
            mydVar.x0 = true;
            mydVar.e();
            m15Var.F0 = true;
            m15Var.n();
        }
    }

    public final void v(Editable editable) {
        ((hme) this.B0).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.F1) {
            AppCompatTextView appCompatTextView = this.H0;
            if (appCompatTextView == null || !this.G0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            c2f.a(frameLayout, this.L0);
            this.H0.setVisibility(4);
            return;
        }
        if (this.H0 == null || !this.G0 || TextUtils.isEmpty(this.F0)) {
            return;
        }
        this.H0.setText(this.F0);
        c2f.a(frameLayout, this.K0);
        this.H0.setVisibility(0);
        this.H0.bringToFront();
        announceForAccessibility(this.F0);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.y1.getDefaultColor();
        int colorForState = this.y1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.y1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.h1 = colorForState2;
        } else if (z2) {
            this.h1 = colorForState;
        } else {
            this.h1 = defaultColor;
        }
    }

    public final void x() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.T0 == null || this.c1 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.o) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.o) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.h1 = this.D1;
        } else if (m()) {
            if (this.y1 != null) {
                w(z2, z);
            } else {
                this.h1 = getErrorCurrentTextColors();
            }
        } else if (!this.A0 || (appCompatTextView = this.C0) == null) {
            if (z2) {
                this.h1 = this.x1;
            } else if (z) {
                this.h1 = this.w1;
            } else {
                this.h1 = this.v1;
            }
        } else if (this.y1 != null) {
            w(z2, z);
        } else {
            this.h1 = appCompatTextView.getCurrentTextColor();
        }
        p();
        m15 m15Var = this.c;
        m15Var.l();
        CheckableImageButton checkableImageButton = m15Var.c;
        ColorStateList colorStateList = m15Var.o;
        TextInputLayout textInputLayout = m15Var.a;
        a14.I(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = m15Var.y0;
        CheckableImageButton checkableImageButton2 = m15Var.u0;
        a14.I(textInputLayout, checkableImageButton2, colorStateList2);
        if (m15Var.b() instanceof qs4) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                a14.d(textInputLayout, checkableImageButton2, m15Var.y0, m15Var.z0);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                aq4.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        myd mydVar = this.b;
        a14.I(mydVar.a, mydVar.o, mydVar.s0);
        if (this.c1 == 2) {
            int i = this.e1;
            if (z2 && isEnabled()) {
                this.e1 = this.g1;
            } else {
                this.e1 = this.f1;
            }
            if (this.e1 != i && e() && !this.F1) {
                if (e()) {
                    ((y04) this.T0).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.c1 == 1) {
            if (!isEnabled()) {
                this.i1 = this.A1;
            } else if (z && !z2) {
                this.i1 = this.C1;
            } else if (z2) {
                this.i1 = this.B1;
            } else {
                this.i1 = this.z1;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.u0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.u0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.u0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m15 m15Var = this.c;
        CheckableImageButton checkableImageButton = m15Var.u0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = m15Var.y0;
            PorterDuff.Mode mode = m15Var.z0;
            TextInputLayout textInputLayout = m15Var.a;
            a14.d(textInputLayout, checkableImageButton, colorStateList, mode);
            a14.I(textInputLayout, checkableImageButton, m15Var.y0);
        }
    }
}
