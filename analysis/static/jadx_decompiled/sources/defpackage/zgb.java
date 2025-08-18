package defpackage;

/* loaded from: classes2.dex */
public final class zgb implements chb {
    public final Long a;
    public final jqe b;

    public zgb(Long l, jqe jqeVar) {
        this.a = l;
        this.b = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb)) {
            return false;
        }
        zgb zgbVar = (zgb) obj;
        return tpa.f(this.a, zgbVar.a) && tpa.f(this.b, zgbVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
