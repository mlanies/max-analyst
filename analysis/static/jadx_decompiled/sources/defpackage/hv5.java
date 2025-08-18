package defpackage;

/* loaded from: classes2.dex */
public final class hv5 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public hv5(long j, String str, String str2, String str3, Long l, String str4, String str5, String str6) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv5)) {
            return false;
        }
        hv5 hv5Var = (hv5) obj;
        return this.a == hv5Var.a && tpa.f(this.b, hv5Var.b) && tpa.f(this.c, hv5Var.c) && tpa.f(this.d, hv5Var.d) && tpa.f(this.e, hv5Var.e) && tpa.f(this.f, hv5Var.f) && tpa.f(this.g, hv5Var.g) && tpa.f(this.h, hv5Var.h);
    }

    public final int hashCode() {
        int iD = rh4.d(rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderWidget(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", startParam=");
        sb.append(this.f);
        sb.append(", url=");
        sb.append(this.g);
        sb.append(", iconUrl=");
        return zr6.l(sb, this.h, ")");
    }
}
