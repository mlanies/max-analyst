package defpackage;

/* loaded from: classes2.dex */
public final class o93 {
    public final p93 a;
    public final int b;
    public final int c;

    public o93(p93 p93Var, int i, int i2) {
        this.a = p93Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o93)) {
            return false;
        }
        o93 o93Var = (o93) obj;
        return tpa.f(this.a, o93Var.a) && this.b == o93Var.b && this.c == o93Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(-1, k7d.e(this.b, Integer.hashCode(this.a.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStrokeColors(separator=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, glass=");
        return zr6.j(sb, this.c, ")");
    }
}
