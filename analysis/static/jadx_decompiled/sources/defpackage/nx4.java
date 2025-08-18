package defpackage;

/* loaded from: classes2.dex */
public final class nx4 {
    public final int a;
    public final int b;
    public final int c;

    public nx4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx4)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        return this.a == nx4Var.a && this.b == nx4Var.b && this.c == nx4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiLocation(spriteIndex=");
        sb.append(this.a);
        sb.append(", x=");
        sb.append(this.b);
        sb.append(", y=");
        return zr6.j(sb, this.c, ")");
    }
}
