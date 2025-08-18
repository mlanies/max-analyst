package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class fsf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GradientDrawable b;

    public /* synthetic */ fsf(GradientDrawable gradientDrawable, int i) {
        this.a = i;
        this.b = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                GradientDrawable gradientDrawable = this.b;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
                break;
            default:
                GradientDrawable gradientDrawable2 = this.b;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    break;
                }
                break;
        }
    }
}
