package defpackage;

/* loaded from: classes.dex */
public final class h41 implements j41 {
    public final jp1 a;

    public h41(jp1 jp1Var) {
        this.a = jp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h41) && tpa.f(this.a, ((h41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
