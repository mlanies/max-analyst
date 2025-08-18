package defpackage;

/* loaded from: classes2.dex */
public final class j9g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public j9g(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9g)) {
            return false;
        }
        j9g j9gVar = (j9g) obj;
        return this.a == j9gVar.a && this.b == j9gVar.b && this.c == j9gVar.c && this.d == j9gVar.d && this.e == j9gVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WritebarIconColors(neutral=");
        sb.append(this.a);
        sb.append(", neutralSecondary=");
        sb.append(this.b);
        sb.append(", neutralTertiary=");
        sb.append(this.c);
        sb.append(", themed=");
        sb.append(this.d);
        sb.append(", verificationReplyTo=");
        return zr6.j(sb, this.e, ")");
    }
}
