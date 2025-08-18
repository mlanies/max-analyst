package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class qwc implements m56 {
    public final /* synthetic */ iwc X;
    public final /* synthetic */ View a;
    public final /* synthetic */ rwc b;
    public final /* synthetic */ lwc c;
    public final /* synthetic */ rwc o;

    public qwc(iwc iwcVar, rwc rwcVar, lwc lwcVar, rwc rwcVar2, iwc iwcVar2) {
        this.a = iwcVar;
        this.b = rwcVar;
        this.c = lwcVar;
        this.o = rwcVar2;
        this.X = iwcVar2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = 1 - (view.getTranslationY() / (fk4.d().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getTranslationY(), fk4.d().getDisplayMetrics().density * 4.0f);
        valueAnimatorOfFloat.setDuration((long) (200 * translationY));
        valueAnimatorOfFloat.setInterpolator(rwc.x0);
        iwc iwcVar = (iwc) view;
        valueAnimatorOfFloat.addListener(new owc(iwcVar, this.b, this.c, this.o, this.X));
        valueAnimatorOfFloat.addUpdateListener(new pwc(iwcVar, animatedFraction));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }
}
