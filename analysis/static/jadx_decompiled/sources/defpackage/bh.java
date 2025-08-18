package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class bh extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ch d;
    public final /* synthetic */ xu3 e;
    public final /* synthetic */ boolean f;

    public bh(ch chVar, xu3 xu3Var, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = view;
        this.b = view2;
        this.c = viewGroup;
        this.d = chVar;
        this.e = xu3Var;
        this.f = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ch chVar = this.d;
        View view = this.a;
        if (view != null) {
            chVar.n(view);
        }
        View view2 = this.b;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = this.c;
            if (parent == viewGroup) {
                viewGroup.removeView(view2);
            }
        }
        chVar.k(this.e, this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ch chVar = this.d;
        if (chVar.X || chVar.s0 == null) {
            return;
        }
        boolean z = this.f;
        View view = this.a;
        if (view != null && (!z || chVar.u0)) {
            this.c.removeView(view);
        }
        chVar.k(this.e, this);
        if (!z || view == null) {
            return;
        }
        chVar.n(view);
    }
}
