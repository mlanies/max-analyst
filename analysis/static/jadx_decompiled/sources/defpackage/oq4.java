package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class oq4 extends Transition {
    public static final float[] o = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[8];

    public oq4(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof na6)) {
            return null;
        }
        na6 na6Var = (na6) view;
        ((la6) na6Var.getHierarchy()).n(wnc.b(this.a));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new nq4(this, na6Var));
        valueAnimatorOfFloat.addListener(new eh(this, na6Var, false, 2));
        return valueAnimatorOfFloat;
    }
}
