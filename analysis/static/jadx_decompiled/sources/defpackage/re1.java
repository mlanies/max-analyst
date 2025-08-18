package defpackage;

/* loaded from: classes.dex */
public final class re1 extends ue1 {
    public final boolean a;
    public final gg1 b;

    public re1(gg1 gg1Var, boolean z) {
        this.a = z;
        this.b = gg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re1)) {
            return false;
        }
        re1 re1Var = (re1) obj;
        return this.a == re1Var.a && tpa.f(this.b, re1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HasMoreAction(isEnabled=" + this.a + ", opponentId=" + this.b + ")";
    }
}
