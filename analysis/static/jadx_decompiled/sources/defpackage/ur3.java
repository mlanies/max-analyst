package defpackage;

/* loaded from: classes.dex */
public final class ur3 {
    public final qp3 a;

    public ur3(qp3 qp3Var) {
        this.a = qp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur3) && tpa.f(this.a, ((ur3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(contactsResult=" + this.a + ")";
    }
}
