package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class scb extends vcb {
    public final jqe b;
    public final jqe c;
    public final List d;

    public scb(eqe eqeVar, eqe eqeVar2, List list) {
        this.b = eqeVar;
        this.c = eqeVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scb)) {
            return false;
        }
        scb scbVar = (scb) obj;
        return tpa.f(this.b, scbVar.b) && tpa.f(this.c, scbVar.c) && tpa.f(this.d, scbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        jqe jqeVar = this.c;
        return this.d.hashCode() + ((iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return au1.i(sb, this.d, ")");
    }
}
