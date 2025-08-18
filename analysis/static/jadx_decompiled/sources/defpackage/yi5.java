package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yi5 extends Drawable {
    public final Paint a;
    public ui5 b;
    public ui5 c;
    public float d;
    public float e;
    public float f;
    public final float g;
    public final wi5 h;
    public final xi5 i;
    public long j;

    public yi5() {
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        ui5 ui5Var = ui5.a;
        this.b = ui5Var;
        this.c = ui5Var;
        this.d = 1.0f;
        this.g = 1.0f;
        this.h = new wi5(this);
        this.i = new xi5(this);
    }

    public final vi5 a() {
        ui5 ui5Var = this.b;
        ui5 ui5Var2 = this.c;
        int iOrdinal = ui5Var.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = ui5Var2.ordinal();
            if (iOrdinal2 == 0) {
                return vi5.a;
            }
            if (iOrdinal2 == 1) {
                return vi5.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal3 = ui5Var2.ordinal();
        if (iOrdinal3 == 0) {
            return vi5.c;
        }
        if (iOrdinal3 == 1) {
            return vi5.o;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return this.f > 0.01f || this.e > 0.01f;
    }

    public final void c(int i, int i2) {
        wi5 wi5Var = this.h;
        long j = wi5Var.f;
        int i3 = (int) (j >> 32);
        xi5 xi5Var = this.i;
        if (i3 != i || ((int) (j >> 32)) != i2 || xi5Var.j != i2) {
            invalidateSelf();
        }
        wi5Var.f = dy7.l(i, i2);
        xi5Var.j = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (b()) {
            wi5 wi5Var = this.h;
            if (wi5Var.h >= 0.01f) {
                float f = wi5Var.i;
                if (f < 0.99f) {
                    float interpolation = wi5Var.g.getInterpolation(f);
                    float fB = wmd.b(interpolation, wi5Var.d);
                    float fB2 = wmd.b(interpolation, wi5Var.c) / 2;
                    float fB3 = wmd.b(interpolation, wi5Var.a);
                    float fB4 = wmd.b(interpolation, wi5Var.b);
                    yi5 yi5Var = wi5Var.k;
                    Paint paint = yi5Var.a;
                    long j = wi5Var.f;
                    paint.setColor(f8.G(s63.c((int) (j >> 32), interpolation, (int) (j & 4294967295L)), wi5Var.h * yi5Var.e * yi5Var.d));
                    Paint paint2 = yi5Var.a;
                    paint2.setStrokeWidth(wi5Var.e);
                    canvas.drawLine(fB3, fB4, fB3, fB4 - fB, paint2);
                    float f2 = fB4 - fB2;
                    canvas.drawLine(fB3, fB4, fB3 - fB2, f2, paint2);
                    canvas.drawLine(fB3, fB4, fB3 + fB2, f2, paint2);
                }
            }
            xi5 xi5Var = this.i;
            if (xi5Var.i < 0.01f) {
                return;
            }
            float f3 = xi5Var.c;
            float f4 = xi5Var.d;
            float f5 = ((xi5Var.f * 360.0f) + 90.0f) % 360.0f;
            float fD = ote.d(xi5Var.g * 360.0f, 3.0f, 360.0f);
            yi5 yi5Var2 = xi5Var.m;
            yi5Var2.a.setColor(f8.G(xi5Var.j, xi5Var.i * yi5Var2.e * yi5Var2.d));
            Paint paint3 = yi5Var2.a;
            paint3.setStrokeWidth(xi5Var.e);
            canvas.drawArc(0.0f, 0.0f, f3, f4, f5, fD, false, paint3);
            float f6 = xi5Var.k;
            if (f6 > 0.01f) {
                float interpolation2 = xi5Var.l.getInterpolation(f6);
                float f7 = (interpolation2 * 1.5707964f) - 0.7853982f;
                float f8 = 2;
                float f9 = f3 / f8;
                float f10 = f4 / f8;
                float f11 = xi5Var.a;
                float f12 = xi5Var.b;
                float f13 = (f9 * f11) - f12;
                float f14 = (f11 * f10) - f12;
                double d = f7;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                double d2 = f7 + 1.5707964f;
                float fCos2 = (float) Math.cos(d2);
                float fSin2 = (float) Math.sin(d2);
                paint3.setColor(f8.G(paint3.getColor(), xi5Var.i * interpolation2 * yi5Var2.e * yi5Var2.d));
                float f15 = fCos * f13;
                float f16 = fSin * f14;
                canvas.drawLine(f9 - f15, f10 - f16, f9 + f15, f10 + f16, paint3);
                float f17 = f13 * fCos2;
                float f18 = f14 * fSin2;
                canvas.drawLine(f9 - f17, f10 - f18, f9 + f17, f10 + f18, paint3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(i4 - i2);
        float f = iAbs;
        float f2 = f / 2.0f;
        long jK = mr0.k(f2, f2);
        wi5 wi5Var = this.h;
        wi5Var.a = jK;
        float f3 = iAbs2;
        wi5Var.b = wmd.m(wi5Var.b, 0.0f, f3, 1);
        xi5 xi5Var = this.i;
        xi5Var.c = f;
        xi5Var.d = f3;
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final String toString() {
        return naf.h("(%s(%s), %.1f -> %.1f, %s, %s)", this.b, a(), Float.valueOf(this.e), Float.valueOf(this.f), this.h.toString(), this.i.toString());
    }
}
