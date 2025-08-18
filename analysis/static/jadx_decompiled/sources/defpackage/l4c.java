package defpackage;

/* loaded from: classes.dex */
public final class l4c {
    public static final l4c c = new l4c(jqe.a, null);
    public final jqe a;
    public final jqe b;

    public l4c(jqe jqeVar, gqe gqeVar) {
        this.a = jqeVar;
        this.b = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4c)) {
            return false;
        }
        l4c l4cVar = (l4c) obj;
        return tpa.f(this.a, l4cVar.a) && tpa.f(this.b, l4cVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    public final String toString() {
        return "RaiseHandState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
