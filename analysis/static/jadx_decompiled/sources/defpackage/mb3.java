package defpackage;

/* loaded from: classes.dex */
public final class mb3 {
    public final Object a;
    public final m56 b;

    public mb3(Object obj, m56 m56Var) {
        this.a = obj;
        this.b = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb3)) {
            return false;
        }
        mb3 mb3Var = (mb3) obj;
        return tpa.f(this.a, mb3Var.a) && tpa.f(this.b, mb3Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
