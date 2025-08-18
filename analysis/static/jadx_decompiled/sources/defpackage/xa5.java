package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class xa5 extends ch {
    public xa5() {
        super(0);
    }

    @Override // defpackage.zu3
    public final zu3 b() {
        return new xa5(this.o, this.u0);
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            animatorSet.play(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z2 ? 0.0f : view2.getAlpha(), 1.0f));
        }
        if (view != null && (!z || this.u0)) {
            animatorSet.play(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public xa5(long j) {
        super(j, 2);
    }
}
