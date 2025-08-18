package defpackage;

/* loaded from: classes2.dex */
public final class y47 implements ol7 {
    public final long X;
    public final x47 a;
    public final jqe b;
    public final Integer c;
    public final int o = gca.c;

    public y47(x47 x47Var, eqe eqeVar, Integer num) {
        this.a = x47Var;
        this.b = eqeVar;
        this.c = num;
        this.X = x47Var.ordinal();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y47)) {
            return false;
        }
        y47 y47Var = (y47) obj;
        return this.a == y47Var.a && tpa.f(this.b, y47Var.b) && tpa.f(this.c, y47Var.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.X;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.X == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iF = k7d.f(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iF + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
