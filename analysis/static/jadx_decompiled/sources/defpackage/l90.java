package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public final class l90 {
    public final xb0 a;
    public final int b;
    public final Size c;
    public final eu4 d;
    public final List e;
    public final ce3 f;
    public final Range g;

    public l90(xb0 xb0Var, int i, Size size, eu4 eu4Var, List list, ce3 ce3Var, Range range) {
        if (xb0Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.a = xb0Var;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (eu4Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = eu4Var;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.e = list;
        this.f = ce3Var;
        this.g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        if (this.a.equals(l90Var.a) && this.b == l90Var.b && this.c.equals(l90Var.c) && this.d.equals(l90Var.d) && this.e.equals(l90Var.e)) {
            ce3 ce3Var = l90Var.f;
            ce3 ce3Var2 = this.f;
            if (ce3Var2 != null ? ce3Var2.equals(ce3Var) : ce3Var == null) {
                Range range = l90Var.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        ce3 ce3Var = this.f;
        int iHashCode2 = (iHashCode ^ (ce3Var == null ? 0 : ce3Var.hashCode())) * 1000003;
        Range range = this.g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
