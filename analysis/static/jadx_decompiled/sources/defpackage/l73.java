package defpackage;

/* loaded from: classes2.dex */
public final class l73 {
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

    public l73(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
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
        if (!(obj instanceof l73)) {
            return false;
        }
        l73 l73Var = (l73) obj;
        return this.a == l73Var.a && this.b == l73Var.b && this.c == l73Var.c && this.d == l73Var.d && this.e == l73Var.e && this.f == l73Var.f && this.g == l73Var.g && this.h == l73Var.h && this.i == l73Var.i && this.j == l73Var.j && this.k == l73Var.k && this.l == l73Var.l && this.m == l73Var.m && this.n == l73Var.n && this.o == l73Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonBackgroundChatBackgroundColors(additionalStep1=");
        sb.append(this.a);
        sb.append(", additionalStep2=");
        sb.append(this.b);
        sb.append(", additionalStep3=");
        sb.append(this.c);
        sb.append(", additionalStep4=");
        sb.append(this.d);
        sb.append(", additionalStep5=");
        sb.append(this.e);
        sb.append(", additionalStep6=");
        sb.append(this.f);
        sb.append(", backgroundStep1=");
        sb.append(this.g);
        sb.append(", backgroundStep2=");
        sb.append(this.h);
        sb.append(", patternColor=");
        sb.append(this.i);
        sb.append(", patternStep1=");
        sb.append(this.j);
        sb.append(", patternStep2=");
        sb.append(this.k);
        sb.append(", patternStep3=");
        sb.append(this.l);
        sb.append(", patternStep4=");
        sb.append(this.m);
        sb.append(", patternStep5=");
        sb.append(this.n);
        sb.append(", patternStep6=");
        return zr6.j(sb, this.o, ")");
    }
}
