package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* loaded from: classes.dex */
public final class pnc extends Drawable {
    public final Bitmap a;
    public final int b;
    public final BitmapShader e;
    public final int j;
    public final int k;
    public final int c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f = new Matrix();
    public final Rect g = new Rect();
    public final RectF h = new RectF();
    public boolean i = true;

    public pnc(Resources resources, Bitmap bitmap) {
        this.b = 160;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap == null) {
            this.k = -1;
            this.j = -1;
            this.e = null;
        } else {
            int i = this.b;
            this.j = bitmap.getScaledWidth(i);
            this.k = bitmap.getScaledHeight(i);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public final void b() {
        if (this.i) {
            a(this.c, this.j, this.k, getBounds(), this.g);
            RectF rectF = this.h;
            rectF.set(this.g);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                Matrix matrix = this.f;
                matrix.setTranslate(rectF.left, rectF.top);
                float fWidth = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.i = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        b();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.g, paint);
        } else {
            canvas.drawRoundRect(this.h, 0.0f, 0.0f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.c != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        b();
        outline.setRoundRect(this.g, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.d;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }
}
