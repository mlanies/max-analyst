package defpackage;

/* loaded from: classes.dex */
public final class v5a extends np8 {
    public final int p;

    public v5a(int i) {
        this.p = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5a) && this.p == ((v5a) obj).p;
    }

    public final int hashCode() {
        return Integer.hashCode(this.p);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Counter(value="), this.p, ")");
    }
}
