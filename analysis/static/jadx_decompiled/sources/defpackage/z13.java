package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class z13 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a23 b;

    public /* synthetic */ z13(a23 a23Var, int i) {
        this.a = i;
        this.b = a23Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                a23 a23Var = this.b;
                a23Var.x();
                le leVar = a23Var.v0;
                if (leVar != null) {
                    leVar.a((tz6) a23Var.b);
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
                a23 a23Var = this.b;
                a23Var.s0 = (a23Var.s0 + 4) % a23Var.Z.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
