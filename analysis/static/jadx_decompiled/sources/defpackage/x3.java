package defpackage;

/* loaded from: classes2.dex */
public final class x3 {
    public final int a;
    public final int b;
    public final int c;

    public x3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return this.a == x3Var.a && this.b == x3Var.b && this.c == x3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccentColors(red=");
        sb.append(this.a);
        sb.append(", secondary=");
        sb.append(this.b);
        sb.append(", themed=");
        return zr6.j(sb, this.c, ")");
    }
}
