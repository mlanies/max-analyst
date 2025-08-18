package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class psc extends g06 {
    public rsc X;
    public Float Y;
    public PointF Z;
    public int s0;
    public int t0;
    public Matrix u0;
    public final Matrix v0;

    public psc(Drawable drawable, rsc rscVar) {
        super(drawable);
        this.v0 = new Matrix();
        this.X = rscVar;
    }

    @Override // defpackage.g06, defpackage.b1f
    public final void d(Matrix matrix) {
        n(matrix);
        q();
        Matrix matrix2 = this.u0;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        q();
        if (this.u0 == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.u0);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.g06
    public final Drawable o(Drawable drawable) {
        Drawable drawableO = super.o(drawable);
        p();
        return drawableO;
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.t0 = 0;
            this.s0 = 0;
            this.u0 = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.s0 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.t0 = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.u0 = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.u0 = null;
            return;
        }
        if (this.X == ssc.r) {
            drawable.setBounds(bounds);
            this.u0 = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        Matrix matrix = this.v0;
        matrix.reset();
        rsc rscVar = this.X;
        PointF pointF = this.Z;
        rscVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
        this.u0 = matrix;
    }

    public final void q() {
        boolean z;
        rsc rscVar = this.X;
        if (rscVar instanceof qsc) {
            Float fValueOf = Float.valueOf(((qsc) rscVar).j);
            z = !fValueOf.equals(this.Y);
            this.Y = fValueOf;
        } else {
            z = false;
        }
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        if (this.s0 == drawable.getIntrinsicWidth() && this.t0 == drawable.getIntrinsicHeight() && !z) {
            return;
        }
        p();
    }

    public final void r(PointF pointF) {
        if (j47.B(this.Z, pointF)) {
            return;
        }
        if (pointF == null) {
            this.Z = null;
        } else {
            if (this.Z == null) {
                this.Z = new PointF();
            }
            this.Z.set(pointF);
        }
        p();
        invalidateSelf();
    }
}
