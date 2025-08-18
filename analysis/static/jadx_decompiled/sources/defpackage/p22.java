package defpackage;

/* loaded from: classes2.dex */
public final class p22 implements q22 {
    public final int a;
    public final String b;
    public final jqe c;
    public final Integer d;
    public final boolean e;

    public p22(int i, String str, jqe jqeVar, Integer num, boolean z) {
        this.a = i;
        this.b = str;
        this.c = jqeVar;
        this.d = num;
        this.e = z;
    }

    public static p22 a(p22 p22Var, String str, jqe jqeVar, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            str = p22Var.b;
        }
        return new p22(p22Var.a, str, jqeVar, num, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p22)) {
            return false;
        }
        p22 p22Var = (p22) obj;
        return this.a == p22Var.a && tpa.f(this.b, p22Var.b) && tpa.f(this.c, p22Var.c) && tpa.f(this.d, p22Var.d) && this.e == p22Var.e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jqe jqeVar = this.c;
        int iHashCode3 = (iHashCode2 + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(title=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", hint=");
        sb.append(this.c);
        sb.append(", hintColor=");
        sb.append(this.d);
        sb.append(", hasError=");
        return au1.j(sb, this.e, ")");
    }
}
