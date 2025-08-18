package defpackage;

/* loaded from: classes.dex */
public final class ia1 extends ka1 {
    public final jqe b;

    public ia1(eqe eqeVar) {
        super(0);
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia1) && tpa.f(this.b, ((ia1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(message="), this.b, ")");
    }
}
