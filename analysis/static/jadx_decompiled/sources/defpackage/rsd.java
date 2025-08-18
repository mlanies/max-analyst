package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class rsd extends gqf {
    public static final DecelerateInterpolator U0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator V0 = new AccelerateInterpolator();
    public static final psd W0 = new psd();
    public qsd T0;

    @Override // defpackage.gqf
    public final ObjectAnimator S(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2) {
        if (g2fVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) g2fVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return ema.o(view, g2fVar2, iArr[0], iArr[1], this.T0.a(view, viewGroup), this.T0.b(view, viewGroup), translationX, translationY, U0, this);
    }

    @Override // defpackage.gqf
    public final ObjectAnimator T(ViewGroup viewGroup, View view, g2f g2fVar, g2f g2fVar2) {
        if (g2fVar == null) {
            return null;
        }
        int[] iArr = (int[]) g2fVar.a.get("android:slide:screenPosition");
        return ema.o(view, g2fVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.T0.a(view, viewGroup), this.T0.b(view, viewGroup), V0, this);
    }

    @Override // defpackage.gqf, defpackage.w1f
    public final void e(g2f g2fVar) {
        gqf.Q(g2fVar);
        int[] iArr = new int[2];
        g2fVar.b.getLocationOnScreen(iArr);
        g2fVar.a.put("android:slide:screenPosition", iArr);
    }

    @Override // defpackage.w1f
    public final void h(g2f g2fVar) {
        gqf.Q(g2fVar);
        int[] iArr = new int[2];
        g2fVar.b.getLocationOnScreen(iArr);
        g2fVar.a.put("android:slide:screenPosition", iArr);
    }
}
