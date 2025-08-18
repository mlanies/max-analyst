package defpackage;

/* loaded from: classes2.dex */
public final class ks0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ks0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return this.a == ks0Var.a && this.b == ks0Var.b && this.c == ks0Var.c && this.d == ks0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleStrokeColors(action=");
        sb.append(this.a);
        sb.append(", neutralSecondary=");
        sb.append(this.b);
        sb.append(", reply=");
        sb.append(this.c);
        sb.append(", replyOutside=");
        return zr6.j(sb, this.d, ")");
    }
}
