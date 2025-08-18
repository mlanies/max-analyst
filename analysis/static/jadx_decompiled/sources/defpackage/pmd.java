package defpackage;

/* loaded from: classes2.dex */
public final class pmd extends i24 {
    public final jqe g;
    public final jqe h;
    public final Integer i;

    public pmd(iqe iqeVar, eqe eqeVar, Integer num) {
        this.g = iqeVar;
        this.h = eqeVar;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        return tpa.f(this.g, pmdVar.g) && tpa.f(this.h, pmdVar.h) && tpa.f(this.i, pmdVar.i);
    }

    public final int hashCode() {
        int iD = ms2.d(this.g.hashCode() * 31, 31, true);
        jqe jqeVar = this.h;
        int iHashCode = (iD + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // defpackage.i24
    public final jqe m() {
        return this.h;
    }

    @Override // defpackage.i24
    public final Integer n() {
        return this.i;
    }

    public final String toString() {
        return "Text(text=" + this.g + ", shouldShowMore=true, hint=" + this.h + ", hintColor=" + this.i + ")";
    }
}
