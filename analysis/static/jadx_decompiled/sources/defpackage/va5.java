package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class va5 extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public boolean b = false;

    public va5(View view) {
        this.a = view;
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void b() {
        float transitionAlpha;
        View view = this.a;
        if (view.getVisibility() == 0) {
            l12 l12Var = ppf.a;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(gvb.transition_pause_alpha, Float.valueOf(transitionAlpha));
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void d(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void f() {
        this.a.setTag(gvb.transition_pause_alpha, null);
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        l12 l12Var = ppf.a;
        this.a.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        l12 l12Var = ppf.a;
        view.setTransitionAlpha(1.0f);
    }
}
