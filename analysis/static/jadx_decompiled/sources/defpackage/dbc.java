package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class dbc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ dbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                ngg.G(recordControlsWidget.q0().getDrawable(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                View viewF0 = recordControlsWidget.F0();
                ViewGroup.LayoutParams layoutParams = viewF0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewF0.setLayoutParams(layoutParams2);
                return;
            case 2:
                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                ngg.G(recordControlsWidget.B0(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                bc7[] bc7VarArr4 = RecordControlsWidget.b1;
                View viewF02 = recordControlsWidget.F0();
                ViewGroup.LayoutParams layoutParams3 = viewF02.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewF02.setLayoutParams(layoutParams4);
                return;
        }
    }
}
