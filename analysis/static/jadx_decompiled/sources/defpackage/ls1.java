package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ls1 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public ls1(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static ls1 a(ls1 ls1Var, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = ls1Var.a;
        }
        if ((i & 2) != 0) {
            z = ls1Var.b;
        }
        if ((i & 4) != 0) {
            z2 = ls1Var.c;
        }
        ls1Var.getClass();
        return new ls1(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls1)) {
            return false;
        }
        ls1 ls1Var = (ls1) obj;
        return tpa.f(this.a, ls1Var.a) && this.b == ls1Var.b && this.c == ls1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsHistoryState(tabs=");
        sb.append(this.a);
        sb.append(", isGroupCallAvailable=");
        sb.append(this.b);
        sb.append(", isBannerVisible=");
        return au1.j(sb, this.c, ")");
    }
}
