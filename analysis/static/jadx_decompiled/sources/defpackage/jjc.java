package defpackage;

/* loaded from: classes2.dex */
public final class jjc {
    public final long a;

    public jjc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjc) && this.a == ((jjc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("RestrictionsInfo(expiration="), this.a, ")");
    }
}
