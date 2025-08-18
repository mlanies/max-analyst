package defpackage;

/* loaded from: classes2.dex */
public final class xo0 implements ap0 {
    public final kn3 a;

    public xo0(kn3 kn3Var) {
        this.a = kn3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo0) && tpa.f(this.a, ((xo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
