package defpackage;

/* loaded from: classes2.dex */
public final class pw8 {
    public final long a;

    public pw8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw8) && this.a == ((pw8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ControlInfo(pinnedMessageId="), this.a, ")");
    }
}
