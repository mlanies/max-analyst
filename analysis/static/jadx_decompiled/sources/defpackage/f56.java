package defpackage;

/* loaded from: classes2.dex */
public final class f56 {
    public final e56 a;
    public final e56 b;

    public f56(e56 e56Var, e56 e56Var2) {
        this.a = e56Var;
        this.b = e56Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f56)) {
            return false;
        }
        f56 f56Var = (f56) obj;
        return tpa.f(this.a, f56Var.a) && tpa.f(this.b, f56Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
