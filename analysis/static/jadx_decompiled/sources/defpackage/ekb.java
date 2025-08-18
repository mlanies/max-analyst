package defpackage;

/* loaded from: classes2.dex */
public final class ekb extends ka1 {
    public final long b;

    public ekb(long j) {
        super(11);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekb) && this.b == ((ekb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("AddToFolder(chatId="), this.b, ")");
    }
}
