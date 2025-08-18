package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class b8b implements z18 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public final int d = 0;
    public float e = -1.0f;
    public float f = -1.0f;
    public Matrix g = new Matrix();

    public b8b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static b8b e(int i, int i2) {
        fm9.e("width " + i + " must be positive", i > 0);
        fm9.e("height " + i2 + " must be positive", i2 > 0);
        return new b8b(i, i2);
    }

    @Override // defpackage.z18
    public final Matrix a() {
        Matrix matrix = this.g;
        fm9.m(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.z18
    public final boolean c(int i, int i2) {
        d(i, i2);
        Matrix matrix = this.g;
        fm9.l(matrix);
        return matrix.isIdentity() && i == Math.round(this.e) && i2 == Math.round(this.f);
    }

    @Override // defpackage.z18
    public final lsd d(int i, int i2) {
        fm9.e("inputWidth must be positive", i > 0);
        fm9.e("inputHeight must be positive", i2 > 0);
        Matrix matrix = new Matrix();
        this.g = matrix;
        float f = i;
        this.e = f;
        float f2 = i2;
        this.f = f2;
        int i3 = this.b;
        int i4 = this.a;
        if (i4 != -1 && i3 != -1) {
            this.c = i4 / i3;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            int i5 = this.d;
            if (i5 == 0) {
                if (f3 > f4) {
                    matrix.setScale(f4 / f3, 1.0f);
                    this.e = this.f * this.c;
                } else {
                    matrix.setScale(1.0f, f3 / f4);
                    this.f = this.e / this.c;
                }
            } else if (i5 == 1) {
                if (f3 > f4) {
                    matrix.setScale(1.0f, f3 / f4);
                    this.f = this.e / this.c;
                } else {
                    matrix.setScale(f4 / f3, 1.0f);
                    this.e = this.f * this.c;
                }
            } else if (i5 == 2) {
                if (f3 > f4) {
                    this.e = f2 * f3;
                } else {
                    this.f = f / f3;
                }
            }
        }
        if (i3 != -1) {
            if (i4 != -1) {
                this.e = i4;
            } else {
                this.e = (i3 * this.e) / this.f;
            }
            this.f = i3;
        }
        return new lsd(Math.round(this.e), Math.round(this.f));
    }
}
