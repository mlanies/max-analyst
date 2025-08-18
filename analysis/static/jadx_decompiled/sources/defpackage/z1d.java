package defpackage;

/* loaded from: classes.dex */
public final class z1d {
    public static final z1d c = new z1d(0, 0);
    public final long a;
    public final long b;

    public z1d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1d.class != obj.getClass()) {
            return false;
        }
        z1d z1dVar = (z1d) obj;
        return this.a == z1dVar.a && this.b == z1dVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return zr6.k(sb, this.b, "]");
    }
}
