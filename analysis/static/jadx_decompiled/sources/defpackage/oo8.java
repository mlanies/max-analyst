package defpackage;

/* loaded from: classes2.dex */
public final class oo8 implements qo8 {
    public final long a;

    public oo8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo8) && this.a == ((oo8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OnOwnerClicked(id="), this.a, ")");
    }
}
