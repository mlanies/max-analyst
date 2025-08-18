package defpackage;

/* loaded from: classes.dex */
public final class cnd extends tt2 {
    public final jqe a;
    public final m56 b;

    public cnd(eqe eqeVar, m56 m56Var) {
        this.a = eqeVar;
        this.b = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnd)) {
            return false;
        }
        cnd cndVar = (cnd) obj;
        return tpa.f(this.a, cndVar.a) && tpa.f(this.b, cndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
