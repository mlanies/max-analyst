package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class e4f extends Drawable implements Animatable, kre {
    public int Y;
    public int Z;
    public final m56 a;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public boolean x0;
    public float y0;
    public final int b = 3;
    public final Paint c = new Paint(1);
    public int o = 255;
    public final Rect X = new Rect();
    public final gwe w0 = new gwe(3, this);

    public e4f(fka fkaVar, m56 m56Var) {
        this.a = m56Var;
        onThemeChanged(fkaVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i2 = bounds.left;
            int i3 = this.Y;
            int i4 = (i3 * i) + i2;
            Rect rect = this.X;
            rect.left = i4;
            int i5 = bounds.top;
            rect.top = i5;
            rect.right = i4 + i3;
            rect.bottom = i5 + this.Z;
            float f = 2;
            float fSin = (((float) Math.sin(this.y0 + ((r2 - i) + 1))) + 1) / f;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            float f2 = this.s0;
            float f3 = (((this.t0 - f2) * fSin) + f2) / f;
            float f4 = this.u0;
            float f5 = (((this.v0 - f4) * fSin) + f4) * (this.o / 255.0f);
            Paint paint = this.c;
            paint.setAlpha((int) (f5 * 255));
            canvas.drawCircle(fExactCenterX, fExactCenterY, f3, paint);
            i++;
        }
        if (this.x0) {
            this.y0 += 0.1f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.Y = bounds.width() / this.b;
        int iHeight = bounds.height();
        this.Z = iHeight;
        float fMin = Math.min(this.Y, iHeight);
        this.s0 = 0.44f * fMin;
        this.t0 = fMin * 0.66f;
        this.u0 = 0.4f;
        this.v0 = 1.0f;
        invalidateSelf();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int iIntValue = ((Number) this.a.invoke(fkaVar)).intValue();
        int iAlpha = Color.alpha(iIntValue);
        Paint paint = this.c;
        if (iIntValue == paint.getColor() && this.o == iAlpha) {
            return;
        }
        paint.setColor(iIntValue);
        setAlpha(iAlpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.c;
        if (tpa.f(colorFilter, paint.getColorFilter())) {
            return;
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.x0) {
            return;
        }
        this.x0 = true;
        scheduleSelf(this.w0, SystemClock.uptimeMillis() + 8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.x0) {
            this.x0 = false;
            unscheduleSelf(this.w0);
            this.y0 = 0.0f;
        }
    }
}
