package defpackage;

/* loaded from: classes2.dex */
public final class ea7 extends ga7 {
    public final ha7 d;

    public ea7(ha7 ha7Var) {
        super("client", 1, ha7Var);
        this.d = ha7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea7) && tpa.f(this.d, ((ea7) obj).d);
    }

    public final int hashCode() {
        ha7 ha7Var = this.d;
        if (ha7Var == null) {
            return 0;
        }
        return ha7Var.hashCode();
    }

    @Override // defpackage.ga7
    public final ha7 l() {
        return this.d;
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
