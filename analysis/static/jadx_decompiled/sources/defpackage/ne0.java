package defpackage;

/* loaded from: classes2.dex */
public final class ne0 {
    public final me0 a;
    public final ve0 b;
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

    public ne0(me0 me0Var, ve0 ve0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = me0Var;
        this.b = ve0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne0)) {
            return false;
        }
        ne0 ne0Var = (ne0) obj;
        return tpa.f(this.a, ne0Var.a) && tpa.f(this.b, ne0Var.b) && this.c == ne0Var.c && this.d == ne0Var.d && this.e == ne0Var.e && this.f == ne0Var.f && this.g == ne0Var.g && this.h == ne0Var.h && this.i == ne0Var.i && this.j == ne0Var.j && this.k == ne0Var.k && this.l == ne0Var.l && this.m == ne0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(-1728053248, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(-1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundColors(accent=");
        sb.append(this.a);
        sb.append(", local=");
        sb.append(this.b);
        sb.append(", contrastFloating=-1, contrastFloatingSecondary=");
        sb.append(this.c);
        sb.append(", neutralFloating=");
        sb.append(this.d);
        sb.append(", overlay=");
        sb.append(this.e);
        sb.append(", overlaySecondary=-1728053248, overlayStatic=");
        sb.append(this.f);
        sb.append(", surfaceCard=");
        sb.append(this.g);
        sb.append(", surfaceCardSecondary=");
        sb.append(this.h);
        sb.append(", surfaceFloating=");
        sb.append(this.i);
        sb.append(", surfaceGround=");
        sb.append(this.j);
        sb.append(", surfacePrimary=");
        sb.append(this.k);
        sb.append(", surfaceSecondary=");
        sb.append(this.l);
        sb.append(", surfaceTertiary=");
        return zr6.j(sb, this.m, ", transparent=0)");
    }
}
