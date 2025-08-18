package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class mid extends ka1 {
    public final jqe b;
    public final List c;
    public final jqe d;

    public mid(jqe jqeVar, jqe jqeVar2, List list) {
        super(15);
        this.b = jqeVar;
        this.c = list;
        this.d = jqeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mid)) {
            return false;
        }
        mid midVar = (mid) obj;
        return tpa.f(this.b, midVar.b) && tpa.f(this.c, midVar.c) && tpa.f(this.d, midVar.d);
    }

    public final int hashCode() {
        int iG = k7d.g(this.c, this.b.hashCode() * 31, 31);
        jqe jqeVar = this.d;
        return iG + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", desc=" + this.d + ")";
    }
}
