package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class t44 extends Drawable implements cv6 {
    public int A0;
    public int B0;
    public int C0;
    public long D0;
    public rsc X;
    public int Z;
    public String a;
    public int b;
    public int c;
    public int o;
    public int s0;
    public int y0;
    public int z0;
    public HashMap Y = new HashMap();
    public final int t0 = 80;
    public final Paint u0 = new Paint(1);
    public final Matrix v0 = new Matrix();
    public final Rect w0 = new Rect();
    public final RectF x0 = new RectF();

    public t44() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i) {
        String strG = au1.g(str, ": ");
        Paint paint = this.u0;
        float fMeasureText = paint.measureText(strG);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.B0;
        int i3 = this.C0;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.A0 + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strG, this.B0, this.C0, paint);
        paint.setColor(i);
        canvas.drawText(str2, this.B0 + fMeasureText, this.C0, paint);
        this.C0 += this.A0;
    }

    public final void b() {
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.Y = new HashMap();
        this.Z = -1;
        this.s0 = -1;
        this.a = "none";
        invalidateSelf();
        this.D0 = -1L;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.u0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.B0 = this.y0;
        this.C0 = this.z0;
        a(canvas, "ID", this.a, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        a(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            a(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i = this.b;
        int i2 = this.c;
        rsc rscVar = this.X;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i3 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i > 0 && i2 > 0) {
            if (rscVar != null) {
                Rect rect = this.w0;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.v0;
                matrix.reset();
                rscVar.a(matrix, this.w0, i, i2, 0.0f, 0.0f);
                RectF rectF = this.x0;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f = iWidth2;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = iHeight2;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int iAbs = Math.abs(i - iWidth2);
            int iAbs2 = Math.abs(i2 - iHeight2);
            float f7 = iAbs;
            if (f7 < f2 && iAbs2 < f5) {
                i3 = -16711936;
            } else if (f7 < f3 && iAbs2 < f6) {
                i3 = -256;
            }
        }
        a(canvas, "I", this.b + "x" + this.c, i3);
        int i4 = this.c;
        if (i4 > 0) {
            a(canvas, "IAR", String.valueOf(Float.valueOf(this.b / i4)), -1);
        }
        a(canvas, "I", (this.o / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) + " KiB", -1);
        int i5 = this.Z;
        if (i5 > 0) {
            a(canvas, "anim", rh4.h("f ", i5, this.s0, ", l "), -1);
        }
        rsc rscVar2 = this.X;
        if (rscVar2 != null) {
            a(canvas, "scale", String.valueOf(rscVar2), -1);
        }
        long j = this.D0;
        if (j >= 0) {
            a(canvas, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.Y.entrySet()) {
            a(canvas, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.u0.setTextSize(iMin);
        int i = iMin + 8;
        this.A0 = i;
        int i2 = this.t0;
        if (i2 == 80) {
            this.A0 = i * (-1);
        }
        this.y0 = rect.left + 10;
        this.z0 = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
