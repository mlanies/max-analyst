package defpackage;

/* loaded from: classes.dex */
public final class qa0 {
    public final eb0 a;
    public final int b;

    public qa0(eb0 eb0Var, int i) {
        if (eb0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.a = eb0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return this.a.equals(qa0Var.a) && this.b == qa0Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return zr6.j(sb, this.b, "}");
    }
}
