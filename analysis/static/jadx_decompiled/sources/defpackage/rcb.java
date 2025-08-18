package defpackage;

/* loaded from: classes2.dex */
public final class rcb extends vcb {
    public final jqe b;

    public rcb(gqe gqeVar) {
        this.b = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcb) && tpa.f(this.b, ((rcb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShareLinkToChat(text="), this.b, ")");
    }
}
