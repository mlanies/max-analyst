package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class mab {
    public final tab a;
    public final List b;
    public final List c;

    public mab(tab tabVar, List list, List list2) {
        this.a = tabVar;
        this.b = list;
        this.c = list2;
    }

    public static mab a(mab mabVar, tab tabVar, List list, int i) {
        if ((i & 2) != 0) {
            list = mabVar.b;
        }
        return new mab(tabVar, list, mabVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mab)) {
            return false;
        }
        mab mabVar = (mab) obj;
        return tpa.f(this.a, mabVar.a) && tpa.f(this.b, mabVar.b) && tpa.f(this.c, mabVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return au1.i(sb, this.c, ")");
    }

    public /* synthetic */ mab(tab tabVar, kl7 kl7Var) {
        this(tabVar, kl7Var, nz4.a);
    }
}
