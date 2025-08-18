package defpackage;

/* loaded from: classes2.dex */
public final class e93 {
    public final int a;

    public e93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e93) && this.a == ((e93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("CommonShadowsWriteBarColors(color="), this.a, ")");
    }
}
