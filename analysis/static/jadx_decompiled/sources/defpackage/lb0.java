package defpackage;

/* loaded from: classes.dex */
public final class lb0 {
    public final mb0 a;
    public final int b;

    public lb0(mb0 mb0Var, int i) {
        if (mb0Var == null) {
            throw new NullPointerException("Null quality");
        }
        this.a = mb0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        return this.a.equals(lb0Var.a) && this.b == lb0Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return zr6.j(sb, this.b, "}");
    }
}
