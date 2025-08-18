package defpackage;

/* loaded from: classes2.dex */
public final class tt3 {
    public final int a;
    public final jqe b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ tt3(int i, jqe jqeVar, Integer num, Integer num2, int i2) {
        this(i, jqeVar, (Integer) null, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt3)) {
            return false;
        }
        tt3 tt3Var = (tt3) obj;
        return this.a == tt3Var.a && tpa.f(this.b, tt3Var.b) && tpa.f(this.c, tt3Var.c) && tpa.f(this.d, tt3Var.d) && tpa.f(this.e, tt3Var.e);
    }

    public final int hashCode() {
        int iF = k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }

    public tt3(int i, jqe jqeVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = jqeVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }
}
