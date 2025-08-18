package defpackage;

/* loaded from: classes2.dex */
public final class ywa implements axa {
    public final long a;

    public ywa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywa) && this.a == ((ywa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
