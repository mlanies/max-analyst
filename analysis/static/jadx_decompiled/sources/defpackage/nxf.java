package defpackage;

/* loaded from: classes2.dex */
public final class nxf extends oxf {
    public final long a;

    public nxf(long j) {
        this.a = j;
    }

    @Override // defpackage.oxf
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxf) && this.a == ((nxf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
