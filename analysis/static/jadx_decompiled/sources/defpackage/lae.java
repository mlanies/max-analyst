package defpackage;

/* loaded from: classes2.dex */
public final class lae {
    public final int a;
    public final int b;
    public final int c;

    public lae(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lae)) {
            return false;
        }
        lae laeVar = (lae) obj;
        return this.a == laeVar.a && this.b == laeVar.b && this.c == laeVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeSeparatorColors(contrast=");
        sb.append(this.a);
        sb.append(", primary=");
        sb.append(this.b);
        sb.append(", secondary=");
        return zr6.j(sb, this.c, ")");
    }
}
