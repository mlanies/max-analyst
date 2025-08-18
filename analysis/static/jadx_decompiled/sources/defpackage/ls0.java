package defpackage;

/* loaded from: classes2.dex */
public final class ls0 {
    public final ms0 a;
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
    public final int l;
    public final int m;

    public ls0(ms0 ms0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = ms0Var;
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
        this.l = i11;
        this.m = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls0)) {
            return false;
        }
        ls0 ls0Var = (ls0) obj;
        return tpa.f(this.a, ls0Var.a) && this.b == ls0Var.b && this.c == ls0Var.c && this.d == ls0Var.d && this.e == ls0Var.e && this.f == ls0Var.f && this.g == ls0Var.g && this.h == ls0Var.h && this.i == ls0Var.i && this.j == ls0Var.j && this.k == ls0Var.k && this.l == ls0Var.l && this.m == ls0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleTextColors(reaction=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionFade=");
        sb.append(this.c);
        sb.append(", author=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", bodySecondary=");
        sb.append(this.f);
        sb.append(", forwardLabel=");
        sb.append(this.g);
        sb.append(", forwardName=");
        sb.append(this.h);
        sb.append(", link=");
        sb.append(this.i);
        sb.append(", linkUnderline=");
        sb.append(this.j);
        sb.append(", replyBody=");
        sb.append(this.k);
        sb.append(", replyName=");
        sb.append(this.l);
        sb.append(", time=");
        return zr6.j(sb, this.m, ")");
    }
}
