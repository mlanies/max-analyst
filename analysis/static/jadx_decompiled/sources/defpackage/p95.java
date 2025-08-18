package defpackage;

/* loaded from: classes.dex */
public final class p95 extends wm9 {
    public final jqe b;

    public p95(eqe eqeVar) {
        super(e5f.a);
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p95) && tpa.f(this.b, ((p95) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(text="), this.b, ")");
    }
}
