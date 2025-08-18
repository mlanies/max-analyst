package defpackage;

/* loaded from: classes2.dex */
public final class gs0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gs0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return this.a == gs0Var.a && this.b == gs0Var.b && this.c == gs0Var.c && this.d == gs0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleBackgroundReactionColors(insideMy=");
        sb.append(this.a);
        sb.append(", insideOthers=");
        sb.append(this.b);
        sb.append(", outsideMy=");
        sb.append(this.c);
        sb.append(", outsideOthers=");
        return zr6.j(sb, this.d, ")");
    }
}
