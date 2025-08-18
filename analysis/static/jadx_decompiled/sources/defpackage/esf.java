package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class esf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsf b;

    public /* synthetic */ esf(lsf lsfVar, int i) {
        this.a = i;
        this.b = lsfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.x0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                this.b.v0.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.x0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
