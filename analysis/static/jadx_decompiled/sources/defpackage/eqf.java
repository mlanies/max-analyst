package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class eqf extends AnimatorListenerAdapter implements v1f {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ gqf e;

    public eqf(gqf gqfVar, ViewGroup viewGroup, View view, View view2) {
        this.e = gqfVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void b() {
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
        w1fVar.D(this);
    }

    @Override // defpackage.v1f
    public final void f() {
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(gvb.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            int i = gvb.save_overlay_view;
            View view2 = this.b;
            view.setTag(i, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }
}
