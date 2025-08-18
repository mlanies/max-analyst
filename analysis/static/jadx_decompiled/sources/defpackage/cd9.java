package defpackage;

/* loaded from: classes2.dex */
public final class cd9 {
    public final long a;

    public cd9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd9) && this.a == ((cd9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("MovieId(id="), this.a, ")");
    }
}
