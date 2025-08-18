package defpackage;

/* loaded from: classes2.dex */
public final class nmd extends i24 {
    public final jqe g;
    public final jqe h;
    public final Integer i;

    public nmd(eqe eqeVar, eqe eqeVar2, Integer num) {
        this.g = eqeVar;
        this.h = eqeVar2;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmdVar = (nmd) obj;
        return tpa.f(this.g, nmdVar.g) && tpa.f(this.h, nmdVar.h) && tpa.f(this.i, nmdVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        jqe jqeVar = this.h;
        int iHashCode2 = (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
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
        return "Button(text=" + this.g + ", hint=" + this.h + ", hintColor=" + this.i + ")";
    }
}
