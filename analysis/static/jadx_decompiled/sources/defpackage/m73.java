package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m73 {
    public final l73 a;
    public final n73 b;
    public final q73 c;
    public final v73 d;
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
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public m73(l73 l73Var, n73 n73Var, q73 q73Var, v73 v73Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = l73Var;
        this.b = n73Var;
        this.c = q73Var;
        this.d = v73Var;
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
        this.o = i11;
        this.p = i12;
        this.q = i13;
        this.r = i14;
        this.s = i15;
        this.t = i16;
        this.u = i17;
        this.v = iArr;
        this.w = iArr2;
        this.x = iArr3;
        this.y = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73Var = (m73) obj;
        return tpa.f(this.a, m73Var.a) && tpa.f(this.b, m73Var.b) && tpa.f(this.c, m73Var.c) && tpa.f(this.d, m73Var.d) && this.e == m73Var.e && this.f == m73Var.f && this.g == m73Var.g && this.h == m73Var.h && this.i == m73Var.i && this.j == m73Var.j && this.k == m73Var.k && this.l == m73Var.l && this.m == m73Var.m && this.n == m73Var.n && this.o == m73Var.o && this.p == m73Var.p && this.q == m73Var.q && this.r == m73Var.r && this.s == m73Var.s && this.t == m73Var.t && this.u == m73Var.u && tpa.f(this.v, m73Var.v) && tpa.f(this.w, m73Var.w) && tpa.f(this.x, m73Var.x) && tpa.f(this.y, m73Var.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.y) + ((Arrays.hashCode(this.x) + ((Arrays.hashCode(this.w) + ((Arrays.hashCode(this.v) + k7d.e(1392508927, k7d.e(-1191182337, k7d.e(this.u, k7d.e(this.t, k7d.e(this.s, k7d.e(this.r, k7d.e(this.q, k7d.e(this.p, k7d.e(this.o, k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(1543503872, k7d.e(this.k, k7d.e(-1, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.v);
        String string2 = Arrays.toString(this.w);
        String string3 = Arrays.toString(this.x);
        String string4 = Arrays.toString(this.y);
        StringBuilder sb = new StringBuilder("CommonBackgroundColors(chatBackground=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", skeleton=");
        sb.append(this.c);
        sb.append(", systemBubbleGradient=");
        sb.append(this.d);
        sb.append(", accent=");
        sb.append(this.e);
        sb.append(", capsule=");
        sb.append(this.f);
        sb.append(", capsuleOutside=");
        sb.append(this.g);
        sb.append(", capsuleSecondary=");
        sb.append(this.h);
        sb.append(", chatFAB=");
        sb.append(this.i);
        sb.append(", contrastFloatingSecondary=");
        sb.append(this.j);
        sb.append(", contrastStatic=-1, neutral=");
        sb.append(this.k);
        sb.append(", neutralFade=1543503872, neutralFadeSecondary=");
        sb.append(this.l);
        sb.append(", neutralFadeTertiary=");
        sb.append(this.m);
        sb.append(", neutralThemed=");
        sb.append(this.n);
        sb.append(", overlay=");
        sb.append(this.o);
        sb.append(", overlayHard=");
        sb.append(this.p);
        sb.append(", overlaySecondary=");
        sb.append(this.q);
        sb.append(", pattern=");
        sb.append(this.r);
        sb.append(", searchHighlight=");
        sb.append(this.s);
        sb.append(", stickerBlank=");
        sb.append(this.t);
        sb.append(", surfaceGround=");
        sb.append(this.u);
        sb.append(", timelineActive=-1191182337, timelinePassive=1392508927, capsuleGradient=");
        sb.append(string);
        sb.append(", capsuleSecondaryGradient=");
        sb.append(string2);
        sb.append(", glassLightGradient=");
        sb.append(string3);
        sb.append(", spaceThemeGradient=");
        return zr6.l(sb, string4, ")");
    }
}
