package defpackage;

/* loaded from: classes2.dex */
public final class je5 {
    public final long a;
    public final long b;
    public final ne5 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public je5(long j, long j2, ne5 ne5Var, String str, String str2, long j3, long j4, String str3, long j5, String str4, String str5, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = ne5Var;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = j4;
        this.h = str3;
        this.i = j5;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je5)) {
            return false;
        }
        je5 je5Var = (je5) obj;
        return this.a == je5Var.a && this.b == je5Var.b && this.c == je5Var.c && tpa.f(this.d, je5Var.d) && tpa.f(this.e, je5Var.e) && this.f == je5Var.f && this.g == je5Var.g && tpa.f(this.h, je5Var.h) && this.i == je5Var.i && tpa.f(this.j, je5Var.j) && tpa.f(this.k, je5Var.k) && this.l == je5Var.l && this.m == je5Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iM = h4f.m(rh4.d(h4f.m(h4f.m((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int iHashCode3 = (iM + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return Boolean.hashCode(this.m) + ms2.d((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getSimpleName());
        sb.append('(');
        sb.append("pushId=");
        sb.append(this.i);
        sb.append(",sender=");
        sb.append(this.f);
        sb.append(",chatServerId=");
        sb.append(this.a);
        sb.append(",messageId=");
        sb.append(this.b);
        sb.append(",type=");
        sb.append(this.c);
        sb.append(",time=");
        sb.append(this.g);
        sb.append(",hasText=");
        return au1.j(sb, this.h.length() > 0, ")");
    }
}
