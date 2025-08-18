package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public final /* synthetic */ class pmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ pmc(float f, w12 w12Var) {
        this.a = 0;
        this.c = f;
        this.b = w12Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = this.c;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = RootController.u0;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
                View view = (View) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) fFloatValue;
                view.setLayoutParams(marginLayoutParams);
                break;
            case 1:
                View view2 = (View) obj;
                view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (fFloatValue == 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= fFloatValue) {
                    view2.setAlpha(valueAnimator.getAnimatedFraction());
                    break;
                }
                break;
            default:
                oz3 oz3Var = (oz3) obj;
                float fAbs = Math.abs((oz3Var.p - fFloatValue) - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oz3Var.p += fAbs;
                Matrix matrix = oz3Var.k;
                RectF rectF = oz3Var.g;
                matrix.postRotate(fAbs, rectF.centerX(), rectF.centerY());
                oz3Var.j.set(matrix);
                iag iagVar = oz3Var.b;
                if (iagVar != null) {
                    iagVar.f(matrix);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pmc(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }
}
