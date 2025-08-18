package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class tnc extends Drawable implements nnc, a1f {
    public RectF A0;
    public Matrix G0;
    public Matrix H0;
    public b1f N0;
    public final Drawable a;
    public float[] v0;
    public boolean b = false;
    public boolean c = false;
    public float o = 0.0f;
    public final Path X = new Path();
    public boolean Y = true;
    public int Z = 0;
    public final Path s0 = new Path();
    public final float[] t0 = new float[8];
    public final float[] u0 = new float[8];
    public final RectF w0 = new RectF();
    public final RectF x0 = new RectF();
    public final RectF y0 = new RectF();
    public final RectF z0 = new RectF();
    public final Matrix B0 = new Matrix();
    public final Matrix C0 = new Matrix();
    public final Matrix D0 = new Matrix();
    public final Matrix E0 = new Matrix();
    public final Matrix F0 = new Matrix();
    public final Matrix I0 = new Matrix();
    public float J0 = 0.0f;
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = true;

    public tnc(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.nnc
    public final void a(int i, float f) {
        if (this.Z == i && this.o == f) {
            return;
        }
        this.Z = i;
        this.o = f;
        this.M0 = true;
        invalidateSelf();
    }

    @Override // defpackage.nnc
    public final void b(boolean z) {
        this.b = z;
        this.M0 = true;
        invalidateSelf();
    }

    @Override // defpackage.nnc
    public final void c() {
        Arrays.fill(this.t0, 0.0f);
        this.c = false;
        this.M0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    public final void d() {
        if (this.M0) {
            Path path = this.s0;
            path.reset();
            RectF rectF = this.w0;
            float f = this.o;
            rectF.inset(f / 2.0f, f / 2.0f);
            boolean z = this.b;
            float[] fArr = this.u0;
            float[] fArr2 = this.t0;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (fArr2[i] + this.J0) - (this.o / 2.0f);
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = this.o;
            rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
            Path path2 = this.X;
            path2.reset();
            float f3 = this.J0 + (this.K0 ? this.o : 0.0f);
            rectF.inset(f3, f3);
            if (this.b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else if (this.K0) {
                if (this.v0 == null) {
                    this.v0 = new float[8];
                }
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    this.v0[i2] = fArr2[i2] - this.o;
                }
                path2.addRoundRect(rectF, this.v0, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.M0 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (f46.W()) {
            f46.e("RoundedDrawable#draw");
        }
        this.a.draw(canvas);
        if (f46.W()) {
            f46.A();
        }
    }

    @Override // defpackage.nnc
    public final void e(boolean z) {
        if (this.L0 != z) {
            this.L0 = z;
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnc.f():void");
    }

    public void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // defpackage.nnc
    public final void i(float f) {
        if (this.J0 != f) {
            this.J0 = f;
            this.M0 = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.nnc
    public final void k() {
        if (this.K0) {
            this.K0 = false;
            this.M0 = true;
            invalidateSelf();
        }
    }

    @Override // defpackage.a1f
    public final void l(b1f b1fVar) {
        this.N0 = b1fVar;
    }

    @Override // defpackage.nnc
    public final void m(float[] fArr) {
        float[] fArr2 = this.t0;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.c = false;
        } else {
            od2.k("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > 0.0f;
            }
        }
        this.M0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
