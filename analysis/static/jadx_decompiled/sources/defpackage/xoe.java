package defpackage;

/* loaded from: classes2.dex */
public final class xoe {
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

    public xoe(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe)) {
            return false;
        }
        xoe xoeVar = (xoe) obj;
        return this.a == xoeVar.a && this.b == xoeVar.b && this.c == xoeVar.c && this.d == xoeVar.d && this.e == xoeVar.e && this.f == xoeVar.f && this.g == xoeVar.g && this.h == xoeVar.h && this.i == xoeVar.i && this.j == xoeVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, k7d.e(-520093697, k7d.e(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1, fileType=-520093697, negative=");
        sb.append(this.b);
        sb.append(", neutralThemed=");
        sb.append(this.c);
        sb.append(", positive=");
        sb.append(this.d);
        sb.append(", primary=");
        sb.append(this.e);
        sb.append(", primaryStatic=");
        sb.append(this.f);
        sb.append(", secondary=");
        sb.append(this.g);
        sb.append(", subhead=");
        sb.append(this.h);
        sb.append(", tertiary=");
        sb.append(this.i);
        sb.append(", themed=");
        return zr6.j(sb, this.j, ")");
    }
}
