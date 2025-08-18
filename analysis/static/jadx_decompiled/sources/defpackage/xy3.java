package defpackage;

/* loaded from: classes2.dex */
public final class xy3 implements zy3 {
    public final long a;

    public xy3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy3) && this.a == ((xy3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Fail(requestId="), this.a, ")");
    }
}
