package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class rv8 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv8 b;

    public /* synthetic */ rv8(sv8 sv8Var, int i) {
        this.a = i;
        this.b = sv8Var;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.v0.setAlpha(1.0f);
                break;
            case 2:
                this.b.v0.setAlpha(1.0f);
                break;
            case 4:
                this.b.v0.setAlpha(1.0f);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                sv8 sv8Var = this.b;
                sv8Var.v0.setAlpha(0.0f);
                sv8Var.v0.setVisibility(0);
                break;
            case 2:
                break;
            case 3:
                sv8 sv8Var2 = this.b;
                sv8Var2.v0.setAlpha(0.0f);
                sv8Var2.v0.setVisibility(0);
                sv8Var2.b.setTranslationX(0.0f);
                break;
            case 4:
                break;
            case 5:
                sv8 sv8Var3 = this.b;
                sv8Var3.c.setTranslationX(0.0f);
                sv8Var3.b.setTranslationX(0.0f);
                sv8Var3.v0.setVisibility(0);
                break;
            default:
                this.b.v0.setVisibility(4);
                break;
        }
    }
}
