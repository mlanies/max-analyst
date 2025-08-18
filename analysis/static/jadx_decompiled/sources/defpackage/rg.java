package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes.dex */
public final class rg implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ m56 f;

    public rg(View view, int i, String str, float f, float f2, boolean z, m56 m56Var) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = m56Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        view.setVisibility(this.e ? 0 : 8);
        m56 m56Var = this.f;
        if (m56Var != null) {
            m56Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(y7a.m, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        view.setVisibility(this.e ? 0 : 8);
        m56 m56Var = this.f;
        if (m56Var != null) {
            m56Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(y7a.m, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = y7a.m;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
