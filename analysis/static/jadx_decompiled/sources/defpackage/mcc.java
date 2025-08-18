package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class mcc extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final je7 Y;
    public final je7 Z;
    public final Context a;
    public final hg b;
    public final ObjectAnimator c;
    public final hg o;

    public mcc(Context context) {
        this.a = context;
        hg hgVar = new hg("bgAlpha", 255);
        this.b = hgVar;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, 255, 128, 255);
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        final int i = 0;
        objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lcc
            public final /* synthetic */ mcc b;

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
        this.c = objectAnimatorOfInt;
        hg hgVar2 = new hg("indicatorAlpha", 255);
        this.o = hgVar2;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, hgVar2, 255, 0, 255);
        objectAnimatorOfInt2.setDuration(2000L);
        objectAnimatorOfInt2.setRepeatCount(-1);
        objectAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        final int i2 = 1;
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: lcc
            public final /* synthetic */ mcc b;

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
        this.X = objectAnimatorOfInt2;
        this.Y = tu0.r(3, new hbc(3));
        this.Z = tu0.r(3, new lwa(13, this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        je7 je7Var = this.Y;
        ((ShapeDrawable) je7Var.getValue()).setAlpha(this.b.a);
        ((ShapeDrawable) je7Var.getValue()).draw(canvas);
        int iWidth = getBounds().width() / 2;
        je7 je7Var2 = this.Z;
        float fWidth = iWidth - (((ShapeDrawable) je7Var2.getValue()).getBounds().width() / 2);
        float fHeight = (getBounds().height() / 2) - (((ShapeDrawable) je7Var2.getValue()).getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(fWidth, fHeight);
        try {
            ((ShapeDrawable) je7Var2.getValue()).setAlpha(this.o.a);
            ((ShapeDrawable) je7Var2.getValue()).draw(canvas);
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
        return this.c.isRunning() || this.X.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.Y.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int iMin = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.Z.getValue()).setBounds(0, 0, iMin, iMin);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c.start();
        this.X.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c.cancel();
        this.X.cancel();
    }
}
