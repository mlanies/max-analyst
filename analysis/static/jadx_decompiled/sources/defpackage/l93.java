package defpackage;

/* loaded from: classes2.dex */
public final class l93 {
    public final int a;
    public final int b;

    public l93(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l93)) {
            return false;
        }
        l93 l93Var = (l93) obj;
        return this.a == l93Var.a && this.b == l93Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStatesIconDisabledColors(negative=");
        sb.append(this.a);
        sb.append(", themed=");
        return zr6.j(sb, this.b, ")");
    }
}
