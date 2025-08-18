package defpackage;

/* loaded from: classes.dex */
public final class la0 {
    public static final la0 c = new la0(mb0.j, 0);
    public final mb0 a;
    public final int b;

    public la0(mb0 mb0Var, int i) {
        if (mb0Var == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.a = mb0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return this.a.equals(la0Var.a) && this.b == la0Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return zr6.j(sb, this.b, "}");
    }
}
