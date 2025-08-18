package defpackage;

/* loaded from: classes.dex */
public final class vj1 extends wj1 {
    public final jqe D;
    public final k56 E;

    public vj1(gqe gqeVar, a81 a81Var) {
        this.D = gqeVar;
        this.E = a81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1Var = (vj1) obj;
        vj1Var.getClass();
        return tpa.f(this.D, vj1Var.D) && tpa.f(this.E, vj1Var.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + k7d.f(dj1.b.hashCode() * 31, 31, this.D);
    }

    public final String toString() {
        return "ShowTimerSnackbar(priority=" + dj1.b + ", textSource=" + this.D + ", action=" + this.E + ")";
    }
}
