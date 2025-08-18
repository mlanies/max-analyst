package defpackage;

/* loaded from: classes.dex */
public final class fk {
    public final long a;

    public fk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && ft4.d(this.a, ((fk) obj).a);
    }

    public final int hashCode() {
        int i = ft4.o;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.i("AnrConfig(timeout=", ft4.j(this.a), ")");
    }
}
