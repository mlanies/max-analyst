package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class yw8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final ix8 j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final vx8 q;
    public final int r;
    public final int s;
    public final long t;
    public final int u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public yw8(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, List list, ix8 ix8Var, int i, long j8, boolean z, long j9, String str2, String str3, vx8 vx8Var, int i2, int i3, long j10, int i4, int i5, long j11, Long l, Boolean bool) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = list;
        this.j = ix8Var;
        this.k = i;
        this.l = j8;
        this.m = z;
        this.n = j9;
        this.o = str2;
        this.p = str3;
        this.q = vx8Var;
        this.r = i2;
        this.s = i3;
        this.t = j10;
        this.u = i4;
        this.v = i5;
        this.w = j11;
        this.x = l;
        this.y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw8)) {
            return false;
        }
        yw8 yw8Var = (yw8) obj;
        return this.a == yw8Var.a && this.b == yw8Var.b && this.c == yw8Var.c && this.d == yw8Var.d && this.e == yw8Var.e && this.f == yw8Var.f && this.g == yw8Var.g && tpa.f(this.h, yw8Var.h) && tpa.f(this.i, yw8Var.i) && tpa.f(this.j, yw8Var.j) && this.k == yw8Var.k && this.l == yw8Var.l && this.m == yw8Var.m && this.n == yw8Var.n && tpa.f(this.o, yw8Var.o) && tpa.f(this.p, yw8Var.p) && this.q == yw8Var.q && this.r == yw8Var.r && this.s == yw8Var.s && this.t == yw8Var.t && this.u == yw8Var.u && this.v == yw8Var.v && this.w == yw8Var.w && tpa.f(this.x, yw8Var.x) && tpa.f(this.y, yw8Var.y);
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iG = k7d.g(this.i, (iM + (str == null ? 0 : str.hashCode())) * 31, 31);
        ix8 ix8Var = this.j;
        int iM2 = h4f.m(ms2.d(h4f.m(k7d.e(this.k, (iG + (ix8Var == null ? 0 : ix8Var.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int iHashCode = (iM2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int iM3 = h4f.m(k7d.e(this.v, k7d.e(this.u, h4f.m(k7d.e(this.s, ey8.g(this.r, (this.q.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31, this.t), 31), 31), 31, this.w);
        Long l = this.x;
        int iHashCode2 = (iM3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MessagePartEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", chatId=" + this.d + ", updateTime=" + this.e + ", sender=" + this.f + ", cid=" + this.g + ", text=" + this.h + ", elements=" + this.i + ", reactions=" + this.j + ", messagesLinkType=" + this.k + ", messagesLinkId=" + this.l + ", insertedFromMessageLink=" + this.m + ", messagesLinkChatId=" + this.n + ", messageLinkChatName=" + this.o + ", messageLinkChatLink=" + this.p + ", status=" + this.q + ", type=" + ey8.n(this.r) + ", ttl=" + this.s + ", viewTime=" + this.t + ", zoom=" + this.u + ", options=" + this.v + ", liveUntil=" + this.w + ", timeToFire=" + this.x + ", notifySender=" + this.y + ")";
    }
}
