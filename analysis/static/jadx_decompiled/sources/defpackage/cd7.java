package defpackage;

/* loaded from: classes2.dex */
public final class cd7 {
    public final int a;

    public cd7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd7) && this.a == ((cd7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("StateConfig(titleTextColor="), this.a, ")");
    }
}
