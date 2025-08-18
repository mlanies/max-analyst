package defpackage;

/* loaded from: classes.dex */
public final class l51 implements t51 {
    public final long a;

    public l51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l51) && this.a == ((l51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
