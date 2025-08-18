package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.aq4;
import defpackage.i24;
import defpackage.ky6;
import defpackage.m2c;
import defpackage.nu0;
import defpackage.oag;
import defpackage.omf;
import defpackage.q18;
import defpackage.sre;
import defpackage.tsb;
import defpackage.wq8;
import defpackage.y18;
import defpackage.z2c;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int n1 = m2c.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] o1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer i1;
    public boolean j1;
    public boolean k1;
    public ImageView.ScaleType l1;
    public Boolean m1;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        int i = tsb.toolbarStyle;
        int i2 = n1;
        super(y18.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayD.hasValue(z2c.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(z2c.MaterialToolbar_navigationIconTint, -1));
        }
        this.j1 = typedArrayD.getBoolean(z2c.MaterialToolbar_titleCentered, false);
        this.k1 = typedArrayD.getBoolean(z2c.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayD.getInt(z2c.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = o1;
            if (i3 < scaleTypeArr.length) {
                this.l1 = scaleTypeArr[i3];
            }
        }
        if (typedArrayD.hasValue(z2c.MaterialToolbar_logoAdjustViewBounds)) {
            this.m1 = Boolean.valueOf(typedArrayD.getBoolean(z2c.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : oag.r(background);
        if (colorStateListValueOf != null) {
            q18 q18Var = new q18();
            q18Var.l(colorStateListValueOf);
            q18Var.j(context2);
            WeakHashMap weakHashMap = zmf.a;
            q18Var.k(omf.i(this));
            setBackground(q18Var);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.l1;
    }

    public Integer getNavigationIconTint() {
        return this.i1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof wq8;
        if (z) {
            ((wq8) menu).w();
        }
        super.m(i);
        if (z) {
            ((wq8) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof q18) {
            nu0.N(this, (q18) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.j1 || this.k1) {
            ArrayList arrayListQ = i24.q(this, getTitle());
            boolean zIsEmpty = arrayListQ.isEmpty();
            ky6 ky6Var = i24.f;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListQ, ky6Var);
            ArrayList arrayListQ2 = i24.q(this, getSubtitle());
            TextView textView2 = arrayListQ2.isEmpty() ? null : (TextView) Collections.max(arrayListQ2, ky6Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.j1 && textView != null) {
                    y(textView, pair);
                }
                if (this.k1 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.m1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.l1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof q18) {
            ((q18) background).k(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.m1;
        if (bool == null || bool.booleanValue() != z) {
            this.m1 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.l1 != scaleType) {
            this.l1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.i1 != null) {
            drawable = drawable.mutate();
            aq4.g(drawable, this.i1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.i1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
