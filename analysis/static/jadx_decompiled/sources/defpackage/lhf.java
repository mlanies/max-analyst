package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final /* synthetic */ class lhf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ohf b;

    public /* synthetic */ lhf(ohf ohfVar, int i) {
        this.a = i;
        this.b = ohfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohf ohfVar = this.b;
                ohfVar.B0 = fFloatValue;
                ohfVar.invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ohf ohfVar2 = this.b;
                ohfVar2.z0 = fFloatValue2;
                ohfVar2.postInvalidateOnAnimation();
                break;
        }
    }
}
