package defpackage;

/* loaded from: classes2.dex */
public final class p93 {
    public final int a;

    public p93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p93) && this.a == ((p93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("CommonStrokeSeparatorColors(primary="), this.a, ")");
    }
}
