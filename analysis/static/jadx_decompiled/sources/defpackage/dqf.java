package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class dqf extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public dqf(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void b() {
        h(false);
        if (this.f) {
            return;
        }
        l12 l12Var = ppf.a;
        this.a.setTransitionVisibility(this.b);
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
        w1fVar.D(this);
    }

    @Override // defpackage.v1f
    public final void f() {
        h(true);
        if (this.f) {
            return;
        }
        l12 l12Var = ppf.a;
        this.a.setTransitionVisibility(0);
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        gnf.b(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            l12 l12Var = ppf.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            l12 l12Var = ppf.a;
            this.a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f) {
            l12 l12Var = ppf.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }
}
