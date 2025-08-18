package defpackage;

/* loaded from: classes.dex */
public final class zyc implements bzc {
    public final oi0 a;

    public zyc(oi0 oi0Var) {
        this.a = oi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyc) && tpa.f(this.a, ((zyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchError(event=" + this.a + ")";
    }
}
