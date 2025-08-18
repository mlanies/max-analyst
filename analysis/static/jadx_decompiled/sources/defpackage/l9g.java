package defpackage;

/* loaded from: classes2.dex */
public final class l9g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public l9g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9g)) {
            return false;
        }
        l9g l9gVar = (l9g) obj;
        return this.a == l9gVar.a && this.b == l9gVar.b && this.c == l9gVar.c && this.d == l9gVar.d && this.e == l9gVar.e && this.f == l9gVar.f && this.g == l9gVar.g && this.h == l9gVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WritebarTextColors(input=");
        sb.append(this.a);
        sb.append(", inputMDLink=");
        sb.append(this.b);
        sb.append(", inputPlaceholder=");
        sb.append(this.c);
        sb.append(", primary=");
        sb.append(this.d);
        sb.append(", replyMessage=");
        sb.append(this.e);
        sb.append(", replyTo=");
        sb.append(this.f);
        sb.append(", secondary=");
        sb.append(this.g);
        sb.append(", themed=");
        return zr6.j(sb, this.h, ")");
    }
}
