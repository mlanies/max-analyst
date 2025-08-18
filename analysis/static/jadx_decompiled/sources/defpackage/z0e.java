package defpackage;

/* loaded from: classes2.dex */
public final class z0e {
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

    public z0e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0e)) {
            return false;
        }
        z0e z0eVar = (z0e) obj;
        return this.a == z0eVar.a && this.b == z0eVar.b && this.c == z0eVar.c && this.d == z0eVar.d && this.e == z0eVar.e && this.f == z0eVar.f && this.g == z0eVar.g && this.h == z0eVar.h && this.i == z0eVar.i && this.j == z0eVar.j && this.k == z0eVar.k && this.l == z0eVar.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesBackgroundDisabledColors(card=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=");
        sb.append(this.c);
        sb.append(", negative=");
        sb.append(this.d);
        sb.append(", neutral=");
        sb.append(this.e);
        sb.append(", neutralFade=");
        sb.append(this.f);
        sb.append(", neutralStatic=");
        sb.append(this.g);
        sb.append(", neutralThemed=");
        sb.append(this.h);
        sb.append(", overlayStatic=");
        sb.append(this.i);
        sb.append(", positive=");
        sb.append(this.j);
        sb.append(", secondary=");
        sb.append(this.k);
        sb.append(", themed=");
        return zr6.j(sb, this.l, ")");
    }
}
