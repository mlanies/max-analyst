package defpackage;

/* loaded from: classes.dex */
public final class hx6 implements pqb {
    public static final hx6 d;
    public int a;
    public boolean b;
    public boolean c;

    static {
        hx6 hx6Var = new hx6();
        hx6Var.a = Integer.MAX_VALUE;
        hx6Var.b = true;
        hx6Var.c = true;
        d = hx6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hx6)) {
            return false;
        }
        hx6 hx6Var = (hx6) obj;
        return this.a == hx6Var.a && this.b == hx6Var.b && this.c == hx6Var.c;
    }

    public final int hashCode() {
        return ((this.b ? 4194304 : 0) ^ this.a) ^ (this.c ? 8388608 : 0);
    }
}
