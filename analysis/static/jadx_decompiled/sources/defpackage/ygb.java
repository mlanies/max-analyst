package defpackage;

/* loaded from: classes2.dex */
public final class ygb {
    public final Long a;
    public final jqe b;

    public ygb(Long l, jqe jqeVar) {
        this.a = l;
        this.b = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb)) {
            return false;
        }
        ygb ygbVar = (ygb) obj;
        return tpa.f(this.a, ygbVar.a) && tpa.f(this.b, ygbVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
