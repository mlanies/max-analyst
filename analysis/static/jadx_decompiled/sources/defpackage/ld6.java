package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.widget.ImageView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class ld6 extends ImageView {
    public final Paint a;
    public LinearGradient b;
    public final Matrix c;
    public kd6 o;
    public float s0;
    public ValueAnimator t0;

    public ld6(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.a = paint;
        this.c = new Matrix();
        this.o = new kd6(-1, 7000L, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, 15.0f, 48);
    }

    public final void a() {
        this.s0 = -getWidth();
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kd6 kd6Var = this.o;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-getWidth(), (getWidth() * kd6Var.e) + getWidth());
        valueAnimatorOfFloat.setDuration(kd6Var.c);
        valueAnimatorOfFloat.setStartDelay(kd6Var.b);
        valueAnimatorOfFloat.setRepeatCount(kd6Var.a);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new z00(9, this));
        valueAnimatorOfFloat.start();
        this.t0 = valueAnimatorOfFloat;
    }

    public final kd6 getAnimConfig() {
        return this.o;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(this.o.d, getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.postTranslate(this.s0, 0.0f);
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, i * this.o.e, 0.0f, new int[]{0, ote.b0(-1, 0.3f), 0}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        this.a.setShader(linearGradient);
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(-getWidth(), (getWidth() * this.o.e) + getWidth());
        }
        this.s0 = -getWidth();
    }

    public final void setAnimConfig(kd6 kd6Var) {
        this.o = kd6Var;
    }
}
