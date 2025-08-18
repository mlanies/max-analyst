package defpackage;

/* loaded from: classes2.dex */
public final class rsf extends q42 {
    public final long c;

    public rsf(long j) {
        super(2, Long.valueOf(j));
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
        return (obj instanceof rsf) && this.c == ((rsf) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DialogBotId(sourceId="), this.c, ")");
    }
}
