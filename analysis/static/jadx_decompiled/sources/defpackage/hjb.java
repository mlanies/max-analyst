package defpackage;

/* loaded from: classes2.dex */
public final class hjb implements ijb {
    public final jqe a;

    public hjb(jqe jqeVar) {
        this.a = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hjb) && tpa.f(this.a, ((hjb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ShowSuccessRestoredMembersSnackbar(caption="), this.a, ")");
    }
}
