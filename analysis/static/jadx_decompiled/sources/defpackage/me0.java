package defpackage;

/* loaded from: classes2.dex */
public final class me0 {
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

    public me0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return this.a == me0Var.a && this.b == me0Var.b && this.c == me0Var.c && this.d == me0Var.d && this.e == me0Var.e && this.f == me0Var.f && this.g == me0Var.g && this.h == me0Var.h && this.i == me0Var.i && this.j == me0Var.j && this.k == me0Var.k && this.l == me0Var.l && this.m == me0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(-1, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundAccentColors(attentionPrimary=");
        sb.append(this.a);
        sb.append(", attentionSecondary=");
        sb.append(this.b);
        sb.append(", contrast=");
        sb.append(this.c);
        sb.append(", contrastSecondary=");
        sb.append(this.d);
        sb.append(", contrastStatic=-1, negative=");
        sb.append(this.e);
        sb.append(", neutral=");
        sb.append(this.f);
        sb.append(", neutralFade=");
        sb.append(this.g);
        sb.append(", neutralFadeSecondary=");
        sb.append(this.h);
        sb.append(", neutralSecondary=");
        sb.append(this.i);
        sb.append(", neutralStatic=");
        sb.append(this.j);
        sb.append(", neutralThemed=");
        sb.append(this.k);
        sb.append(", positive=");
        sb.append(this.l);
        sb.append(", themed=");
        return zr6.j(sb, this.m, ")");
    }
}
