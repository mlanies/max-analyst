package defpackage;

/* loaded from: classes2.dex */
public final class s5f implements u5f {
    public final long a;

    public s5f(long j) {
        this.a = j;
    }

    @Override // defpackage.u5f
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5f) && this.a == ((s5f) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("InitialEvent(mark="), this.a, ")");
    }
}
