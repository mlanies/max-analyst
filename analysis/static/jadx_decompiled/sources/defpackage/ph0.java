package defpackage;

/* loaded from: classes2.dex */
public final class ph0 {
    public final long a;
    public final pke b;

    public ph0(long j, pke pkeVar) {
        this.a = j;
        this.b = pkeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        return this.a == ph0Var.a && tpa.f(this.b, ph0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
