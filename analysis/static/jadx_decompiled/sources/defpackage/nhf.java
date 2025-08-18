package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class nhf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ohf b;

    public /* synthetic */ nhf(ohf ohfVar, int i) {
        this.a = i;
        this.b = ohfVar;
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
                ohf ohfVar = this.b;
                ohfVar.H0 = null;
                ohfVar.I0 = false;
                break;
            default:
                this.b.E0 = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
