package defpackage;

/* loaded from: classes.dex */
public final class z90 extends o33 {
    public final n33 a = n33.a;
    public final kd b;

    public z90(k90 k90Var) {
        this.b = k90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o33)) {
            return false;
        }
        o33 o33Var = (o33) obj;
        n33 n33Var = this.a;
        if (n33Var != null ? n33Var.equals(((z90) o33Var).a) : ((z90) o33Var).a == null) {
            kd kdVar = this.b;
            if (kdVar == null) {
                if (((z90) o33Var).b == null) {
                    return true;
                }
            } else if (kdVar.equals(((z90) o33Var).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        n33 n33Var = this.a;
        int iHashCode = ((n33Var == null ? 0 : n33Var.hashCode()) ^ 1000003) * 1000003;
        kd kdVar = this.b;
        return iHashCode ^ (kdVar != null ? kdVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
