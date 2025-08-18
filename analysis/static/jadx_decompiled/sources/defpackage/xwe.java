package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
public final class xwe implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ k56 g;

    public xwe(View view, int i, String str, float f, float f2, boolean z, float f3, k56 k56Var) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = f3;
        this.g = k56Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.e ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        k56 k56Var = this.g;
        if (k56Var != null) {
            k56Var.invoke();
        }
        view.setTag(xoc.R0, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        view.setVisibility(this.e ? 0 : 8);
        view.setTranslationY(this.f);
        k56 k56Var = this.g;
        if (k56Var != null) {
            k56Var.invoke();
        }
        view.setTag(xoc.R0, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = xoc.R0;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
