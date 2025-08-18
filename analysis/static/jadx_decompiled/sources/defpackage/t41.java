package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t41 extends ch {
    public t41() {
        this(-1L);
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    @Override // defpackage.ch
    public final void n(View view) {
    }

    public t41(long j) {
        super(j, 2);
    }
}
