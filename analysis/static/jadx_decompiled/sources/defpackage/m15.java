package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m15 extends LinearLayout {
    public int A0;
    public ImageView.ScaleType B0;
    public View.OnLongClickListener C0;
    public CharSequence D0;
    public final AppCompatTextView E0;
    public boolean F0;
    public EditText G0;
    public final AccessibilityManager H0;
    public q64 I0;
    public final k15 J0;
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList o;
    public PorterDuff.Mode s0;
    public View.OnLongClickListener t0;
    public final CheckableImageButton u0;
    public final ty v0;
    public int w0;
    public final LinkedHashSet x0;
    public ColorStateList y0;
    public PorterDuff.Mode z0;

    public m15(TextInputLayout textInputLayout, k8g k8gVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.w0 = 0;
        this.x0 = new LinkedHashSet();
        this.J0 = new k15(this);
        l15 l15Var = new l15(this);
        this.H0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, ivb.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, ivb.text_input_end_icon);
        this.u0 = checkableImageButtonA2;
        ty tyVar = new ty();
        tyVar.c = new SparseArray();
        tyVar.o = this;
        int i = z2c.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) k8gVar.b;
        tyVar.a = typedArray.getResourceId(i, 0);
        tyVar.b = typedArray.getResourceId(z2c.TextInputLayout_passwordToggleDrawable, 0);
        this.v0 = tyVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.E0 = appCompatTextView;
        int i2 = z2c.TextInputLayout_errorIconTint;
        TypedArray typedArray2 = (TypedArray) k8gVar.b;
        if (typedArray2.hasValue(i2)) {
            this.o = ju0.p(getContext(), k8gVar, z2c.TextInputLayout_errorIconTint);
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_errorIconTintMode)) {
            this.s0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_errorIconDrawable)) {
            i(k8gVar.n(z2c.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(wzb.error_icon_content_description));
        WeakHashMap weakHashMap = zmf.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray2.hasValue(z2c.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconTint)) {
                this.y0 = ju0.p(getContext(), k8gVar, z2c.TextInputLayout_endIconTint);
            }
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconTintMode)) {
                this.z0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_endIconMode)) {
            g(typedArray2.getInt(z2c.TextInputLayout_endIconMode, 0));
            if (typedArray2.hasValue(z2c.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray2.getText(z2c.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray2.getBoolean(z2c.TextInputLayout_endIconCheckable, true));
        } else if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleTint)) {
                this.y0 = ju0.p(getContext(), k8gVar, z2c.TextInputLayout_passwordToggleTint);
            }
            if (typedArray2.hasValue(z2c.TextInputLayout_passwordToggleTintMode)) {
                this.z0 = mqd.A(typedArray2.getInt(z2c.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray2.getBoolean(z2c.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(z2c.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(z2c.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(stb.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.A0) {
            this.A0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(z2c.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeK = a14.k(typedArray2.getInt(z2c.TextInputLayout_endIconScaleType, -1));
            this.B0 = scaleTypeK;
            checkableImageButtonA2.setScaleType(scaleTypeK);
            checkableImageButtonA.setScaleType(scaleTypeK);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(ivb.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(z2c.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray2.hasValue(z2c.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(k8gVar.l(z2c.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray2.getText(z2c.TextInputLayout_suffixText);
        this.D0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.p1.add(l15Var);
        if (textInputLayout.o != null) {
            l15Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ck(5, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(vyb.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ju0.A(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n15 b() {
        n15 m04Var;
        int i = this.w0;
        ty tyVar = this.v0;
        SparseArray sparseArray = (SparseArray) tyVar.c;
        n15 graVar = (n15) sparseArray.get(i);
        if (graVar == null) {
            m15 m15Var = (m15) tyVar.o;
            if (i == -1) {
                m04Var = new m04(m15Var, 0);
            } else if (i == 0) {
                m04Var = new m04(m15Var, 1);
            } else if (i == 1) {
                graVar = new gra(m15Var, tyVar.b);
                sparseArray.append(i, graVar);
            } else if (i == 2) {
                m04Var = new h33(m15Var);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(zr6.h(i, "Invalid end icon mode: "));
                }
                m04Var = new qs4(m15Var);
            }
            graVar = m04Var;
            sparseArray.append(i, graVar);
        }
        return graVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.u0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = zmf.a;
        return this.E0.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.u0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        n15 n15VarB = b();
        boolean zK = n15VarB.k();
        CheckableImageButton checkableImageButton = this.u0;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.o) == n15VarB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(n15VarB instanceof qs4) || (zIsActivated = checkableImageButton.isActivated()) == n15VarB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            a14.I(this.a, checkableImageButton, this.y0);
        }
    }

    public final void g(int i) {
        if (this.w0 == i) {
            return;
        }
        n15 n15VarB = b();
        q64 q64Var = this.I0;
        AccessibilityManager accessibilityManager = this.H0;
        if (q64Var != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new b4(q64Var));
        }
        this.I0 = null;
        n15VarB.s();
        this.w0 = i;
        Iterator it = this.x0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
        h(i != 0);
        n15 n15VarB2 = b();
        int iD = this.v0.a;
        if (iD == 0) {
            iD = n15VarB2.d();
        }
        Drawable drawableN = iD != 0 ? s36.n(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.u0;
        checkableImageButton.setImageDrawable(drawableN);
        TextInputLayout textInputLayout = this.a;
        if (drawableN != null) {
            a14.d(textInputLayout, checkableImageButton, this.y0, this.z0);
            a14.I(textInputLayout, checkableImageButton, this.y0);
        }
        int iC = n15VarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(n15VarB2.k());
        if (!n15VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        n15VarB2.r();
        q64 q64VarH = n15VarB2.h();
        this.I0 = q64VarH;
        if (q64VarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = zmf.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new b4(this.I0));
            }
        }
        View.OnClickListener onClickListenerF = n15VarB2.f();
        View.OnLongClickListener onLongClickListener = this.C0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        a14.J(checkableImageButton, onLongClickListener);
        EditText editText = this.G0;
        if (editText != null) {
            n15VarB2.m(editText);
            j(n15VarB2);
        }
        a14.d(textInputLayout, checkableImageButton, this.y0, this.z0);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.u0.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        a14.d(this.a, checkableImageButton, this.o, this.s0);
    }

    public final void j(n15 n15Var) {
        if (this.G0 == null) {
            return;
        }
        if (n15Var.e() != null) {
            this.G0.setOnFocusChangeListener(n15Var.e());
        }
        if (n15Var.g() != null) {
            this.u0.setOnFocusChangeListener(n15Var.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.u0.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.D0 == null || this.F0) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.x0.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.w0 != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.o == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.o;
            WeakHashMap weakHashMap = zmf.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(stb.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.o.getPaddingTop();
        int paddingBottom = textInputLayout.o.getPaddingBottom();
        WeakHashMap weakHashMap2 = zmf.a;
        this.E0.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.E0;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.D0 == null || this.F0) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.q();
    }
}
