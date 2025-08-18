package defpackage;

/* loaded from: classes.dex */
public final class r2d {
    public final long a;
    public final long b;

    public r2d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2d.class != obj.getClass()) {
            return false;
        }
        r2d r2dVar = (r2d) obj;
        return this.a == r2dVar.a && this.b == r2dVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
