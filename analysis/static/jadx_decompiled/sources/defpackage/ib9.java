package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class ib9 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, kre {
    public static final int[] t0 = {-16724737, -16767233, -5963578};
    public static final int[] u0 = {-2500135, 14277081};
    public final int[] X;
    public final Path Y;
    public final Paint Z;
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient o;
    public final je7 s0;

    public ib9() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.X = t0;
        this.Y = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.Z = paint2;
        this.s0 = tu0.r(3, new zj7(11, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.o = linearGradient;
        this.a.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.Y, this.Z);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((ValueAnimator) this.s0.getValue()).isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(fFloatValue, 0.0f);
        LinearGradient linearGradient = this.o;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.X);
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getBounds().height(), u0, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.s0.getValue()).setFloatValues(getBounds().width() * 2.0f, 0.0f);
        int iHeight = getBounds().height();
        Path path = this.Y;
        path.reset();
        float fWidth = getBounds().width() / 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 24.0f;
        float f2 = iHeight;
        path.addOval(0.0f - fWidth, (f2 - (fk4.d().getDisplayMetrics().density * 187.0f)) + f, getBounds().width() + fWidth, f2 + f, Path.Direction.CW);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        a(t0);
        this.Z.setColor(fkaVar.b().k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.Z.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.Z.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        je7 je7Var = this.s0;
        if (((ValueAnimator) je7Var.getValue()).isRunning()) {
            return;
        }
        ((ValueAnimator) je7Var.getValue()).start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((ValueAnimator) this.s0.getValue()).cancel();
    }
}
