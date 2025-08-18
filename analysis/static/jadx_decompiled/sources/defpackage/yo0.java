package defpackage;

/* loaded from: classes2.dex */
public final class yo0 implements ap0 {
    public final ps3 a;

    public yo0(ps3 ps3Var) {
        this.a = ps3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo0) && tpa.f(this.a, ((yo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(event=" + this.a + ")";
    }
}
