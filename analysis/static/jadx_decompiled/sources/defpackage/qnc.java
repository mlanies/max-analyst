package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qnc extends Drawable implements nnc {
    public float[] c;
    public final int x0;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public final Paint o = new Paint(1);
    public boolean X = false;
    public float Y = 0.0f;
    public float Z = 0.0f;
    public int s0 = 0;
    public boolean t0 = false;
    public boolean u0 = false;
    public final Path v0 = new Path();
    public final Path w0 = new Path();
    public final RectF y0 = new RectF();
    public int z0 = 255;

    public qnc(int i) {
        this.x0 = 0;
        if (this.x0 != i) {
            this.x0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void a(int i, float f) {
        if (this.s0 != i) {
            this.s0 = i;
            invalidateSelf();
        }
        if (this.Y != f) {
            this.Y = f;
            d();
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void b(boolean z) {
        this.X = z;
        d();
        invalidateSelf();
    }

    @Override // defpackage.nnc
    public final void c() {
        Arrays.fill(this.a, 0.0f);
        d();
        invalidateSelf();
    }

    public final void d() {
        float[] fArr;
        float[] fArr2;
        Path path = this.v0;
        path.reset();
        Path path2 = this.w0;
        path2.reset();
        RectF rectF = this.y0;
        rectF.set(getBounds());
        float f = this.Y;
        rectF.inset(f / 2.0f, f / 2.0f);
        boolean z = this.X;
        int i = 0;
        float[] fArr3 = this.a;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (fArr3[i2] + this.Z) - (this.Y / 2.0f);
                i2++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = this.Y;
        rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.Z + (this.t0 ? this.Y : 0.0f);
        rectF.inset(f3, f3);
        if (this.X) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else if (this.t0) {
            if (this.c == null) {
                this.c = new float[8];
            }
            while (true) {
                fArr2 = this.c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = fArr3[i] - this.Y;
                i++;
            }
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.o;
        paint.setColor(m6d.z(this.x0, this.z0));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.u0);
        canvas.drawPath(this.v0, paint);
        if (this.Y != 0.0f) {
            paint.setColor(m6d.z(this.s0, this.z0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.Y);
            canvas.drawPath(this.w0, paint);
        }
    }

    @Override // defpackage.nnc
    public final void e(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.z0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iZ = m6d.z(this.x0, this.z0) >>> 24;
        if (iZ != 0) {
            return iZ != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // defpackage.nnc
    public final void i(float f) {
        if (this.Z != f) {
            this.Z = f;
            d();
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void k() {
        if (this.t0) {
            this.t0 = false;
            d();
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void m(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            od2.k("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        d();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.z0) {
            this.z0 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
