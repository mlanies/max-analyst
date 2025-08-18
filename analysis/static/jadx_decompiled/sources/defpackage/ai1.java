package defpackage;

import android.animation.Animator;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class ai1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ View f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ch h;

    public /* synthetic */ ai1(ch chVar, View view, boolean z, View view2, boolean z2, View view3, boolean z3, int i) {
        this.a = i;
        this.h = chVar;
        this.b = view;
        this.c = z;
        this.d = view2;
        this.e = z2;
        this.f = view3;
        this.g = z3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                bi1.o((bi1) this.h, this.d, this.e);
                break;
            default:
                am1.o((am1) this.h, this.d, this.e);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bi1.o((bi1) this.h, this.b, this.c);
                break;
            default:
                am1.o((am1) this.h, this.b, this.c);
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
                KeyEvent.Callback callback = this.f;
                zj1 zj1Var = callback instanceof zj1 ? (zj1) callback : null;
                if (zj1Var != null) {
                    zj1Var.e(this.g);
                    break;
                }
                break;
            default:
                KeyEvent.Callback callback2 = this.f;
                bk1 bk1Var = callback2 instanceof bk1 ? (bk1) callback2 : null;
                if (bk1Var != null) {
                    bk1Var.b(this.g);
                    break;
                }
                break;
        }
    }
}
