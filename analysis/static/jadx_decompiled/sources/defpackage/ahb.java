package defpackage;

/* loaded from: classes2.dex */
public final class ahb implements chb {
    public final Long a;

    public ahb(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahb) && tpa.f(this.a, ((ahb) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "UpdateSuccess(requestId=" + this.a + ")";
    }
}
