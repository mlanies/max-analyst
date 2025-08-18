package defpackage;

/* loaded from: classes.dex */
public final class sp1 implements up1 {
    public final long a;

    public sp1(long j) {
        this.a = j;
    }

    @Override // defpackage.up1
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp1) && this.a == ((sp1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("None(lastUpdate="), this.a, ")");
    }
}
