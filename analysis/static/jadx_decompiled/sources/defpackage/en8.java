package defpackage;

/* loaded from: classes2.dex */
public final class en8 implements ol7 {
    public final hfd X;
    public final long Y;
    public final int Z = eda.a;
    public final int a;
    public final jqe b;
    public final jfd c;
    public final Integer o;

    public en8(int i, jqe jqeVar, jfd jfdVar, Integer num, hfd hfdVar) {
        this.a = i;
        this.b = jqeVar;
        this.c = jfdVar;
        this.o = num;
        this.X = hfdVar;
        this.Y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en8)) {
            return false;
        }
        en8 en8Var = (en8) obj;
        return this.a == en8Var.a && tpa.f(this.b, en8Var.b) && this.c == en8Var.c && tpa.f(this.o, en8Var.o) && tpa.f(this.X, en8Var.X);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.o;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        hfd hfdVar = this.X;
        return iHashCode2 + (hfdVar != null ? hfdVar.hashCode() : 0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.Z;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.X + ")";
    }
}
