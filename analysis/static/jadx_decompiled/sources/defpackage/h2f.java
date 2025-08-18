package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class h2f extends AnimatorListenerAdapter implements v1f {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public h2f(View view, View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(gvb.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(gvb.transition_position, null);
        }
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void b() {
        if (this.c == null) {
            this.c = new int[2];
        }
        int[] iArr = this.c;
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(gvb.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
        e(w1fVar);
    }

    @Override // defpackage.v1f
    public final void e(w1f w1fVar) {
        if (this.h) {
            return;
        }
        this.a.setTag(gvb.transition_position, null);
    }

    @Override // defpackage.v1f
    public final void f() {
        float f = this.d;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.e);
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
