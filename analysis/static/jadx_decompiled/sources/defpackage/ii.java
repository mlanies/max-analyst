package defpackage;

/* loaded from: classes2.dex */
public final class ii {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;

    public ii(long j, long j2, String str, String str2, String str3, Long l, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return this.a == iiVar.a && this.b == iiVar.b && tpa.f(this.c, iiVar.c) && tpa.f(this.d, iiVar.d) && tpa.f(this.e, iiVar.e) && tpa.f(this.f, iiVar.f) && tpa.f(this.g, iiVar.g);
    }

    public final int hashCode() {
        int iD = rh4.d(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimojiEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", lottieUrl=");
        sb.append(this.d);
        sb.append(", lottiePlayUrl=");
        sb.append(this.e);
        sb.append(", setId=");
        sb.append(this.f);
        sb.append(", iconUrl=");
        return zr6.l(sb, this.g, ")");
    }
}
