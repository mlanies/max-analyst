package defpackage;

/* loaded from: classes.dex */
public final class pe1 extends ue1 {
    public final gg1 a;
    public final String b;
    public final String c;

    public pe1(gg1 gg1Var, String str, String str2) {
        this.a = gg1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe1)) {
            return false;
        }
        pe1 pe1Var = (pe1) obj;
        return tpa.f(this.a, pe1Var.a) && tpa.f(this.b, pe1Var.b) && tpa.f(this.c, pe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", url=");
        return zr6.l(sb, this.c, ")");
    }
}
