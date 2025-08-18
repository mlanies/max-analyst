package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class f60 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f60(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((g60) this.b).A0 = false;
                k56 k56Var = (k56) this.d;
                if (k56Var != null) {
                    k56Var.invoke();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g60 g60Var = (g60) this.b;
                g60Var.A0 = false;
                g60Var.setVisibility(8);
                g60Var.y0 = null;
                k56 k56Var = (k56) this.c;
                if (k56Var != null) {
                    k56Var.invoke();
                    break;
                }
                break;
            default:
                ((rwc) this.b).u0.put((EnumMap) this.c, (lwc) null);
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
                ((g60) this.b).setVisibility(0);
                break;
            default:
                View view = (View) this.d;
                view.setVisibility(0);
                if (view.getTranslationY() == 0.0f) {
                    view.setTranslationY(fk4.d().getDisplayMetrics().density * 4.0f);
                    break;
                }
                break;
        }
    }
}
