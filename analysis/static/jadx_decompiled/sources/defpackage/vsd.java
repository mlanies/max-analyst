package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vsd {
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;
    public final xh9 q;
    public final RectF r;
    public float s;

    public vsd() {
        xh9 xh9Var = new xh9();
        xh9Var.a = new float[16];
        this.q = xh9Var;
        this.r = new RectF();
    }

    public final float a(float f) {
        int i = this.p;
        RectF rectF = this.r;
        if (i <= 1) {
            return rectF.left;
        }
        xh9 xh9Var = this.q;
        int i2 = 0;
        float fA = (xh9Var.a(1) - xh9Var.a(0)) / 2.0f;
        int i3 = xh9Var.b - 1;
        float f2 = rectF.left;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            float fA2 = xh9Var.a(i4);
            float f3 = fA2 - f;
            if (Math.abs(f3) <= fA) {
                return fA2;
            }
            if (Math.abs(f3) < Math.abs(f2 - f)) {
                f2 = fA2;
            }
            if (fA2 < f) {
                i2 = i4 + 1;
            } else {
                i3 = i4 - 1;
            }
        }
        return f2;
    }

    public final void b(int i) {
        this.p = i;
        RectF rectF = this.r;
        float fG = tu0.G(rectF.width());
        int i2 = this.p - 1;
        if (i2 < 1) {
            i2 = 1;
        }
        float f = fG / i2;
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        float f2 = (((this.d - r3) - this.h) / 2.0f) + this.f;
        float f3 = iG / 2.0f;
        this.n = f2 - f3;
        this.o = f2 + f3;
        float f4 = rectF.left;
        int i3 = this.p;
        xh9 xh9Var = this.q;
        float[] fArr = xh9Var.a;
        if (fArr.length < i3) {
            xh9Var.a = Arrays.copyOf(fArr, Math.max(i3, (fArr.length * 3) / 2));
        }
        int i4 = this.p;
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = (i5 * f) + f4;
            int i6 = xh9Var.b;
            if (i6 <= i5) {
                int i7 = i6 + 1;
                float[] fArr2 = xh9Var.a;
                if (fArr2.length < i7) {
                    xh9Var.a = Arrays.copyOf(fArr2, Math.max(i7, (fArr2.length * 3) / 2));
                }
                float[] fArr3 = xh9Var.a;
                int i8 = xh9Var.b;
                fArr3[i8] = f5;
                xh9Var.b = i8 + 1;
            } else {
                if (i5 < 0 || i5 >= i6) {
                    StringBuilder sbN = rh4.n(i5, "set index ", " must be between 0 .. ");
                    sbN.append(xh9Var.b - 1);
                    throw new IndexOutOfBoundsException(sbN.toString());
                }
                float[] fArr4 = xh9Var.a;
                float f6 = fArr4[i5];
                fArr4[i5] = f5;
            }
        }
    }

    public final void c(float f) {
        RectF rectF = this.r;
        this.s = ote.d(f, rectF.left, rectF.right);
    }

    public final void d() {
        RectF rectF = this.r;
        float f = (((this.d - r1) - this.h) / 2.0f) + this.f;
        rectF.top = f;
        rectF.bottom = f;
        float fB = ote.b(this.e + this.i, 0.0f);
        rectF.left = fB;
        float fB2 = ote.b((this.c - this.g) - this.k, fB);
        rectF.right = fB2;
        this.s = ote.d(this.s, rectF.left, fB2);
    }
}
