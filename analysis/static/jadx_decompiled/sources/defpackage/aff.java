package defpackage;

/* loaded from: classes2.dex */
public final class aff {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public aff(int i, int i2, int i3, int i4, int i5) {
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
        if (!(obj instanceof aff)) {
            return false;
        }
        aff affVar = (aff) obj;
        return this.a == affVar.a && this.b == affVar.b && this.c == affVar.c && this.d == affVar.d && this.e == affVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + s36.c(this.d, s36.c(this.c, s36.c(this.b, Integer.hashCode(this.a) * 31)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDimension(landscapeWidth=");
        sb.append(this.a);
        sb.append(", landscapeHeight=");
        sb.append(this.b);
        sb.append(", portraitWidth=");
        sb.append(this.c);
        sb.append(", portraitHeight=");
        sb.append(this.d);
        sb.append(", fps=");
        return zr6.j(sb, this.e, ")");
    }
}
