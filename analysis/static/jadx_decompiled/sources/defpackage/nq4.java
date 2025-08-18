package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class nq4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ na6 a;
    public final /* synthetic */ oq4 b;

    public nq4(oq4 oq4Var, na6 na6Var) {
        this.b = oq4Var;
        this.a = na6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            oq4 oq4Var = this.b;
            if (i >= 8) {
                ((la6) this.a.getHierarchy()).n(wnc.b(oq4Var.c));
                return;
            }
            oq4Var.c[i] = (oq4Var.b[i] * fFloatValue) + ((1.0f - fFloatValue) * oq4Var.a[i]);
            i++;
        }
    }
}
