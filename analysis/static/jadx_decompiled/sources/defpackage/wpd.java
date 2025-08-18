package defpackage;

/* loaded from: classes2.dex */
public final class wpd {
    public final int a;
    public final jqe b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public wpd(int i, jqe jqeVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = jqeVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpd)) {
            return false;
        }
        wpd wpdVar = (wpd) obj;
        return this.a == wpdVar.a && tpa.f(this.b, wpdVar.b) && tpa.f(this.c, wpdVar.c) && tpa.f(this.d, wpdVar.d) && tpa.f(this.e, wpdVar.e);
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
        return "SimpleContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }
}
