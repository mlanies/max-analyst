package defpackage;

/* loaded from: classes2.dex */
public final class k73 {
    public final int a;
    public final int b;
    public final int c;

    public k73(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k73)) {
            return false;
        }
        k73 k73Var = (k73) obj;
        k73Var.getClass();
        return this.a == k73Var.a && this.b == k73Var.b && this.c == k73Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, k7d.e(this.a, Integer.hashCode(-1) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonActionIconColors(contrastStatic=-1, neutral=");
        sb.append(this.a);
        sb.append(", neutralSecondary=");
        sb.append(this.b);
        sb.append(", themedFade=");
        return zr6.j(sb, this.c, ")");
    }
}
