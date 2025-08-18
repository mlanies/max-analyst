package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class h33 extends n15 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final c5 j;
    public final e33 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public h33(m15 m15Var) {
        super(m15Var);
        this.j = new c5(19, this);
        this.k = new e33(0, this);
        this.e = z7.P(tsb.motionDurationShort3, 100, m15Var.getContext());
        this.f = z7.P(tsb.motionDurationShort3, 150, m15Var.getContext());
        this.g = z7.Q(m15Var.getContext(), tsb.motionEasingLinearInterpolator, og.a);
        this.h = z7.Q(m15Var.getContext(), tsb.motionEasingEmphasizedInterpolator, og.d);
    }

    @Override // defpackage.n15
    public final void a() {
        if (this.b.D0 != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.n15
    public final int c() {
        return wzb.clear_text_end_icon_content_description;
    }

    @Override // defpackage.n15
    public final int d() {
        return yub.mtrl_ic_cancel;
    }

    @Override // defpackage.n15
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.n15
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.n15
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.n15
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.n15
    public final void p(boolean z) {
        if (this.b.D0 == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.n15
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f33
            public final /* synthetic */ h33 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                h33 h33Var = this.b;
                h33Var.getClass();
                switch (i3) {
                    case 0:
                        h33Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = h33Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f33
            public final /* synthetic */ h33 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i2;
                h33 h33Var = this.b;
                h33Var.getClass();
                switch (i32) {
                    case 0:
                        h33Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = h33Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new g33(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f33
            public final /* synthetic */ h33 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i2;
                h33 h33Var = this.b;
                h33Var.getClass();
                switch (i32) {
                    case 0:
                        h33Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = h33Var.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new g33(this, i));
    }

    @Override // defpackage.n15
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new cu1(14, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
