package defpackage;

/* loaded from: classes2.dex */
public final class vd5 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public vd5(long j, long j2, long j3, int i, Long l, long j4, Long l2, String str, long j5, long j6, String str2, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = l;
        this.f = j4;
        this.g = l2;
        this.h = str;
        this.i = j5;
        this.j = j6;
        this.k = str2;
        this.l = j7;
        this.m = j8;
    }

    public static vd5 a(vd5 vd5Var) {
        return new vd5(vd5Var.a, vd5Var.b, vd5Var.c, 3, vd5Var.e, vd5Var.f, vd5Var.g, vd5Var.h, vd5Var.i, vd5Var.j, vd5Var.k, vd5Var.l, vd5Var.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd5)) {
            return false;
        }
        vd5 vd5Var = (vd5) obj;
        return this.a == vd5Var.a && this.b == vd5Var.b && this.c == vd5Var.c && this.d == vd5Var.d && tpa.f(this.e, vd5Var.e) && this.f == vd5Var.f && tpa.f(this.g, vd5Var.g) && tpa.f(this.h, vd5Var.h) && this.i == vd5Var.i && this.j == vd5Var.j && tpa.f(this.k, vd5Var.k) && this.l == vd5Var.l && this.m == vd5Var.m;
    }

    public final int hashCode() {
        int iG = ey8.g(this.d, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        Long l = this.e;
        int iM = h4f.m((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        Long l2 = this.g;
        int iHashCode = (iM + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.h;
        return Long.hashCode(this.m) + h4f.m(rh4.d(h4f.m(h4f.m((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsEntryDb(pushId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", analyticsStatus=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SENT" : "NOT_SENT" : "UNDEFINED");
        sb.append(", senderUserId=");
        sb.append(this.e);
        sb.append(", contentLength=");
        sb.append(this.f);
        sb.append(", sentTime=");
        sb.append(this.g);
        sb.append(", eventKey=");
        sb.append(this.h);
        sb.append(", fcmSentTime=");
        sb.append(this.i);
        sb.append(", receivedTime=");
        sb.append(this.j);
        sb.append(", pushType=");
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        sb.append(", createdTime=");
        return zr6.k(sb, this.m, ")");
    }
}
