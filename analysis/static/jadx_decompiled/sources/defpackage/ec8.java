package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ec8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc8 b;

    public /* synthetic */ ec8(hc8 hc8Var, int i) {
        this.a = i;
        this.b = hc8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = this.b.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), iIntValue);
                return;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                MediaKeyboardWidget mediaKeyboardWidgetD = this.b.d();
                if (mediaKeyboardWidgetD == null || (view = mediaKeyboardWidgetD.getView()) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iIntValue2;
                view.setLayoutParams(layoutParams);
                return;
        }
    }
}
