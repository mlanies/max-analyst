package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0 ck0Var = (ck0) obj;
                Iterator it = ck0Var.z0.iterator();
                while (it.hasNext()) {
                    uwe uweVar = (uwe) it.next();
                    uweVar.Y0 = 1.2f;
                    uweVar.W0 = fFloatValue;
                    uweVar.X0 = fFloatValue;
                    uweVar.Z0 = og.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue);
                    uweVar.invalidateSelf();
                }
                WeakHashMap weakHashMap = zmf.a;
                ck0Var.postInvalidateOnAnimation();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q18 q18Var = ((BottomSheetBehavior) obj).i;
                if (q18Var != null) {
                    p18 p18Var = q18Var.a;
                    if (p18Var.j != fFloatValue2) {
                        p18Var.j = fFloatValue2;
                        q18Var.X = true;
                        q18Var.invalidateSelf();
                        break;
                    }
                }
                break;
            case 2:
                ((w53) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                ((qsc) obj).j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                zb5 zb5Var = (zb5) obj;
                zb5Var.c.setAlpha(iFloatValue);
                zb5Var.o.setAlpha(iFloatValue);
                zb5Var.D0.invalidate();
                break;
            case 5:
                ((b77) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 6:
                ood oodVar = (ood) obj;
                oodVar.f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oodVar.o = (((oodVar.f1 - oodVar.l1) * oodVar.d1) / oodVar.g1) + oodVar.b;
                oodVar.invalidate();
                oodVar.getClass();
                break;
            case 7:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 8:
                ((TextInputLayout) obj).G1.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                dif difVar = (dif) obj;
                difVar.K0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                difVar.requestLayout();
                break;
        }
    }
}
