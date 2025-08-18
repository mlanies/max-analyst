package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class u18 extends ch {
    public final int v0;
    public final int w0;

    public u18() {
        this(0);
    }

    public static ObjectAnimator p(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f * scaleY, f2 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new t18(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator q(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new s18(view, f3, 2));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // defpackage.zu3
    public final zu3 b() {
        return new u18(this.v0, null);
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new wb5());
        if (view2 != null) {
            float alpha = view2.getAlpha() == 0.0f ? 1.0f : view2.getAlpha();
            animatorSet.play(o(view2, 0.0f, alpha, ote.d(-0.15f, 0.0f, 1.0f), 1.0f, alpha));
        }
        if (view != null && (!z || this.u0)) {
            float alpha2 = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
            animatorSet.play(o(view, alpha2, 0.0f, 0.0f, ote.d(0.85f, 0.0f, 1.0f), alpha2));
        }
        int iS = au1.s(this.v0);
        if (iS == 0) {
            int i = this.w0;
            if (z) {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() + i, view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() - i, view.getTranslationX()));
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() - i, view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() + i, view.getTranslationX()));
                }
            }
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                if (view2 != null) {
                    animatorSet.play(p(view2, 0.8f, 1.0f));
                }
                if (view != null) {
                    animatorSet.play(p(view, 1.0f, 1.1f));
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(p(view2, 1.1f, 1.0f));
                }
                if (view != null) {
                    animatorSet.play(p(view, 1.0f, 0.8f));
                }
            }
        }
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public final ValueAnimator o(final View view, final float f, final float f2, final float f3, final float f4, float f5) {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimatorOfFloat.getAnimatedValue()).floatValue();
                float f6 = f3;
                float f7 = f;
                if (fFloatValue >= f6) {
                    float f8 = f4;
                    float f9 = f2;
                    if (fFloatValue > f8) {
                        f7 = f9;
                    } else {
                        this.getClass();
                        f7 += (f9 - f7) * ((fFloatValue - f6) / (f8 - f6));
                    }
                }
                view.setAlpha(f7);
            }
        });
        valueAnimatorOfFloat.addListener(new s18(view, f5, 1));
        valueAnimatorOfFloat.addListener(new s18(view, f5, 0));
        return valueAnimatorOfFloat;
    }

    public /* synthetic */ u18(int i) {
        this(1, null);
    }

    public u18(int i, au1 au1Var) {
        super(300L, 2);
        this.v0 = i;
        this.w0 = tu0.G(30 * fk4.d().getDisplayMetrics().density);
    }
}
