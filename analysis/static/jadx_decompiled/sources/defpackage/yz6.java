package defpackage;

/* loaded from: classes.dex */
public final class yz6 {
    public final int a;
    public final Object b;

    public yz6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz6)) {
            return false;
        }
        yz6 yz6Var = (yz6) obj;
        return this.a == yz6Var.a && tpa.f(this.b, yz6Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
