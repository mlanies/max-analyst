package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class so8 {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public so8(List list, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = list;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so8)) {
            return false;
        }
        so8 so8Var = (so8) obj;
        return tpa.f(this.a, so8Var.a) && tpa.f(this.b, so8Var.b) && tpa.f(this.c, so8Var.c) && this.d == so8Var.d && this.e == so8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(k7d.g(this.c, k7d.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(items=");
        sb.append(this.a);
        sb.append(", topActions=");
        sb.append(this.b);
        sb.append(", bottomAction=");
        sb.append(this.c);
        sb.append(", isSearch=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return au1.j(sb, this.e, ")");
    }
}
