package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* loaded from: classes.dex */
public final class zl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object o;

    public /* synthetic */ zl(Object obj, View view, View view2, int i) {
        this.a = i;
        this.o = obj;
        this.b = view;
        this.c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((AppBarLayout$BaseBehavior) this.o).K((CoordinatorLayout) this.b, (fm) this.c, iIntValue);
                break;
            default:
                ((dje) this.o).c(this.b, this.c, valueAnimator.getAnimatedFraction());
                break;
        }
    }
}
