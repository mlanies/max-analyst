package defpackage;

/* loaded from: classes.dex */
public final class bb0 extends sn9 {
    public final rn9 a;
    public final qn9 b;

    public bb0(rn9 rn9Var, qn9 qn9Var) {
        this.a = rn9Var;
        this.b = qn9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sn9)) {
            return false;
        }
        sn9 sn9Var = (sn9) obj;
        rn9 rn9Var = this.a;
        if (rn9Var != null ? rn9Var.equals(((bb0) sn9Var).a) : ((bb0) sn9Var).a == null) {
            qn9 qn9Var = this.b;
            if (qn9Var == null) {
                if (((bb0) sn9Var).b == null) {
                    return true;
                }
            } else if (qn9Var.equals(((bb0) sn9Var).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        rn9 rn9Var = this.a;
        int iHashCode = ((rn9Var == null ? 0 : rn9Var.hashCode()) ^ 1000003) * 1000003;
        qn9 qn9Var = this.b;
        return iHashCode ^ (qn9Var != null ? qn9Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
