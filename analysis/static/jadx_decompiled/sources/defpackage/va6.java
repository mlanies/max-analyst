package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* loaded from: classes2.dex */
public final class va6 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ wa6 a;

    public va6(wa6 wa6Var) {
        this.a = wa6Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        wa6 wa6Var = this.a;
        float f = wa6Var.Q0;
        float f2 = wa6Var.R0;
        if (scaleFactor != 0.0f) {
            Matrix matrix = wa6Var.u0;
            matrix.postScale(scaleFactor, scaleFactor, f, f2);
            wa6Var.setImageMatrix(matrix);
        }
        wa6Var.S0 = scaleGestureDetector.getFocusX();
        wa6Var.T0 = scaleGestureDetector.getFocusY();
        return true;
    }
}
