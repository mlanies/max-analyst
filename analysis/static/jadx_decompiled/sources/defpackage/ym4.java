package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ym4 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ym4(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b.setVisibility(8);
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
                this.b.setVisibility(0);
                break;
        }
    }
}
