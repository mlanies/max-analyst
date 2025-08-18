package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class tb4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ dec b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ yb4 e;

    public tb4(yb4 yb4Var, dec decVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = yb4Var;
        this.b = decVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                yb4 yb4Var = this.e;
                yb4Var.l();
                dec decVar = this.b;
                yb4Var.c(decVar);
                yb4Var.q.remove(decVar);
                yb4Var.i();
                break;
            default:
                this.d.setListener(null);
                yb4 yb4Var2 = this.e;
                dec decVar2 = this.b;
                yb4Var2.c(decVar2);
                yb4Var2.o.remove(decVar2);
                yb4Var2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public tb4(yb4 yb4Var, dec decVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = yb4Var;
        this.b = decVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
