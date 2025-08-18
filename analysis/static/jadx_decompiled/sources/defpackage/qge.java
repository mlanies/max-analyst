package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class qge implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rge b;

    public /* synthetic */ qge(rge rgeVar, int i) {
        this.a = i;
        this.b = rgeVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
