package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public final class qmc extends AnimatorListenerAdapter {
    public final /* synthetic */ bk1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RootController c;

    public qmc(bk1 bk1Var, boolean z, RootController rootController) {
        this.a = bk1Var;
        this.b = z;
        this.c = rootController;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        bc7[] bc7VarArr = RootController.u0;
        this.c.r0(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bc7[] bc7VarArr = RootController.u0;
        this.c.r0(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        bk1 bk1Var = this.a;
        if (bk1Var != null) {
            bk1Var.b(z);
        }
        bc7[] bc7VarArr = RootController.u0;
        RootController rootController = this.c;
        rootController.u0().setTranslationY(0.0f);
        rootController.w0(z);
    }
}
