package defpackage;

/* loaded from: classes2.dex */
public final class lfb extends ka1 {
    public final long b;

    public lfb(long j) {
        super(9);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfb) && this.b == ((lfb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("InviteByLink(id="), this.b, ")");
    }
}
