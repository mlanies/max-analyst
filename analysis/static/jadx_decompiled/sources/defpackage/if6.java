package defpackage;

/* loaded from: classes2.dex */
public final class if6 {
    public final int a;
    public final int b;

    public if6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if6)) {
            return false;
        }
        if6 if6Var = (if6) obj;
        return this.a == if6Var.a && this.b == if6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientsLoadingIconNegativeColors(filled=");
        sb.append(this.a);
        sb.append(", transparent=");
        return zr6.j(sb, this.b, ")");
    }
}
