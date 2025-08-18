package defpackage;

/* loaded from: classes.dex */
public final class y50 {
    public static final y50 d = new x50().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public y50(x50 x50Var) {
        this.a = x50Var.a;
        this.b = x50Var.b;
        this.c = x50Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y50.class != obj.getClass()) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return this.a == y50Var.a && this.b == y50Var.b && this.c == y50Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
