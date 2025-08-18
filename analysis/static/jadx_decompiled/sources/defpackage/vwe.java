package defpackage;

/* loaded from: classes.dex */
public final class vwe {
    public final jqe a;
    public final jqe b;

    public vwe(gqe gqeVar, eqe eqeVar) {
        this.a = gqeVar;
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwe)) {
            return false;
        }
        vwe vweVar = (vwe) obj;
        return tpa.f(this.a, vweVar.a) && tpa.f(this.b, vweVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
