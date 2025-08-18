package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.SeekBar;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class usd extends ck0 {
    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.h1;
    }

    public int getFocusedThumbIndex() {
        return this.i1;
    }

    public int getHaloRadius() {
        return this.U0;
    }

    public ColorStateList getHaloTintList() {
        return this.r1;
    }

    public int getLabelBehavior() {
        return this.P0;
    }

    public float getStepSize() {
        return this.j1;
    }

    public float getThumbElevation() {
        return this.z1.a.n;
    }

    public int getThumbHeight() {
        return this.T0;
    }

    @Override // defpackage.ck0
    public int getThumbRadius() {
        return this.S0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.z1.a.d;
    }

    public float getThumbStrokeWidth() {
        return this.z1.a.k;
    }

    public ColorStateList getThumbTintList() {
        return this.z1.a.c;
    }

    public int getThumbTrackGapSize() {
        return this.V0;
    }

    public int getThumbWidth() {
        return this.S0;
    }

    public int getTickActiveRadius() {
        return this.m1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.s1;
    }

    public int getTickInactiveRadius() {
        return this.n1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.t1;
    }

    public ColorStateList getTickTintList() {
        if (this.t1.equals(this.s1)) {
            return this.s1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.u1;
    }

    public int getTrackHeight() {
        return this.Q0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.v1;
    }

    public int getTrackInsideCornerSize() {
        return this.Z0;
    }

    public int getTrackSidePadding() {
        return this.R0;
    }

    public int getTrackStopIndicatorSize() {
        return this.Y0;
    }

    public ColorStateList getTrackTintList() {
        if (this.v1.equals(this.u1)) {
            return this.u1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.o1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // defpackage.ck0
    public float getValueFrom() {
        return this.e1;
    }

    @Override // defpackage.ck0
    public float getValueTo() {
        return this.f1;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    @Override // defpackage.ck0, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.g1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.i1 = i;
        this.v0.w(i);
        postInvalidate();
    }

    @Override // defpackage.ck0
    public void setHaloRadius(int i) {
        if (i == this.U0) {
            return;
        }
        this.U0 = i;
        Drawable background = getBackground();
        if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.U0);
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.ck0
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.r1)) {
            return;
        }
        this.r1 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.o;
        paint.setColor(h(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    @Override // defpackage.ck0
    public void setLabelBehavior(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(pd7 pd7Var) {
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.j1 != f) {
                this.j1 = f;
                this.q1 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.e1 + ")-valueTo(" + this.f1 + ") range");
    }

    @Override // defpackage.ck0
    public void setThumbElevation(float f) {
        this.z1.k(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // defpackage.ck0
    public void setThumbHeight(int i) {
        if (i == this.T0) {
            return;
        }
        this.T0 = i;
        this.z1.setBounds(0, 0, this.S0, i);
        Drawable drawable = this.A1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.B1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.ck0
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.z1.n(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(z7.n(getContext(), i));
        }
    }

    @Override // defpackage.ck0
    public void setThumbStrokeWidth(float f) {
        q18 q18Var = this.z1;
        q18Var.a.k = f;
        q18Var.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        q18 q18Var = this.z1;
        if (colorStateList.equals(q18Var.a.c)) {
            return;
        }
        q18Var.l(colorStateList);
        invalidate();
    }

    @Override // defpackage.ck0
    public void setThumbTrackGapSize(int i) {
        if (this.V0 == i) {
            return;
        }
        this.V0 = i;
        invalidate();
    }

    @Override // defpackage.ck0
    public void setThumbWidth(int i) {
        if (i == this.S0) {
            return;
        }
        this.S0 = i;
        q18 q18Var = this.z1;
        vu4 vu4Var = new vu4();
        vu4 vu4Var2 = new vu4();
        vu4 vu4Var3 = new vu4();
        vu4 vu4Var4 = new vu4();
        float f = this.S0 / 2.0f;
        hm9 hm9VarF = nu0.f(0);
        i8g.d(hm9VarF);
        i8g.d(hm9VarF);
        i8g.d(hm9VarF);
        i8g.d(hm9VarF);
        a0 a0Var = new a0(f);
        a0 a0Var2 = new a0(f);
        a0 a0Var3 = new a0(f);
        a0 a0Var4 = new a0(f);
        gjd gjdVar = new gjd();
        gjdVar.a = hm9VarF;
        gjdVar.b = hm9VarF;
        gjdVar.c = hm9VarF;
        gjdVar.d = hm9VarF;
        gjdVar.e = a0Var;
        gjdVar.f = a0Var2;
        gjdVar.g = a0Var3;
        gjdVar.h = a0Var4;
        gjdVar.i = vu4Var;
        gjdVar.j = vu4Var2;
        gjdVar.k = vu4Var3;
        gjdVar.l = vu4Var4;
        q18Var.setShapeAppearanceModel(gjdVar);
        q18Var.setBounds(0, 0, this.S0, this.T0);
        Drawable drawable = this.A1;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.B1.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        y();
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.ck0
    public void setTickActiveRadius(int i) {
        if (this.m1 != i) {
            this.m1 = i;
            this.t0.setStrokeWidth(i * 2);
            y();
        }
    }

    @Override // defpackage.ck0
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.s1)) {
            return;
        }
        this.s1 = colorStateList;
        this.t0.setColor(h(colorStateList));
        invalidate();
    }

    @Override // defpackage.ck0
    public void setTickInactiveRadius(int i) {
        if (this.n1 != i) {
            this.n1 = i;
            this.s0.setStrokeWidth(i * 2);
            y();
        }
    }

    @Override // defpackage.ck0
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.t1)) {
            return;
        }
        this.t1 = colorStateList;
        this.s0.setColor(h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.l1 != z) {
            this.l1 = z;
            postInvalidate();
        }
    }

    @Override // defpackage.ck0
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.u1)) {
            return;
        }
        this.u1 = colorStateList;
        this.b.setColor(h(colorStateList));
        this.u0.setColor(h(this.u1));
        invalidate();
    }

    @Override // defpackage.ck0
    public void setTrackHeight(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            this.a.setStrokeWidth(i);
            this.b.setStrokeWidth(this.Q0);
            y();
        }
    }

    @Override // defpackage.ck0
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.v1)) {
            return;
        }
        this.v1 = colorStateList;
        this.a.setColor(h(colorStateList));
        invalidate();
    }

    @Override // defpackage.ck0
    public void setTrackInsideCornerSize(int i) {
        if (this.Z0 == i) {
            return;
        }
        this.Z0 = i;
        invalidate();
    }

    @Override // defpackage.ck0
    public void setTrackStopIndicatorSize(int i) {
        if (this.Y0 == i) {
            return;
        }
        this.Y0 = i;
        this.u0.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.e1 = f;
        this.q1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f1 = f;
        this.q1 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.A1 = drawableNewDrawable;
        this.B1.clear();
        postInvalidate();
    }
}
