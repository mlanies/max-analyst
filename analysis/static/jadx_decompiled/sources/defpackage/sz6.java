package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class sz6 extends Drawable {
    public final Paint a;
    public int[] b;
    public float c;
    public final float d;

    public sz6() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        this.a = paint;
        this.b = new int[0];
        this.d = 5.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.b.length < 2) {
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth > iHeight) {
            iWidth = iHeight;
        }
        Paint paint = this.a;
        float strokeWidth = (iWidth - paint.getStrokeWidth()) / 2;
        this.c = (this.c + this.d) % 360;
        paint.setShader(new SweepGradient(bounds.exactCenterX(), bounds.exactCenterY(), this.b, (float[]) null));
        canvas.save();
        canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), strokeWidth, paint);
        canvas.restore();
        invalidateSelf();
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

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
