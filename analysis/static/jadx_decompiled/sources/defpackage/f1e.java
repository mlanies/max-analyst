package defpackage;

/* loaded from: classes2.dex */
public final class f1e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public f1e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1e)) {
            return false;
        }
        f1e f1eVar = (f1e) obj;
        return this.a == f1eVar.a && this.b == f1eVar.b && this.c == f1eVar.c && this.d == f1eVar.d && this.e == f1eVar.e && this.f == f1eVar.f && this.g == f1eVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesTextDisabledColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=");
        sb.append(this.b);
        sb.append(", negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", primary=");
        sb.append(this.e);
        sb.append(", primaryStatic=");
        sb.append(this.f);
        sb.append(", themed=");
        return zr6.j(sb, this.g, ")");
    }
}
