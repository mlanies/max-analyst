package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class mhb extends phb {
    public final jqe a;
    public final jqe b;
    public final List c;

    public mhb(eqe eqeVar, eqe eqeVar2, List list) {
        this.a = eqeVar;
        this.b = eqeVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb)) {
            return false;
        }
        mhb mhbVar = (mhb) obj;
        return tpa.f(this.a, mhbVar.a) && tpa.f(this.b, mhbVar.b) && tpa.f(this.c, mhbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return this.c.hashCode() + ((iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
