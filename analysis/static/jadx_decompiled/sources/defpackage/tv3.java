package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public final class tv3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tv3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                uv3.a((uv3) obj, this.b);
                break;
            case 1:
                this.b = true;
                break;
            case 2:
                bc7[] bc7VarArr = RootController.u0;
                ((RootController) obj).r0(this.b);
                break;
            default:
                super.onAnimationCancel(animator);
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                uv3.a((uv3) obj, this.b);
                break;
            case 1:
                if (!this.b) {
                    zb5 zb5Var = (zb5) obj;
                    if (((Float) zb5Var.K0.getAnimatedValue()).floatValue() != 0.0f) {
                        zb5Var.L0 = 2;
                        zb5Var.D0.invalidate();
                        break;
                    } else {
                        zb5Var.L0 = 0;
                        zb5Var.l(0);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
            case 2:
                bc7[] bc7VarArr = RootController.u0;
                ((RootController) obj).r0(this.b);
                break;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                this.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((uv3) this.c).i.invoke(Boolean.valueOf(this.b));
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public tv3(View view) {
        this.a = 3;
        this.c = view;
    }

    public tv3(zb5 zb5Var) {
        this.a = 1;
        this.c = zb5Var;
        this.b = false;
    }
}
