package defpackage;

/* loaded from: classes.dex */
public final class yg1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public yg1(long j, long j2, String str, String str2, String str3, boolean z, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg1)) {
            return false;
        }
        yg1 yg1Var = (yg1) obj;
        return this.a == yg1Var.a && this.b == yg1Var.b && tpa.f(this.c, yg1Var.c) && tpa.f(this.d, yg1Var.d) && tpa.f(this.e, yg1Var.e) && this.f == yg1Var.f && tpa.f(this.g, yg1Var.g);
    }

    public final int hashCode() {
        int iM = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iD = ms2.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        return iD + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallPush(callerId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", callerName=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", isVideo=");
        sb.append(this.f);
        sb.append(", conversationParams=");
        return zr6.l(sb, this.g, ")");
    }
}
