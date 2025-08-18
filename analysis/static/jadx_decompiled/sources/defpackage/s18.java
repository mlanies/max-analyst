package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
public final class s18 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public /* synthetic */ s18(View view, float f, int i) {
        this.a = i;
        this.b = view;
        this.c = f;
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

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(this.c);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                this.b.setAlpha(this.c);
                break;
            default:
                this.b.setTranslationX(this.c);
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
