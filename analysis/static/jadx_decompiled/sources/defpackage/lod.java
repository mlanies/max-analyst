package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class lod extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ood b;

    public /* synthetic */ lod(ood oodVar, int i) {
        this.a = i;
        this.b = oodVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ood oodVar = this.b;
                oodVar.i1 = false;
                oodVar.invalidate();
                break;
            default:
                ood oodVar2 = this.b;
                oodVar2.o = (((oodVar2.f1 - oodVar2.l1) * oodVar2.d1) / oodVar2.g1) + oodVar2.b;
                oodVar2.i1 = false;
                oodVar2.p1 = true;
                oodVar2.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ood oodVar = this.b;
                oodVar.i1 = false;
                oodVar.invalidate();
                oodVar.getClass();
                break;
            default:
                ood oodVar2 = this.b;
                oodVar2.o = (((oodVar2.f1 - oodVar2.l1) * oodVar2.d1) / oodVar2.g1) + oodVar2.b;
                oodVar2.i1 = false;
                oodVar2.p1 = true;
                oodVar2.invalidate();
                oodVar2.getClass();
                break;
        }
    }
}
