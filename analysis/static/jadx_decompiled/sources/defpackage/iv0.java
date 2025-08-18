package defpackage;

/* loaded from: classes2.dex */
public final class iv0 {
    public final int a;
    public final int b;

    public iv0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return false;
        }
        iv0 iv0Var = (iv0) obj;
        return this.a == iv0Var.a && this.b == iv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonPaddings(horizontalPaddings=");
        sb.append(this.a);
        sb.append(", verticalPaddings=");
        return zr6.j(sb, this.b, ")");
    }
}
