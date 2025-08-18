package defpackage;

/* loaded from: classes2.dex */
public final class r36 {
    public final int a;
    public final long b;

    public r36(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r36)) {
            return false;
        }
        r36 r36Var = (r36) obj;
        return this.a == r36Var.a && this.b == r36Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FreezeStat(freezeCount=" + this.a + ", totalFreezeDuration=" + this.b + ")";
    }
}
