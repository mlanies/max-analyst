package defpackage;

/* loaded from: classes2.dex */
public final class ssf extends q42 {
    public final long c;

    public ssf(long j) {
        super(1, Long.valueOf(j));
        this.c = j;
    }

    @Override // defpackage.q42
    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssf) && this.c == ((ssf) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DialogUserId(sourceId="), this.c, ")");
    }
}
