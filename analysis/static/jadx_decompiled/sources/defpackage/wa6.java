package defpackage;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes2.dex */
public final class wa6 extends t37 {
    public ScaleGestureDetector N0;
    public zmc O0;
    public GestureDetector P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public boolean U0;
    public boolean V0;
    public int W0;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getDrawable() == null) {
            return true;
        }
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.J0);
            removeCallbacks(this.K0);
        }
        if (motionEvent.getPointerCount() > 1) {
            this.Q0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.R0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.P0.onTouchEvent(motionEvent);
        if (this.V0) {
            this.N0.onTouchEvent(motionEvent);
        }
        if (this.U0) {
            zmc zmcVar = this.O0;
            zmcVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                zmcVar.c = motionEvent.getX();
                zmcVar.d = motionEvent.getY();
                zmcVar.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                zmcVar.g = 0.0f;
                zmcVar.h = true;
            } else if (actionMasked == 1) {
                zmcVar.e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    zmcVar.a = motionEvent.getX();
                    zmcVar.b = motionEvent.getY();
                    zmcVar.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    zmcVar.g = 0.0f;
                    zmcVar.h = true;
                } else if (actionMasked == 6) {
                    zmcVar.f = -1;
                }
            } else if (zmcVar.e != -1 && zmcVar.f != -1 && motionEvent.getPointerCount() > zmcVar.f) {
                float x = motionEvent.getX(zmcVar.e);
                float y = motionEvent.getY(zmcVar.e);
                float x2 = motionEvent.getX(zmcVar.f);
                float y2 = motionEvent.getY(zmcVar.f);
                if (zmcVar.h) {
                    zmcVar.g = 0.0f;
                    zmcVar.h = false;
                } else {
                    float f = zmcVar.a;
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y2 - y, x2 - x))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(zmcVar.b - zmcVar.d, f - zmcVar.c))) % 360.0f);
                    zmcVar.g = degrees;
                    if (degrees < -180.0f) {
                        zmcVar.g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        zmcVar.g = degrees - 360.0f;
                    }
                }
                gaa gaaVar = zmcVar.i;
                if (gaaVar != null) {
                    float f2 = zmcVar.g;
                    wa6 wa6Var = (wa6) gaaVar.a;
                    float f3 = wa6Var.Q0;
                    float f4 = wa6Var.R0;
                    if (f2 != 0.0f) {
                        Matrix matrix = wa6Var.u0;
                        matrix.postRotate(f2, f3, f4);
                        wa6Var.setImageMatrix(matrix);
                    }
                }
                zmcVar.a = x2;
                zmcVar.b = y2;
                zmcVar.c = x;
                zmcVar.d = y;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }
}
