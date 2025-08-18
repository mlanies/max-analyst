package defpackage;

/* loaded from: classes2.dex */
public final class st3 {
    public final jqe a;
    public final Integer b;
    public final rme c;
    public final rme d;
    public final k56 e;

    public st3(jqe jqeVar, Integer num, rme rmeVar, rme rmeVar2, k56 k56Var) {
        this.a = jqeVar;
        this.b = num;
        this.c = rmeVar;
        this.d = rmeVar2;
        this.e = k56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st3)) {
            return false;
        }
        st3 st3Var = (st3) obj;
        return tpa.f(this.a, st3Var.a) && tpa.f(this.b, st3Var.b) && this.c == st3Var.c && this.d == st3Var.d && tpa.f(this.e, st3Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContextMenuAction(title=" + this.a + ", icon=" + this.b + ", iconColor=" + this.c + ", titleColor=" + this.d + ", clickAction=" + this.e + ")";
    }

    public /* synthetic */ st3(eqe eqeVar, Integer num, k56 k56Var, int i) {
        this(eqeVar, (i & 2) != 0 ? null : num, rme.u0, rme.D0, k56Var);
    }
}
