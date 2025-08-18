package defpackage;

/* loaded from: classes.dex */
public final class fq implements ol7 {
    public final bq a;
    public final Boolean b;
    public final jqe c;

    public fq(bq bqVar, Boolean bool, jqe jqeVar) {
        this.a = bqVar;
        this.b = bool;
        this.c = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return this.a == fqVar.a && tpa.f(this.b, fqVar.b) && tpa.f(this.c, fqVar.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a.ordinal();
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return getItemId() == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        fq fqVar = ol7Var instanceof fq ? (fq) ol7Var : null;
        if (fqVar == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = fqVar.b;
        if (tpa.f(bool, bool2)) {
            return null;
        }
        return new dq(bool2);
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ", title=" + this.c + ")";
    }
}
