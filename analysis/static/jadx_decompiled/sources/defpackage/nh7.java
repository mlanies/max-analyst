package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class nh7 extends wq4 {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    @Override // defpackage.wq4
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.b = rect.width();
        tj0 tj0Var = this.a;
        float f2 = ((xh7) tj0Var).a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((xh7) tj0Var).j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = this.b / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        this.e = ((xh7) tj0Var).a / 2 == ((xh7) tj0Var).b;
        this.c = ((xh7) tj0Var).a * f;
        this.d = Math.min(((xh7) tj0Var).a / 2, ((xh7) tj0Var).b) * f;
        if (z || z2) {
            if ((z && ((xh7) tj0Var).e == 2) || (z2 && ((xh7) tj0Var).f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((xh7) tj0Var).f != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * ((xh7) tj0Var).a) / 2.0f);
            }
        }
        if (z2 && ((xh7) tj0Var).f == 3) {
            this.f = f;
        } else {
            this.f = 1.0f;
        }
    }

    @Override // defpackage.wq4
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int iJ = mr0.j(i, i2);
        xh7 xh7Var = (xh7) this.a;
        if (xh7Var.k <= 0 || iJ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iJ);
        PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), 0.0f);
        int i3 = xh7Var.k;
        h(canvas, paint, pointF, null, i3, i3);
    }

    @Override // defpackage.wq4
    public final void c(Canvas canvas, Paint paint, vq4 vq4Var, int i) {
        int iJ = mr0.j(vq4Var.c, i);
        float f = vq4Var.a;
        float f2 = vq4Var.b;
        int i2 = vq4Var.d;
        g(canvas, paint, f, f2, iJ, i2, i2);
    }

    @Override // defpackage.wq4
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        g(canvas, paint, f, f2, mr0.j(i, i2), i3, i3);
    }

    @Override // defpackage.wq4
    public final int e() {
        return ((xh7) this.a).a;
    }

    @Override // defpackage.wq4
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        float fO = z04.o(f, 0.0f, 1.0f);
        float fO2 = z04.o(f2, 0.0f, 1.0f);
        float fX = fp3.x(1.0f - this.f, 1.0f, fO);
        float fX2 = fp3.x(1.0f - this.f, 1.0f, fO2);
        int iO = (int) ((z04.o(fX, 0.0f, 0.01f) * i2) / 0.01f);
        float fO3 = 1.0f - z04.o(fX2, 0.99f, 1.0f);
        float f3 = this.b;
        int i4 = (int) ((fX * f3) + iO);
        int i5 = (int) ((fX2 * f3) - ((int) ((fO3 * i3) / 0.01f)));
        float f4 = (-f3) / 2.0f;
        if (i4 <= i5) {
            float f5 = this.d;
            float f6 = i4 + f5;
            float f7 = i5 - f5;
            float f8 = f5 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.c);
            if (f6 >= f7) {
                h(canvas, paint, new PointF(f6 + f4, 0.0f), new PointF(f7 + f4, 0.0f), f8, this.c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f9 = f6 + f4;
            float f10 = f7 + f4;
            canvas.drawLine(f9, 0.0f, f10, 0.0f, paint);
            if (this.e || this.d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f6 > 0.0f) {
                h(canvas, paint, new PointF(f9, 0.0f), null, f8, this.c);
            }
            if (f7 < this.b) {
                h(canvas, paint, new PointF(f10, 0.0f), null, f8, this.c);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f, float f2) {
        float fMin = Math.min(f2, this.c);
        float f3 = f / 2.0f;
        float fMin2 = Math.min(f3, (this.d * fMin) / this.c);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f3, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
