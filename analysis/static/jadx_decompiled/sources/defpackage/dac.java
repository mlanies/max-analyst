package defpackage;

/* loaded from: classes2.dex */
public final class dac implements iac {
    public final o2 a;

    public dac(o2 o2Var) {
        this.a = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dac) && tpa.f(this.a, ((dac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediaMessageSend(media=" + this.a + ")";
    }
}
