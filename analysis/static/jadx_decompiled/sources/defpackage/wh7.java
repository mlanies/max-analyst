package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wh7 extends sj0 {
    public static final int A0 = m2c.Widget_MaterialComponents_LinearProgressIndicator;

    @Override // defpackage.sj0
    public final tj0 a(Context context, AttributeSet attributeSet) {
        int i = tsb.linearProgressIndicatorStyle;
        int i2 = A0;
        xh7 xh7Var = new xh7(context, attributeSet, i, i2);
        int[] iArr = z2c.LinearProgressIndicator;
        int i3 = tsb.linearProgressIndicatorStyle;
        sre.a(context, attributeSet, i3, i2);
        sre.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        xh7Var.h = typedArrayObtainStyledAttributes.getInt(z2c.LinearProgressIndicator_indeterminateAnimationType, 1);
        xh7Var.i = typedArrayObtainStyledAttributes.getInt(z2c.LinearProgressIndicator_indicatorDirectionLinear, 0);
        xh7Var.k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.LinearProgressIndicator_trackStopIndicatorSize, 0), xh7Var.a);
        typedArrayObtainStyledAttributes.recycle();
        xh7Var.a();
        xh7Var.j = xh7Var.i == 1;
        return xh7Var;
    }

    @Override // defpackage.sj0
    public final void b(int i) {
        tj0 tj0Var = this.a;
        if (tj0Var != null && ((xh7) tj0Var).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((xh7) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((xh7) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((xh7) this.a).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        tj0 tj0Var = this.a;
        xh7 xh7Var = (xh7) tj0Var;
        boolean z2 = true;
        if (((xh7) tj0Var).i != 1) {
            WeakHashMap weakHashMap = zmf.a;
            if ((getLayoutDirection() != 1 || ((xh7) tj0Var).i != 2) && (getLayoutDirection() != 0 || ((xh7) tj0Var).i != 3)) {
                z2 = false;
            }
        }
        xh7Var.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        tz6 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        di4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        tj0 tj0Var = this.a;
        if (((xh7) tj0Var).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((xh7) tj0Var).h = i;
        ((xh7) tj0Var).a();
        if (i == 0) {
            tz6 indeterminateDrawable = getIndeterminateDrawable();
            oh7 oh7Var = new oh7((xh7) tj0Var);
            indeterminateDrawable.x0 = oh7Var;
            oh7Var.b = indeterminateDrawable;
        } else {
            tz6 indeterminateDrawable2 = getIndeterminateDrawable();
            qh7 qh7Var = new qh7(getContext(), (xh7) tj0Var);
            indeterminateDrawable2.x0 = qh7Var;
            qh7Var.b = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // defpackage.sj0
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((xh7) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        tj0 tj0Var = this.a;
        ((xh7) tj0Var).i = i;
        xh7 xh7Var = (xh7) tj0Var;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = zmf.a;
            if ((getLayoutDirection() != 1 || ((xh7) tj0Var).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        xh7Var.j = z;
        invalidate();
    }

    @Override // defpackage.sj0
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((xh7) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        tj0 tj0Var = this.a;
        if (((xh7) tj0Var).k != i) {
            ((xh7) tj0Var).k = Math.min(i, ((xh7) tj0Var).a);
            ((xh7) tj0Var).a();
            invalidate();
        }
    }
}
