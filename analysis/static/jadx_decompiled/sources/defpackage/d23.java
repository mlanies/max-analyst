package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class d23 extends sj0 {
    public static final int A0 = m2c.Widget_MaterialComponents_CircularProgressIndicator;

    @Override // defpackage.sj0
    public final tj0 a(Context context, AttributeSet attributeSet) {
        return new e23(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((e23) this.a).j;
    }

    public int getIndicatorInset() {
        return ((e23) this.a).i;
    }

    public int getIndicatorSize() {
        return ((e23) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((e23) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        tj0 tj0Var = this.a;
        if (((e23) tj0Var).i != i) {
            ((e23) tj0Var).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        tj0 tj0Var = this.a;
        if (((e23) tj0Var).h != iMax) {
            ((e23) tj0Var).h = iMax;
            ((e23) tj0Var).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.sj0
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((e23) this.a).a();
    }
}
