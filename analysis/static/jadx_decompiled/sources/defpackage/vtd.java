package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class vtd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l17 b;

    public /* synthetic */ vtd(l17 l17Var, int i) {
        this.a = i;
        this.b = l17Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ptd ptdVar = (ptd) this.b;
                ptdVar.H0.setTextColor(f8.G(ptdVar.H0.getCurrentTextColor(), fFloatValue));
                break;
            default:
                ((ptd) this.b).H0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
