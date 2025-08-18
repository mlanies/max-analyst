package defpackage;

/* loaded from: classes2.dex */
public final class dz8 {
    public final int a;
    public final jqe b;
    public final boolean c;
    public final ez d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public dz8(int i, jqe jqeVar, boolean z, ez ezVar, boolean z2, Integer num, boolean z3) {
        this.a = i;
        this.b = jqeVar;
        this.c = z;
        this.d = ezVar;
        this.e = z2;
        this.f = num;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz8)) {
            return false;
        }
        dz8 dz8Var = (dz8) obj;
        return this.a == dz8Var.a && tpa.f(this.b, dz8Var.b) && this.c == dz8Var.c && tpa.f(this.d, dz8Var.d) && this.e == dz8Var.e && tpa.f(this.f, dz8Var.f) && this.g == dz8Var.g;
    }

    public final int hashCode() {
        int iD = ms2.d(k7d.f(au1.s(this.a) * 31, 31, this.b), 31, this.c);
        ez ezVar = this.d;
        int iD2 = ms2.d((iD + (ezVar == null ? 0 : ezVar.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iD2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "EDIT");
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showVerificationMark=");
        sb.append(this.c);
        sb.append(", attachDescription=");
        sb.append(this.d);
        sb.append(", isForwardAuthorHidden=");
        sb.append(this.e);
        sb.append(", startIconResId=");
        sb.append(this.f);
        sb.append(", isAuthorVisibilityAvailable=");
        return au1.j(sb, this.g, ")");
    }
}
