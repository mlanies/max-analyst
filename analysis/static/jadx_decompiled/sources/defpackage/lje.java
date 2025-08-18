package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lje {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public lje(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lje)) {
            return false;
        }
        lje ljeVar = (lje) obj;
        if (this.b != ljeVar.b || !tpa.f(this.c, ljeVar.c) || !tpa.f(this.d, ljeVar.d)) {
            return false;
        }
        String str = this.a;
        boolean zO0 = eae.o0(str, "index_", false);
        String str2 = ljeVar.a;
        return zO0 ? eae.o0(str2, "index_", false) : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k7d.g(this.c, (((eae.o0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append(", orders=");
        return au1.i(sb, this.d, "'}");
    }
}
