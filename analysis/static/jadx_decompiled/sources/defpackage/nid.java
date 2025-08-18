package defpackage;

/* loaded from: classes2.dex */
public final class nid extends ka1 {
    public final jqe b;

    public nid(gqe gqeVar) {
        super(15);
        this.b = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nid) && tpa.f(this.b, ((nid) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(message="), this.b, ")");
    }
}
