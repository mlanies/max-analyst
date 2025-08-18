package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public final class p6c extends Visibility {
    public static final PathInterpolator b = new PathInterpolator(0.9f, 0.0f, 0.66f, 1.0f);
    public final k56 a;

    public p6c(a6c a6cVar) {
        this.a = a6cVar;
    }

    public final AnimatorSet a(View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        au4 au4Var = kwd.r;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new m6c(view, au4Var, f2));
        view.setScaleX(f);
        au4 au4Var2 = kwd.s;
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        addListener(new m6c(view, au4Var2, f2));
        view.setScaleY(f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(b);
        addListener(new o6c(view, f));
        valueAnimatorOfFloat.addUpdateListener(new zf(view, 5));
        animatorSet.playTogether(duration, duration2, valueAnimatorOfFloat);
        animatorSet.addListener(new n6c(z, this, view));
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, true);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, false);
    }
}
