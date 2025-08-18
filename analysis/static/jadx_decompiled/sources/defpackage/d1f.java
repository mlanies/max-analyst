package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public abstract class d1f extends AppCompatImageView {
    public String A0;
    public float B0;
    public final float[] o;
    public final float[] s0;
    public final float[] t0;
    public final Matrix u0;
    public float[] v0;
    public float[] w0;
    public boolean x0;
    public boolean y0;
    public int z0;

    public d1f(Context context) {
        super(context, null, 0);
        this.o = new float[8];
        this.s0 = new float[2];
        this.t0 = new float[9];
        this.u0 = new Matrix();
        this.x0 = false;
        this.y0 = false;
        this.z0 = 0;
        wa6 wa6Var = (wa6) this;
        wa6Var.setScaleType(ImageView.ScaleType.MATRIX);
        wa6Var.P0 = new GestureDetector(wa6Var.getContext(), new q00(11, wa6Var), null, true);
        wa6Var.N0 = new ScaleGestureDetector(wa6Var.getContext(), new va6(wa6Var));
        gaa gaaVar = new gaa(wa6Var);
        zmc zmcVar = new zmc();
        zmcVar.i = gaaVar;
        zmcVar.e = -1;
        zmcVar.f = -1;
        wa6Var.O0 = zmcVar;
    }

    public abstract void f();

    public final void g(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        Matrix matrix = this.u0;
        matrix.postTranslate(f, f2);
        setImageMatrix(matrix);
    }

    public float getCurrentAngle() {
        Matrix matrix = this.u0;
        double dL = f46.L(matrix, 1);
        matrix.getValues(f46.c);
        return (float) (-(Math.atan2(dL, r2[0]) * 57.29577951308232d));
    }

    public float[] getCurrentImageCorners() {
        return this.o;
    }

    public Matrix getCurrentImageMatrix() {
        return this.u0;
    }

    public float[] getCurrentMatrixValues() {
        Matrix matrix = this.u0;
        float[] fArr = this.t0;
        matrix.getValues(fArr);
        return fArr;
    }

    public float getCurrentScale() {
        return f46.K(this.u0);
    }

    public String getImageOutputPath() {
        return this.A0;
    }

    public float[] getInitialImageCorners() {
        return this.v0;
    }

    public int getMaxBitmapSize() {
        if (this.z0 <= 0) {
            this.z0 = a14.f(getContext());
        }
        return this.z0;
    }

    public float getMinOverlaySize() {
        if (this.B0 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return getCurrentScale() * this.B0;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof ub5)) {
            return null;
        }
        return ((ub5) getDrawable()).b;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.x0 && !this.y0)) {
            getPaddingLeft();
            getPaddingTop();
            getWidth();
            getPaddingRight();
            getHeight();
            getPaddingBottom();
            f();
        }
    }

    public void setCurrentMatrixValues(float[] fArr) {
        Matrix matrix = this.u0;
        matrix.setValues(fArr);
        setImageMatrix(matrix);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new ub5(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.u0;
        matrix2.set(matrix);
        try {
            matrix2.mapPoints(this.o, this.v0);
            matrix2.mapPoints(this.s0, this.w0);
        } catch (Exception unused) {
        }
    }

    public void setMaxBitmapSize(int i) {
        this.z0 = i;
    }

    public void setMinImageSize(float f) {
        this.B0 = f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(c1f c1fVar) {
    }
}
