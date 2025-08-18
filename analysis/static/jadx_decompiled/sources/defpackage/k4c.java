package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class k4c extends Drawable implements Animatable {
    public final bg X;
    public final ObjectAnimator Y;
    public final Drawable a;
    public final ShapeDrawable b;
    public final bg c;
    public final ObjectAnimator o;

    public k4c(Context context) {
        final int i = 0;
        Drawable drawableB = kt3.b(context, x7a.N);
        pq9 pq9Var = qp4.u0;
        pq9Var.o(context).c.getIcon();
        drawableB.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.a = drawableB;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(pq9Var.o(context).c.b().a.m);
        this.b = shapeDrawable;
        bg bgVar = new bg("rotateAnimation", 90.0f);
        this.c = bgVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, bgVar, 90.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setRepeatCount(0);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j4c
            public final /* synthetic */ k4c b;

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
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.o = objectAnimatorOfFloat;
        bg bgVar2 = new bg("scaleAnimation", 0.5f);
        this.X = bgVar2;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, bgVar2, 0.5f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setRepeatCount(0);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        final int i2 = 1;
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j4c
            public final /* synthetic */ k4c b;

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
                        this.b.invalidateSelf();
                        break;
                }
            }
        });
        this.Y = objectAnimatorOfFloat2;
    }

    public static int a(int i) {
        return i >= tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density) ? tu0.G(16 * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density) ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : tu0.G(4 * fk4.d().getDisplayMetrics().density);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        this.b.draw(canvas);
        int iSave = canvas.save();
        try {
            float fCenterX = getBounds().centerX();
            float fCenterY = getBounds().centerY();
            float fCenterX2 = drawable.getBounds().centerX();
            float fCenterY2 = drawable.getBounds().centerY();
            canvas.rotate(this.c.a, fCenterX, fCenterY);
            float f = this.X.a;
            canvas.scale(f, f, fCenterX, fCenterY);
            canvas.translate(fCenterX - fCenterX2, fCenterY - fCenterY2);
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
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
        return this.o.isRunning() || this.Y.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.setBounds(rect);
        int iA = a(rect.width());
        int iA2 = a(rect.height());
        this.a.setBounds(0, 0, rect.width() - iA, rect.height() - iA2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.o.start();
        this.Y.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.o.cancel();
        this.Y.cancel();
    }
}
