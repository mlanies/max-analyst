package defpackage;

/* loaded from: classes2.dex */
public final class bs6 {
    public final hs6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public bs6(hs6 hs6Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = hs6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs6)) {
            return false;
        }
        bs6 bs6Var = (bs6) obj;
        return tpa.f(this.a, bs6Var.a) && this.b == bs6Var.b && this.c == bs6Var.c && this.d == bs6Var.d && this.e == bs6Var.e && this.f == bs6Var.f && this.g == bs6Var.g && this.h == bs6Var.h && this.i == bs6Var.i && this.j == bs6Var.j && this.k == bs6Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(-1, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColors(local=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", primary=");
        sb.append(this.f);
        sb.append(", primaryStatic=");
        sb.append(this.g);
        sb.append(", quaternary=");
        sb.append(this.h);
        sb.append(", secondary=");
        sb.append(this.i);
        sb.append(", tertiary=");
        sb.append(this.j);
        sb.append(", themed=");
        return zr6.j(sb, this.k, ")");
    }
}
