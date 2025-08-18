package defpackage;

/* loaded from: classes2.dex */
public final class wx6 {
    public final ux6 a;
    public final int b;

    public wx6(ux6 ux6Var, int i) {
        this.a = ux6Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx6)) {
            return false;
        }
        wx6 wx6Var = (wx6) obj;
        return this.a == wx6Var.a && this.b == wx6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggeredCondition(key=");
        sb.append(this.a);
        sb.append(", quantity=");
        return zr6.j(sb, this.b, ")");
    }
}
