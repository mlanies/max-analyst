package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class x91 extends FrameLayout implements bk1 {
    public final /* synthetic */ CallIndicatorWidget a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(CallIndicatorWidget callIndicatorWidget, Context context) {
        super(context);
        this.a = callIndicatorWidget;
        setId(y7a.O);
        setBackground(new ColorDrawable(0));
        bc7[] bc7VarArr = CallIndicatorWidget.X;
        callIndicatorWidget.getClass();
        bc7 bc7Var = CallIndicatorWidget.X[1];
        addView((View) callIndicatorWidget.c.getValue());
        addView(CallIndicatorWidget.m0(callIndicatorWidget));
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.n0(callIndicatorWidget, true);
        float f = 100;
        if (CallIndicatorWidget.m0(callIndicatorWidget).getHeight() != tu0.G(fk4.d().getDisplayMetrics().density * f)) {
            o91 o91VarM0 = CallIndicatorWidget.m0(callIndicatorWidget);
            ViewGroup.LayoutParams layoutParams = o91VarM0.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = tu0.G(f * fk4.d().getDisplayMetrics().density);
            o91VarM0.setLayoutParams(marginLayoutParams);
        }
        CallIndicatorWidget.m0(callIndicatorWidget).a(true);
    }

    @Override // defpackage.bk1
    public final void b(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.n0(callIndicatorWidget, true);
        CallIndicatorWidget.m0(callIndicatorWidget).b(z);
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, final boolean z, long j) {
        final CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.m0(callIndicatorWidget).h(kl7Var, z, j);
        float f = 100;
        int iQ = rh4.q(f, fk4.d().getDisplayMetrics().density, ((ivc) ((ba1) ((aa1) callIndicatorWidget.a.getValue())).c.getValue()).a);
        int iG = z ? iQ : tu0.G(fk4.d().getDisplayMetrics().density * f);
        if (z) {
            iQ = tu0.G(f * fk4.d().getDisplayMetrics().density);
        }
        o91 o91VarM0 = CallIndicatorWidget.m0(callIndicatorWidget);
        hg hgVar = new hg("height", iG);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, iG, iQ);
        objectAnimatorOfInt.setDuration(j);
        objectAnimatorOfInt.addUpdateListener(new pg(o91VarM0, hgVar, 1));
        kl7Var.add(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, new hg("backgroundChange", 0), 0);
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w91
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CallIndicatorWidget.n0(callIndicatorWidget, z);
            }
        });
        kl7Var.add(objectAnimatorOfInt2);
    }
}
