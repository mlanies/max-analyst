package defpackage;

/* loaded from: classes2.dex */
public final class gpd {
    public final long a;
    public final pcc b;
    public final bg1 c;
    public final long d;
    public final String e;
    public final String f;

    public gpd(long j, pcc pccVar, bg1 bg1Var, long j2, String str, String str2) {
        this.a = j;
        this.b = pccVar;
        this.c = bg1Var;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpd)) {
            return false;
        }
        gpd gpdVar = (gpd) obj;
        return this.a == gpdVar.a && this.b == gpdVar.b && tpa.f(this.c, gpdVar.c) && this.d == gpdVar.d && tpa.f(this.e, gpdVar.e) && tpa.f(this.f, gpdVar.f);
    }

    public final int hashCode() {
        int iM = h4f.m((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        sb.append(this.d);
        sb.append(", recordExternalMovieId=");
        sb.append(this.e);
        sb.append(", recordExternalOwnerId=");
        return zr6.l(sb, this.f, ")");
    }
}
