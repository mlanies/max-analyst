package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class am1 extends ch {
    public final je7 v0;

    public am1() {
        this(-1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(am1 am1Var, View view, boolean z) {
        am1Var.getClass();
        bk1 bk1Var = view instanceof bk1 ? (bk1) view : null;
        if (bk1Var != null) {
            bk1Var.a(z);
        }
        if (z) {
            view.setClipToOutline(true);
            dy7.h(view, new Rect(0, 0, view.getWidth(), view.getHeight()), fk4.d().getDisplayMetrics().density * 0.0f);
        }
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z && view2 != null) {
            p(animatorSet, view2, true);
        } else if (!z && view != null) {
            p(animatorSet, view, false);
        }
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(AnimatorSet animatorSet, View view, boolean z) {
        int height;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new ai1(this, view, z, view, z, view, z, 1));
        kl7 kl7VarL = j1e.l();
        if (z) {
            ((ba1) ((aa1) this.v0.getValue())).getClass();
            height = tu0.G(174 * fk4.d().getDisplayMetrics().density);
        } else {
            height = view.getHeight();
        }
        int height2 = z ? view.getHeight() : 0;
        hg hgVar = new hg("bounds", height);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, height, height2);
        objectAnimatorOfInt.addUpdateListener(new pg(view, hgVar, 2));
        kl7VarL.add(objectAnimatorOfInt);
        bk1 bk1Var = view instanceof bk1 ? (bk1) view : null;
        if (bk1Var != null) {
            bk1Var.h(kl7VarL, z, this.o);
        }
        animatorSet.playTogether(j1e.d(kl7VarL));
    }

    public am1(long j) {
        super(j, 2);
        this.v0 = zi1.a.c();
    }
}
