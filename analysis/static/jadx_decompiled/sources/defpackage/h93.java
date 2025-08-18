package defpackage;

/* loaded from: classes2.dex */
public final class h93 {
    public final g93 a;
    public final i93 b;

    public h93(g93 g93Var, i93 i93Var) {
        this.a = g93Var;
        this.b = i93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        return tpa.f(this.a, h93Var.a) && tpa.f(this.b, h93Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonStatesBackgroundColors(active=" + this.a + ", disabled=" + this.b + ")";
    }
}
