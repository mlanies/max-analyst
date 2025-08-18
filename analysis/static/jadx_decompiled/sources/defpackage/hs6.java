package defpackage;

/* loaded from: classes2.dex */
public final class hs6 {
    public final gs6 a;
    public final is6 b;
    public final js6 c;
    public final int d;
    public final int e;

    public hs6(gs6 gs6Var, is6 is6Var, js6 js6Var, int i, int i2) {
        this.a = gs6Var;
        this.b = is6Var;
        this.c = js6Var;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs6)) {
            return false;
        }
        hs6 hs6Var = (hs6) obj;
        return tpa.f(this.a, hs6Var.a) && tpa.f(this.b, hs6Var.b) && tpa.f(this.c, hs6Var.c) && this.d == hs6Var.d && this.e == hs6Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + k7d.e(this.d, (this.c.hashCode() + k7d.e(this.b.a, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalColors(category=");
        sb.append(this.a);
        sb.append(", promo=");
        sb.append(this.b);
        sb.append(", tabbar=");
        sb.append(this.c);
        sb.append(", verificationSecondary=");
        sb.append(this.d);
        sb.append(", verificationSubhead=");
        return zr6.j(sb, this.e, ")");
    }
}
