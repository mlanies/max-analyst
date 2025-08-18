package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mcf extends ch {
    public mcf() {
        super(0);
    }

    @Override // defpackage.zu3
    public final zu3 b() {
        return new mcf(this.o, this.u0);
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getHeight(), 0.0f));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight()));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
    }

    public mcf(int i) {
        super(200L, 2);
    }
}
