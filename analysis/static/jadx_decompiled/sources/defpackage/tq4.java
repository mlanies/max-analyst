package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class tq4 extends Transition {
    public final rsc a;
    public final rsc b;
    public final PointF c = null;
    public final PointF o = null;

    public tq4(fm9 fm9Var, fm9 fm9Var2) {
        this.a = fm9Var;
        this.b = fm9Var2;
    }

    public static void a(TransitionValues transitionValues) {
        if (transitionValues.view instanceof na6) {
            transitionValues.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues.view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet b(fm9 fm9Var, fm9 fm9Var2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new tq4(fm9Var, fm9Var2));
        return transitionSet;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            Rect rect = (Rect) transitionValues.values.get("draweeTransition:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("draweeTransition:bounds");
            if (rect != null && rect2 != null) {
                rsc rscVar = this.a;
                rsc rscVar2 = this.b;
                if (rscVar == rscVar2 && this.c == this.o) {
                    return null;
                }
                na6 na6Var = (na6) transitionValues.view;
                qsc qscVar = new qsc((fm9) rscVar, (fm9) rscVar2, rect, rect2);
                ((la6) na6Var.getHierarchy()).h(qscVar);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new yj0(3, qscVar));
                valueAnimatorOfFloat.addListener(new eh(this, na6Var, false, 3));
                return valueAnimatorOfFloat;
            }
        }
        return null;
    }
}
