package defpackage;

/* loaded from: classes2.dex */
public final class js0 {
    public final int a;
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
    public final int n;
    public final int o;

    public js0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js0)) {
            return false;
        }
        js0 js0Var = (js0) obj;
        return this.a == js0Var.a && this.b == js0Var.b && this.c == js0Var.c && this.d == js0Var.d && this.e == js0Var.e && this.f == js0Var.f && this.g == js0Var.g && this.h == js0Var.h && this.i == js0Var.i && this.j == js0Var.j && this.k == js0Var.k && this.l == js0Var.l && this.m == js0Var.m && this.n == js0Var.n && this.o == js0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleIconColors(action=");
        sb.append(this.a);
        sb.append(", actionSecondary=");
        sb.append(this.b);
        sb.append(", alert=");
        sb.append(this.c);
        sb.append(", callNegative=");
        sb.append(this.d);
        sb.append(", callNeutral=");
        sb.append(this.e);
        sb.append(", iconItem=");
        sb.append(this.f);
        sb.append(", readStatus=");
        sb.append(this.g);
        sb.append(", readStatusCapsule=");
        sb.append(this.h);
        sb.append(", reply=");
        sb.append(this.i);
        sb.append(", replyForwarded=");
        sb.append(this.j);
        sb.append(", verificationAuthor=");
        sb.append(this.k);
        sb.append(", verificationBody=");
        sb.append(this.l);
        sb.append(", verificationForwardName=");
        sb.append(this.m);
        sb.append(", verificationReplyBody=");
        sb.append(this.n);
        sb.append(", verificationReplyName=");
        return zr6.j(sb, this.o, ")");
    }
}
