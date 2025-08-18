package defpackage;

/* loaded from: classes.dex */
public final class zie {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public zie(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zie)) {
            return false;
        }
        zie zieVar = (zie) obj;
        return this.a == zieVar.a && this.b == zieVar.b && this.c == zieVar.c && this.d == zieVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateConfig(startIconColor=");
        sb.append(this.a);
        sb.append(", titleTextColor=");
        sb.append(this.b);
        sb.append(", endIconColor=");
        sb.append(this.c);
        sb.append(", isEndIconVisible=");
        return au1.j(sb, this.d, ")");
    }
}
