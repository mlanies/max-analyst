package defpackage;

/* loaded from: classes.dex */
public final class jv3 implements mv3 {
    public final int a;

    public jv3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv3) && this.a == ((jv3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Seeking(progress="), this.a, ")");
    }
}
