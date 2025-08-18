package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class yb0 {
    public final Size a;
    public final Rect b;
    public final ax1 c;
    public final int d;
    public final boolean e;

    public yb0(Size size, Rect rect, ax1 ax1Var, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.c = ax1Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        if (this.a.equals(yb0Var.a) && this.b.equals(yb0Var.b)) {
            ax1 ax1Var = yb0Var.c;
            ax1 ax1Var2 = this.c;
            if (ax1Var2 != null ? ax1Var2.equals(ax1Var) : ax1Var == null) {
                if (this.d == yb0Var.d && this.e == yb0Var.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ax1 ax1Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (ax1Var == null ? 0 : ax1Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return au1.j(sb, this.e, "}");
    }
}
