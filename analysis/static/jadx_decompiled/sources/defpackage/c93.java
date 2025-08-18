package defpackage;

/* loaded from: classes2.dex */
public final class c93 {
    public final int a;
    public final int b;

    public c93(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c93)) {
            return false;
        }
        c93 c93Var = (c93) obj;
        return this.a == c93Var.a && this.b == c93Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonShadowsElevation2Colors(primary=");
        sb.append(this.a);
        sb.append(", secondary=");
        return zr6.j(sb, this.b, ")");
    }
}
