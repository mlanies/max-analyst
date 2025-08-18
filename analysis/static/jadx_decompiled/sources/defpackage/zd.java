package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;

/* loaded from: classes.dex */
public final class zd implements cag {
    public final boolean Y;
    public final xv1 a;
    public final Range b;
    public lq1 o;
    public float c = 1.0f;
    public float X = 1.0f;

    public zd(xv1 xv1Var) {
        boolean z = false;
        this.Y = false;
        this.a = xv1Var;
        this.b = (Range) xv1Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) xv1Var.b.a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.Y = z;
    }

    @Override // defpackage.cag
    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.o != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.X == f.floatValue()) {
                this.o.b(null);
                this.o = null;
            }
        }
    }

    @Override // defpackage.cag
    public final void b(re6 re6Var) {
        re6Var.r0(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (!this.Y || Build.VERSION.SDK_INT < 34) {
            return;
        }
        re6Var.r0(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    @Override // defpackage.cag
    public final float c() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    @Override // defpackage.cag
    public final float d() {
        return ((Float) this.b.getLower()).floatValue();
    }

    @Override // defpackage.cag
    public final Rect e() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // defpackage.cag
    public final void f(float f, lq1 lq1Var) {
        this.c = f;
        lq1 lq1Var2 = this.o;
        if (lq1Var2 != null) {
            lq1Var2.d(new CameraControl$OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.X = this.c;
        this.o = lq1Var;
    }

    @Override // defpackage.cag
    public final void g() {
        this.c = 1.0f;
        lq1 lq1Var = this.o;
        if (lq1Var != null) {
            lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            this.o = null;
        }
    }
}
