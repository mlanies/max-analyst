package defpackage;

/* loaded from: classes2.dex */
public final class uw0 {
    public final vw0 a;
    public final long b;

    public uw0(vw0 vw0Var, long j) {
        this.a = vw0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw0)) {
            return false;
        }
        uw0 uw0Var = (uw0) obj;
        return this.a == uw0Var.a && this.b == uw0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheItem(type=");
        sb.append(this.a);
        sb.append(", sizeBytes=");
        return zr6.k(sb, this.b, ")");
    }
}
