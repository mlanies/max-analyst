package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* loaded from: classes2.dex */
public final class fh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Animator b;
    public final /* synthetic */ k56 c;

    public /* synthetic */ fh(AnimatorSet animatorSet, k56 k56Var, int i) {
        this.a = i;
        this.b = animatorSet;
        this.c = k56Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.removeListener(this);
                this.c.invoke();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
