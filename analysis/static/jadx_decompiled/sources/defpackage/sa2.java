package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class sa2 {
    public static final sa2 c = new sa2(nz4.a, wz4.a);
    public final Set a;
    public final List b;

    public sa2(List list, Set set) {
        this.a = set;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa2)) {
            return false;
        }
        sa2 sa2Var = (sa2) obj;
        return tpa.f(this.a, sa2Var.a) && tpa.f(this.b, sa2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatFolders(allFilterExclude=" + this.a + ", folders=" + this.b + ")";
    }
}
