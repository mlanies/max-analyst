package defpackage;

/* loaded from: classes2.dex */
public final class gf6 {
    public final int a;
    public final int b;

    public gf6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf6)) {
            return false;
        }
        gf6 gf6Var = (gf6) obj;
        return this.a == gf6Var.a && this.b == gf6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientsLoadingIconContrastColors(filled=");
        sb.append(this.a);
        sb.append(", transparent=");
        return zr6.j(sb, this.b, ")");
    }
}
