package defpackage;

/* loaded from: classes2.dex */
public final class kdb implements ldb {
    public final jqe a;
    public final Integer b;

    public kdb(jqe jqeVar, Integer num) {
        this.a = jqeVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdb)) {
            return false;
        }
        kdb kdbVar = (kdb) obj;
        return tpa.f(this.a, kdbVar.a) && tpa.f(this.b, kdbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
