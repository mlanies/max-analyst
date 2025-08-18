package defpackage;

/* loaded from: classes2.dex */
public final class q93 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public q93(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
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
        if (!(obj instanceof q93)) {
            return false;
        }
        q93 q93Var = (q93) obj;
        return this.a == q93Var.a && this.b == q93Var.b && this.c == q93Var.c && this.d == q93Var.d && this.e == q93Var.e && this.f == q93Var.f && this.g == q93Var.g && this.h == q93Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(-520093697, k7d.e(-1, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonTextColors(capsule=");
        sb.append(this.a);
        sb.append(", capsuleSecondary=");
        sb.append(this.b);
        sb.append(", contrast=");
        sb.append(this.c);
        sb.append(", contrastStatic=-1, fileType=-520093697, negative=");
        sb.append(this.d);
        sb.append(", primary=");
        sb.append(this.e);
        sb.append(", secondary=");
        sb.append(this.f);
        sb.append(", tertiary=");
        sb.append(this.g);
        sb.append(", themed=");
        return zr6.j(sb, this.h, ")");
    }
}
