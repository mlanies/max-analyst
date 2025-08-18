package defpackage;

/* loaded from: classes2.dex */
public final class my3 {
    public final eaa a;
    public final int b;
    public final jqe c;

    public my3(eaa eaaVar, int i, jqe jqeVar) {
        this.a = eaaVar;
        this.b = i;
        this.c = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my3)) {
            return false;
        }
        my3 my3Var = (my3) obj;
        return tpa.f(this.a, my3Var.a) && this.b == my3Var.b && tpa.f(this.c, my3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
