package defpackage;

/* loaded from: classes.dex */
public final class uj1 extends wj1 {
    public final jqe D;
    public final Integer E;

    public uj1(jqe jqeVar, Integer num) {
        this.D = jqeVar;
        this.E = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1Var = (uj1) obj;
        uj1Var.getClass();
        return tpa.f(this.D, uj1Var.D) && tpa.f(this.E, uj1Var.E);
    }

    public final int hashCode() {
        int iF = k7d.f(dj1.a.hashCode() * 31, 31, this.D);
        Integer num = this.E;
        return iF + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(priority=" + dj1.a + ", textSource=" + this.D + ", icon=" + this.E + ")";
    }
}
