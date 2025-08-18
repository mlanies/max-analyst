package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ov2 {
    public static final ov2 f = new ov2(nv2.c, "", it6.d, nz4.a, true);
    public final nv2 a;
    public final String b;
    public final it6 c;
    public final List d;
    public final boolean e;

    public ov2(nv2 nv2Var, String str, it6 it6Var, List list, boolean z) {
        this.a = nv2Var;
        this.b = str;
        this.c = it6Var;
        this.d = list;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static ov2 a(ov2 ov2Var, nv2 nv2Var, it6 it6Var, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            nv2Var = ov2Var.a;
        }
        nv2 nv2Var2 = nv2Var;
        String str = ov2Var.b;
        if ((i & 4) != 0) {
            it6Var = ov2Var.c;
        }
        it6 it6Var2 = it6Var;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = ov2Var.d;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            z = ov2Var.e;
        }
        ov2Var.getClass();
        return new ov2(nv2Var2, str, it6Var2, arrayList3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov2)) {
            return false;
        }
        ov2 ov2Var = (ov2) obj;
        return this.a == ov2Var.a && tpa.f(this.b, ov2Var.b) && tpa.f(this.c, ov2Var.c) && tpa.f(this.d, ov2Var.d) && this.e == ov2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k7d.g(this.d, (this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        if (this == f) {
            return ov2.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery='");
        sb.append(pag.x(this.b));
        sb.append("', idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(x53.n0(this.d, ",", "[", "]", new we1(27), 24));
        sb.append(", scrollToTop=");
        return au1.j(sb, this.e, ")");
    }
}
