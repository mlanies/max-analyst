package defpackage;

/* loaded from: classes2.dex */
public final class b93 {
    public final c93 a;
    public final d93 b;
    public final e93 c;

    public b93(c93 c93Var, d93 d93Var, e93 e93Var) {
        this.a = c93Var;
        this.b = d93Var;
        this.c = e93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93Var = (b93) obj;
        return tpa.f(this.a, b93Var.a) && tpa.f(this.b, b93Var.b) && tpa.f(this.c, b93Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CommonShadowsColors(elevation2=" + this.a + ", topBar=" + this.b + ", writeBar=" + this.c + ")";
    }
}
