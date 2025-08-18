package defpackage;

/* loaded from: classes.dex */
public final class ym1 extends j1e {
    public final String d;
    public final boolean e;

    public ym1(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym1)) {
            return false;
        }
        ym1 ym1Var = (ym1) obj;
        return tpa.f(this.d, ym1Var.d) && this.e == ym1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.d + ", isJoinByExistLink=" + this.e + ")";
    }
}
