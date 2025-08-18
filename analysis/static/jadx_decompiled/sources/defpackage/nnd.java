package defpackage;

/* loaded from: classes2.dex */
public final class nnd implements s29 {
    public final long a;

    public nnd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnd) && this.a == ((nnd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ShowReply(messageId="), this.a, ")");
    }
}
