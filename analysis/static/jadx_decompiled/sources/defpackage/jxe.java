package defpackage;

/* loaded from: classes2.dex */
public final class jxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public jxe(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxe)) {
            return false;
        }
        jxe jxeVar = (jxe) obj;
        return this.a == jxeVar.a && this.b == jxeVar.b && this.c == jxeVar.c && this.d == jxeVar.d && this.e == jxeVar.e && this.f == jxeVar.f && this.g == jxeVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, k7d.e(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarIconDefaultColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1, neutralFade=");
        sb.append(this.b);
        sb.append(", primary=");
        sb.append(this.c);
        sb.append(", quaternary=");
        sb.append(this.d);
        sb.append(", secondary=");
        sb.append(this.e);
        sb.append(", tertiary=");
        sb.append(this.f);
        sb.append(", themed=");
        return zr6.j(sb, this.g, ")");
    }
}
