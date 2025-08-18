package defpackage;

/* loaded from: classes2.dex */
public final class gs6 {
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

    public gs6(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
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
        if (!(obj instanceof gs6)) {
            return false;
        }
        gs6 gs6Var = (gs6) obj;
        return this.a == gs6Var.a && this.b == gs6Var.b && this.c == gs6Var.c && this.d == gs6Var.d && this.e == gs6Var.e && this.f == gs6Var.f && this.g == gs6Var.g && this.h == gs6Var.h && this.i == gs6Var.i && this.j == gs6Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + k7d.e(this.i, k7d.e(-1292849417, k7d.e(-1292582917, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalCategoryColors(earthStep1=");
        sb.append(this.a);
        sb.append(", earthStep2=");
        sb.append(this.b);
        sb.append(", earthStrokeStep1=");
        sb.append(this.c);
        sb.append(", earthStrokeStep2=");
        sb.append(this.d);
        sb.append(", mercuryStep1=");
        sb.append(this.e);
        sb.append(", mercuryStep2=");
        sb.append(this.f);
        sb.append(", mercuryStrokeStep1=");
        sb.append(this.g);
        sb.append(", mercuryStrokeStep2=");
        sb.append(this.h);
        sb.append(", venusStep1=-1292582917, venusStep2=-1292849417, venusStrokeStep1=");
        sb.append(this.i);
        sb.append(", venusStrokeStep2=");
        return zr6.j(sb, this.j, ")");
    }
}
