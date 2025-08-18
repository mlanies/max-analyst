package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class v99 {
    public Rational a;

    public final u99 a(float f, float f2, float f3) {
        PointF pointF;
        r8b r8bVar = (r8b) this;
        float[] fArr = {f, f2};
        synchronized (r8bVar) {
            try {
                Matrix matrix = r8bVar.d;
                if (matrix == null) {
                    pointF = r8b.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        u99 u99Var = new u99();
        u99Var.a = f4;
        u99Var.b = f5;
        u99Var.c = f3;
        u99Var.d = rational;
        return u99Var;
    }
}
