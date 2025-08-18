package defpackage;

/* loaded from: classes.dex */
public final class s2d {
    public final long a;
    public final long b;

    public s2d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s2d.class != obj.getClass()) {
            return false;
        }
        s2d s2dVar = (s2d) obj;
        return this.a == s2dVar.a && this.b == s2dVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
