package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u08 extends jm {
    public final wl7 s0;
    public final AccessibilityManager t0;
    public final Rect u0;
    public final int v0;
    public final float w0;
    public ColorStateList x0;
    public int y0;
    public ColorStateList z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public u08(Context context, AttributeSet attributeSet) {
        int i = tsb.autoCompleteTextViewStyle;
        super(y18.a(context, attributeSet, i, 0), attributeSet, i);
        this.u0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.MaterialAutoCompleteTextView, i, m2c.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(z2c.MaterialAutoCompleteTextView_android_inputType) && typedArrayD.getInt(z2c.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.v0 = typedArrayD.getResourceId(z2c.MaterialAutoCompleteTextView_simpleItemLayout, vyb.mtrl_auto_complete_simple_item);
        this.w0 = typedArrayD.getDimensionPixelOffset(z2c.MaterialAutoCompleteTextView_android_popupElevation, stb.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(z2c.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.x0 = ColorStateList.valueOf(typedArrayD.getColor(z2c.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.y0 = typedArrayD.getColor(z2c.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.z0 = ju0.q(context2, typedArrayD, z2c.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.t0 = (AccessibilityManager) context2.getSystemService("accessibility");
        wl7 wl7Var = new wl7(context2, null, vsb.listPopupWindowStyle, 0);
        this.s0 = wl7Var;
        wl7Var.J0 = true;
        wl7Var.K0.setFocusable(true);
        wl7Var.z0 = this;
        wl7Var.K0.setInputMethodMode(2);
        wl7Var.p(getAdapter());
        wl7Var.A0 = new wn(1, this);
        if (typedArrayD.hasValue(z2c.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayD.getResourceId(z2c.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayD.recycle();
    }

    public static void b(u08 u08Var, Object obj) {
        u08Var.setText(u08Var.convertSelectionToString(obj), false);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.t0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (d()) {
            this.s0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.x0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.S0) ? super.getHint() : textInputLayoutC.getHint();
    }

    public float getPopupElevation() {
        return this.w0;
    }

    public int getSimpleItemSelectedColor() {
        return this.y0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.z0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.S0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutC = c();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutC != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                wl7 wl7Var = this.s0;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !wl7Var.K0.isShowing() ? -1 : wl7Var.c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutC);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = wl7Var.K0.getBackground();
                if (background != null) {
                    Rect rect = this.u0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutC.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (d()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.s0.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        wl7 wl7Var = this.s0;
        if (wl7Var != null) {
            wl7Var.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof q18) {
            ((q18) dropDownBackground).l(this.x0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.s0.B0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null) {
            textInputLayoutC.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.y0 = i;
        if (getAdapter() instanceof t08) {
            ((t08) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        if (getAdapter() instanceof t08) {
            ((t08) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (d()) {
            this.s0.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t08(this, getContext(), this.v0, strArr));
    }
}
