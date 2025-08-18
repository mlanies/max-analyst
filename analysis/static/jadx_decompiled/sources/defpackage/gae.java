package defpackage;

/* loaded from: classes2.dex */
public final class gae {
    public final iae a;
    public final lae b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public gae(iae iaeVar, lae laeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = iaeVar;
        this.b = laeVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gaeVar = (gae) obj;
        return tpa.f(this.a, gaeVar.a) && tpa.f(this.b, gaeVar.b) && this.c == gaeVar.c && this.d == gaeVar.d && this.e == gaeVar.e && this.f == gaeVar.f && this.g == gaeVar.g && this.h == gaeVar.h && this.i == gaeVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(1308622847, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColors(local=");
        sb.append(this.a);
        sb.append(", separator=");
        sb.append(this.b);
        sb.append(", contrastSecondaryStatic=1308622847, contrastStatic=");
        sb.append(this.c);
        sb.append(", negative=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", secondary=");
        sb.append(this.f);
        sb.append(", tertiary=");
        sb.append(this.g);
        sb.append(", themed=");
        sb.append(this.h);
        sb.append(", transparent=");
        return zr6.j(sb, this.i, ")");
    }
}
