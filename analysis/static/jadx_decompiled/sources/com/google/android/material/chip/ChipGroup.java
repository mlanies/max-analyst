package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.ana;
import defpackage.j4;
import defpackage.m2c;
import defpackage.n18;
import defpackage.o03;
import defpackage.p03;
import defpackage.ph4;
import defpackage.q03;
import defpackage.qq5;
import defpackage.r03;
import defpackage.sre;
import defpackage.tsb;
import defpackage.y18;
import defpackage.y8;
import defpackage.z2c;
import defpackage.zmf;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ChipGroup extends qq5 {
    public static final int y0 = m2c.Widget_MaterialComponents_ChipGroup;
    public int s0;
    public int t0;
    public q03 u0;
    public final ana v0;
    public final int w0;
    public final r03 x0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        int i = tsb.chipGroupStyle;
        int i2 = y0;
        Context contextA = y18.a(context, attributeSet, i, i2);
        super(contextA, attributeSet, i);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(attributeSet, z2c.FlowLayout, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.FlowLayout_lineSpacing, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
        ana anaVar = new ana();
        this.v0 = anaVar;
        r03 r03Var = new r03(this);
        this.x0 = r03Var;
        TypedArray typedArrayD = sre.d(getContext(), attributeSet, z2c.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(z2c.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(z2c.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(z2c.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(z2c.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayD.getBoolean(z2c.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayD.getBoolean(z2c.ChipGroup_selectionRequired, false));
        this.w0 = typedArrayD.getResourceId(z2c.ChipGroup_checkedChip, -1);
        typedArrayD.recycle();
        anaVar.X = new y8(this);
        super.setOnHierarchyChangeListener(r03Var);
        WeakHashMap weakHashMap = zmf.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o03);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o03(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o03(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.v0.l();
    }

    public List<Integer> getCheckedChipIds() {
        return this.v0.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.s0;
    }

    public int getChipSpacingVertical() {
        return this.t0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.w0;
        if (i != -1) {
            ana anaVar = this.v0;
            n18 n18Var = (n18) ((HashMap) anaVar.c).get(Integer.valueOf(i));
            if (n18Var != null && anaVar.f(n18Var)) {
                anaVar.m();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j4.a(getRowCount(), this.c ? getVisibleChipCount() : -1, this.v0.a ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(p03 p03Var) {
        if (p03Var == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new ph4((Object) this, (Object) p03Var, false));
        }
    }

    public void setOnCheckedStateChangeListener(q03 q03Var) {
        this.u0 = q03Var;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.x0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.v0.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // defpackage.qq5
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        ana anaVar = this.v0;
        if (anaVar.a != z) {
            anaVar.a = z;
            anaVar.g();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new o03(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
