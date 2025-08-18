package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fc0 {
    public int a;
    public final Executor b;
    public final ey1 c;
    public final Rect d;
    public final Matrix e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;

    public fc0(Executor executor, ey1 ey1Var, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        this.a = ((CaptureFailedRetryQuirk) wi4.a.e(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.b = executor;
        this.c = ey1Var;
        this.d = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.e = matrix;
        this.f = i;
        this.g = i2;
        this.h = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0Var = (fc0) obj;
        if (this.b.equals(fc0Var.b)) {
            ey1 ey1Var = fc0Var.c;
            ey1 ey1Var2 = this.c;
            if (ey1Var2 != null ? ey1Var2.equals(ey1Var) : ey1Var == null) {
                if (this.d.equals(fc0Var.d) && this.e.equals(fc0Var.e) && this.f == fc0Var.f && this.g == fc0Var.g && this.h == fc0Var.h && this.i.equals(fc0Var.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        ey1 ey1Var = this.c;
        return this.i.hashCode() ^ ((((((((((((iHashCode ^ (ey1Var == null ? 0 : ey1Var.hashCode())) * 583896283) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.b);
        sb.append(", inMemoryCallback=");
        sb.append(this.c);
        sb.append(", onDiskCallback=null, outputFileOptions=null, cropRect=");
        sb.append(this.d);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", rotationDegrees=");
        sb.append(this.f);
        sb.append(", jpegQuality=");
        sb.append(this.g);
        sb.append(", captureMode=");
        sb.append(this.h);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return au1.i(sb, this.i, "}");
    }
}
