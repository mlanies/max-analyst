package defpackage;

/* loaded from: classes2.dex */
public final class xgd extends ka1 {
    public final long b;

    public xgd(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgd) && this.b == ((xgd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ProfileAvatars(id="), this.b, ")");
    }
}
