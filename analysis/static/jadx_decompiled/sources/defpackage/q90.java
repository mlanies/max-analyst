package defpackage;

/* loaded from: classes.dex */
public final class q90 {
    public final int a;
    public final long b;

    public q90(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj;
        return this.a == q90Var.a && this.b == q90Var.b;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.a);
        sb.append(", timestampNs=");
        return zr6.k(sb, this.b, "}");
    }
}
