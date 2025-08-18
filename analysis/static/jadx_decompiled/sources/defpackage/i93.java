package defpackage;

/* loaded from: classes2.dex */
public final class i93 {
    public final int a;
    public final int b;
    public final int c;

    public i93(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i93)) {
            return false;
        }
        i93 i93Var = (i93) obj;
        return this.a == i93Var.a && this.b == i93Var.b && this.c == i93Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonStatesBackgroundDisabledColors(accent=");
        sb.append(this.a);
        sb.append(", neutralFadeSecondary=");
        sb.append(this.b);
        sb.append(", neutralThemed=");
        return zr6.j(sb, this.c, ")");
    }
}
