package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class it6 {
    public static final it6 d;
    public final List a;
    public final List b;
    public final List c;

    static {
        nz4 nz4Var = nz4.a;
        d = new it6(nz4Var, nz4Var, nz4Var);
    }

    public it6(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        return tpa.f(this.a, it6Var.a) && tpa.f(this.b, it6Var.b) && tpa.f(this.c, it6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        if (this == d) {
            return it6.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("IdleSearchData(recentContacts=");
        sb.append(x53.n0(this.a, ",", "[", "]", new pz2(24), 24));
        sb.append(", recentSearch=");
        sb.append(x53.n0(this.b, ",", "[", "]", new pz2(25), 24));
        sb.append(", allContacts=");
        return zr6.l(sb, x53.n0(this.c, ",", "[", "]", new pz2(26), 24), ")");
    }
}
