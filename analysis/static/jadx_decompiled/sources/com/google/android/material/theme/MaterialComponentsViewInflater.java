package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import defpackage.fd3;
import defpackage.jm;
import defpackage.ju0;
import defpackage.kq0;
import defpackage.l18;
import defpackage.mn;
import defpackage.o18;
import defpackage.so;
import defpackage.sre;
import defpackage.tsb;
import defpackage.u08;
import defpackage.x18;
import defpackage.y18;
import defpackage.z2c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends so {
    @Override // defpackage.so
    public final jm a(Context context, AttributeSet attributeSet) {
        return new u08(context, attributeSet);
    }

    @Override // defpackage.so
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.so
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new l18(context, attributeSet);
    }

    @Override // defpackage.so
    public final mn d(Context context, AttributeSet attributeSet) {
        int i = tsb.radioButtonStyle;
        int i2 = o18.u0;
        o18 o18Var = new o18(y18.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = o18Var.getContext();
        TypedArray typedArrayD = sre.d(context2, attributeSet, z2c.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayD.hasValue(z2c.MaterialRadioButton_buttonTint)) {
            fd3.c(o18Var, ju0.q(context2, typedArrayD, z2c.MaterialRadioButton_buttonTint));
        }
        o18Var.t0 = typedArrayD.getBoolean(z2c.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
        return o18Var;
    }

    @Override // defpackage.so
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        x18 x18Var = new x18(y18.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = x18Var.getContext();
        if (kq0.E(tsb.textAppearanceLineHeightEnabled, context2, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, z2c.MaterialTextView, R.attr.textViewStyle, 0);
            int[] iArr = {z2c.MaterialTextView_android_lineHeight, z2c.MaterialTextView_lineHeight};
            int iR = -1;
            for (int i = 0; i < 2 && iR < 0; i++) {
                iR = ju0.r(context2, typedArrayObtainStyledAttributes, iArr[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, z2c.MaterialTextView, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(z2c.MaterialTextView_android_textAppearance, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, z2c.MaterialTextAppearance);
                    Context context3 = x18Var.getContext();
                    int[] iArr2 = {z2c.MaterialTextAppearance_android_lineHeight, z2c.MaterialTextAppearance_lineHeight};
                    int iR2 = -1;
                    for (int i2 = 0; i2 < 2 && iR2 < 0; i2++) {
                        iR2 = ju0.r(context3, typedArrayObtainStyledAttributes3, iArr2[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iR2 >= 0) {
                        x18Var.setLineHeight(iR2);
                    }
                }
            }
        }
        return x18Var;
    }
}
