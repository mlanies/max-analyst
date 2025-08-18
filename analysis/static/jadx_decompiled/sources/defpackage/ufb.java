package defpackage;

/* loaded from: classes2.dex */
public final class ufb implements xfb {
    public final a73 a;

    public ufb(a73 a73Var) {
        this.a = a73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufb) && tpa.f(this.a, ((ufb) obj).a);
    }

    public final int hashCode() {
        a73 a73Var = this.a;
        if (a73Var == null) {
            return 0;
        }
        return a73Var.a.hashCode();
    }

    public final String toString() {
        return "FirstNamePayload(errorText=" + this.a + ")";
    }
}
