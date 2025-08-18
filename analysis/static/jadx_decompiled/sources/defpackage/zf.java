package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class zf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ zf(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue;
        switch (this.a) {
            case 0:
                Object animatedValue = valueAnimator.getAnimatedValue("top");
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                View view = this.b;
                int iIntValue2 = 0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    iIntValue = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                }
                Object animatedValue2 = valueAnimator.getAnimatedValue("bottom");
                Integer num2 = animatedValue2 instanceof Integer ? (Integer) animatedValue2 : null;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        iIntValue2 = marginLayoutParams2.bottomMargin;
                    }
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams3.topMargin = iIntValue;
                marginLayoutParams3.bottomMargin = iIntValue2;
                view.setLayoutParams(marginLayoutParams3);
                return;
            case 1:
                View view2 = this.b;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams4.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view2.setLayoutParams(marginLayoutParams4);
                return;
            case 2:
                View view3 = this.b;
                ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams5.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view3.setLayoutParams(marginLayoutParams5);
                return;
            case 3:
                dy7.H(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                this.b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
