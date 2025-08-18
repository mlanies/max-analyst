package defpackage;

/* loaded from: classes.dex */
public final class r6a implements s6a {
    public final int a;

    public r6a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6a) && this.a == ((r6a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Resource(iconRes="), this.a, ")");
    }
}
