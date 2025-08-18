package defpackage;

/* loaded from: classes2.dex */
public final class n93 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public n93(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n93)) {
            return false;
        }
        n93 n93Var = (n93) obj;
        return this.a == n93Var.a && this.b == n93Var.b && this.c == n93Var.c && this.d == n93Var.d && this.e == n93Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStatesTextDisabledColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=");
        sb.append(this.b);
        sb.append(", negative=");
        sb.append(this.c);
        sb.append(", primary=");
        sb.append(this.d);
        sb.append(", themed=");
        return zr6.j(sb, this.e, ")");
    }
}
