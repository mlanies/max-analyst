package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class sg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg(k56 k56Var, FrameLayout frameLayout, k56 k56Var2, int i) {
        this.a = i;
        this.b = k56Var;
        this.c = frameLayout;
        this.d = k56Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(y7a.m, null);
                this.b.invoke();
                break;
            case 1:
                ((f6b) this.c).requestLayout();
                ((k56) this.d).invoke();
                break;
            default:
                ((uge) this.c).requestLayout();
                ((k56) this.d).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setTag(y7a.m, null);
                this.b.invoke();
                break;
            case 1:
                f6b f6bVar = (f6b) this.c;
                f6bVar.requestLayout();
                ((k56) this.d).invoke();
                f6bVar.s0 = null;
                break;
            default:
                uge ugeVar = (uge) this.c;
                ugeVar.requestLayout();
                ((k56) this.d).invoke();
                ugeVar.c = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                this.c.setTag(y7a.m, (String) this.d);
                break;
            case 1:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }

    public sg(View view, int i, String str, k81 k81Var) {
        this.a = 0;
        this.c = view;
        this.d = str;
        this.b = k81Var;
    }
}
