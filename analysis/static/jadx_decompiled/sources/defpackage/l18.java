package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class l18 extends AppCompatCheckBox {
    public static final int M0 = m2c.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] N0 = {tsb.state_indeterminate};
    public static final int[] O0;
    public static final int[][] P0;
    public static final int Q0;
    public Drawable A0;
    public boolean B0;
    public ColorStateList C0;
    public ColorStateList D0;
    public PorterDuff.Mode E0;
    public int F0;
    public int[] G0;
    public boolean H0;
    public CharSequence I0;
    public CompoundButton.OnCheckedChangeListener J0;
    public final sf K0;
    public final rj0 L0;
    public final LinkedHashSet s0;
    public final LinkedHashSet t0;
    public ColorStateList u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public CharSequence y0;
    public Drawable z0;

    static {
        int i = tsb.state_error;
        O0 = new int[]{i};
        P0 = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        Q0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l18(Context context, AttributeSet attributeSet) {
        int i = tsb.checkboxStyle;
        int i2 = M0;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        this.s0 = new LinkedHashSet();
        this.t0 = new LinkedHashSet();
        Context context2 = getContext();
        int i3 = yub.mtrl_checkbox_button_checked_unchecked;
        sf sfVar = new sf(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = vic.a;
        Drawable drawableA = qic.a(resources, i3, theme);
        sfVar.a = drawableA;
        drawableA.setCallback(sfVar.Y);
        new rf(sfVar.a.getConstantState());
        this.K0 = sfVar;
        this.L0 = new rj0(this, 2);
        Context context3 = getContext();
        this.z0 = gd3.a(this);
        this.C0 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = z2c.MaterialCheckBox;
        sre.a(context3, attributeSet, i, i2);
        sre.b(context3, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, i, i2);
        k8g k8gVar = new k8g(context3, typedArrayObtainStyledAttributes);
        this.A0 = k8gVar.n(z2c.MaterialCheckBox_buttonIcon);
        if (this.z0 != null && kq0.E(tsb.isMaterial3Theme, context3, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCheckBox_android_button, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z2c.MaterialCheckBox_buttonCompat, 0);
            if (resourceId == Q0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.z0 = s36.n(context3, yub.mtrl_checkbox_button);
                this.B0 = true;
                if (this.A0 == null) {
                    this.A0 = s36.n(context3, yub.mtrl_checkbox_button_icon);
                }
            }
        }
        this.D0 = ju0.p(context3, k8gVar, z2c.MaterialCheckBox_buttonIconTint);
        this.E0 = mqd.A(typedArrayObtainStyledAttributes.getInt(z2c.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.v0 = typedArrayObtainStyledAttributes.getBoolean(z2c.MaterialCheckBox_useMaterialThemeColors, false);
        this.w0 = typedArrayObtainStyledAttributes.getBoolean(z2c.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.x0 = typedArrayObtainStyledAttributes.getBoolean(z2c.MaterialCheckBox_errorShown, false);
        this.y0 = typedArrayObtainStyledAttributes.getText(z2c.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArrayObtainStyledAttributes.hasValue(z2c.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(z2c.MaterialCheckBox_checkedState, 0));
        }
        k8gVar.z();
        b();
    }

    private String getButtonStateDescription() {
        int i = this.F0;
        return i == 1 ? getResources().getString(wzb.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(wzb.mtrl_checkbox_state_description_unchecked) : getResources().getString(wzb.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.u0 == null) {
            int iZ = mr0.z(this, tsb.colorControlActivated);
            int iZ2 = mr0.z(this, tsb.colorError);
            int iZ3 = mr0.z(this, tsb.colorSurface);
            int iZ4 = mr0.z(this, tsb.colorOnSurface);
            this.u0 = new ColorStateList(P0, new int[]{mr0.N(iZ3, 1.0f, iZ2), mr0.N(iZ3, 1.0f, iZ), mr0.N(iZ3, 0.54f, iZ4), mr0.N(iZ3, 0.38f, iZ4), mr0.N(iZ3, 0.38f, iZ4)});
        }
        return this.u0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.C0;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h6 h6Var;
        Drawable drawableMutate = this.z0;
        ColorStateList colorStateList3 = this.C0;
        PorterDuff.Mode modeB = fd3.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                aq4.i(drawableMutate, modeB);
            }
        }
        this.z0 = drawableMutate;
        Drawable drawableMutate2 = this.A0;
        ColorStateList colorStateList4 = this.D0;
        PorterDuff.Mode mode = this.E0;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                aq4.i(drawableMutate2, mode);
            }
        }
        this.A0 = drawableMutate2;
        if (this.B0) {
            sf sfVar = this.K0;
            if (sfVar != null) {
                Drawable drawable = sfVar.a;
                rj0 rj0Var = this.L0;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (rj0Var.a == null) {
                        rj0Var.a = new ke(rj0Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(rj0Var.a);
                }
                ArrayList arrayList = sfVar.X;
                qf qfVar = sfVar.b;
                if (arrayList != null && rj0Var != null) {
                    arrayList.remove(rj0Var);
                    if (sfVar.X.size() == 0 && (h6Var = sfVar.o) != null) {
                        qfVar.b.removeListener(h6Var);
                        sfVar.o = null;
                    }
                }
                Drawable drawable2 = sfVar.a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (rj0Var.a == null) {
                        rj0Var.a = new ke(rj0Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(rj0Var.a);
                } else if (rj0Var != null) {
                    if (sfVar.X == null) {
                        sfVar.X = new ArrayList();
                    }
                    if (!sfVar.X.contains(rj0Var)) {
                        sfVar.X.add(rj0Var);
                        if (sfVar.o == null) {
                            sfVar.o = new h6(1, sfVar);
                        }
                        qfVar.b.addListener(sfVar.o);
                    }
                }
            }
            Drawable drawable3 = this.z0;
            if ((drawable3 instanceof AnimatedStateListDrawable) && sfVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(ivb.checked, ivb.unchecked, sfVar, false);
                ((AnimatedStateListDrawable) this.z0).addTransition(ivb.indeterminate, ivb.unchecked, sfVar, false);
            }
        }
        Drawable drawable4 = this.z0;
        if (drawable4 != null && (colorStateList2 = this.C0) != null) {
            aq4.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.A0;
        if (drawable5 != null && (colorStateList = this.D0) != null) {
            aq4.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.z0;
        Drawable drawable7 = this.A0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.z0;
    }

    public Drawable getButtonIconDrawable() {
        return this.A0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.D0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.E0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.C0;
    }

    public int getCheckedState() {
        return this.F0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.y0;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.F0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v0 && this.C0 == null && this.D0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N0);
        }
        if (this.x0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.G0 = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.w0 || !TextUtils.isEmpty(getText()) || (drawableA = gd3.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (mqd.t(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            aq4.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.x0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.y0));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k18)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k18 k18Var = (k18) parcelable;
        super.onRestoreInstanceState(k18Var.getSuperState());
        setCheckedState(k18Var.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        k18 k18Var = new k18(super.onSaveInstanceState());
        k18Var.a = getCheckedState();
        return k18Var;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(s36.n(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A0 = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(s36.n(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.D0 == colorStateList) {
            return;
        }
        this.D0 = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.E0 == mode) {
            return;
        }
        this.E0 = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.C0 == colorStateList) {
            return;
        }
        this.C0 = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.w0 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.F0 != i) {
            this.F0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.I0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.H0) {
                return;
            }
            this.H0 = true;
            LinkedHashSet linkedHashSet = this.t0;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    au1.r(it.next());
                    throw null;
                }
            }
            if (this.F0 != 2 && (onCheckedChangeListener = this.J0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.H0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.y0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.x0 == z) {
            return;
        }
        this.x0 = z;
        refreshDrawableState();
        Iterator it = this.s0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.J0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.I0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.v0 = z;
        if (z) {
            fd3.c(this, getMaterialThemeColorsTintList());
        } else {
            fd3.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.z0 = drawable;
        this.B0 = false;
        b();
    }
}
