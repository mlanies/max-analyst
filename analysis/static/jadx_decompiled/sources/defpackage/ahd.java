package defpackage;

/* loaded from: classes2.dex */
public final class ahd extends ka1 {
    public final jqe b;
    public final Integer c;

    public ahd(jqe jqeVar, Integer num) {
        super(14);
        this.b = jqeVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahd)) {
            return false;
        }
        ahd ahdVar = (ahd) obj;
        return tpa.f(this.b, ahdVar.b) && tpa.f(this.c, ahdVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}
