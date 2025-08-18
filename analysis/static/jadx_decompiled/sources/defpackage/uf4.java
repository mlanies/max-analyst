package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public class uf4 implements jag, Animator.AnimatorListener {
    public final b9b a;
    public iag b = null;
    public boolean c = false;
    public boolean d = false;
    public float e = 1.0f;
    public float f = 4.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Matrix j = new Matrix();
    public final Matrix k = new Matrix();

    public uf4(b9b b9bVar) {
        new Matrix();
        this.a = b9bVar;
        b9bVar.c = this;
    }

    @Override // defpackage.jag
    public void a(final float f, final float f2) {
        float fK = f46.K(this.k);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fK, ((double) fK) <= 1.1d ? 2.5f : 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tf4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                uf4 uf4Var = this.a;
                uf4Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Matrix matrix = uf4Var.k;
                float fK2 = fFloatValue / f46.K(matrix);
                matrix.postScale(fK2, fK2, f, f2);
                uf4Var.j.set(matrix);
                uf4Var.b();
                iag iagVar = uf4Var.b;
                if (iagVar != null) {
                    iagVar.f(matrix);
                }
            }
        });
        valueAnimatorOfFloat.addListener(this);
        valueAnimatorOfFloat.start();
    }

    public void b() {
        RectF rectF = this.i;
        rectF.set(this.h);
        Matrix matrix = this.k;
        matrix.mapRect(rectF);
        float f = rectF.left;
        float fWidth = rectF.width();
        RectF rectF2 = this.g;
        float fWidth2 = rectF2.width() - fWidth;
        float fMin = fWidth2 > 0.0f ? fWidth2 / 2.0f : Math.min(Math.max(fWidth2, f), 0.0f);
        float f2 = rectF.top;
        float fHeight = rectF2.height() - rectF.height();
        float fMin2 = fHeight > 0.0f ? fHeight / 2.0f : Math.min(Math.max(fHeight, f2), 0.0f);
        float f3 = rectF.left;
        if (fMin == f3 && fMin2 == rectF.top) {
            return;
        }
        matrix.postTranslate(fMin - f3, fMin2 - rectF.top);
        this.a.q();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = true;
    }

    @Override // defpackage.jag
    public void reset() {
        ((r68) this.a.b).b();
        this.j.reset();
        this.k.reset();
    }
}
