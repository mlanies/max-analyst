package defpackage;

import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class dc0 {
    public final Size a;
    public final Map b;
    public final Size c;
    public final Map d;
    public final Size e;
    public final Map f;
    public final Map g;

    public dc0(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.a = size;
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.c = size2;
        this.d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.e = size3;
        this.f = map3;
        this.g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc0)) {
            return false;
        }
        dc0 dc0Var = (dc0) obj;
        return this.a.equals(dc0Var.a) && this.b.equals(dc0Var.b) && this.c.equals(dc0Var.c) && this.d.equals(dc0Var.d) && this.e.equals(dc0Var.e) && this.f.equals(dc0Var.f) && this.g.equals(dc0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
