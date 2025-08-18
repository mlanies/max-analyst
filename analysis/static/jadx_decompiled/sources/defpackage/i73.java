package defpackage;

/* loaded from: classes2.dex */
public final class i73 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i73(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i73)) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return this.a == i73Var.a && this.b == i73Var.b && this.c == i73Var.c && this.d == i73Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonActionBackgroundColors(error=");
        sb.append(this.a);
        sb.append(", neutral=");
        sb.append(this.b);
        sb.append(", themed=");
        sb.append(this.c);
        sb.append(", themedFade=");
        return zr6.j(sb, this.d, ")");
    }
}
