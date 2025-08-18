package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d18 {
    public final MaterialButton a;
    public gjd b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public q18 m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public d18(MaterialButton materialButton, gjd gjdVar) {
        this.a = materialButton;
        this.b = gjdVar;
    }

    public final rjd a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (rjd) this.s.getDrawable(2) : (rjd) this.s.getDrawable(1);
    }

    public final q18 b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (q18) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(gjd gjdVar) {
        this.b = gjdVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(gjdVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(gjdVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(gjdVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = zmf.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        q18 q18Var = new q18(this.b);
        MaterialButton materialButton = this.a;
        q18Var.j(materialButton.getContext());
        aq4.h(q18Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            aq4.i(q18Var, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        q18Var.a.k = f;
        q18Var.invalidateSelf();
        q18Var.n(colorStateList);
        q18 q18Var2 = new q18(this.b);
        q18Var2.setTint(0);
        float f2 = this.h;
        int iZ = this.n ? mr0.z(materialButton, tsb.colorSurface) : 0;
        q18Var2.a.k = f2;
        q18Var2.invalidateSelf();
        q18Var2.n(ColorStateList.valueOf(iZ));
        q18 q18Var3 = new q18(this.b);
        this.m = q18Var3;
        aq4.g(q18Var3, -1);
        ColorStateList colorStateListValueOf = this.l;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{q18Var2, q18Var}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        q18 q18VarB = b(false);
        if (q18VarB != null) {
            q18VarB.k(this.t);
            q18VarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        q18 q18VarB = b(false);
        q18 q18VarB2 = b(true);
        if (q18VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            q18VarB.a.k = f;
            q18VarB.invalidateSelf();
            q18VarB.n(colorStateList);
            if (q18VarB2 != null) {
                float f2 = this.h;
                int iZ = this.n ? mr0.z(this.a, tsb.colorSurface) : 0;
                q18VarB2.a.k = f2;
                q18VarB2.invalidateSelf();
                q18VarB2.n(ColorStateList.valueOf(iZ));
            }
        }
    }
}
