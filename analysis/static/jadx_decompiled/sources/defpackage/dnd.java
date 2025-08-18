package defpackage;

/* loaded from: classes.dex */
public final class dnd extends ln3 {
    public final jqe a;
    public final m56 b;

    public dnd(eqe eqeVar, m56 m56Var) {
        this.a = eqeVar;
        this.b = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnd)) {
            return false;
        }
        dnd dndVar = (dnd) obj;
        return tpa.f(this.a, dndVar.a) && tpa.f(this.b, dndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
