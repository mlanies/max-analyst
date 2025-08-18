package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class w33 extends Transition {
    public final Rect a;
    public final boolean b;

    public w33(Rect rect, boolean z) {
        this.a = rect;
        this.b = z;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !(transitionValues.view instanceof na6)) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new yl(this, 2, transitionValues));
        valueAnimatorOfFloat.addListener(new eh(this, transitionValues, false, 1));
        return valueAnimatorOfFloat;
    }
}
