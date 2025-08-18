package defpackage;

/* loaded from: classes2.dex */
public final class gjb implements ijb {
    public final jqe a;

    public gjb(jqe jqeVar) {
        this.a = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjb) && tpa.f(this.a, ((gjb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowRestoreMembersSnackbar(caption="), this.a, ")");
    }
}
