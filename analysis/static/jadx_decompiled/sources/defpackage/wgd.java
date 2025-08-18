package defpackage;

/* loaded from: classes2.dex */
public final class wgd extends ka1 {
    public final long b;

    public wgd(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgd) && this.b == ((wgd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("EditProfile(id="), this.b, ")");
    }
}
