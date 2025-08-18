package defpackage;

/* loaded from: classes2.dex */
public final class t63 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final Integer L;
    public final Integer M;
    public final Integer N;
    public final Integer O;
    public final Integer P;
    public final int Q;
    public final int R;
    public final int S;
    public final je7 T;
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
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public /* synthetic */ t63(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, Integer num, Integer num2, Integer num3, Integer num4, int i38) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, (i38 & 32) != 0 ? null : num, (i38 & 64) != 0 ? null : num2, (i38 & 128) != 0 ? null : num3, (i38 & 256) != 0 ? null : num4, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        return this.a == t63Var.a && this.b == t63Var.b && this.c == t63Var.c && this.d == t63Var.d && this.e == t63Var.e && this.f == t63Var.f && this.g == t63Var.g && this.h == t63Var.h && this.i == t63Var.i && this.j == t63Var.j && this.k == t63Var.k && this.l == t63Var.l && this.m == t63Var.m && this.n == t63Var.n && this.o == t63Var.o && this.p == t63Var.p && this.q == t63Var.q && this.r == t63Var.r && this.s == t63Var.s && this.t == t63Var.t && this.u == t63Var.u && this.v == t63Var.v && this.w == t63Var.w && this.x == t63Var.x && this.y == t63Var.y && this.z == t63Var.z && this.A == t63Var.A && this.B == t63Var.B && this.C == t63Var.C && this.D == t63Var.D && this.E == t63Var.E && this.F == t63Var.F && this.G == t63Var.G && this.H == t63Var.H && this.I == t63Var.I && this.J == t63Var.J && this.K == t63Var.K && tpa.f(this.L, t63Var.L) && tpa.f(this.M, t63Var.M) && tpa.f(this.N, t63Var.N) && tpa.f(this.O, t63Var.O) && tpa.f(this.P, t63Var.P);
    }

    public final int hashCode() {
        int iE = k7d.e(this.K, k7d.e(this.J, k7d.e(this.I, k7d.e(this.H, k7d.e(this.G, k7d.e(this.F, k7d.e(this.E, k7d.e(this.D, k7d.e(this.C, k7d.e(this.B, k7d.e(this.A, k7d.e(this.z, k7d.e(this.y, k7d.e(this.x, k7d.e(this.w, k7d.e(this.v, k7d.e(this.u, k7d.e(this.t, k7d.e(this.s, k7d.e(this.r, k7d.e(this.q, k7d.e(this.p, k7d.e(this.o, k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.L;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.M;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.N;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.O;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.P;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "Colors(accent=" + this.a + ", accentText=" + this.b + ", background=" + this.c + ", bubbleBorderColor=" + zr6.j(new StringBuilder("BubbleBorderColor(_color="), this.d, ")") + ", bubbleBorderHighLight=" + this.e + ", bubbleClickableBackground=" + this.f + ", bubbleControlBackgroundColor=" + zr6.j(new StringBuilder("BubbleControlBackgroundColor(_color="), this.g, ")") + ", bubbleControlsText=" + this.h + ", bubbleDecoratorBackgroundColor=" + zr6.j(new StringBuilder("BubbleDecoratorBackgroundColor(_color="), this.i, ")") + ", bubbleDecoratorText=" + this.j + ", bubbleOuterBorder=" + this.k + ", bubbleSecondaryText=" + this.l + ", buttonTint=" + this.m + ", chatBackground=" + this.n + ", destructive=" + this.o + ", lightBadgeBackground=" + this.p + ", highlightBackground=" + this.q + ", incomingBubbleBackground=" + this.r + ", incomingBubbleBackgroundHighlighted=" + this.s + ", outgoingBubbleBackground=" + this.t + ", outgoingBubbleBackgroundHighlighted=" + this.u + ", primaryText=" + this.v + ", profileBackground=" + this.w + ", secondaryBackground=" + this.x + ", secondaryButton=" + this.y + ", secondaryText=" + this.z + ", separatorBackground=" + this.A + ", statusBarBackground=" + this.B + ", tertiaryText=" + this.C + ", toolbarBackground=" + this.D + ", unreadBackground=" + this.E + ", unreadBackgroundMuted=" + this.F + ", unreadText=" + this.G + ", callAccent=" + this.H + ", callBackground=" + this.I + ", callControl=" + this.J + ", groupCallBackground=" + this.K + ", switchThumb=" + this.L + ", switchThumbChecked=" + this.M + ", switchTrack=" + this.N + ", switchTrackChecked=" + this.O + ", switchTint=" + this.P + ")";
    }

    public t63(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
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
        this.p = i16;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = i21;
        this.v = i22;
        this.w = i23;
        this.x = i24;
        this.y = i25;
        this.z = i26;
        this.A = i27;
        this.B = i28;
        this.C = i29;
        this.D = i30;
        this.E = i31;
        this.F = i32;
        this.G = i33;
        this.H = i34;
        this.I = i35;
        this.J = i36;
        this.K = i37;
        this.L = num;
        this.M = num2;
        this.N = num3;
        this.O = num4;
        this.P = num5;
        this.Q = ote.b0(i4, 0.1f);
        this.R = ote.b0(i7, 0.5f);
        this.S = ote.b0(i9, 0.45f);
        this.T = tu0.r(2, new md1(19, this));
    }
}
