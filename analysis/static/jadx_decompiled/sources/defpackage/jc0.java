package defpackage;

/* loaded from: classes.dex */
public final class jc0 {
    public static final jc0 d = new jc0(0, 0, 0);
    public static final jc0 e = new jc0(1, 3, 2);
    public static final jc0 f = new jc0(6, 7, 1);
    public static final jc0 g = new jc0(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public jc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        return this.a == jc0Var.a && this.b == jc0Var.b && this.c == jc0Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return zr6.j(sb, this.c, "}");
    }
}
