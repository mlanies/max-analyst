package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.secret.widgets.TimerView;
import ru.ok.messages.settings.view.BrightnessSeekBar;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                a10 a10Var = (a10) obj;
                a10Var.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a10Var.invalidateSelf();
                return;
            case 1:
                r20 r20Var = (r20) obj;
                r20Var.getClass();
                r20Var.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r20Var.invalidateSelf();
                return;
            case 2:
                ((el9) obj).C0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                int i = BrightnessSeekBar.u0;
                BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) obj;
                brightnessSeekBar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brightnessSeekBar.s0 = fFloatValue;
                if (fFloatValue < 0.0f) {
                    brightnessSeekBar.s0 = 0.0f;
                }
                brightnessSeekBar.invalidate();
                return;
            case 4:
                ((u91) obj).invalidateSelf();
                return;
            case 5:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy3 gy3Var = (gy3) obj;
                c23 c23Var = gy3Var.w0;
                c23Var.b = fFloatValue2;
                c23Var.invalidateSelf();
                gy3Var.setText(String.valueOf((((int) ((gy3Var.u0 * ((100 * fFloatValue2) / 360.0f)) / 100.0f)) / 1000) + 1));
                return;
            case 6:
                oz3 oz3Var = (oz3) obj;
                oz3Var.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue3 == 0.0f) {
                    return;
                }
                Matrix matrix = oz3Var.k;
                float fL = fFloatValue3 / f46.L(matrix, 0);
                RectF rectF = oz3Var.g;
                matrix.postScale(fL, 1.0f, rectF.centerX(), rectF.centerY());
                oz3Var.j.set(matrix);
                iag iagVar = oz3Var.b;
                if (iagVar != null) {
                    iagVar.f(matrix);
                    return;
                }
                return;
            case 7:
                qs4 qs4Var = (qs4) obj;
                qs4Var.getClass();
                qs4Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                p85 p85Var = (p85) obj;
                p85Var.A0 = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = p85Var.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p85Var.setLayoutParams(layoutParams);
                return;
            case 9:
                ld6 ld6Var = (ld6) obj;
                ld6Var.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ld6Var.invalidate();
                return;
            case 10:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                vf7 vf7Var = (vf7) obj;
                if (animatedFraction <= 0.1f && vf7Var.a) {
                    vf7Var.a = false;
                    vf7Var.b.a();
                    return;
                } else {
                    if (animatedFraction > 0.1f) {
                        vf7Var.a = true;
                        return;
                    }
                    return;
                }
            case 11:
                ((oo7) obj).invalidateSelf();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((ht8) obj).I0.getForeground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 13:
                caa caaVar = (caa) obj;
                caaVar.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caaVar.invalidate();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                z5c z5cVar = (z5c) obj;
                z5cVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5cVar.invalidate();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                fvc fvcVar = (fvc) obj;
                fvcVar.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fvcVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ((bmd) obj).invalidateSelf();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ood oodVar = (ood) obj;
                oodVar.getClass();
                if (valueAnimator.isRunning()) {
                    oodVar.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    oodVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i2 = SlideOutLayout.C0;
                ((SlideOutLayout) obj).e();
                return;
            case 19:
                ((TextView) obj).setWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 20:
                int i3 = TimerView.y0;
                TimerView timerView = (TimerView) obj;
                timerView.getClass();
                timerView.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
                timerView.invalidate();
                return;
            case 21:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ejf ejfVar = (ejf) obj;
                ejfVar.I0 = fFloatValue4;
                hg7 hg7Var = ejfVar.z0;
                ejc ejcVar = hg7Var != null ? hg7Var.c.B0 : null;
                if (ejcVar != null) {
                    ejcVar.d(fFloatValue4);
                    return;
                }
                return;
            default:
                ((View) ((d6g) ((w5e) obj).a).Z.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ z00(w5e w5eVar, View view) {
        this.a = 22;
        this.b = w5eVar;
    }
}
