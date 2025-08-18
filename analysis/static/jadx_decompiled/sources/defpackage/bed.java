package defpackage;

/* loaded from: classes2.dex */
public final class bed extends ka1 {
    public final jqe b;

    public bed(eqe eqeVar) {
        super(12);
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bed) && tpa.f(this.b, ((bed) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowError(message="), this.b, ")");
    }
}
