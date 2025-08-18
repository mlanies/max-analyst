package defpackage;

/* loaded from: classes2.dex */
public final class rlb extends amb {
    public final jqe a;

    public rlb(gqe gqeVar) {
        this.a = gqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rlb) && tpa.f(this.a, ((rlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ExternalShareChannelLink(text="), this.a, ")");
    }
}
