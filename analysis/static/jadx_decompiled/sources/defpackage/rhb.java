package defpackage;

/* loaded from: classes2.dex */
public final class rhb extends ka1 {
    public final jqe b;

    public rhb(gqe gqeVar) {
        super(10);
        this.b = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhb) && tpa.f(this.b, ((rhb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
