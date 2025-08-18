package defpackage;

/* loaded from: classes2.dex */
public final class k9g {
    public final int a;
    public final int b;
    public final int c;

    public k9g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9g)) {
            return false;
        }
        k9g k9gVar = (k9g) obj;
        return this.a == k9gVar.a && this.b == k9gVar.b && this.c == k9gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WritebarStrokeColors(areaSeparator=");
        sb.append(this.a);
        sb.append(", input=");
        sb.append(this.b);
        sb.append(", themed=");
        return zr6.j(sb, this.c, ")");
    }
}
