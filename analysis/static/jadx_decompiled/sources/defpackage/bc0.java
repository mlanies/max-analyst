package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final class bc0 {
    public final int a;
    public final Surface b;

    public bc0(int i, Surface surface) {
        this.a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        return this.a == bc0Var.a && this.b.equals(bc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
