package defpackage;

/* loaded from: classes2.dex */
public final class kf6 {
    public final int a;
    public final int b;

    public kf6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf6)) {
            return false;
        }
        kf6 kf6Var = (kf6) obj;
        return this.a == kf6Var.a && this.b == kf6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientsLoadingIconPrimaryColors(filled=");
        sb.append(this.a);
        sb.append(", transparent=");
        return zr6.j(sb, this.b, ")");
    }
}
