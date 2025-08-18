package defpackage;

/* loaded from: classes2.dex */
public final class x22 {
    public final jqe a;
    public final Integer b;

    public x22(eqe eqeVar, Integer num) {
        this.a = eqeVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x22)) {
            return false;
        }
        x22 x22Var = (x22) obj;
        return tpa.f(this.a, x22Var.a) && tpa.f(this.b, x22Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
