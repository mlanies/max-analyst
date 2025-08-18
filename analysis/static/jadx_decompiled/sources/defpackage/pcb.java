package defpackage;

/* loaded from: classes2.dex */
public final class pcb extends vcb {
    public final jqe b;

    public pcb(gqe gqeVar) {
        this.b = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcb) && tpa.f(this.b, ((pcb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ExternalShareLink(text="), this.b, ")");
    }
}
