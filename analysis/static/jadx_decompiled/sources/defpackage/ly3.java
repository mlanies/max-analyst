package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ly3 {
    public final List a;
    public final List b;

    public ly3(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly3.class != obj.getClass()) {
            return false;
        }
        ly3 ly3Var = (ly3) obj;
        List list = ly3Var.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = ly3Var.b;
        List list4 = this.b;
        return list4 != null ? list4.equals(list3) : list3 == null;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "CountryCodeProxiesEntry{countries=" + this.a + ", connectionHosts=" + this.b + '}';
    }
}
