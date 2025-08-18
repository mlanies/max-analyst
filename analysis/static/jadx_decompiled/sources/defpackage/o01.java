package defpackage;

/* loaded from: classes2.dex */
public final class o01 {
    public final bg1 a;
    public final Long b;

    public o01(bg1 bg1Var, Long l) {
        this.a = bg1Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return tpa.f(this.a, o01Var.a) && tpa.f(this.b, o01Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
