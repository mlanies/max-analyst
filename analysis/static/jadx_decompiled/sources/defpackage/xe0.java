package defpackage;

/* loaded from: classes2.dex */
public final class xe0 {
    public final int a;

    public xe0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe0) && this.a == ((xe0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("BackgroundLocalTabBarColors(primary="), this.a, ")");
    }
}
