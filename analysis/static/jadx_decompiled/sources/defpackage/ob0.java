package defpackage;

/* loaded from: classes.dex */
public final class ob0 {
    public final long a;
    public final long b;
    public final p90 c;

    public ob0(long j, long j2, p90 p90Var) {
        this.a = j;
        this.b = j2;
        this.c = p90Var;
    }

    public static ob0 a(long j, long j2, p90 p90Var) {
        c54.j("duration must be positive value.", j >= 0);
        c54.j("bytes must be positive value.", j2 >= 0);
        return new ob0(j, j2, p90Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        return this.a == ob0Var.a && this.b == ob0Var.b && this.c.equals(ob0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.a + ", numBytesRecorded=" + this.b + ", audioStats=" + this.c + "}";
    }
}
