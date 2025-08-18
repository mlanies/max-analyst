package defpackage;

/* loaded from: classes2.dex */
public final class fs0 {
    public final int a;
    public final int b;

    public fs0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs0)) {
            return false;
        }
        fs0 fs0Var = (fs0) obj;
        return this.a == fs0Var.a && this.b == fs0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleBackgroundFocusTransparentColors(max=");
        sb.append(this.a);
        sb.append(", min=");
        return zr6.j(sb, this.b, ")");
    }
}
