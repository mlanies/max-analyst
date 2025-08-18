package defpackage;

/* loaded from: classes.dex */
public final class icc {
    public final jqe a;
    public final jqe b;
    public final hcc c;
    public final hcc d;
    public final jqe e;
    public final boolean f;

    public icc(eqe eqeVar, eqe eqeVar2, hcc hccVar, hcc hccVar2, jqe jqeVar, boolean z) {
        this.a = eqeVar;
        this.b = eqeVar2;
        this.c = hccVar;
        this.d = hccVar2;
        this.e = jqeVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icc)) {
            return false;
        }
        icc iccVar = (icc) obj;
        return tpa.f(this.a, iccVar.a) && tpa.f(this.b, iccVar.b) && tpa.f(this.c, iccVar.c) && tpa.f(this.d, iccVar.d) && tpa.f(this.e, iccVar.e) && this.f == iccVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return Boolean.hashCode(this.f) + k7d.f((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitWithRecordState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", negativeButton=");
        sb.append(this.c);
        sb.append(", positiveButton=");
        sb.append(this.d);
        sb.append(", recordTitle=");
        sb.append(this.e);
        sb.append(", canRemove=");
        return au1.j(sb, this.f, ")");
    }
}
