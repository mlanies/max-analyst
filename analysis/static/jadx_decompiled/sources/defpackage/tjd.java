package defpackage;

/* loaded from: classes2.dex */
public final class tjd implements o00 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final yt6 f;
    public final long g;

    public tjd(long j, String str, String str2, String str3, String str4, yt6 yt6Var, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = yt6Var;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjd)) {
            return false;
        }
        tjd tjdVar = (tjd) obj;
        return this.a == tjdVar.a && tpa.f(this.b, tjdVar.b) && tpa.f(this.c, tjdVar.c) && tpa.f(this.d, tjdVar.d) && tpa.f(this.e, tjdVar.e) && tpa.f(this.f, tjdVar.f) && this.g == tjdVar.g;
    }

    public final int hashCode() {
        int iD = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        yt6 yt6Var = this.f;
        return Long.hashCode(this.g) + ((iHashCode3 + (yt6Var != null ? yt6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttachModel(shareId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", host=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", previewConfig=");
        sb.append(this.f);
        sb.append(", messageId=");
        return zr6.k(sb, this.g, ")");
    }
}
