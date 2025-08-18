package defpackage;

/* loaded from: classes2.dex */
public final class z85 {
    public final byte a;
    public final int b;

    public z85(int i, byte b) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("length must be >= 0");
        }
        this.a = b;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z85)) {
            return false;
        }
        z85 z85Var = (z85) obj;
        return this.a == z85Var.a && this.b == z85Var.b;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.a), Integer.valueOf(this.b));
    }
}
