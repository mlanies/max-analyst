package defpackage;

/* loaded from: classes2.dex */
public final class js6 {
    public final int a;
    public final int b;

    public js6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js6)) {
            return false;
        }
        js6 js6Var = (js6) obj;
        return this.a == js6Var.a && this.b == js6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalTabbarColors(active=");
        sb.append(this.a);
        sb.append(", inactive=");
        return zr6.j(sb, this.b, ")");
    }
}
