package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class b77 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final dec e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ dec o;
    public final /* synthetic */ f77 p;

    public b77(f77 f77Var, dec decVar, int i, float f, float f2, float f3, float f4, int i2, dec decVar2) {
        this.p = f77Var;
        this.n = i2;
        this.o = decVar2;
        this.f = i;
        this.e = decVar;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new yj0(5, this));
        valueAnimatorOfFloat.setTarget(decVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.v(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        dec decVar = this.o;
        f77 f77Var = this.p;
        if (i <= 0) {
            f77Var.x0.a(f77Var.C0, decVar);
        } else {
            f77Var.a.add(decVar.a);
            this.h = true;
            if (i > 0) {
                f77Var.C0.post(new i76(f77Var, this, i));
            }
        }
        View view = f77Var.H0;
        View view2 = decVar.a;
        if (view == view2) {
            f77Var.r(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
