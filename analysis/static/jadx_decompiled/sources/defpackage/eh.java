package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.transition.TransitionValues;
import android.view.View;

/* loaded from: classes2.dex */
public final class eh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationCancel(animator);
                ((TransitionValues) this.b).view.setClipBounds(null);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ValueAnimator) this.b).removeListener(this);
                ((k56) this.c).invoke();
                break;
            case 1:
                super.onAnimationEnd(animator);
                if (((w33) this.c).b) {
                    ((TransitionValues) this.b).view.setClipBounds(null);
                    break;
                }
                break;
            case 2:
                ((la6) ((na6) this.b).getHierarchy()).n(wnc.b(((oq4) this.c).b));
                break;
            case 3:
                na6 na6Var = (na6) this.b;
                la6 la6Var = (la6) na6Var.getHierarchy();
                tq4 tq4Var = (tq4) this.c;
                la6Var.h(tq4Var.b);
                if (tq4Var.o != null) {
                    la6 la6Var2 = (la6) na6Var.getHierarchy();
                    PointF pointF = tq4Var.o;
                    la6Var2.getClass();
                    pointF.getClass();
                    la6Var2.f(2).r(pointF);
                    break;
                }
                break;
            case 4:
                uv4 uv4Var = (uv4) this.c;
                uv4Var.o.setValues((float[]) this.b);
                uv4Var.o.invert(uv4Var.s0);
                uv4Var.invalidate();
                break;
            case 5:
                ((us) this.b).remove(animator);
                ((w1f) this.c).A0.remove(animator);
                break;
            default:
                k6g k6gVar = (k6g) this.b;
                k6gVar.a.d(1.0f);
                g6g.e((View) this.c, k6gVar);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((w1f) this.c).A0.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ eh(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
