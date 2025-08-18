package defpackage;

/* loaded from: classes.dex */
public final class ib0 {
    public final nu4 a;
    public final nu4 b;
    public final int c;
    public final int d;

    public ib0(nu4 nu4Var, nu4 nu4Var2, int i, int i2) {
        this.a = nu4Var;
        this.b = nu4Var2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return this.a.equals(ib0Var.a) && this.b.equals(ib0Var.b) && this.c == ib0Var.c && this.d == ib0Var.d;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormat=");
        return zr6.j(sb, this.d, "}");
    }
}
