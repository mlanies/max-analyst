package defpackage;

/* loaded from: classes2.dex */
public final class ds0 {
    public final int a;
    public final int b;

    public ds0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds0)) {
            return false;
        }
        ds0 ds0Var = (ds0) obj;
        return this.a == ds0Var.a && this.b == ds0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleBackgroundFocusRegularColors(max=");
        sb.append(this.a);
        sb.append(", min=");
        return zr6.j(sb, this.b, ")");
    }
}
