package defpackage;

/* loaded from: classes2.dex */
public final class w6f {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ w6f(long j, long j2) {
        this(j, j2, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6f)) {
            return false;
        }
        w6f w6fVar = (w6f) obj;
        return this.a == w6fVar.a && this.b == w6fVar.b && this.c == w6fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        long j3 = this.c + j2;
        StringBuilder sbK = au1.k(j2, "Chunk[", " -> ");
        sbK.append(j + j2);
        sbK.append(" (position: ");
        sbK.append(j3);
        sbK.append(")]");
        return sbK.toString();
    }

    public w6f(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
