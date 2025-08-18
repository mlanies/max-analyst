package defpackage;

/* loaded from: classes2.dex */
public final class hnd implements s29 {
    public final long a;

    public hnd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnd) && this.a == ((hnd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ShowEditMessage(messageId="), this.a, ")");
    }
}
