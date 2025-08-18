package defpackage;

/* loaded from: classes2.dex */
public final class ced extends ka1 {
    public final jqe b;

    public ced(eqe eqeVar) {
        super(12);
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ced) && tpa.f(this.b, ((ced) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSuccess(message="), this.b, ")");
    }
}
