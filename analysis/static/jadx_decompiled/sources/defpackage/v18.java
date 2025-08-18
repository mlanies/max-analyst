package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class v18 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w18 c;

    public v18(w18 w18Var, boolean z, int i) {
        this.c = w18Var;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w18 w18Var = this.c;
        w18Var.b.setTranslationX(0.0f);
        w18Var.a(0.0f, this.a, this.b);
    }
}
