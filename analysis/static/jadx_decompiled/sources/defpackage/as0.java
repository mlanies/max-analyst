package defpackage;

/* loaded from: classes2.dex */
public final class as0 {
    public final int a;
    public final int b;
    public final int c;

    public as0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as0)) {
            return false;
        }
        as0 as0Var = (as0) obj;
        return this.a == as0Var.a && this.b == as0Var.b && this.c == as0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleBackgroundBotButtonColors(default=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", pressed=");
        return zr6.j(sb, this.c, ")");
    }
}
