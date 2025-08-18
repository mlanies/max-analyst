package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class pwc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public pwc(iwc iwcVar, float f) {
        this.a = iwcVar;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.setTranslationY(fFloatValue);
        float f = this.b;
        if (valueAnimator.getAnimatedFraction() >= (f != 0.0f ? 1.0f - f : 0.0f)) {
            view.setAlpha(1 - valueAnimator.getAnimatedFraction());
        }
    }
}
