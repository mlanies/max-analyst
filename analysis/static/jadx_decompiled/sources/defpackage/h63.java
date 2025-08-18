package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h63 implements su0 {
    public int X;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] o;

    public h63(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h63.class != obj.getClass()) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return this.a == h63Var.a && this.b == h63Var.b && this.c == h63Var.c && Arrays.equals(this.o, h63Var.o);
    }

    public final int hashCode() {
        if (this.X == 0) {
            this.X = Arrays.hashCode(this.o) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.X;
    }

    public final String toString() {
        boolean z = this.o != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
