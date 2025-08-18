package defpackage;

/* loaded from: classes2.dex */
public final class qt7 extends rt7 {
    public final jqe d;
    public final jqe e;

    public qt7(jqe jqeVar, jqe jqeVar2) {
        super(jqeVar, null);
        this.d = jqeVar;
        this.e = jqeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt7)) {
            return false;
        }
        qt7 qt7Var = (qt7) obj;
        return tpa.f(this.d, qt7Var.d) && tpa.f(this.e, qt7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
