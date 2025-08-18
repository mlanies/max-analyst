package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.btb;
import defpackage.h3c;
import defpackage.j2c;
import defpackage.lnc;
import defpackage.nsb;
import defpackage.ob6;
import defpackage.qz7;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] t0 = {R.attr.colorBackground};
    public static final ob6 u0 = new ob6();
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect o;
    public final qz7 s0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        int i = nsb.cardViewStyle;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.o = new Rect();
        qz7 qz7Var = new qz7(this);
        this.s0 = qz7Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3c.CardView, i, j2c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(h3c.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(h3c.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(t0);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(btb.cardview_light_background) : getResources().getColor(btb.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(h3c.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(h3c.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(h3c.CardView_cardMaxElevation, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(h3c.CardView_cardUseCompatPadding, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(h3c.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(h3c.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        ob6 ob6Var = u0;
        lnc lncVar = new lnc(colorStateListValueOf, dimension);
        qz7Var.b = lncVar;
        setBackgroundDrawable(lncVar);
        setClipToOutline(true);
        setElevation(dimension2);
        ob6Var.m(qz7Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((lnc) ((Drawable) this.s0.b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.s0.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((lnc) ((Drawable) this.s0.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((lnc) ((Drawable) this.s0.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        lnc lncVar = (lnc) ((Drawable) this.s0.b);
        if (colorStateListValueOf == null) {
            lncVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        lncVar.h = colorStateListValueOf;
        lncVar.b.setColor(colorStateListValueOf.getColorForState(lncVar.getState(), lncVar.h.getDefaultColor()));
        lncVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.s0.c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        u0.m(this.s0, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            ob6 ob6Var = u0;
            qz7 qz7Var = this.s0;
            ob6Var.m(qz7Var, ((lnc) ((Drawable) qz7Var.b)).e);
        }
    }

    public void setRadius(float f) {
        lnc lncVar = (lnc) ((Drawable) this.s0.b);
        if (f == lncVar.a) {
            return;
        }
        lncVar.a = f;
        lncVar.b(null);
        lncVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            ob6 ob6Var = u0;
            qz7 qz7Var = this.s0;
            ob6Var.m(qz7Var, ((lnc) ((Drawable) qz7Var.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        lnc lncVar = (lnc) ((Drawable) this.s0.b);
        if (colorStateList == null) {
            lncVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        lncVar.h = colorStateList;
        lncVar.b.setColor(colorStateList.getColorForState(lncVar.getState(), lncVar.h.getDefaultColor()));
        lncVar.invalidateSelf();
    }
}
