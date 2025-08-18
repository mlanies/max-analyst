package defpackage;

/* loaded from: classes2.dex */
public final class p86 implements r86 {
    public final int a;

    public p86(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p86) && this.a == ((p86) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("UpdateCameraLayoutParams(size="), this.a, ")");
    }
}
