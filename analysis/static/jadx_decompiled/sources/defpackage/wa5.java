package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class wa5 extends gqf {
    public wa5(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.R0 = i;
    }

    public static float V(g2f g2fVar, float f) {
        Float f2;
        return (g2fVar == null || (f2 = (Float) g2fVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.gqf
    public final ObjectAnimator S(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2) {
        l12 l12Var = ppf.a;
        return U(view, V(g2fVar, 0.0f), 1.0f);
    }

    @Override // defpackage.gqf
    public final ObjectAnimator T(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2) {
        l12 l12Var = ppf.a;
        ObjectAnimator objectAnimatorU = U(view, V(g2fVar, 1.0f), 0.0f);
        if (objectAnimatorU == null) {
            view.setTransitionAlpha(V(g2fVar2, 1.0f));
        }
        return objectAnimatorU;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        l12 l12Var = ppf.a;
        view.setTransitionAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ppf.a, f2);
        va5 va5Var = new va5(view);
        objectAnimatorOfFloat.addListener(va5Var);
        s().a(va5Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.w1f
    public final void h(g2f g2fVar) {
        gqf.Q(g2fVar);
        int i = gvb.transition_pause_alpha;
        View view = g2fVar.b;
        Float fValueOf = (Float) view.getTag(i);
        if (fValueOf == null) {
            if (view.getVisibility() == 0) {
                l12 l12Var = ppf.a;
                fValueOf = Float.valueOf(view.getTransitionAlpha());
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        g2fVar.a.put("android:fade:transitionAlpha", fValueOf);
    }
}
