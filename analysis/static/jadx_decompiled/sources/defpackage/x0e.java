package defpackage;

/* loaded from: classes2.dex */
public final class x0e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public x0e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0e)) {
            return false;
        }
        x0e x0eVar = (x0e) obj;
        return this.a == x0eVar.a && this.b == x0eVar.b && this.c == x0eVar.c && this.d == x0eVar.d && this.e == x0eVar.e && this.f == x0eVar.f && this.g == x0eVar.g && this.h == x0eVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(1308622847) + k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, k7d.e(-1907998, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesBackgroundActiveColors(card=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1907998, negative=");
        sb.append(this.b);
        sb.append(", neutral=");
        sb.append(this.c);
        sb.append(", neutralFade=");
        sb.append(this.d);
        sb.append(", neutralThemed=");
        sb.append(this.e);
        sb.append(", overlayStatic=");
        sb.append(this.f);
        sb.append(", themed=");
        sb.append(this.g);
        sb.append(", transparent=");
        return zr6.j(sb, this.h, ", transparentSecondaryStatic=1308622847)");
    }
}
