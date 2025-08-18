package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public final class l1b extends AnimatorListenerAdapter {
    public final /* synthetic */ m1b a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ RectF d;
    public final /* synthetic */ k56 e;

    public l1b(m1b m1bVar, View view, xg1 xg1Var, RectF rectF, a81 a81Var) {
        this.a = m1bVar;
        this.b = view;
        this.c = xg1Var;
        this.d = rectF;
        this.e = a81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        m1b m1bVar = this.a;
        m1bVar.getClass();
        xg1 xg1Var = (xg1) this.c;
        View view = this.b;
        m1b.a(m1bVar, view, xg1Var, this.d);
        this.e.invoke();
        if (m1b.b()) {
            view.setLayerType(0, null);
            xg1Var.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m1b m1bVar = this.a;
        m1bVar.getClass();
        xg1 xg1Var = (xg1) this.c;
        View view = this.b;
        m1b.a(m1bVar, view, xg1Var, this.d);
        this.e.invoke();
        if (m1b.b()) {
            view.setLayerType(0, null);
            xg1Var.setLayerType(0, null);
        }
    }
}
