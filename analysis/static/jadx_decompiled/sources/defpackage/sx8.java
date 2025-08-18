package defpackage;

/* loaded from: classes2.dex */
public final class sx8 extends tx8 {
    public final long c;

    public sx8(long j) {
        super(j, 1);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx8) && this.c == ((sx8) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DialogUserId(contactId="), this.c, ")");
    }
}
