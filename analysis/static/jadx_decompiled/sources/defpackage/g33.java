package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class g33 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h33 b;

    public /* synthetic */ g33(h33 h33Var, int i) {
        this.a = i;
        this.b = h33Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
