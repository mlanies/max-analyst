package defpackage;

/* loaded from: classes.dex */
public final class a06 {
    public final jqe a;
    public final boolean b;
    public final ez c;
    public final boolean d;

    public a06(jqe jqeVar, boolean z, ez ezVar, boolean z2) {
        this.a = jqeVar;
        this.b = z;
        this.c = ezVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a06)) {
            return false;
        }
        a06 a06Var = (a06) obj;
        return tpa.f(this.a, a06Var.a) && this.b == a06Var.b && tpa.f(this.c, a06Var.c) && this.d == a06Var.d;
    }

    public final int hashCode() {
        int iD = ms2.d(this.a.hashCode() * 31, 31, this.b);
        ez ezVar = this.c;
        return Boolean.hashCode(this.d) + ((iD + (ezVar == null ? 0 : ezVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ForwardQuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", attachDescription=" + this.c + ", isAuthorVisibilityAvailable=" + this.d + ")";
    }
}
