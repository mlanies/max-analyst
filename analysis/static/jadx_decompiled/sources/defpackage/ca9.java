package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class ca9 extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final bg Y;
    public final ObjectAnimator Z;
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final hg o;
    public final Path s0;
    public float t0;

    public ca9(Context context) {
        this.a = context;
        final int i = 0;
        this.b = tu0.r(3, new k56(this) { // from class: aa9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = x7a.a0;
                        Context context2 = this.b.a;
                        Drawable drawableB = kt3.b(context2, i2);
                        qp4.u0.o(context2).c.getIcon();
                        drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawableB;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(qp4.u0.o(this.b.a).c.getIcon().e);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        return paint;
                }
            }
        });
        final int i2 = 1;
        this.c = tu0.r(3, new k56(this) { // from class: aa9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = x7a.a0;
                        Context context2 = this.b.a;
                        Drawable drawableB = kt3.b(context2, i22);
                        qp4.u0.o(context2).c.getIcon();
                        drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        return drawableB;
                    default:
                        Paint paint = new Paint();
                        paint.setColor(qp4.u0.o(this.b.a).c.getIcon().e);
                        paint.setAntiAlias(true);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        return paint;
                }
            }
        });
        hg hgVar = new hg("waveX", 0);
        this.o = hgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, 0, getBounds().width());
        objectAnimatorOfInt.setDuration(1000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        ca9 ca9Var = this.b;
                        ca9Var.a(ca9Var.s0);
                        ca9Var.invalidateSelf();
                        break;
                }
            }
        });
        this.X = objectAnimatorOfInt;
        bg bgVar = new bg("volume", 0.0f);
        this.Y = bgVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, bgVar, 0.0f, 0.7f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ba9
            public final /* synthetic */ ca9 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        this.b.invalidateSelf();
                        break;
                    default:
                        ca9 ca9Var = this.b;
                        ca9Var.a(ca9Var.s0);
                        ca9Var.invalidateSelf();
                        break;
                }
            }
        });
        this.Z = objectAnimatorOfFloat;
        this.s0 = new Path();
        this.t0 = 0.7f;
    }

    public final void a(Path path) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = fHeight - (this.Y.a * fHeight);
        float f2 = 4;
        float fG = f + (tu0.G(fk4.d().getDisplayMetrics().density * f2) / 2);
        path.rewind();
        path.moveTo(0.0f, fG);
        float f3 = fWidth / 3.0f;
        path.cubicTo(f3, f + (tu0.G(fk4.d().getDisplayMetrics().density * f2) / 2), f3 * 2, f, fWidth, f + (tu0.G(f2 * fk4.d().getDisplayMetrics().density) / 2));
        path.lineTo(fWidth, fHeight);
        path.lineTo(0.0f, fHeight);
        path.lineTo(0.0f, fG);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        ((Drawable) this.b.getValue()).draw(canvas);
        hg hgVar = this.o;
        canvas.translate(-hgVar.a, 0.0f);
        Path path = this.s0;
        je7 je7Var = this.c;
        canvas.drawPath(path, (Paint) je7Var.getValue());
        canvas.translate(((Drawable) r1.getValue()).getIntrinsicWidth(), 0.0f);
        canvas.drawPath(path, (Paint) je7Var.getValue());
        canvas.translate(hgVar.a - ((Drawable) r1.getValue()).getIntrinsicWidth(), 0.0f);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.X.isRunning() || this.Z.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.b.getValue()).setBounds(rect);
        this.X.setValues(PropertyValuesHolder.ofInt(this.o, 0, rect.width()));
        a(this.s0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.X.start();
        this.Z.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.X.cancel();
        this.Z.cancel();
    }
}
