package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class qsc implements rsc {
    public final rsc a;
    public final rsc b;
    public final Rect c;
    public final Rect d;
    public float j;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public final float[] i = new float[9];
    public final PointF e = null;
    public final PointF f = null;

    public qsc(fm9 fm9Var, fm9 fm9Var2, Rect rect, Rect rect2) {
        this.a = fm9Var;
        this.b = fm9Var2;
        this.c = rect;
        this.d = rect2;
    }

    @Override // defpackage.rsc
    public final Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        Rect rect2 = this.c;
        Rect rect3 = rect2 != null ? rect2 : rect;
        Rect rect4 = this.d;
        Rect rect5 = rect4 != null ? rect4 : rect;
        PointF pointF = this.e;
        this.a.a(matrix, rect3, i, i2, pointF == null ? f : pointF.x, pointF == null ? f2 : pointF.y);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        PointF pointF2 = this.f;
        this.b.a(matrix, rect5, i, i2, pointF2 == null ? f : pointF2.x, pointF2 == null ? f2 : pointF2.y);
        float[] fArr2 = this.h;
        matrix.getValues(fArr2);
        int i3 = 0;
        while (true) {
            float[] fArr3 = this.i;
            if (i3 >= 9) {
                matrix.setValues(fArr3);
                return matrix;
            }
            float f3 = fArr[i3];
            float f4 = this.j;
            fArr3[i3] = (fArr2[i3] * f4) + ((1.0f - f4) * f3);
            i3++;
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.b);
        String strValueOf4 = String.valueOf(this.f);
        StringBuilder sbK = k7d.k("InterpolatingScaleType(", strValueOf, " (", strValueOf2, ") -> ");
        sbK.append(strValueOf3);
        sbK.append(" (");
        sbK.append(strValueOf4);
        sbK.append("))");
        return sbK.toString();
    }
}
