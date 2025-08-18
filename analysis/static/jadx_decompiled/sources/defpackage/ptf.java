package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ptf implements rtf {
    public final jqe a;
    public final jqe b;
    public final List c;

    public ptf(int i, eqe eqeVar, jqe jqeVar, List list) {
        this.a = eqeVar;
        this.b = jqeVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptf)) {
            return false;
        }
        ptf ptfVar = (ptf) obj;
        ptfVar.getClass();
        int i = woc.a;
        return tpa.f(this.a, ptfVar.a) && tpa.f(this.b, ptfVar.b) && tpa.f(this.c, ptfVar.c);
    }

    public final int hashCode() {
        int iF = k7d.f(Integer.hashCode(woc.A) * 31, 31, this.a);
        jqe jqeVar = this.b;
        return this.c.hashCode() + ((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestBiometryAccess(icon=");
        sb.append(woc.A);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
