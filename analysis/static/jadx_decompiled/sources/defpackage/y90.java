package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class y90 {
    public fw6 b;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Size h;
    public final int i;
    public final nu4 j;
    public final nu4 k;
    public iv1 a = new pz1();
    public final fw6 c = null;

    public y90(Size size, int i, int i2, boolean z, nu4 nu4Var, nu4 nu4Var2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.d = size;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = null;
        this.i = 35;
        this.j = nu4Var;
        this.k = nu4Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        if (this.d.equals(y90Var.d) && this.e == y90Var.e && this.f == y90Var.f && this.g == y90Var.g) {
            Size size = y90Var.h;
            Size size2 = this.h;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.i == y90Var.i && this.j.equals(y90Var.j) && this.k.equals(y90Var.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * (-721379959);
        Size size = this.h;
        return this.k.hashCode() ^ ((((((iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSize=" + this.h + ", postviewImageFormat=" + this.i + ", requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
