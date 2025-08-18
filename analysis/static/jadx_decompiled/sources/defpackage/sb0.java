package defpackage;

/* loaded from: classes.dex */
public final class sb0 {
    public final long a;
    public final long b;
    public final long c;

    public sb0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0Var = (sb0) obj;
        return this.a == sb0Var.a && this.b == sb0Var.b && this.c == sb0Var.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return zr6.k(sb, this.c, "}");
    }
}
