package defpackage;

/* loaded from: classes.dex */
public final class da0 {
    public final cb0 a;
    public final cb0 b;

    public da0(cb0 cb0Var, cb0 cb0Var2) {
        this.a = cb0Var;
        this.b = cb0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0Var = (da0) obj;
        return this.a.equals(da0Var.a) && this.b.equals(da0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
