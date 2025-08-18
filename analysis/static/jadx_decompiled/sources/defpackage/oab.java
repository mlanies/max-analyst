package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oab {
    public final long a;
    public final Map b;
    public final List c;
    public final uj3 d;

    public oab(long j, Map map, List list, uj3 uj3Var) {
        this.a = j;
        this.b = map;
        this.c = list;
        this.d = uj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oabVar = (oab) obj;
        return this.a == oabVar.a && tpa.f(this.b, oabVar.b) && tpa.f(this.c, oabVar.c) && tpa.f(this.d, oabVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k7d.g(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Profile(serverId=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ", contact=" + this.d + ")";
    }
}
