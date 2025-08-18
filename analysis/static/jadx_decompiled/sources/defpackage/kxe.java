package defpackage;

/* loaded from: classes2.dex */
public final class kxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public kxe(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        return this.a == kxeVar.a && this.b == kxeVar.b && this.c == kxeVar.c && this.d == kxeVar.d && this.e == kxeVar.e && this.f == kxeVar.f && this.g == kxeVar.g && this.h == kxeVar.h && this.i == kxeVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarIconDisabledColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=");
        sb.append(this.b);
        sb.append(", negative=");
        sb.append(this.c);
        sb.append(", neutralFade=");
        sb.append(this.d);
        sb.append(", primary=");
        sb.append(this.e);
        sb.append(", quaternary=");
        sb.append(this.f);
        sb.append(", secondary=");
        sb.append(this.g);
        sb.append(", tertiary=");
        sb.append(this.h);
        sb.append(", themed=");
        return zr6.j(sb, this.i, ")");
    }
}
