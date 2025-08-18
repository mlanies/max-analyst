package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class vb4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb4 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ yb4 e;

    public /* synthetic */ vb4(yb4 yb4Var, wb4 wb4Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = yb4Var;
        this.b = wb4Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                wb4 wb4Var = this.b;
                dec decVar = wb4Var.a;
                yb4 yb4Var = this.e;
                yb4Var.c(decVar);
                yb4Var.r.remove(wb4Var.a);
                yb4Var.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                wb4 wb4Var2 = this.b;
                dec decVar2 = wb4Var2.b;
                yb4 yb4Var2 = this.e;
                yb4Var2.c(decVar2);
                yb4Var2.r.remove(wb4Var2.b);
                yb4Var2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                dec decVar = this.b.a;
                this.e.getClass();
                break;
            default:
                dec decVar2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
