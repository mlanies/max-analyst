package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class end extends ln3 {
    public final long a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public end(long j, jqe jqeVar, eqe eqeVar, List list) {
        this.a = j;
        this.b = jqeVar;
        this.c = eqeVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof end)) {
            return false;
        }
        end endVar = (end) obj;
        return this.a == endVar.a && tpa.f(this.b, endVar.b) && tpa.f(this.c, endVar.c) && tpa.f(this.d, endVar.d);
    }

    public final int hashCode() {
        int iF = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        jqe jqeVar = this.c;
        return this.d.hashCode() + ((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
