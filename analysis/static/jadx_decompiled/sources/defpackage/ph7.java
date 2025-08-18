package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class ph7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh7 b;

    public /* synthetic */ ph7(qh7 qh7Var, int i) {
        this.a = i;
        this.b = qh7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                qh7 qh7Var = this.b;
                qh7Var.x();
                le leVar = qh7Var.v0;
                if (leVar != null) {
                    leVar.a((tz6) qh7Var.b);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                qh7 qh7Var = this.b;
                qh7Var.s0 = (qh7Var.s0 + 1) % qh7Var.Z.c.length;
                qh7Var.t0 = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
