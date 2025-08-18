package defpackage;

/* loaded from: classes2.dex */
public final class nv extends qv {
    public final long a;

    public nv(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv) && this.a == ((nv) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("LoadingAround(time="), this.a, ")");
    }
}
