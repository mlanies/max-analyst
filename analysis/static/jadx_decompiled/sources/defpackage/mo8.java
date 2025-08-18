package defpackage;

/* loaded from: classes2.dex */
public final class mo8 implements qo8 {
    public final long a;

    public mo8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo8) && this.a == ((mo8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OnMemberClicked(id="), this.a, ")");
    }
}
