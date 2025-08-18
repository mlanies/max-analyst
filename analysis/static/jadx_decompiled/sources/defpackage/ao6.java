package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ao6 extends ch {
    public ao6() {
        super(0);
    }

    @Override // defpackage.zu3
    public final zu3 b() {
        return new ao6(this.o, this.u0);
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, view2.getWidth(), 0.0f));
            }
        } else {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, view.getWidth()));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, (view != null ? view.getTranslationX() : 0.0f) - view2.getWidth(), 0.0f));
            }
        }
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
        view.setTranslationX(0.0f);
    }

    public ao6(int i) {
        super(200L, 2);
    }
}
