package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class bi1 extends ch {
    public final je7 v0;

    public bi1() {
        this(-1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(bi1 bi1Var, View view, boolean z) {
        bi1Var.getClass();
        zj1 zj1Var = view instanceof zj1 ? (zj1) view : null;
        if (zj1Var != null) {
            zj1Var.o(z);
        }
        if (z) {
            dy7.h(view, new Rect(0, 0, view.getWidth(), view.getHeight()), 0.0f);
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
    public final void p(AnimatorSet animatorSet, final View view, final boolean z) {
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new ai1(this, view, z, view, z, view, z, 0));
        kl7 kl7VarL = j1e.l();
        ba1 ba1Var = (ba1) ((aa1) this.v0.getValue());
        ba1Var.getClass();
        PointF pointF = ba1Var.b;
        final PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        bg bgVar = new bg("bounds", f);
        boolean z2 = view instanceof zj1;
        zj1 zj1Var = z2 ? (zj1) view : null;
        final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, bgVar, f, f2);
        final zj1 zj1Var2 = zj1Var;
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zh1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bi1 bi1Var = this;
                long j = bi1Var.o;
                ObjectAnimator objectAnimator = objectAnimatorOfFloat;
                objectAnimator.setDuration(j);
                boolean z3 = z;
                float animatedFraction = z3 ? objectAnimator.getAnimatedFraction() : 1 - objectAnimator.getAnimatedFraction();
                View view2 = view;
                int width = view2.getWidth();
                int height = view2.getHeight();
                PointF pointF3 = pointF2;
                float f3 = pointF3.x;
                float f4 = 1 - animatedFraction;
                float f5 = pointF3.y * f4;
                float fMin = Math.min(f3, f3 * f4);
                float fMin2 = Math.min(pointF3.y, f5);
                float f6 = width * animatedFraction;
                float f7 = height * animatedFraction;
                float f8 = pointF3.x;
                je7 je7Var = bi1Var.v0;
                ((ba1) ((aa1) je7Var.getValue())).getClass();
                float fMax = Math.max(f8 + tu0.G(118 * fk4.d().getDisplayMetrics().density), f6);
                float f9 = pointF3.y;
                ((ba1) ((aa1) je7Var.getValue())).getClass();
                RectF rectF = new RectF(fMin, fMin2, fMax, Math.max(f9 + tu0.G(174 * fk4.d().getDisplayMetrics().density), f7));
                zj1 zj1Var3 = zj1Var2;
                if (zj1Var3 != null) {
                    zj1Var3.d(rectF, z3);
                }
                Rect rect = new Rect();
                rectF.roundOut(rect);
                dy7.h(view2, rect, fk4.d().getDisplayMetrics().density * 20.0f);
            }
        });
        if (z) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
            objectAnimatorOfFloat2.setDuration(50L);
            kl7VarL.add(objectAnimatorOfFloat2);
        }
        kl7VarL.add(objectAnimatorOfFloat);
        zj1 zj1Var3 = z2 ? (zj1) view : null;
        if (zj1Var3 != null) {
            zj1Var3.f(kl7VarL, z, this.o);
        }
        animatorSet.playTogether(j1e.d(kl7VarL));
    }

    public bi1(long j) {
        super(j, 2);
        this.v0 = zi1.a.c();
    }
}
