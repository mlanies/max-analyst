package defpackage;

/* loaded from: classes2.dex */
public final class wfb implements xfb {
    public final i24 a;

    public wfb(i24 i24Var) {
        this.a = i24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfb) && tpa.f(this.a, ((wfb) obj).a);
    }

    public final int hashCode() {
        i24 i24Var = this.a;
        if (i24Var == null) {
            return 0;
        }
        return i24Var.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
