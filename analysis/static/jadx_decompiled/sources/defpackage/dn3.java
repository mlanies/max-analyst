package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dn3 {
    public static final dn3 d = new dn3(null, null, null);
    public final List a;
    public final List b;
    public final List c;

    public dn3(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static dn3 a(dn3 dn3Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = dn3Var.a;
        }
        List list = dn3Var.b;
        List list2 = dn3Var.c;
        dn3Var.getClass();
        return new dn3(arrayList2, list, list2);
    }

    public final boolean b() {
        List list;
        List list2;
        List list3 = this.a;
        return (list3 == null || list3.isEmpty()) && ((list = this.b) == null || list.isEmpty()) && ((list2 = this.c) == null || list2.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn3)) {
            return false;
        }
        dn3 dn3Var = (dn3) obj;
        return tpa.f(this.a, dn3Var.a) && tpa.f(this.b, dn3Var.b) && tpa.f(this.c, dn3Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactList(contacts=");
        sb.append(this.a);
        sb.append(", globalContacts=");
        sb.append(this.b);
        sb.append(", phonebook=");
        return au1.i(sb, this.c, ")");
    }
}
