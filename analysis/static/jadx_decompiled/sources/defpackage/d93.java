package defpackage;

/* loaded from: classes2.dex */
public final class d93 {
    public final int a;

    public d93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d93) && this.a == ((d93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("CommonShadowsTopBarColors(color="), this.a, ")");
    }
}
