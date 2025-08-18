package defpackage;

/* loaded from: classes2.dex */
public final class lkb extends ka1 {
    public final long b;

    public lkb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkb) && this.b == ((lkb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("InviteByLink(chatId="), this.b, ")");
    }
}
