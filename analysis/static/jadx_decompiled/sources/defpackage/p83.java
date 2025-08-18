package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class p83 implements u83 {
    public final List a;
    public final boolean b;
    public final Long c;

    public p83(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static p83 a(p83 p83Var, List list, int i) {
        boolean z = (i & 2) != 0 ? p83Var.b : false;
        Long l = p83Var.c;
        p83Var.getClass();
        return new p83(l, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p83)) {
            return false;
        }
        p83 p83Var = (p83) obj;
        return tpa.f(this.a, p83Var.a) && this.b == p83Var.b && tpa.f(this.c, p83Var.c);
    }

    public final int hashCode() {
        int iD = ms2.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iD + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
