package defpackage;

/* loaded from: classes.dex */
public final class azc implements bzc {
    public final jl2 a;

    public azc(jl2 jl2Var) {
        this.a = jl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azc) && tpa.f(this.a, ((azc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
