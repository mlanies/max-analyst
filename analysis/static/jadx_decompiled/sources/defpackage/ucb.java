package defpackage;

/* loaded from: classes2.dex */
public final class ucb extends vcb {
    public final jqe b;
    public final jqe c;
    public final boolean d;
    public final Integer e;

    public /* synthetic */ ucb(jqe jqeVar, Integer num, int i) {
        this(jqeVar, null, false, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb)) {
            return false;
        }
        ucb ucbVar = (ucb) obj;
        return tpa.f(this.b, ucbVar.b) && tpa.f(this.c, ucbVar.c) && this.d == ucbVar.d && tpa.f(this.e, ucbVar.e);
    }

    public final int hashCode() {
        jqe jqeVar = this.b;
        int iHashCode = (jqeVar == null ? 0 : jqeVar.hashCode()) * 31;
        jqe jqeVar2 = this.c;
        int iD = ms2.d((iHashCode + (jqeVar2 == null ? 0 : jqeVar2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public ucb(jqe jqeVar, jqe jqeVar2, boolean z, Integer num) {
        this.b = jqeVar;
        this.c = jqeVar2;
        this.d = z;
        this.e = num;
    }
}
