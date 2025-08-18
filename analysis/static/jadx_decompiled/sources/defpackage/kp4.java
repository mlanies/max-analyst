package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class kp4 {
    public final Map a;
    public final Map b;

    public kp4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp4)) {
            return false;
        }
        kp4 kp4Var = (kp4) obj;
        return tpa.f(this.a, kp4Var.a) && tpa.f(this.b, kp4Var.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "DraftUpdates(discarded=" + this.a + ", saved=" + this.b + ")";
    }
}
