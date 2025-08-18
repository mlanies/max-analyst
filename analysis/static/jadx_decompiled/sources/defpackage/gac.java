package defpackage;

/* loaded from: classes2.dex */
public final class gac implements iac {
    public final jqe a;

    public gac(eqe eqeVar) {
        this.a = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gac) && tpa.f(this.a, ((gac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSnackbar(textSource="), this.a, ")");
    }
}
