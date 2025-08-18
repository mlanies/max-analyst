package defpackage;

/* loaded from: classes2.dex */
public final class w83 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public w83(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return this.a == w83Var.a && this.b == w83Var.b && this.c == w83Var.c && this.d == w83Var.d && this.e == w83Var.e && this.f == w83Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(-1, k7d.e(-1, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonIconColors(accent=");
        sb.append(this.a);
        sb.append(", accentContrast=");
        sb.append(this.b);
        sb.append(", capsule=-1, contrastStatic=-1, negative=");
        sb.append(this.c);
        sb.append(", secondary=");
        sb.append(this.d);
        sb.append(", themed=");
        sb.append(this.e);
        sb.append(", verificationCapsule=");
        return zr6.j(sb, this.f, ")");
    }
}
