package defpackage;

import android.animation.ValueAnimator;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ jf(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((OneMeButton) this.c).setTranslationY(fFloatValue);
                ((OneMeButton) this.o).setTranslationY((-this.b) + fFloatValue);
                break;
            case 1:
                f6b.d((f6b) this.c, (a66) this.o, this.b, valueAnimator);
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                tge tgeVar = (tge) this.c;
                tgeVar.q().offsetTopAndBottom(iIntValue - tgeVar.k());
                ((a66) this.o).invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(this.b));
                break;
        }
    }
}
