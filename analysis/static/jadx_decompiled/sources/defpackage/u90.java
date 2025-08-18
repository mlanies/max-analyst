package defpackage;

/* loaded from: classes.dex */
public final class u90 {
    public final int a;
    public final v90 b;

    public u90(int i, v90 v90Var) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.a = i;
        this.b = v90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        if (au1.c(this.a, u90Var.a)) {
            v90 v90Var = u90Var.b;
            v90 v90Var2 = this.b;
            if (v90Var2 == null) {
                if (v90Var == null) {
                    return true;
                }
            } else if (v90Var2.equals(v90Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iS = (au1.s(this.a) ^ 1000003) * 1000003;
        v90 v90Var = this.b;
        return (v90Var == null ? 0 : v90Var.hashCode()) ^ iS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
