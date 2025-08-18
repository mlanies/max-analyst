package defpackage;

/* loaded from: classes2.dex */
public final class c1e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public c1e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
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
        if (!(obj instanceof c1e)) {
            return false;
        }
        c1e c1eVar = (c1e) obj;
        return this.a == c1eVar.a && this.b == c1eVar.b && this.c == c1eVar.c && this.d == c1eVar.d && this.e == c1eVar.e && this.f == c1eVar.f && this.g == c1eVar.g && this.h == c1eVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesIconDisabledColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=");
        sb.append(this.b);
        sb.append(", negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", primary=");
        sb.append(this.f);
        sb.append(", primaryStatic=");
        sb.append(this.g);
        sb.append(", themed=");
        return zr6.j(sb, this.h, ")");
    }
}
