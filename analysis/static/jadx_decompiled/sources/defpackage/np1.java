package defpackage;

/* loaded from: classes2.dex */
public final class np1 {
    public final z61 a;

    public np1(z61 z61Var) {
        this.a = z61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof np1) && tpa.f(this.a, ((np1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.a + ")";
    }
}
