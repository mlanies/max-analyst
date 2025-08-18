package defpackage;

/* loaded from: classes2.dex */
public final class e39 implements f39 {
    public final long a;

    public e39(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e39) && this.a == ((e39) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("SetRepliedMessage(messageId="), this.a, ")");
    }
}
