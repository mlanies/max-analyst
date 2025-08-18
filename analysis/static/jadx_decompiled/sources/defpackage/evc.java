package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class evc implements eu6 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ fvc c;

    public evc(fvc fvcVar) {
        this.c = fvcVar;
    }

    @Override // defpackage.eu6
    public final void a(long j, wu1 wu1Var) {
        fvc fvcVar = this.c;
        this.a = fvcVar.getBrightness();
        fvcVar.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(wu1Var);
        u3c u3cVar = new u3c(9, wu1Var);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(fvcVar.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new z00(15, fvcVar));
        valueAnimatorOfFloat.addListener(new mf(8, u3cVar));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // defpackage.eu6
    public final void clear() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        fvc fvcVar = this.c;
        fvcVar.setAlpha(0.0f);
        fvcVar.setBrightness(this.a);
    }
}
