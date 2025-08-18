package defpackage;

/* loaded from: classes2.dex */
public final class hae {
    public final int a;

    public hae(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hae) && this.a == ((hae) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("StrokeLocalCarverColors(tabBar="), this.a, ")");
    }
}
