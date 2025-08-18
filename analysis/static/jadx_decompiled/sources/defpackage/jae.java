package defpackage;

/* loaded from: classes2.dex */
public final class jae {
    public final int a;

    public jae(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jae) && this.a == ((jae) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("StrokeLocalTabBarColors(primary="), this.a, ")");
    }
}
