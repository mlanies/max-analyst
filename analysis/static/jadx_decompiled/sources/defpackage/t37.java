package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import one.me.image.crop.view.ImageCropView;

/* loaded from: classes2.dex */
public abstract class t37 extends d1f {
    public final RectF C0;
    public final Matrix D0;
    public final RectF E0;
    public float F0;
    public float G0;
    public nz3 H0;
    public mz3 I0;
    public r37 J0;
    public s37 K0;
    public float L0;
    public float M0;

    public t37(Context context) {
        super(context);
        this.C0 = new RectF();
        this.D0 = new Matrix();
        this.E0 = new RectF();
        this.G0 = 10.0f;
        this.H0 = null;
        this.K0 = null;
    }

    private void setupInitialCropState(nz3 nz3Var) {
        Matrix matrix = this.u0;
        matrix.setValues(nz3Var.c);
        Matrix matrix2 = this.D0;
        matrix.invert(matrix2);
        RectF rectF = this.E0;
        RectF rectF2 = this.C0;
        rectF.set(rectF2);
        matrix2.mapRect(rectF);
        float fWidth = rectF.width();
        RectF rectF3 = nz3Var.a;
        float fMax = Math.max(fWidth / rectF3.width(), rectF.height() / rectF3.height());
        matrix.postScale(fMax, fMax, 0.0f, 0.0f);
        matrix.postTranslate(-f46.L(matrix, 2), -f46.L(matrix, 5));
        matrix.mapRect(rectF3);
        matrix.postTranslate(rectF2.left - rectF3.left, rectF2.top - rectF3.top);
        setImageMatrix(matrix);
    }

    @Override // defpackage.d1f
    public final void f() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.v0 = ngg.t(rectF);
            this.w0 = new float[]{rectF.centerX(), rectF.centerY()};
            this.y0 = true;
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 == null) {
            return;
        }
        float intrinsicWidth2 = drawable2.getIntrinsicWidth();
        float intrinsicHeight2 = drawable2.getIntrinsicHeight();
        if (this.F0 == 0.0f) {
            this.F0 = intrinsicWidth2 / intrinsicHeight2;
        }
        nz3 nz3Var = this.H0;
        if (nz3Var != null) {
            this.F0 = nz3Var.b;
        }
        mz3 mz3Var = this.I0;
        if (mz3Var != null) {
            ((ImageCropView) mz3Var).b.setTargetAspectRatio(this.F0);
        }
        h(intrinsicWidth2, intrinsicHeight2);
        Matrix matrix = this.u0;
        matrix.set(getInitialMatrix());
        setImageMatrix(matrix);
        nz3 nz3Var2 = this.H0;
        if (nz3Var2 != null) {
            setupInitialCropState(nz3Var2);
            this.H0 = null;
        }
    }

    public nz3 getCropState() {
        Matrix matrix = this.u0;
        Matrix matrix2 = this.D0;
        matrix.invert(matrix2);
        RectF rectF = this.E0;
        RectF rectF2 = this.C0;
        rectF.set(rectF2);
        float[] fArr = {rectF2.centerX(), rectF2.centerY()};
        matrix2.mapRect(rectF);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        return new nz3(rectF, rectF2.width() / rectF2.height(), fArr2);
    }

    public Matrix getInitialMatrix() {
        if (getDrawable() == null) {
            return new Matrix();
        }
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.C0;
        float fWidth = (measuredWidth - rectF.width()) / 2.0f;
        float measuredHeight = (getMeasuredHeight() - rectF.height()) / 2.0f;
        Matrix matrix = new Matrix();
        float f = this.M0;
        matrix.postScale(f, f);
        RectF rectF2 = this.E0;
        rectF2.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrix.mapRect(rectF2);
        matrix.postTranslate(fWidth, measuredHeight);
        return matrix;
    }

    public float getMaxScale() {
        return this.L0;
    }

    public float getMinScale() {
        return this.M0;
    }

    public float getTargetAspectRatio() {
        return this.F0;
    }

    public final void h(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = this.D0;
        matrix.reset();
        matrix.setRotate(getCurrentAngle());
        float[] fArrT = ngg.t(rectF);
        matrix.mapPoints(fArrT);
        RectF rectFJ = ngg.J(fArrT);
        RectF rectF2 = this.C0;
        float fMax = Math.max(Math.abs(rectF2.width() / rectFJ.width()), Math.abs(rectF2.height() / rectFJ.height()));
        this.M0 = fMax;
        this.L0 = fMax * this.G0;
    }

    public final boolean i(float[] fArr) {
        Matrix matrix = this.D0;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(fArrCopyOf);
        float[] fArrT = ngg.t(this.C0);
        matrix.mapPoints(fArrT);
        return ngg.J(fArrCopyOf).contains(ngg.J(fArrT));
    }

    public final void j(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            float currentScale = f / getCurrentScale();
            if (currentScale != 0.0f) {
                Matrix matrix = this.u0;
                matrix.postScale(currentScale, currentScale, f2, f3);
                setImageMatrix(matrix);
            }
        }
    }

    public void setCropBoundsChangeListener(mz3 mz3Var) {
        this.I0 = mz3Var;
    }

    public void setCropRect(RectF rectF) {
        this.F0 = rectF.width() / rectF.height();
        this.C0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        if (getDrawable() == null) {
            return;
        }
        h(r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
    }

    public void setImageToWrapCropBounds(boolean z) {
        float fMax;
        float f;
        float f2;
        if (this.y0) {
            float[] fArr = this.o;
            if (i(fArr)) {
                return;
            }
            float[] fArr2 = this.s0;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.C0;
            float fCenterX = rectF.centerX() - f3;
            float fCenterY = rectF.centerY() - f4;
            Matrix matrix = this.D0;
            matrix.reset();
            matrix.setTranslate(fCenterX, fCenterY);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(fArrCopyOf);
            boolean zI = i(fArrCopyOf);
            if (zI) {
                matrix.reset();
                matrix.setRotate(-getCurrentAngle());
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, fArr.length);
                float[] fArrT = ngg.t(rectF);
                matrix.mapPoints(fArrCopyOf2);
                matrix.mapPoints(fArrT);
                RectF rectFJ = ngg.J(fArrCopyOf2);
                RectF rectFJ2 = ngg.J(fArrT);
                float f5 = rectFJ.left - rectFJ2.left;
                float f6 = rectFJ.top - rectFJ2.top;
                float f7 = rectFJ.right - rectFJ2.right;
                float f8 = rectFJ.bottom - rectFJ2.bottom;
                if (f5 <= 0.0f) {
                    f5 = 0.0f;
                }
                if (f6 <= 0.0f) {
                    f6 = 0.0f;
                }
                if (f7 >= 0.0f) {
                    f7 = 0.0f;
                }
                if (f8 >= 0.0f) {
                    f8 = 0.0f;
                }
                float[] fArr3 = {f5, f6, f7, f8};
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapPoints(fArr3);
                float f9 = -(fArr3[0] + fArr3[2]);
                f2 = -(fArr3[1] + fArr3[3]);
                f = f9;
                fMax = 0.0f;
            } else {
                RectF rectF2 = new RectF(rectF);
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapRect(rectF2);
                float[] fArr4 = {(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
                fMax = (Math.max(rectF2.width() / fArr4[0], rectF2.height() / fArr4[1]) * currentScale) - currentScale;
                f = fCenterX;
                f2 = fCenterY;
            }
            if (fMax != 0.0f) {
                this.M0 = currentScale + fMax;
            }
            if (z) {
                r37 r37Var = new r37(this, f3, f4, f, f2, currentScale, fMax, zI);
                this.J0 = r37Var;
                post(r37Var);
            } else {
                g(f, f2);
                if (zI) {
                    return;
                }
                j(currentScale + fMax, rectF.centerX(), rectF.centerY());
            }
        }
    }

    public void setMaxScaleMultiplier(float f) {
        this.G0 = f;
    }
}
