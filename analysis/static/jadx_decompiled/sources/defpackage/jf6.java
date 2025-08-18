package defpackage;

/* loaded from: classes2.dex */
public final class jf6 {
    public final int a;
    public final int b;

    public jf6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf6)) {
            return false;
        }
        jf6 jf6Var = (jf6) obj;
        return this.a == jf6Var.a && this.b == jf6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientsLoadingIconNeutralThemedColors(filled=");
        sb.append(this.a);
        sb.append(", transparent=");
        return zr6.j(sb, this.b, ")");
    }
}
