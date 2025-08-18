package defpackage;

/* loaded from: classes2.dex */
public final class es0 {
    public final int a;
    public final int b;

    public es0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es0)) {
            return false;
        }
        es0 es0Var = (es0) obj;
        return this.a == es0Var.a && this.b == es0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleBackgroundFocusSingleMediaColors(max=");
        sb.append(this.a);
        sb.append(", min=");
        return zr6.j(sb, this.b, ")");
    }
}
