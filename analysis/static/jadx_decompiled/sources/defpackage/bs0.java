package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bs0 {
    public final as0 a;
    public final cs0 b;
    public final gs0 c;
    public final hs0 d;
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
    public final int[] o;
    public final int[] p;

    public bs0(as0 as0Var, cs0 cs0Var, gs0 gs0Var, hs0 hs0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.a = as0Var;
        this.b = cs0Var;
        this.c = gs0Var;
        this.d = hs0Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = iArr;
        this.p = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0Var = (bs0) obj;
        return tpa.f(this.a, bs0Var.a) && tpa.f(this.b, bs0Var.b) && tpa.f(this.c, bs0Var.c) && tpa.f(this.d, bs0Var.d) && this.e == bs0Var.e && this.f == bs0Var.f && this.g == bs0Var.g && this.h == bs0Var.h && this.i == bs0Var.i && this.j == bs0Var.j && this.k == bs0Var.k && this.l == bs0Var.l && this.m == bs0Var.m && this.n == bs0Var.n && tpa.f(this.o, bs0Var.o) && tpa.f(this.p, bs0Var.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.p) + ((Arrays.hashCode(this.o) + k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.o);
        String string2 = Arrays.toString(this.p);
        StringBuilder sb = new StringBuilder("BubbleBackgroundColors(botButton=");
        sb.append(this.a);
        sb.append(", focus=");
        sb.append(this.b);
        sb.append(", reaction=");
        sb.append(this.c);
        sb.append(", systemAssetGradient=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", actionFade=");
        sb.append(this.f);
        sb.append(", actionSecondary=");
        sb.append(this.g);
        sb.append(", bubbleSimple=");
        sb.append(this.h);
        sb.append(", iconItem=");
        sb.append(this.i);
        sb.append(", iconItemNegative=");
        sb.append(this.j);
        sb.append(", mention=");
        sb.append(this.k);
        sb.append(", mentionPressed=");
        sb.append(this.l);
        sb.append(", surfaceSecondary=");
        sb.append(this.m);
        sb.append(", textFocus=");
        sb.append(this.n);
        sb.append(", bubbleGradient=");
        sb.append(string);
        sb.append(", bubbleOldGradient=");
        return zr6.l(sb, string2, ")");
    }
}
