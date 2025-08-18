package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jdb implements ldb {
    public final jqe a;
    public final jqe b;
    public final List c;

    public jdb(jqe jqeVar, jqe jqeVar2, List list) {
        this.a = jqeVar;
        this.b = jqeVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb)) {
            return false;
        }
        jdb jdbVar = (jdb) obj;
        return tpa.f(this.a, jdbVar.a) && tpa.f(this.b, jdbVar.b) && tpa.f(this.c, jdbVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return this.c.hashCode() + ((iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
