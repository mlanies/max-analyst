package defpackage;

/* loaded from: classes2.dex */
public final class o22 implements q22 {
    public final int a;
    public final n22 b;
    public final String c;
    public final jqe d;
    public final Integer e;
    public final boolean f;

    public o22(int i, n22 n22Var, String str, jqe jqeVar, Integer num, boolean z) {
        this.a = i;
        this.b = n22Var;
        this.c = str;
        this.d = jqeVar;
        this.e = num;
        this.f = z;
    }

    public static o22 a(o22 o22Var, String str, jqe jqeVar, Integer num, boolean z, int i) {
        if ((i & 4) != 0) {
            str = o22Var.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = o22Var.f;
        }
        return new o22(o22Var.a, o22Var.b, str2, jqeVar, num, z);
    }

    public final boolean b(q22 q22Var) {
        if (q22Var == null || !(q22Var instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) q22Var;
        return (this.b == o22Var.b && tpa.f(this.c, o22Var.c)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) obj;
        return this.a == o22Var.a && this.b == o22Var.b && tpa.f(this.c, o22Var.c) && tpa.f(this.d, o22Var.d) && tpa.f(this.e, o22Var.e) && this.f == o22Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jqe jqeVar = this.d;
        int iHashCode3 = (iHashCode2 + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", link=");
        sb.append(this.c);
        sb.append(", hint=");
        sb.append(this.d);
        sb.append(", hintColor=");
        sb.append(this.e);
        sb.append(", hasError=");
        return au1.j(sb, this.f, ")");
    }

    public /* synthetic */ o22(n22 n22Var, String str) {
        this(vea.d2, n22Var, str, null, null, false);
    }
}
