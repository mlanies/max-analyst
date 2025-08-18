package defpackage;

/* loaded from: classes2.dex */
public final class j73 {
    public final i73 a;
    public final k73 b;

    public j73(i73 i73Var, k73 k73Var) {
        this.a = i73Var;
        this.b = k73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return tpa.f(this.a, j73Var.a) && tpa.f(this.b, j73Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonActionColors(background=" + this.a + ", icon=" + this.b + ")";
    }
}
