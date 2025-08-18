package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public final class oo7 extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final Context a;
    public final int b;
    public final je7 c;
    public final bg o;

    public oo7(int i, int i2, Context context) {
        this.a = context;
        this.b = i2;
        this.c = tu0.r(3, new ga5(i, 1, this));
        bg bgVar = new bg("rotation", 0.0f);
        this.o = bgVar;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, bgVar, 0.0f, 359.0f);
        objectAnimatorOfFloat.setDuration(1200L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addUpdateListener(new z00(11, this));
        this.X = objectAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.o.a, getBounds().centerX(), getBounds().centerY());
        ((Drawable) this.c.getValue()).draw(canvas);
        canvas.restore();
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
        return this.X.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.c.getValue()).setBounds(rect);
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
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.X.cancel();
    }
}
