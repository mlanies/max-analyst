package defpackage;

/* loaded from: classes2.dex */
public final class omd extends i24 {
    public final String g;
    public final String h;
    public final jqe i;
    public final boolean j;
    public final boolean k;
    public final jqe l;
    public final Integer m;

    public omd(String str, String str2, eqe eqeVar, boolean z, boolean z2, jqe jqeVar, Integer num) {
        this.g = str;
        this.h = str2;
        this.i = eqeVar;
        this.j = z;
        this.k = z2;
        this.l = jqeVar;
        this.m = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omd)) {
            return false;
        }
        omd omdVar = (omd) obj;
        return tpa.f(this.g, omdVar.g) && tpa.f(this.h, omdVar.h) && tpa.f(this.i, omdVar.i) && this.j == omdVar.j && this.k == omdVar.k && tpa.f(this.l, omdVar.l) && tpa.f(this.m, omdVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        String str = this.h;
        int iD = ms2.d(ms2.d(k7d.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        jqe jqeVar = this.l;
        int iHashCode2 = (iD + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.m;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // defpackage.i24
    public final jqe m() {
        return this.l;
    }

    @Override // defpackage.i24
    public final Integer n() {
        return this.m;
    }

    public final String toString() {
        return "Input(prefix=" + this.g + ", link=" + this.h + ", placeholder=" + this.i + ", shouldShowMore=" + this.j + ", shouldShowDescription=" + this.k + ", hint=" + this.l + ", hintColor=" + this.m + ")";
    }
}
