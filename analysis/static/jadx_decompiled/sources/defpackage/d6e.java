package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class d6e {
    public final List a;
    public final boolean b;

    public d6e(int i, boolean z, List list) {
        list = (i & 1) != 0 ? null : list;
        z = (i & 2) != 0 ? false : z;
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6e)) {
            return false;
        }
        d6e d6eVar = (d6e) obj;
        return tpa.f(this.a, d6eVar.a) && this.b == d6eVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(sets=" + this.a + ", loading=" + this.b + ")";
    }
}
