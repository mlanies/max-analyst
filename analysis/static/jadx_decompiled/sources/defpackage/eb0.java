package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class eb0 {
    public final Object a;
    public final p55 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final pv1 h;

    public eb0(Object obj, p55 p55Var, int i, Size size, Rect rect, int i2, Matrix matrix, pv1 pv1Var) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
        this.b = p55Var;
        this.c = i;
        this.d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix;
        if (pv1Var == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.h = pv1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        if (this.a.equals(eb0Var.a)) {
            p55 p55Var = eb0Var.b;
            p55 p55Var2 = this.b;
            if (p55Var2 != null ? p55Var2.equals(p55Var) : p55Var == null) {
                if (this.c == eb0Var.c && this.d.equals(eb0Var.d) && this.e.equals(eb0Var.e) && this.f == eb0Var.f && this.g.equals(eb0Var.g) && this.h.equals(eb0Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        p55 p55Var = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (p55Var == null ? 0 : p55Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
