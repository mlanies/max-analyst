package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s08 extends sc {
    public static final int e = tsb.alertDialogStyle;
    public static final int f = m2c.MaterialAlertDialog_MaterialComponents;
    public static final int g = tsb.materialAlertDialogTheme;
    public final q18 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public s08(Context context) {
        int i = g;
        TypedValue typedValueC = kq0.C(context, i);
        int i2 = typedValueC == null ? 0 : typedValueC.data;
        int i3 = e;
        int i4 = f;
        Context contextA = y18.a(context, null, i3, i4);
        contextA = i2 != 0 ? new du3(contextA, i2) : contextA;
        TypedValue typedValueC2 = kq0.C(context, i);
        super(contextA, typedValueC2 == null ? 0 : typedValueC2.data);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = z2c.MaterialAlertDialog;
        sre.a(context2, null, i3, i4);
        sre.b(context2, null, iArr, i3, i4, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i3, i4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.MaterialAlertDialog_backgroundInsetStart, context2.getResources().getDimensionPixelSize(stb.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.MaterialAlertDialog_backgroundInsetTop, context2.getResources().getDimensionPixelSize(stb.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.MaterialAlertDialog_backgroundInsetEnd, context2.getResources().getDimensionPixelSize(stb.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.MaterialAlertDialog_backgroundInsetBottom, context2.getResources().getDimensionPixelSize(stb.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int iY = mr0.y(tsb.colorSurface, context2, s08.class.getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, z2c.MaterialAlertDialog, i3, i4);
        int color = typedArrayObtainStyledAttributes2.getColor(z2c.MaterialAlertDialog_backgroundTint, iY);
        typedArrayObtainStyledAttributes2.recycle();
        q18 q18Var = new q18(context2, null, i3, i4);
        q18Var.j(context2);
        q18Var.l(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            i8g i8gVarE = q18Var.a.a.e();
            i8gVarE.e = new a0(dimension);
            i8gVarE.f = new a0(dimension);
            i8gVarE.g = new a0(dimension);
            i8gVarE.h = new a0(dimension);
            q18Var.setShapeAppearanceModel(i8gVarE.c());
        }
        this.c = q18Var;
    }

    public final void b(int i) {
        oc ocVar = this.a;
        ocVar.f = ocVar.a.getText(i);
    }

    public final s08 c(int i, p46 p46Var) {
        return (s08) super.setNegativeButton(i, p46Var);
    }

    @Override // defpackage.sc
    public final tc create() {
        tc tcVarCreate = super.create();
        Window window = tcVarCreate.getWindow();
        View decorView = window.getDecorView();
        q18 q18Var = this.c;
        if (q18Var instanceof q18) {
            WeakHashMap weakHashMap = zmf.a;
            q18Var.k(omf.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) q18Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new t27(tcVarCreate, rect));
        return tcVarCreate;
    }

    public final s08 d(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setPositiveButton(i, onClickListener);
    }

    public final s08 e(CharSequence charSequence) {
        return (s08) super.setTitle(charSequence);
    }

    public final s08 f(View view) {
        return (s08) super.setView(view);
    }

    @Override // defpackage.sc
    public final sc setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setNegativeButton(i, onClickListener);
    }

    @Override // defpackage.sc
    public final sc setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (s08) super.setPositiveButton(i, onClickListener);
    }

    @Override // defpackage.sc
    public final sc setTitle(CharSequence charSequence) {
        return (s08) super.setTitle(charSequence);
    }

    @Override // defpackage.sc
    public final sc setView(View view) {
        return (s08) super.setView(view);
    }
}
