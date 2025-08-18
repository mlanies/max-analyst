package defpackage;

/* loaded from: classes.dex */
public final class ov3 {
    public static final ov3 d = new ov3();
    public final int a;
    public final int b;
    public final boolean c;

    public /* synthetic */ ov3() {
        this(0, 0, true);
    }

    public static ov3 a(ov3 ov3Var, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = ov3Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = ov3Var.b;
        }
        if ((i3 & 4) != 0) {
            z = ov3Var.c;
        }
        ov3Var.getClass();
        return new ov3(i, i2, z);
    }

    public final int b() {
        return this.a + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov3)) {
            return false;
        }
        ov3 ov3Var = (ov3) obj;
        return this.a == ov3Var.a && this.b == ov3Var.b && this.c == ov3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlState(heightView=");
        sb.append(this.a);
        sb.append(", inset=");
        sb.append(this.b);
        sb.append(", isVisible=");
        return au1.j(sb, this.c, ")");
    }

    public ov3(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
