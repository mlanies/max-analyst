package defpackage;

/* loaded from: classes2.dex */
public final class ulb extends amb {
    public final jqe a;
    public final m56 b;

    public ulb(jqe jqeVar, m56 m56Var) {
        this.a = jqeVar;
        this.b = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulb)) {
            return false;
        }
        ulb ulbVar = (ulb) obj;
        return tpa.f(this.a, ulbVar.a) && tpa.f(this.b, ulbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
