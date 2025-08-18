package defpackage;

/* loaded from: classes2.dex */
public final class zjd {
    public final jqe a;
    public final jqe b;
    public final String c;
    public final Integer d;

    public zjd(eqe eqeVar, jqe jqeVar, String str, Integer num) {
        this.a = eqeVar;
        this.b = jqeVar;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjd)) {
            return false;
        }
        zjd zjdVar = (zjd) obj;
        return tpa.f(this.a, zjdVar.a) && tpa.f(this.b, zjdVar.b) && tpa.f(this.c, zjdVar.c) && tpa.f(this.d, zjdVar.d) && tpa.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        int iHashCode2 = (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=null)";
    }
}
